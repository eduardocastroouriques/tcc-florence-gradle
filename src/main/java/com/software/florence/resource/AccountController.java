package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.GenericController;
import com.software.florence.dto.AccountCreateRequest;
import com.software.florence.dto.AccountUpdateRequest;
import com.software.florence.entity.Account;
import com.software.florence.entity.jsonapi.JsonApiResource;
import com.software.florence.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.security.auth.login.AccountNotFoundException;
import java.net.URI;
import java.security.Principal;

@RestController
@RequestMapping("/account")
public class AccountController extends GenericController {

    private AccountService accountService;

    /////////////////////////////
    // Constructor
    /////////////////////////////
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    /////////////////////////////
    // Rest Endpoints
    /////////////////////////////
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createNewAccount(@Validated @RequestBody JsonApiResource<AccountCreateRequest> createResource, BindingResult bindingResult) {
        this.verifyValidation(bindingResult);

        AccountCreateRequest createRequest = createResource.getData();
        Account account = accountService.createAccount(createRequest.getUsername(), createRequest.getEmail(), createRequest.getPassword());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}").buildAndExpand(account.getUsername()).toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "me", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    public Account getMyInformation(Principal principal) throws AccountNotFoundException {
        Account account = accountService.getAccountByUsername(principal.getName());
        return account;
    }

    @RequestMapping(value = "{username}", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and principal == #username)")
    public Account getAccount(@PathVariable String username) throws AccountNotFoundException {
        Account account = accountService.getAccountByUsername(username);
        return account;
    }

    @RequestMapping(value = "{username}", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and principal == #username)")
    public ResponseEntity<?> removeAccount(@PathVariable String username) throws AccountNotFoundException {
        accountService.deleteAccountByUsername(username);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{username}", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and principal == #username)")
    public ResponseEntity<?> updateAccount(@PathVariable String username, @Validated @RequestBody JsonApiResource<AccountUpdateRequest> updateResource, BindingResult bindingResult) throws AccountNotFoundException {
        this.verifyValidation(bindingResult);

        AccountUpdateRequest updateRequest = updateResource.getData();
        accountService.updateAccount(username, updateRequest);
        return ResponseEntity.noContent().build();
    }
}

package com.software.florence.service;

import com.software.florence.common.exception.AccountRegistrationErrorException;
import com.software.florence.common.exception.AccountUpdateErrorException;
import com.software.florence.common.exception.ApiErrorException;
import com.software.florence.dto.AccountUpdateRequest;
import com.software.florence.entity.Account;
import com.software.florence.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.security.auth.login.AccountNotFoundException;

@Service
public class AccountService {

    private static Logger logger = LoggerFactory.getLogger(AccountService.class);

    private AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;

    /////////////////////////////
    // Constructor
    /////////////////////////////
    @Autowired
    public AccountService(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /////////////////////////////
    // Public Methods
    /////////////////////////////
    public boolean hasAccount(String idOrEmail) throws AccountNotFoundException {
        if(!StringUtils.isEmpty(idOrEmail))
            return this.hasAccountById(idOrEmail);

        return this.hasAccountByEmail(idOrEmail);
    }

    public Account getAccount(String idOrEmail) throws AccountNotFoundException {
        if(!StringUtils.isEmpty(idOrEmail))
            return this.getAccountById(idOrEmail);

        return this.getAccountByEmail(idOrEmail);
    }

    public void deleteAccount(String idOrEmail) throws AccountNotFoundException {
        if(!StringUtils.isEmpty(idOrEmail))
            this.deleteAccountById(idOrEmail);

        this.deleteAccountByEmail(idOrEmail);
    }

    /////////////////////////////
    // Methods using accountId
    /////////////////////////////
    public boolean hasAccountById(String accountId) throws AccountNotFoundException {
        if(!StringUtils.isEmpty(accountId))
            return false;

        return accountRepository.exists(new Long(accountId));
    }

    public Account getAccountById(String accountId) throws AccountNotFoundException {
        Account account;

        if (!StringUtils.isEmpty(accountId) || (account = accountRepository.findOne(new Long(accountId))) == null)
            throw new AccountNotFoundException(accountId);

        return account;
    }

    public void deleteAccountById(String accountId) throws AccountNotFoundException {
        if(!StringUtils.isEmpty(accountId))
            throw new AccountNotFoundException(accountId);

        accountRepository.delete(new Long(accountId));
    }

    /////////////////////////////
    // Methods using email address
    /////////////////////////////
    public boolean hasAccountByEmail(String email) {
        return accountRepository.existsByEmail(email);
    }

    public Account getAccountByEmail(String email) throws AccountNotFoundException {
        Account account = accountRepository.findAccountByEmail(email);
        if (account == null)
            throw new AccountNotFoundException(email);

        return account;
    }

    public void deleteAccountByEmail(String email) throws AccountNotFoundException {
        Account account = accountRepository.findAccountByEmail(email);
        if (account == null)
            throw new AccountNotFoundException(email);

        accountRepository.delete(account);
    }

    /////////////////////////////
    // Methods using username
    /////////////////////////////
    public boolean hasAccountByUsername(String username) {
        return accountRepository.existsByUsername(username);
    }

    public Account getAccountByUsername(String username) throws AccountNotFoundException {
        Account account = accountRepository.findAccountByUsername(username);
        if (account == null)
            throw new AccountNotFoundException(username);

        return account;
    }

    public void deleteAccountByUsername(String username) throws AccountNotFoundException {
        Account account = accountRepository.findAccountByUsername(username);
        if (account == null)
            throw new AccountNotFoundException(username);

        accountRepository.delete(account);
    }

    /////////////////////////////
    // Other
    /////////////////////////////
    public Account createAccount(String username, String email, String rawPassword) throws AccountRegistrationErrorException {
        if (this.hasAccountByUsername(username))
            throw new AccountRegistrationErrorException("The username " + username + " is already taken.");

        if (this.hasAccountByEmail(email))
            throw new AccountRegistrationErrorException("The email address " + email + " is already registered.");

        Account account = new Account();
        account.setEmail(email);
        account.setUsername(username);
        account.setPassword(passwordEncoder.encode(rawPassword));
        try {
            return accountRepository.save(account);
        } catch (Exception ex) {
            logger.error("AccountService wasn't able to save this account: " + ex.getMessage(), ex);
            throw new AccountRegistrationErrorException("The service wasn't able to register this account");
        }
    }

    public void updateAccount(String username, AccountUpdateRequest updateRequest) throws AccountNotFoundException {
        Account account = this.getAccountByUsername(username);

        // E-mail address changing.
        if (updateRequest.getEmail() != null) {
            String newEmail = updateRequest.getEmail();
            if (newEmail.contentEquals(account.getEmail()))
                throw new AccountUpdateErrorException("The e-mail address is your current e-mail address already.");

            if (accountRepository.existsByEmail(newEmail))
                throw new AccountUpdateErrorException("The new e-mail address is already in use.");

            account.setEmail(newEmail);
        }

        // Password changing.
        if (updateRequest.getPassword() != null) {
            String encodedPassword = passwordEncoder.encode(updateRequest.getPassword());
            account.setPassword(encodedPassword);
        }

        this.saveAccount(account);
    }

    public Account saveAccount(Account account) {
        try {
            return accountRepository.save(account);
        } catch (Exception ex) {
            logger.error("AccountService wasn't able to update this account: " + ex.getMessage(), ex);
            throw new ApiErrorException("The service wasn't able to update this account");
        }
    }

    public void deleteAllAccounts() {
        accountRepository.deleteAll();
    }
}

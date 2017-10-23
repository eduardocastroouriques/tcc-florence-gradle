package com.software.florence.service;

import com.software.florence.entity.Account;
import com.software.florence.entity.AccountLoggedIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service("userDetailsService")
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    private final AccountService accountService;

    @Autowired
    public AppUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = null;
        try {
            account = accountService.getAccountByUsername(username);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }
        return new AccountLoggedIn(account, getPermissions(account));
    }

    private Collection<? extends GrantedAuthority> getPermissions(Account account) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }
}

package com.software.florence.repository;

import com.software.florence.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findAccountByEmail(String email);

    Account findAccountByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);

}

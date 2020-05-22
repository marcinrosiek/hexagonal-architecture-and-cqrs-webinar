package com.smalaca.bank.infrastructure.jpa.springdata;

import com.smalaca.bank.domain.account.Account;
import com.smalaca.bank.domain.account.AccountId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAccountRepository extends CrudRepository<Account, AccountId> {
}

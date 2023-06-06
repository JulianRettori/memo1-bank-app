package com.aninfo.repository;

import com.aninfo.model.Account;
import com.aninfo.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Optional<Transaction> findById(Long id);
    @Override
    List<Transaction> findAll();

    Collection<Transaction> findAllByCbu(Long cbu);
}

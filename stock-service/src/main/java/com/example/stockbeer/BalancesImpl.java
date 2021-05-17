package com.example.stockbeer;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BalancesImpl implements Balances, PanacheRepository<Balance> {

    @Override
    public Optional<Balance> findByBeerId(String beerId) {
        return find("beerId", beerId).singleResultOptional();
    }

    @Override
    public Balance recalculate(Transaction transaction) {
        var currentBalance = findByBeerId(transaction.getBeerId())
                .orElse(Balance.defaultInstance(transaction.getBeerId()))
                .recalculateBalance(transaction);
        if (currentBalance.id == null) {
            persist(currentBalance);
        } else {
            update("value = ?1 where id = ?2", currentBalance.value, currentBalance.id);
        }
        return currentBalance;
    }

}

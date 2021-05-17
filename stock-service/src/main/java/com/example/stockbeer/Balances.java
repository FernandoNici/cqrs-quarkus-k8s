package src.main.java.com.example.stockbeer;

import java.util.Optional;
import javax.transaction.Transactional;

public interface Balances {

    Optional<Balance> findByBeerId(String beerId);

    @Transactional
    Balance recalculate(Transaction transaction);

}

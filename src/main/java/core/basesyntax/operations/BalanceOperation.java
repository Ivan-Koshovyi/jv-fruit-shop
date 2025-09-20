package core.basesyntax.operations;

import core.basesyntax.service.FruitTransaction;
import java.util.Map;

public class BalanceOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        storage.put(transaction.getFruit(),transaction.getQuantity());
    }
}

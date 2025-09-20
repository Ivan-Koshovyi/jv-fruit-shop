package core.basesyntax.operations;

import core.basesyntax.FruitTransaction;

import java.util.Map;

public interface OperationHandler {
    void handle(FruitTransaction transaction, Map<String, Integer> storage);
}

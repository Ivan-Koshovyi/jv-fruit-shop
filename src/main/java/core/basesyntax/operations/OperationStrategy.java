package core.basesyntax.operations;

import core.basesyntax.service.FruitTransaction;
import java.util.Map;

public interface OperationStrategy {
    void apply(FruitTransaction transaction, Map<String, Integer> storage);
}

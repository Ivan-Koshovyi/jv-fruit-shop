package core.basesyntax;

import java.util.Map;

public interface OperationStrategy {
    void apply(FruitTransaction transaction, Map<String, Integer> storage);
}

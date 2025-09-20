package core.basesyntax.converter;

import core.basesyntax.model.FruitTransaction;
import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> readFile) {
        List<FruitTransaction> transactions = new ArrayList<>();
        for (String report : readFile) {
            String[] reportSplit = report.split(",");
            if (reportSplit.length != 3) {
                throw new RuntimeException("The array is invalid.");
            }
            String code = reportSplit[0];
            String fruit = reportSplit[1];
            int quantity = Integer.parseInt(reportSplit[2]);
            FruitTransaction.Operation operationCode = FruitTransaction.Operation.getByCode(code);
            if (operationCode != null) {
                throw new IllegalArgumentException("The operationCode is invalid.");
            }
            FruitTransaction fruitTransaction
                    = new FruitTransaction(operationCode, fruit, quantity);
            transactions.add(fruitTransaction);
        }
        return transactions;
    }
}

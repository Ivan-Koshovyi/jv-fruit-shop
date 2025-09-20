package core.basesyntax.converter;

import core.basesyntax.service.FruitTransaction;

import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> readFile) {
        List<FruitTransaction> transactions =new ArrayList<>();
        for (String report : readFile) {
            String[] reportSplit = report.split(",");
            String code = reportSplit[0];
            String fruit = reportSplit[1];
            int quantity = Integer.parseInt(reportSplit[2]);
            FruitTransaction.Operation operationCode = null;
            for (FruitTransaction.Operation operation : FruitTransaction.Operation.values()) {
                if (operation.getCode().equals(code)) {
                    operationCode = operation;
                    break;
                }
            }
            if (operationCode != null) {
                FruitTransaction fruitTransaction = new FruitTransaction(operationCode, fruit, quantity);
                transactions.add(fruitTransaction);
            }
        }
        return transactions;
    }
}

package core.basesyntax.service.impl;

import core.basesyntax.service.ReadFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileImpl implements ReadFile {
    @Override
    public List<String> read(String fileName) {
        try (InputStream inputStream = getClass().getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
            return new BufferedReader(new InputStreamReader(inputStream))
                    .lines()
                    .skip(1)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can`t read file " + fileName, e);
        }
    }
}

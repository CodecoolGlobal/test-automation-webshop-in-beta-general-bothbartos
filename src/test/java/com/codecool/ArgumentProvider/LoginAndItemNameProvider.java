package com.codecool.ArgumentProvider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class LoginAndItemNameProvider implements ArgumentsProvider {


    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        List<Arguments> arguments = new ArrayList<>();
        List<String> usernames = readCsv("/usernames.csv");
        List<String> itemNames = readCsv("/itemNames.csv");
        for (String username : usernames) {
            for (String itemName : itemNames) {
                arguments.add(Arguments.of(username, itemName));
            }
        }
        return arguments.stream();
    }

    private List<String> readCsv(String resourcePath) throws Exception{
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                Objects.requireNonNull(getClass().getResourceAsStream(resourcePath)), StandardCharsets.UTF_8
        ))) {
            br.lines().skip(1).forEach(result::add);
        }
        return result;
    }
}

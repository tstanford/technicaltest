package com.lloyds.simpleservice;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SimpleRepository {
    public List<ClientDocument> getAll() {
        return Arrays.asList(
                new ClientDocument(1, "Monthly Statement"),
                new ClientDocument(3, "Loan Approved"),
                new ClientDocument(2, "Welcome Letter"));

    }
}

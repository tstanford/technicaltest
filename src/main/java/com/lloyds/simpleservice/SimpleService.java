package com.lloyds.simpleservice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleService {

    private SimpleRepository repository = new SimpleRepository();

    public List<Integer> getAllDocIds() {
        //task: convert the below to use java streams. make sure that the list is sorted in ascending order

        List<Integer> ids = new ArrayList<>();
        for(ClientDocument document : repository.getAll()){
            ids.add(document.getId());
        }
        return ids;

    }
}

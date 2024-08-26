package com.lloyds.simpleservice;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;


public class SimpleServiceTest {

    @Test
    public void shouldInstantiateService(){
        SimpleService service = new SimpleService();

        Assert.isTrue(service != null, "Service must not be null");
    }

    @Test
    public void shouldGetListOfIds(){
        SimpleService service = new SimpleService();

        List<Integer> ids = service.getAllDocIds();

        Assert.isTrue(ids.size() == 3, "Size of the List must be 3");
    }

    @Test
    public void shouldBeInAscendingOrder(){
        SimpleService service = new SimpleService();

        List<Integer> ids = service.getAllDocIds();

        Assert.isTrue(ids.size() == 3, "Size of the List must be 3");
        Assert.isTrue(ids.get(0) == 1, "Id must be 1");
        Assert.isTrue(ids.get(1) == 2, "Id must be 2");
        Assert.isTrue(ids.get(2) == 3, "Id must be 3");
    }


}

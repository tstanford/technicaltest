package com.lloyds.simpleservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SimpleController {

    private SimpleService service = new SimpleService();

    @RequestMapping(method = RequestMethod.GET)
    public List<Integer> getDocIds(){
        return service.getAllDocIds();
    }

}

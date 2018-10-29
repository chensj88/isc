package com.winning.isc.controller;

import com.winning.isc.service.Facade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LENOVO
 * Date: 2018-07-23
 * Time: 9:21
 */
public class BaseController {

    @Autowired
    private Facade facade;

    protected Map resultMap = new HashMap();

    public Facade getFacade() {
        return facade;
    }

}

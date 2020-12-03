package com.example.demo.controller;


import com.example.demo.domain.es.DeviceEs;
import com.example.demo.elastic.BBossESHandler.DeviceDocHandler;
import com.example.demo.service.impl.DeviceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lqd
 * @since 2020-11-11
 */
@RestController
public class DeviceController {

    @Autowired
    DeviceServiceImpl deviceService;

    @Autowired
    DeviceDocHandler deviceDocHandler;

    @RequestMapping("import")
    public String imports() {
        return null;
    }

    @RequestMapping("get")
    public Iterable<DeviceEs> get() {
        return null;
    }

    @RequestMapping("getBy")
    public DeviceEs getBy(String key) {
        return null;
    }

    @RequestMapping("count")
    public Long count(String key) {
        return null;
    }

    @RequestMapping("/device/create/index")
    public String createDeviceIndex() {
        deviceDocHandler.createDeviceIndex();
        return "success";
    }
}


package com.example.demo;

import com.example.demo.domain.Device;
import com.example.demo.service.impl.DeviceServiceImpl;
import org.frameworkset.elasticsearch.boot.BBossESStarter;
import org.frameworkset.elasticsearch.client.ClientInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private BBossESStarter bbossESStarter;

    private DeviceServiceImpl deviceService;

}

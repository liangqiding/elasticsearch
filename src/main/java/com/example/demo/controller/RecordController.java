package com.example.demo.controller;


import com.example.demo.domain.es.DeviceEs;
import com.example.demo.domain.es.RecordEs;
import com.example.demo.elastic.BBossESHandler.RecordDocHandler;
import com.example.demo.service.impl.DeviceMessageRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lqd
 * @since 2020-11-12
 */
@RestController
public class RecordController {

    @Autowired
    RecordDocHandler recordDocHandler;

    @Autowired
    DeviceMessageRecordServiceImpl deviceMessageRecordService;

    @RequestMapping("/record/create/index")
    public String createDeviceIndex() {
        recordDocHandler.createRecordIndex();
        return "success";
    }

    @RequestMapping("/record/addOrUpdate")
    public String addAndUpdateRecord(RecordEs recordEs, String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(date);
        recordDocHandler.addAndUpdateRecord(recordEs.setGmtCreate(parse));
        return "success";
    }

    @RequestMapping("/record/search")
    public Object search(RecordEs recordEs, Integer pageNumber, Integer pageSize) throws ParseException {
        return recordDocHandler.search(recordEs, pageNumber, pageSize);
    }

    @RequestMapping("/record/get")
    public Object getAll() throws ParseException {
        return deviceMessageRecordService.list();
    }


}


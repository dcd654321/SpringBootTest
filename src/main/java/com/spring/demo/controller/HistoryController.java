package com.spring.demo.controller;

import com.spring.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/his",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HistoryController {
    @Autowired
    HistoryService hisService;

    @RequestMapping(value = "/initHis", method = RequestMethod.POST)
    public void initHis() throws IOException {
        hisService.iniHis();
    }

}

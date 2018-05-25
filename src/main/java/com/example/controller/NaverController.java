package com.example.controller;

import com.example.service.NaverService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NaverController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NaverService naverService;

    @RequestMapping(value = "/naver-api", method = RequestMethod.POST)
    public String controlNaver(@RequestBody Object message) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String messageJsonString = mapper.writeValueAsString(message);
        logger.info("call /naver-api with message : " + messageJsonString);
        return naverService.serviceNaver();
    }
}

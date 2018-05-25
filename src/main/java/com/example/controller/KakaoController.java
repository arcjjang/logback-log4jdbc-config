package com.example.controller;

import com.example.service.KakaoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KakaoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KakaoService kakaoService;

    @RequestMapping(value = "/kakao-api", method = RequestMethod.POST)
    public String controlKakao(@RequestBody Object message) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String messageJsonString = mapper.writeValueAsString(message);
        logger.info("call /kakao-api with message : " + messageJsonString);
        return kakaoService.serviceKakao();
    }
}

package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KakaoService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;

    public String serviceKakao() throws Exception {
        List<User> users = userRepository.findAll();
        logger.info("call kakao service.");
        return "call kakao service.";
    }
}

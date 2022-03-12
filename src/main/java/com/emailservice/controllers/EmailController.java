package com.emailservice.controllers;

import com.emailservice.dtos.EmailDTO;
import com.emailservice.entities.EmailEntity;
import com.emailservice.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendmail")
    public ResponseEntity<EmailEntity> sendMailRequest(@RequestBody @Valid EmailDTO email){
        EmailEntity entity=new EmailEntity();
        BeanUtils.copyProperties(email, entity);
        emailService.sendMail(entity);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }
}

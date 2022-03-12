package com.emailservice.services;

import com.emailservice.entities.EmailEntity;
import com.emailservice.enums.StatusEmail;
import com.emailservice.repositories.EmailRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    EmailRepositorie emailRepositorie;

    public void sendMail(EmailEntity entity){
        entity.setDateEmailSend(LocalDate.now());

        try{
            SimpleMailMessage message=new SimpleMailMessage();
            message.setFrom(entity.getEmailFrom());
            message.setTo(entity.getEmailTo());
            message.setSubject(entity.getSubject());
            message.setText(entity.getEmailText());
            mailSender.send(message);
            entity.setStatusEmail(StatusEmail.SENT);
        }catch(MailException e){
            entity.setStatusEmail(StatusEmail.ERROR);
        }
        finally {
            emailRepositorie.save(entity);
        }

    }
}

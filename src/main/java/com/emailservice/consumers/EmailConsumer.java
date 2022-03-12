package com.emailservice.consumers;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.emailservice.dtos.EmailDTO;
import com.emailservice.entities.EmailEntity;
import com.emailservice.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listener(@Payload EmailDTO emailDTO){
        EmailEntity entity=new EmailEntity();
        BeanUtils.copyProperties(emailDTO, entity);
        emailService.sendMail(entity);
        System.out.println("Email status: "+entity.getStatusEmail().toString());
    }
}

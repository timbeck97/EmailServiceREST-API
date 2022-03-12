package com.emailservice.dtos;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDTO {
    @NotBlank
    private String ownerName;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    private String subject;
    @NotBlank
    private String emailText;

    public EmailDTO(){

    }

    public EmailDTO(String ownerName, String emailTo, String emailFrom, String subject, String emailText) {
        this.ownerName = ownerName;
        this.emailTo = emailTo;
        this.emailFrom = emailFrom;
        this.subject = subject;
        this.emailText = emailText;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }
}

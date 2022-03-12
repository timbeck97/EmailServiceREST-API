package com.emailservice.entities;

import com.emailservice.enums.StatusEmail;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class EmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerName;
    private String emailTo;
    private String emailFrom;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String emailText;
    private LocalDate dateEmailSend;
    private StatusEmail statusEmail;

    public EmailEntity(){

    }

    public EmailEntity(Long emailId, String ownerName, String emailTo, String emailFrom, String subject, String emailText, LocalDate dateEmailSend, StatusEmail statusEmail) {
        this.emailId = emailId;
        this.ownerName = ownerName;
        this.emailTo = emailTo;
        this.emailFrom = emailFrom;
        this.subject = subject;
        this.emailText = emailText;
        this.dateEmailSend = dateEmailSend;
        this.statusEmail = statusEmail;
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
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

    public LocalDate getDateEmailSend() {
        return dateEmailSend;
    }

    public void setDateEmailSend(LocalDate dateEmailSend) {
        this.dateEmailSend = dateEmailSend;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }
}

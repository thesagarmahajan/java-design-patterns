package com.example.designpatterns.creational.factory;

import java.util.List;

public class EmailChannel implements MessageChannel {
    private List<String> receivers;
    private List<String> carbonCopy;
    private List<String> blackCarbonCopy;
    private String subject;
    private String message;
    @Override
    public int send() {
        System.out.println("Sending message via Email Channel");
        return 0;
    }

    public EmailChannel(List<String> receivers, List<String> carbonCopy, List<String> blackCarbonCopy, String subject, String message) {
        this.receivers = receivers;
        this.carbonCopy = carbonCopy;
        this.blackCarbonCopy = blackCarbonCopy;
        this.subject = subject;
        this.message = message;
    }

    public EmailChannel() {
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public List<String> getCarbonCopy() {
        return carbonCopy;
    }

    public void setCarbonCopy(List<String> carbonCopy) {
        this.carbonCopy = carbonCopy;
    }

    public List<String> getBlackCarbonCopy() {
        return blackCarbonCopy;
    }

    public void setBlackCarbonCopy(List<String> blackCarbonCopy) {
        this.blackCarbonCopy = blackCarbonCopy;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EmailChannel{" +
                "receivers=" + receivers +
                ", carbonCopy=" + carbonCopy +
                ", blackCarbonCopy=" + blackCarbonCopy +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


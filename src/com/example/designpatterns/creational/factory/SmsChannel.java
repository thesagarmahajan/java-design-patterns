package com.example.designpatterns.creational.factory;

public class SmsChannel implements MessageChannel {
    private String phone;
    private String message;
    @Override
    public int send() {
        System.out.println("Sending message via SMS Channel");
        return 0;
    }

    public SmsChannel(String phone, String message) {
        this.phone = phone;
        this.message = message;
    }

    public SmsChannel() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsChannel{" +
                "phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

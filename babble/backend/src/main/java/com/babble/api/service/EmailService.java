package com.babble.api.service;

public interface EmailService {
    String sendSimpleMessage(String to)throws Exception;
    void sendHashtagMessage(String to, String hashtag) throws Exception;
    String sendTempPassword(String email) throws  Exception;
}

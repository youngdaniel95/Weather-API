package com.example.twilioapi;

import com.example.twilioapi.model.SmsRequest;
import com.example.twilioapi.service.SenderService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TwilioApiApplicationTests {

    @Mock
    SenderService senderService;

    @Test
    void shouldCreateSmsRequest() {
        SmsRequest smsRequest = new SmsRequest();
        smsRequest.setPhoneNumber("1112223333");
        smsRequest.setMessage("Testing");

        smsRequest.setPhoneNumber(smsRequest.getPhoneNumber());
        smsRequest.setMessage(smsRequest.getMessage());

        senderService.sendSms(smsRequest);
    }

    //environment variables
//    String accountSid = System.getenv("ASID");
//    String authToken = System.getenv("AT");

    @Test
    void shouldCreateMessage() {
//        Twilio.init("ACCOUNT_SID", "AUTH_TOKEN");
//        Message message = Message.creator(
//                new com.twilio.type.PhoneNumber("+5571981265131"),
//                new com.twilio.type.PhoneNumber("+15005550006"),
//                "message test").create();
//
//        System.out.println(message.getAccountSid());

        System.out.println("hi");
    }
}


package com.solid.solidprensipleri.dependencyinversion;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SMS implements Message  {
    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        //Send sms
    }
}

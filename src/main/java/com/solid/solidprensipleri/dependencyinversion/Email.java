package com.solid.solidprensipleri.dependencyinversion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email implements Message  {
    @Override
    public void sendMessage() {
        sendEmail();
    }

    void sendEmail() {
        //Send email
    }
}

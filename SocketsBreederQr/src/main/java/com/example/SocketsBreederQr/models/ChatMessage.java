package com.example.SocketsBreederQr.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private String nickname;
    private String message;
    private Date timestamp;

}

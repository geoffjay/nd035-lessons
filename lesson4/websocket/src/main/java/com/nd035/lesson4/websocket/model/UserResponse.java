package com.nd035.lesson4.websocket.model;

public class UserResponse {
    private String content;

    public UserResponse() {}

    public UserResponse(String content) { this.content = content; }

    public String getContent() { return this.content; }

    public void setContent(String content) { this.content = content; }
}

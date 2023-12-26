package com.example;

import com.example.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User David = new UserBuilder()
        .name("David")
        .gender(Gender.FEMALE)
        .build();
    }
}
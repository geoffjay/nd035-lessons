package com.nd035.lesson3.unittests.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser() {
        return "Tom";
    }
}

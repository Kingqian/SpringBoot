package com.jaycekon.mybatis.multi.model;

import lombok.Data;

/**
 * @date 2018/11/21
 */

@Data
public class User {
    private int id;

    private String username;

    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

package com.po;

import java.io.Serializable;

public class Users implements Serializable {
    private String name;
    private String passwd;

    public Users() {
    }

    public Users(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}

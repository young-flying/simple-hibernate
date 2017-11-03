package com.peace.domain;

import java.util.Date;

public class User {
    private int id;
    private String name = "";
    private String password = "";
    private Date birthday = null;
    
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
    }
}
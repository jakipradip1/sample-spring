package com.jakipradip.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class AppParamaters {
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String userName;
	@Value("${db.password}")
	private String password;
	private String test;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	@Override
	public String toString() {
		return "DBConnParamaters [url=" + url + ", userName=" + userName + ", password=" + password + ", test=" + test
				+ "]";
	}
	
	
	
	
}

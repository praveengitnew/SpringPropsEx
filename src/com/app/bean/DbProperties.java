package com.app.bean;

import java.util.Properties;

public class DbProperties {
	
	private Properties myDtls;
    private Properties urDtls;
	public DbProperties() {
		super();
	}
	public Properties getMyDtls() {
		return myDtls;
	}
	public void setMyDtls(Properties myDtls) {
		this.myDtls = myDtls;
	}
	public Properties getUrDtls() {
		return urDtls;
	}
	public void setUrDtls(Properties urDtls) {
		this.urDtls = urDtls;
	}
	@Override
	public String toString() {
		return "DbProperties [myDtls=" + myDtls + ", urDtls=" + urDtls + "]";
	}
	
    
}

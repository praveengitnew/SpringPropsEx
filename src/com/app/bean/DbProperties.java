package com.app.bean;

import java.util.Properties;

public class DbProperties {
	
	private Properties myDtls;
    
	//alt+shift + o (deSelectAll>ok)
	//alt=shift+ r (SelectAll>ok)
	//alt=Shift + s(ok)
	public DbProperties() {
		super();
	}

	public Properties getMyDtls() {
		return myDtls;
	}

	public void setMyDtls(Properties myDtls) {
		this.myDtls = myDtls;
	}

	@Override
	public String toString() {
		return "DbProperties [myDtls=" + myDtls + "]";
	}
	
	

}

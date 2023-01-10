package com.base;

public class EndPoint {
public static final String Base_URL = "https://api.github.com";
	
	public class  SingleRepo {
	private	SingleRepo(){
		
	}
	public static final String POST_CREATE_SINGLEREPO = Base_URL+"/user/repos";
	public static final String GET_SINGLE_REPO = Base_URL+"/repos/OWNER/REPO";
	public static final String PUT_UPDATE = Base_URL+"/OWNER/repos";
	public static final String DELETE_REPO = Base_URL+"/OWNER/repos";
	
	}

}

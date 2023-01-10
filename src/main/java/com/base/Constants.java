package com.base;

public class Constants {

	//200 success
	public static final int HTTP_STATUS_OK = 200;
	public static final int HTTP_STATUS_CREATED = 201;
	public static final int HTTP_STATUS_ACCEPTED = 202;
	public static final int HTTP_STATUS_NOCONTENT = 204;
	
	//400 client errors
	public static final int HTTP_STATUS_BADREQUEST = 400;
	public static final int HTTP_STATUS_UNAUTHORIZED = 401;
	public static final int HTTP_STATUS_FORBIDDEN = 403;
	public static final int HTTP_STATUS_NOTFOUND = 404;
	public static final int HTTP_STATUS_CONFLICT = 409;
	
	//500 server errors
	public static final int HTTP_STATUS_INTERNALSERVERERROR = 500;
	public static final int HTTP_STATUS_BADGATEWAY = 502;
	public static final int HTTP_STATUS_SERVICEUNAVAILABLE = 503;
	public static final int HTTP_STATUS_GATEWAYTIMEOUT =504;
	
	
}

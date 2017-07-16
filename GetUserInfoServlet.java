package cn.com.hkgt.H5.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.com.hkgt.H5.service.UserInfoService;
import cn.com.hkgt.H5.util.DownSaveImgUtils;
import cn.com.hkgt.H5.util.GetUerInfoUtil;
import cn.com.hkgt.H5.util.IdCreater;
import cn.com.hkgt.H5.util.PathUtil;
import cn.com.hkgt.H5.util.RandomStrUtil;
import cn.com.hkgt.H5.util.UtilCustomerIP;
import cn.com.hkgt.common.util.LogUtil;
import cn.com.hkgt.uran.model.Member;
import cn.com.hkgt.uran.model.SNSUserInfo;
import cn.com.hkgt.uran.model.WeixinOauth2Token;



public class GetUserInfoServlet extends HttpServlet {
	//hello world java
	
	private static final LogUtil logUtil = new LogUtil(GetUserInfoServlet.class);
	private static final long serialVersionUID = 1L;
	private UserInfoService userInfoService;
	private PathUtil pathUtil;
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	public PathUtil getPathUtil() {
		return pathUtil;
	}
	public void setPathUtil(PathUtil pathUtil) {
		this.pathUtil = pathUtil;
	}
	public GetUserInfoServlet() {
        super();
    }

	
}

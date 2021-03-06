package com.youku.soku.manage.interceptor;

import org.apache.log4j.Logger;
import org.apache.torque.TorqueException;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.youku.soku.manage.common.BaseActionSupport;

public class SokuLibConnMgrInterceptor implements Interceptor{

    public void destroy () {}

    public void init() {}

    Logger log = Logger.getLogger(this.getClass());
    
    @SuppressWarnings("finally")
	public String intercept(ActionInvocation actionInvocation) {
		
    	log.debug("*************SokuLibConnMgrInterceptor before interceptor:********* " );
	     	
	    String result = Action.ERROR;
	    BaseActionSupport action = (BaseActionSupport)actionInvocation.getAction();
		try {
			
			result = actionInvocation.invoke();
			log.debug("*************SokuLibConnMgrInterceptor after interceptor:********* " );
			
		} catch (TorqueException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				
		}
    	
		return result;
    }



}

package org.yzsunlight.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

import com.opensymphony.xwork2.util.ValueStack;

/**   
 * @Title: AAA.java 
 * @Package org.yzsunlight.action 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author yangz
 * @date 2016年3月25日 下午7:06:35 
 * @version V1.0   
 */
public class AAA extends ComponentTagSupport{

	@Override
	public Component getBean(ValueStack arg0, HttpServletRequest arg1,
			HttpServletResponse arg2) {
		// TODO Auto-generated method stub
		
		System.out.println("00000000000");
		System.out.println("11111111111");
		System.out.println("22222222222");
		System.out.println("33333333333");
		System.out.println("44444444444");
		System.out.println("555555555555");
		
		return null;
	}

}

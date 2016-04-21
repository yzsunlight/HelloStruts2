package org.yzsunlight.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	//Action的execute()处理方法
	public String execute()
	{
		System.out.println("Ok..........");
		//判断条件
		if(getMsg().equals(""))
		{
			System.out.println("请输入字符串");
			return "err";
		}
		else{
			//显示用户输入信息
			System.out.println(getMsg());
			//返回一个处理成功结果
			return "suc";
		}
	}
	
}

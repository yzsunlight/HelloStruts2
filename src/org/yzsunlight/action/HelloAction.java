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
	
	
	//Action��execute()������
	public String execute()
	{
		System.out.println("Ok..........");
		//�ж�����
		if(getMsg().equals(""))
		{
			System.out.println("�������ַ���");
			return "err";
		}
		else{
			//��ʾ�û�������Ϣ
			System.out.println(getMsg());
			//����һ������ɹ����
			return "suc";
		}
	}
	
}

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<html>
  <head>
	
	<script type="text/javascript" src="jquery.min.js"></script>
	<script type="text/javascript">
		function subForm(){
			$.post(
					"bookcode/HelloWorld.action",
					{
				    	'msg': $("#msg").val()
				    }
					, 
					function(data) {
					}
					, 'json'
				);
		}
	</script>
  </head>
  
  <body>
   
   <!-- form的action指向定义的action名称 -->
   <form method="post">
   	请输入消息字符串<input id="msg" name="msg" type="text" value="测试"/>
   	<input type="button" value="提交" onclick="subForm()" />
   </form>
  </body>
</html>

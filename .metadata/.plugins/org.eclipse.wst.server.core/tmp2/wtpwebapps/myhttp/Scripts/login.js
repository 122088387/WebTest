function checkOk(){
//    alert("登录成功！"); 
    var now=new Date();
    var year=now.getYear();
    var month=now.getMonth();
    var date=now.getDate();
    var day=now.getDay();
    var hour=now.getHours();
    var minu=now.getMinutes();
    var sec=now.getSeconds();
    var week;
    month=month+1;
    if(month<10) month="0"+month;
    if(date<10) date="0"+date;
    if(hour<10) hour="0"+hour;
    if(minu<10) minu="0"+minu;
    if(sec<10) sec="0"+sec;
    var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
    week=arr_week[day];
    var time="";
    time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;
//    var string;
//    string=document.getElementById('selectId').value;
    alert(time);
    return time;
    /*<jsp:forward page="/test2.jsp"/>*/
}
function checkNo(){
	alert("登录失败！");
	
}
function validate() { 
	//获取表单提交的内容 
	var idField = document.getElementById("username"); 
	//访问validate.do这个servlet，同时把获取的表单内容idField加入url字符串，以便传递给validate.do 
	var url = "httpServer.do?username=" + escape(idField.value); 
	//创建一个XMLHttpRequest对象req 
	if(window.XMLHttpRequest) { 
	//IE7, Firefox, Opera支持 
	req = new XMLHttpRequest(); 
	}else if(window.ActiveXObject) { 
	//IE5,IE6支持 
	req = new ActiveXObject("Microsoft.XMLHTTP"); 
	alert(req); 
	} 
	/* 
	open(String method,String url, boolean )函数有3个参数 
	method参数指定向servlet发送请求所使用的方法，有GET,POST等 
	boolean值指定是否异步，true为使用，false为不使用。 
	我们使用异步才能体会到Ajax强大的异步功能。 
	*/ 
	req.open("POST", url, true); 
	//onreadystatechange属性存有处理服务器响应的函数,有5个取值分别代表不同状态 
	req.onreadystatechange = callback; 
	//send函数发送请求 
	req.send(null); 
	} 

	function callback() { 
	if(req.readyState == 4 && req.status == 200) { 
	var check = req.responseText; 
	show (check); 
	} 
	} 

	function show(str) { 
	if(str == "login is success !") { 
	var show = "<font color='green'>恭喜！！用户名可用！</font>"; 
	document.getElementById("info").innerHTML = show; 
	} 
	else if( str == "NO") { 
	var show = "<font color='red'>对不起，用户名不可用！！请重新输入！</font>"; 
	document.getElementById("info").innerHTML = show; 
	} 
	}
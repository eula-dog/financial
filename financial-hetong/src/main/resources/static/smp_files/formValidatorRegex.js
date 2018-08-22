// 正则做参考，拷贝使用，注意正则前后加转义符
var regexEnum = 
{
	intege:"^-?[1-9]\d*$",					//整数
	intege1:"^[1-9]\d*$",					//正整数
	intege2:"^-[1-9]\d*$",					//负整数
	num:"^([+-]?)\d*\.?\d+$",			//数字
	num1:"^[1-9]\d*|0$",					//正数（正整数 + 0）
	num2:"^-[1-9]\d*|0$",					//负数（负整数 + 0）
	decmal:"^([+-]?)\d*\.\d+$",			//浮点数
	decmal1:"^[1-9]\d*.\d*|0.\d*[1-9]\d*$",　　	//正浮点数
	decmal2:"^-([1-9]\d*.\d*|0.\d*[1-9]\d*)$",　 //负浮点数
	decmal3:"^-?([1-9]\d*.\d*|0.\d*[1-9]\d*|0?.0+|0)$",　 //浮点数
	decmal4:"^[1-9]\d*.\d*|0.\d*[1-9]\d*|0?.0+|0$",　　 //非负浮点数（正浮点数 + 0）
	decmal5:"^(-([1-9]\d*.\d*|0.\d*[1-9]\d*))|0?.0+|0$",　　//非正浮点数（负浮点数 + 0）

	email:"^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$", //邮件
	color:"^[a-fA-F0-9]{6}$",				//颜色
	url:"^http[s]?:\/\/([\w-]+\.)+[\w-]+([\w-./?%&=]*)?$",	//url
	chinese:"^[\u4E00-\u9FA5\uF900-\uFA2D]+$",					//仅中文
	ascii:"^[\x00-\xFF]+$",				//仅ACSII字符
	zipcode:"^\d{6}$",						//邮编
	mobile:"^(13|15|18|14)[0-9]{9}$",				//手机
	ip4:"^(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)$",	//ip地址
	notempty:"^\S+$",						//非空
	picture:"(.*)\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$",	//图片
	rar:"(.*)\.(rar|zip|7zip|tgz)$",								//压缩文件
	date:"^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$",					//日期
	qq:"^[1-9]*[1-9][0-9]*$",				//QQ号码
	tel:"^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$",	//电话号码的函数(包括验证国内区号,国际区号,分机号)
	username:"^\w+$",						//用来用户注册。匹配由数字、26个英文字母或者下划线组成的字符串
	letter:"^[A-Za-z]+$",					//字母
	letter_u:"^[A-Z]+$",					//大写字母
	letter_l:"^[a-z]+$",					//小写字母
	idcard:"^[1-9]([0-9]{14}|[0-9]{17})$",	//身份证
	english:"^[A-Za-z]+$"
}

var aCity={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"} 

function isCardID(sId){ 
	var iSum=0 ;
	var info="" ;
	if(!/^\d{17}(\d|x)$/i.test(sId)) return "你输入的身份证长度或格式错误"; 
	sId=sId.replace(/x$/i,"a"); 
	if(aCity[parseInt(sId.substr(0,2))]==null) return "你的身份证地区非法"; 
	sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2)); 
	var d=new Date(sBirthday.replace(/-/g,"/")) ;
	if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return "身份证上的出生日期非法"; 
	for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;
	if(iSum%11!=1) return "你输入的身份证号非法"; 
	return true;//aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女") 
} 

//自定义验证
$.extend($.fn.validatebox.defaults.rules, {
	// 混合验证  五个参数，第一个是正则表达式，第二个是错误提示信息，第三个是调用的url，第四个是传递给服务器的参数名称，第五个是错误提示信息
	 	Composite_validation: { 
       validator: function(value, param) {  
           var m_reg = new RegExp(param[0]); //传递过来的正则字符串中的"\"必须是"\\"  
           if (!m_reg.test(value)) {  
               $.fn.validatebox.defaults.rules.Composite_validation.message = param[1];  
               return false;  
           }  
           else {  
               var postdata = {};  
               postdata[param[3]] = value;  
               var result = $.ajax({  
                   url: param[2],  
                   data: postdata,  
                   async: false,  
                   type: "post"  
               }).responseText;
               if (result == "false") {
                   $.fn.validatebox.defaults.rules.Composite_validation.message = param[4];  
                   return false;  
               }  
               else {  
                   return true;  
               }  
           }  
       },  
       message: ''  
   },
   equalTo: { 
       validator: function(value, param) {
           // 做某些检查
			return value == $('#'+param[0]).val();
       },  
       message: '两次输入的密码不一致'
	},
    mobile: {
        validator: function (value, param) {
            return /^(13|15|18|14)[0-9]{9}$/.test(value);
        },
        message: '手机号码不正确'
    },
    tel: {
        validator: function (value, param) {
    		$.fn.validatebox.defaults.rules.tel.message = param[0];  
        	return /^\d{3,4}-\d{7,9}$/.test(value);
        },
        message: ''
    },
    number: {
        validator: function (value, param) {
            return /^\d+$/.test(value);
        },
        message: '请输入数字'
    },
    idcard: {
        validator: function (value, param) {
       		var result = isCardID(value);
            if(result == true) {
            	return true;
            } else {
            	$.fn.validatebox.defaults.rules.idcard.message = result;  
                return false;  
            }
        },
        message:''
    },
    chinese: { 
       validator: function(value, param) {
			return /^[\u4E00-\u9FA5\uF900-\uFA2D]+$/.test(value);
       },  
       message: '只能输入中文'
	},
	english : {
        validator : function(value, param) { 
            return /^\w+$/.test(value);  
        }, 
        message : '只能输入英文' 
    },
    unChinese : {
        validator : function(value, param) { 
    	//return /^[\w-.\/?%&=]*$/.test(value); 
			if(/^[\u4E00-\u9FA5\uF900-\uFA2D]+$/.test(value)) {
				return false;
			}
			return true;
        }, 
        message : '能输入除中文以外的字符' 
    }
});

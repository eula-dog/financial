$(function(){
	$.ajaxSetup({
   		statusCode: { 
			490: function(jqXHR, textStatus) {
				alert('490 自定义代码，session超时');
				//var resObj = $.parseJSON(jqXHR.responseText);
				var redirectUrl = jqXHR.responseText;
				top.location = redirectUrl;
			}
		},	
		beforeSend:function(jqXHR, settings){
			
		},
		complete:function(jqXHR, textStatus){
			var resObj = jqXHR.responseText;
			if(typeof(resObj) == 'string'){
				if(resObj.indexOf('j_spring_cas_security_check')>0){
					//alert(resObj);
					//var redirectUrl = resObj.substring(resObj.indexOf('top.location.href=')+17);
					//redirectUrl = redirectUrl.substring(0,redirectUrl.indexOf(';'));
					//alert(redirectUrl);
					top.location = self.location;
				}
			}
		}
   	});
})

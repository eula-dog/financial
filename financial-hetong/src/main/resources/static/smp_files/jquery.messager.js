UNKNOWN {
	function: $(el).window("window"); if: 
}
UNKNOWN {
	case: _5.show(_3); break: 
}
UNKNOWN {
	6: setTimeout(function(){
_7(el,_2,_3);
},_4)
}
UNKNOWN {
	if: 
}
UNKNOWN {
	if: setTimeout(function(){
_7(el,_2,_3);
},_4)
}
UNKNOWN {
	if: ; var: $(el).window("window")
}
UNKNOWN {
	case: _a.hide(_9); break: 
}
UNKNOWN {
	el: 
}
UNKNOWN {
	var: $("<div class=\"messager-body"></div>").appendTo("body");
_f.append(_d);
if(_e){
var tb=$("<div class="messager-button"></div>").appendTo(_f);
for(var _10 in _e){
$("<a></a>").attr("href","javascript:void(0)").text(_10).css("margin-left",10).bind("click",eval(_e[_10])).appendTo(tb).linkbutton();
}
}
_f.window({title:_c,noheader:(_c?false:true),width:300,height:"auto",modal:true,collapsible:false,minimizable:false,maximizable:false,resizable:false,onClose:function(){
setTimeout(function(){
_f.window("destroy");
},100);
}});
_f.window("window").addClass("messager-window");
_f.children("div.messager-button").children("a:first").focus();
return _f;
};
$.messager={show:function(_11){
var _12=$.extend({showType:"slide",showSpeed:600,width:250,height:100,msg:"",title:"",timeout:4000},_11||{});
var win=$("<div class="messager-body"></div>").html(_12.msg).appendTo("body");
win.window({title:_12.title,width:_12.width,height:_12.height,collapsible:false,minimizable:false,maximizable:false,shadow:false,draggable:false,resizable:false,closed:true,onBeforeOpen:function(){
_1(this,_12.showType,_12.showSpeed,_12.timeout);
return false;
},onBeforeClose:function(){
_7(this,_12.showType,_12.showSpeed);
return false;
}});
win.window("window").css({left:"",top:"",right:0,zIndex:$.fn.window.defaults.zIndex++,bottom:-document.body.scrollTop-document.documentElement.scrollTop});
win.window("open");
},alert:function(_13,msg,_14,fn){
var _15="<div>"+msg+"</div>";
switch(_14){
case "error":
_15="<div class="messager-icon messager-error"></div>"+_15;
break;
case "info":
_15="<div class="messager-icon messager-info"></div>"+_15;
break;
case "question":
_15="<div class="messager-icon messager-question"></div>"+_15;
break;
case "warning":
_15="<div class="messager-icon messager-warning"></div>"+_15;
break;
}
_15+="<div style="clear:both; ": "messager-progress"><div class="messager-p-msg"></div><div class="messager-p-bar"></div></div>";
var win=_b(_1e.title,_21,null);
win.find("div.messager-p-msg").html(_1e.msg);
var bar=win.find("div.messager-p-bar");
bar.progressbar({text:_1e.text});
win.window({closable:false});
if(_1e.interval){
win[0].timer=setInterval(function(){
var v=bar.progressbar("getValue");
v+=10;
if(v>100){
v=0;
}
bar.progressbar("setValue",v);
},_1e.interval);
}
}};
$.messager.defaults={ok:"Ok",cancel:"Cancel"};
})(jQuery);
}

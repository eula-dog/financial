var const_index = '首页';
function tabClose() {
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children(".tabs-closable").text();
		$('#tabs').tabs('close',subtitle);
	})
	/*为选项卡绑定右键*/
	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY
		});

		var subtitle =$(this).children(".tabs-closable").text();

		$('#mm').data("currtab",subtitle);
		$('#tabs').tabs('select',subtitle);
		return false;
	});
}
//绑定右键菜单事件
function tabCloseEven() {
	//刷新
	$('#mm-tabupdate').click(function(){
		refreshTab();
	})
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	})
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			// 不关闭首页
			if(t == const_index) {
				return;
			}
			$('#tabs').tabs('close',t);
		});
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		$('#mm-tabcloseright').click();
		$('#mm-tabcloseleft').click();
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			// 不关闭首页
			if(t == const_index) {
				return;
			}
			$('#tabs').tabs('close',t);
		});
		return false;
	});
}		
//刷新制指定的TAB
function clicktwo(){
	var pp=$('#tabs').tabs('select','待办任务列表');
	var currTab = $('#tabs').tabs('getSelected');
	if(null != currTab.panel('options').content) {//没有选中页时不刷新
		var url = $(currTab.panel('options').content).attr('src');
		$('#tabs').tabs('update',{
			tab:currTab,
			options:{
				content:createFrame(url)
			}
		})
	}
	
}
//关闭指定的TAB
function clickthree(){
	if($('#tabs').tabs('exists', '修改员工')){
		$('#tabs').tabs('close','修改员工');
	}
}
// 创建tab对象
function creatTabObj(text, action) {
	var node = {};
	node.menuCnName = text;
	node.menuAction = action;
	return node;
}
function openTab(node) {
	// 判断页面是否已打开
	if($('#tabs').tabs('exists', node.menuCnName)) {
		// 重复打开tab页，则选中
		$('#tabs').tabs('select', node.menuCnName);
		refreshTab();
		return;
	}
	openNewTab(node);
}
function openNewTab(node) {
	// 去掉空格的菜单动作为空串时或#号时，内容为空
	var strContent = '';
	node.menuAction = node.menuAction.replace(/\s+/g,"");
	if('' != node.menuAction && '#' != node.menuAction) {
		//strContent = "<iframe scrolling='auto' frameborder='0' src=common/blank.jsp?url=" + node.menuAction + " style='width:100%;height:100%;'></iframe>";
		strContent = "<iframe scrolling='auto' frameborder='0' src=" + node.menuAction + " style='width:100%;height:100%;'></iframe>";
	}
	// iframe方式打开页面
	$('#tabs').tabs('add',{   
		title:node.menuCnName,   
		closable:true,
		content:strContent
	});
	// 增加选项卡事件
	tabClose();
}
function openTabOrRefresh(node) {
	// 判断页面是否已打开
	if($('#tabs').tabs('exists', node.menuCnName)) {
		$('#tabs').tabs('close',node.menuCnName);
	}			
	openNewTab(node);
}
// 关闭刷新父页面
function closeTab(node) {
	// 判断页面是否已关闭
	if($('#tabs').tabs('exists', node.menuCnName)) {
		$('#tabs').tabs('close',node.menuCnName);
		refreshTab();
	}
}
//刷新
function refreshTab(){
	var currTab = $('#tabs').tabs('getSelected');
	if(null != currTab.panel('options').content) {//没有选中页时不刷新
		var url = $(currTab.panel('options').content).attr('src');
		$('#tabs').tabs('update',{
			tab:currTab,
			options:{
				content:createFrame(url)
			}
		})
	}
}
function createFrame(url)
{
	var s = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}
// 关闭当前tab不刷新
function closeCurrentTab() {
	var text = parent.$('#tabs').tabs('getSelected').panel('options').title;
	// 判断页面是否已关闭
	if($('#tabs').tabs('exists', text)) {
		$('#tabs').tabs('close', text);
	}
}
// 获取url传的参数，只取一个
function getParam(url) {
    var name = "";
    if (url.indexOf("=") > 0)
    {
        name = url.substring(url.indexOf("=") + 1, url.length)
    }
    return name;
}
// 获取当前鼠标位置
function mousePosition(ev) {
	if(ev.pageX || ev.pageY) {
    	return {x:ev.pageX, y:ev.pageY};
    }
    return{x:ev.clientX + document.body.scrollLeft - document.body.clientLeft, y:ev.clientY + document.body.scrollTop  - document.body.clientTop};
}

function addSubPage(title,url){    
    var jq = top.jQuery;
    if (jq("#tabs").tabs('exists', title)){    
        jq("#tabs").tabs('select', title);    
    } else {  
          var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';     
           jq("#tabs").tabs('add',{    
                  title:title,    
                  content:content,    
                  closable:true    
                });    
     }    
}  

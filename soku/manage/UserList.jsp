<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title><s:text name="user.title.list" /></title>


	<link href="<s:url value="/soku/manage/css/all.css"/>" rel="stylesheet"
	type="text/css" />
	
	<script type="text/javascript" src="<s:url value="/soku/manage/js/jquery-1.3.2.js"/>"></script>
	
	<script type="text/javascript">
		$(function() {
			$("#pageselect").change(function() {
				location.href = $("#pageurl").val() + $("#pageselect").val();
			});

			$("a[name='deleteLink']").click(function() {
				return confirm("确认删除？");
			});

			$("#thcheck").click(function() {
				if($(this).attr("checked")) {
					$("[name=batchdeleteids]").each(function(){
						$(this).attr("checked", true);
					});
				} else {
					$("[name=batchdeleteids]").each(function() {
						$(this).attr("checked", false);
					});
				}
			});

		 $("#batchdelete").click(function() {
			 
			 haschecked = false;
			 $("[name=batchdeleteids]").each(function(){
					if($(this).attr("checked"))
						haschecked = true;
				});
			 if(haschecked) {
				if(!confirm("确认删除？"))
					 return false;
				$("#User_batchdelete").submit();
			 } else {
				 alert("没有数据要删除");
				 return false;
			 }
			 return false;
		 });
		});
	</script>
</head>
<body>
<div id="main">
  <div id="header"> <a href="#" class="logo"><img src="img/logo.gif" width="101" height="29" alt="" /></a>
   		
  </div>
  <div id="middle">
   <s:if test='shieldUser'>
   	<s:include value="module/shieldleftnav.jsp"></s:include>
   </s:if>
   <s:else><s:include value="module/leftnav.jsp"></s:include></s:else>
    
    <div id="center-column">
      <div class="top-bar"> 
      <a href="<s:url action="User_input">
			<s:param name="userId" value="-1" />
		</s:url>"  class="button"><s:text
            name="user.add"/></a>
        <h1><s:text name="soku.user.title" /></h1>
      </div>
      <br />
      <div class="select-bar">
           <s:form action="User_list" validate="false" cssClass="form" theme="simple">
	        <s:if test="itemFilter!=null">
			</s:if>
      		<label>
	        <s:textfield key="searchWord" cssClass="text"/>
	        </label>
	        <label>
	        <input type="submit" name="Submit" class="ui-button ui-state-default ui-corner-all" value="Search" />
	        </label>
      	</s:form> 
      </div>
      <div class="table"> <img src="img/bg-th-left.gif" width="8" height="7" alt="" class="left" /> <img src="img/bg-th-right.gif" width="7" height="7" alt="" class="right" />
       	<s:form action="User_batchdelete" validate="false" cssClass="form" theme="simple">
        <table class="listing" cellpadding="0" cellspacing="0">

				<tr>
					<th align="center" width="5%"><input id="thcheck" type="checkbox" /></th>
					<th align="center" width="25%"><s:text name="user.heading.name" /></th>
					<th align="center" width="20%"><s:text name="user.heading.email" /></th>
					<th align="center" width="10%"><s:text name="user.heading.actualname" /></th>
					<th align="center" width="10%"><s:text name="user.heading.operation" /></th>
				</tr>

				<s:iterator value="pageInfo.results" status="index">
					<tr <s:if test="#index.odd">class="bg"</s:if>>
						<td align="center"><input type="checkbox" name="batchdeleteids" value="<s:property value="userId" />" /></td>
						<td align="left"><s:property value="name"/></td>
						<td align="left"><s:property value="email" /></td>
						<td align="center"><s:property value="actualName" /></td>
						<td align="center"><a name="deleteLink" class="listbutton"
							href="<s:url action="User_delete"><s:param name="userId" value="userId"/></s:url>">
						<s:text name="user.delete" /> </a> &nbsp; <a class="listbutton"
							href="<s:url action="User_input"><s:param name="userId" value="userId"/></s:url>">
						<s:text name="user.edit" /> </a></td>
					</tr>
				</s:iterator>
				
				 <tfoot>
					<tr>
						<td><a href="#" id="batchdelete">删除</a></td>
						<td colspan="4">
						<s:text name="totalpagenumber" />: <s:property value="pageInfo.totalPageNumber"/>
						<s:text name="currentpagenumber" />: <s:property value="pageInfo.currentPageNumber"/>
						<s:if test="pageInfo.hasPrevPage">
						<a href="<s:url action="User_list">
								<s:param name="pageNumber" value="pageInfo.currentPageNumber - 1" />
								<s:param name="searchWord" value="searchWord" />
							</s:url>"><s:text
								name="prevpage"/></a>
						</s:if>
						<s:if test="pageInfo.hasNextPage">
						<a href="<s:url action="User_list">
								<s:param name="pageNumber" value="pageInfo.currentPageNumber + 1" />
								<s:param name="searchWord" value="searchWord" />
							</s:url>"><s:text
								name="nextpage"/></a>
						</s:if></td>
					</tr>
				</tfoot>
			</table>
			</s:form>
        <div class="select"> <strong>Other Pages: </strong>
           <input type="hidden" id="pageurl" value="<s:url action="User_list">
								<s:param name="searchWord" value="searchWord" />
								<s:param name="itemFilter" value="itemFilter" />
								<s:param name="pageNumber" value="0" />
							</s:url>" />
          <select id="pageselect">
          		<s:bean name="org.apache.struts2.util.Counter" id="counter">  
     			 <s:param name="first" value="1"/>  
     			 <s:param name="last" value="10"/>  
   				 	<s:iterator status="count">  
   				 		<s:if test="(pageInfo.currentPageNumber - #count.index) > 0">
     					 <option><s:property value="pageInfo.currentPageNumber - #count.index"/></option>
     					 </s:if> 
    				</s:iterator>  
   			 	</s:bean> 
          		 
          	   <s:bean name="org.apache.struts2.util.Counter" id="counter">  
     			 <s:param name="first" value="1"/>  
     			 <s:param name="last" value="10"/>  
   				 	<s:iterator status="count">  
   				 		<s:if test="(pageInfo.currentPageNumber + #count.index) < pageInfo.totalPageNumber">
     					 	<option><s:property value="#count.index + pageInfo.currentPageNumber + 1"/></option>
     					</s:if>  
    				</s:iterator>  
   			 	</s:bean>  
          </select>
        </div>
      </div>
      
    </div>
    
  </div>
  <div id="footer"></div>
</div>
</body>
</html>

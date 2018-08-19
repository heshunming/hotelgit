/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.fenye.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Rz;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;

import com.hotel.fenye.Pagination;


public class FenYeYzrAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		 String zzpage=null;
		 zzpage=request.getParameter("zzpage");
		 int startPage=0;
		 if(zzpage==null)
		 {
			 
			  startPage=Integer.parseInt(request.getParameter("page"));
		 }
		 else
		 {
			  startPage=Integer.parseInt(zzpage)-1;
		 }
		 
		 
		 Pagination pagination=(Pagination)request.getSession().getAttribute("pagination");
		 
		 if(startPage<0)
		 {
			 startPage=0;
		 }
		 else if(startPage>=pagination.pageNum){
			 startPage=pagination.pageNum-1;
		 }
		 
		
		 // ��ʼ������
		 		 		 		
		 pagination.setStartPage(startPage);

		 List<Rz> teli = mgr.findAllYdFenYe(pagination.jsc,pagination.keyWord,pagination.startPage*pagination.lineNum, pagination.lineNum);
		 request.getSession().setAttribute("pagination", pagination);
		 request.setAttribute("yd", teli);
			
		return mapping.findForward("ydzhuanrz");
	}
}		
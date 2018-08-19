package com.hotel.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fj;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;

public class AYjAction extends BaseAction  {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int  fjid=Integer.parseInt(request.getParameter("fjid"));
		
		Fj fj=mgr.findFjById(fjid);
		System.out.print(fj.getFjlx().getDj());
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
		response.getWriter().write("<message>"+fj.getFjlx().getDj()+"</message>");
		
		return null;
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Js;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;


public class DeleJsAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		int jsid = Integer.parseInt(request.getParameter("jsid"));
		Js js = mgr.findJsByJsid(jsid);
		mgr.deleJs(js);
		return mapping.findForward("viewalljs");
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Czy;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.BaseAction;


public class ViewCzyByNameAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaValidatorForm f = (DynaValidatorForm) form;
		String name = f.getString("username");
		List list = mgr.findCzyByName(name);
		Czy c = (Czy)list.get(0);
		System.out.print(c.getUsername());
		request.setAttribute("czy", list);
		return mapping.findForward("viewallczy");
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Sygs;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.BaseAction;

public class AddGsAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaValidatorForm f = (DynaValidatorForm) form;// TODO Auto-generated method stub
		String gsmc = f.getString("gsmc");
		String mm = f.getString("mm");
		String gsdz = f.getString("gsdz");
		String gsdh = f.getString("gsdh");
		String beizhu = f.getString("beizhu");
		
		Sygs gs = new Sygs();
		
		gs.setGsmc(gsmc);
		gs.setBeizhu(beizhu);
		gs.setGsdh(gsdh);
		gs.setGsdz(gsdz);
		gs.setMm(mm);
		
		mgr.addGs(gs);
		return mapping.findForward("viewallgs");
	}
}
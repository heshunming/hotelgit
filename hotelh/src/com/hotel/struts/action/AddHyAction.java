/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hy;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.BaseAction;


public class AddHyAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaValidatorForm f = (DynaValidatorForm) form;// TODO Auto-generated method stub
		String hyxm = f.getString("hyxm");
		String hymm = f.getString("hymm");
		String hyxb = f.getString("hyxb");
		String zjlb = f.getString("zjlb");
		String zjbh = f.getString("zjbh");
		String dz = f.getString("dz");
		String lxdh = f.getString("lxdh");
		String beizhu = f.getString("beizhu");
		
		Hy hy = new Hy();
		
		hy.setBeizhu(beizhu);
		hy.setDz(dz);
		hy.setHymm(hymm);
		hy.setHyxb(hyxb);
		hy.setHyxm(hyxm);
		hy.setLxdh(lxdh);
		hy.setZjbh(zjbh);
		hy.setZjlb(zjlb);
		
		mgr.addHy(hy);
		return mapping.findForward("a");
	}
}
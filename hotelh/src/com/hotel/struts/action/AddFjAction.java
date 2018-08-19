/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fj;
import model.Fjlx;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.BaseAction;


public class AddFjAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaValidatorForm addFjForm = (DynaValidatorForm) form;// TODO Auto-generated method stub
		Fj f = new Fj();
		String fxno = addFjForm.getString("fjlxno");
		Fjlx fx = mgr.findFjlxByFjlxno(fxno);
		f.setFjno(addFjForm.getString("fjno"));
//		System.out.print(addFjForm.getString("fjlxno")+"aa");
		f.setFjlx(fx);
		System.out.print(addFjForm.getString("fjzt"));
		f.setFjzt(addFjForm.getString("fjzt"));
		f.setLc(Integer.parseInt((addFjForm.getString("lc"))));
		f.setFjdh(addFjForm.getString("fjdh"));
		f.setYdzt(0);
		f.setBeizhu(addFjForm.getString("beizhu"));
		
		mgr.addFj(f);
		
		
		return mapping.findForward("success");
	}
}
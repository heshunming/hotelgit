/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Fj;
import model.Kh;
import model.Rz;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;

import com.hotel.dao.impl.KhDaoImpl;
import com.hotel.fenye.Pagination;

public class ViewJsByZdAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		List list = null;
		String key = request.getParameter("zd");
		String value = request.getParameter("bl");

		Pagination pagination = (Pagination) request.getSession().getAttribute(
				"pagination");
		pagination.startPage = 0;
		pagination.setJsc(key);
		pagination.setKeyWord(value);

		pagination.setPageNum(mgr.JsTatal(key,value));
		
		List<Rz> teli = mgr.findAllJsFenYe(key,value, 0, pagination.lineNum);
		request.getSession().setAttribute("pagination", pagination);
		request.setAttribute("js", teli);
		return mapping.findForward("viewalljs");
	}
}
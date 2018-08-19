/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Rz;
import model.Yd;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;

import com.hotel.fenye.Pagination;

public class ViewYdByKhmcAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		String key = "kh.khmc"; 
		String value = request.getParameter("mc");

		Pagination pagination = (Pagination) request.getSession().getAttribute(
				"pagination");
		pagination.startPage = 0;
		pagination.setJsc(key);
		pagination.setKeyWord(value);
		
		pagination.setPageNum(mgr.YdTatal(key,value));
		

		List<Rz> teli = mgr.findAllYdFenYe(key,value, 0, pagination.lineNum);
		request.getSession().setAttribute("pagination", pagination);
		request.setAttribute("yd", teli);
		
		return mapping.findForward("ydbj");
	}
}
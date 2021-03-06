/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hotel.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Rz;
import model.Yd;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.yeeku.struts.base.BaseAction;

import com.hotel.fenye.Pagination;


public class ViewAllYdAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		Pagination pagination = new Pagination();
		pagination.setJsc("fj.fjno");
		pagination.setKeyWord("");
		int total=mgr.YdTatal("fj.fjno","");
		HttpSession session=request.getSession();
		session.setAttribute("location1", "预定管理");
		session.setAttribute("location2", "预定信息管理");
		pagination.setPageNum(total);	
        
		List<Yd> teli = mgr.findAllYdFenYe("fj.fjno","", 0, pagination.lineNum);
		request.getSession().setAttribute("pagination", pagination);
		request.setAttribute("yd", teli);
				
		
		String yzr = request.getParameter("yzr");
		String yr = (String)request.getAttribute("yzr");

		if("yzr".equals(yzr) || "yzr".equals(yr)){
			return mapping.findForward("ydzhuangrz");
		}
		
		return mapping.findForward("ydbj");
	}
}
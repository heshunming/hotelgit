package org.yeeku.struts.authority;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuthorityInterceptor implements MethodInterceptor
{

    public Object invoke(MethodInvocation invocation) throws Throwable
	{
        HttpServletRequest request = null;
        ActionMapping mapping = null;
        Object[] args = invocation.getArguments();
        for (int i = 0 ; i < args.length ; i++ )
        {
            if (args[i] instanceof HttpServletRequest) request = (HttpServletRequest)args[i];
            if (args[i] instanceof ActionMapping) mapping = (ActionMapping)args[i];
        }
        if ( request.getSession().getAttribute("userId") != null)
        {
            return invocation.proceed();
        }
        else
        {
            return mapping.findForward("login");
        }
    }
}
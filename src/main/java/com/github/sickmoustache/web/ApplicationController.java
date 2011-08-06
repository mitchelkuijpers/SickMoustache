package com.github.sickmoustache.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This would be the start for the application, we only want one servlet.
 */
public class ApplicationController {

    protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Returning start view");
		return new ModelAndView("start.jsp");
	}
}

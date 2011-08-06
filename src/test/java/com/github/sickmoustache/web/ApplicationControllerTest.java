package com.github.sickmoustache.web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

public class ApplicationControllerTest extends TestCase {

    public void testHandleRequestView() throws Exception{
		ApplicationController controller = new ApplicationController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("start.jsp", modelAndView.getViewName());
	}

}

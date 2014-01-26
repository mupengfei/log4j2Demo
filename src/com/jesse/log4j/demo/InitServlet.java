package com.jesse.log4j.demo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.apache.logging.log4j.util.ProviderUtil;

public class InitServlet extends HttpServlet {
	private Logger logger = LogManager.getLogger(InitServlet.class.getName());  
	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		System.out.println("Hello World");
		logger.error("Hello World");
		logger.info("Hello World");
		int i = 0;
		PropertiesUtil pu = PropertiesUtil.getProperties();
		System.out.println( ProviderUtil.hasProviders());
//		while(i < 10240){
//			logger.entry();
//			logger.error("Hello World");
//			logger.exit();
//			logger.catching(new Exception(""));
//			i++;
//		}
	}
}

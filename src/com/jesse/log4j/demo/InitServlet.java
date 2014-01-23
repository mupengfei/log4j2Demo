package com.jesse.log4j.demo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
		while(i < 100000){
			logger.entry();
			logger.error("Hello World");
			logger.exit();
			i++;
		}
	}
}

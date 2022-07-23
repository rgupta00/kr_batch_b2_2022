package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public CalController() {
		System.out.println("ctr ...");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer n1=Integer.parseInt(request.getParameter("n1"));
		Integer n2=Integer.parseInt(request.getParameter("n2"));
		
		Integer sum=n1+n2;
		
		PrintWriter out=response.getWriter();
		out.print("sum: "+ sum);
	}
}

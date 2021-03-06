package com.iii.team03.henry;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value="/hello", name="helloServlet")
public class HelloServlet extends GenericServlet {
    @Override
    public void init() throws ServletException{
    	System.out.println("init");
    }
	
	@Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("Hello world!!");
    }
	
	@Override
	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}

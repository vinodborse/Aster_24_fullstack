package com.sk;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			String userReq = req.getParameter("q");

	     	
	     	String result;
	     	if(userReq.equals("cricket")) {
	     		result = " Live cricket scores and updates for IPL 2025 and all current top-level cricket matches for men and women - Tests, ODIs, T20s, first-class cricket, List A";
	     	} else if (userReq.equals("music")) {
	     		result = "YouTube Music With the YouTube Music app, enjoy over 100 million songs at your fingertips, plus albums, playlists, remixes, music videos, live performances, covers";
	     	} else {
	     		result = "SORRY";
	     	}
	     	
	     	
	     	req.setAttribute("myData", result);
	     	req.getRequestDispatcher("index.jsp").forward(req, resp);
	     	
	    }
}

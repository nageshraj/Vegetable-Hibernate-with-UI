package com.wolken.wolkenapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.service.VegetableService;
import com.wolken.wolkenapp.service.VegetableServiceImpl;

@WebServlet(urlPatterns = "/delete", loadOnStartup = +1)
public class VegetableServletForDelete extends HttpServlet {

	VegetableService vegetableService = new VegetableServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int vegetableIdToBeDeleted = Integer.parseInt(req.getParameter("vegIdToDelete"));

		vegetableService.validateAndDeleteById(vegetableIdToBeDeleted);

		PrintWriter printWriter = resp.getWriter();

		
		resp.setContentType("text/html");
		printWriter.print("<center><h2>SUCCESSFULLY DELETED</h2><a href='http://localhost:8080/vegetable-hibernate-UI/' > HOME PAGE </a><br><br> <a href='http://localhost:8080/vegetable-hibernate-UI/getAll?' >CHECK RESULTS</a></center>");



		printWriter.flush();
		printWriter.close();

	}

}

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

@WebServlet(urlPatterns = "/update", loadOnStartup = +1)
public class VegetableServletForUpdate extends HttpServlet {
	
	VegetableService vegetableService = new VegetableServiceImpl();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int vegetableId = Integer.parseInt(req.getParameter("vegIdToUpdate"));
		String vegetableName = req.getParameter("vegNameToUpdate");

		vegetableService.validateAndUpdateNameById(vegetableId,vegetableName);
		
		PrintWriter printWriter = resp.getWriter();

		
		resp.setContentType("text/html");
		printWriter.print("<center><h2>SUCCESSFULLY UPDATED</h2><a href='http://localhost:8080/vegetable-hibernate-UI/' > HOME PAGE </a><br><br> <a href='http://localhost:8080/vegetable-hibernate-UI/getAll?' > VIEW RESULTS </a></center>");



		printWriter.flush();
		printWriter.close();
	
	}

}

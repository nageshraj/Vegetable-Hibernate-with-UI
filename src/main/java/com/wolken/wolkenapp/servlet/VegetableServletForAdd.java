package com.wolken.wolkenapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.VegetableDTO;
import com.wolken.wolkenapp.service.VegetableService;
import com.wolken.wolkenapp.service.VegetableServiceImpl;

@WebServlet(urlPatterns = "/add", loadOnStartup = +1)
public class VegetableServletForAdd extends HttpServlet {

	VegetableDTO vegetableDTO = new VegetableDTO();
	VegetableService vegetableService = new VegetableServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int vegetableId = Integer.parseInt(req.getParameter("vegId"));
		String vegetableName = req.getParameter("vegName");
		String vegetableColor = req.getParameter("vegColor");

		vegetableDTO.setVegetableId(vegetableId);
		vegetableDTO.setVegetableName(vegetableName);
		vegetableDTO.setVegetableColor(vegetableColor);

		vegetableService.validateAndAddVegetable(vegetableDTO);

		vegetableService.validateAndGetAll();
		
		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		printWriter.print("<center><h2>SUCCESSFULLY ADDED</h2><a href='http://localhost:8080/vegetable-hibernate-UI/' > HOME PAGE </a></center>");

		printWriter.flush();
		printWriter.close();
	}

}

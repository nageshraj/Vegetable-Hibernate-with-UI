package com.wolken.wolkenapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.VegetableDTO;
import com.wolken.wolkenapp.service.VegetableService;
import com.wolken.wolkenapp.service.VegetableServiceImpl;

@WebServlet(urlPatterns = "/getAll", loadOnStartup = +1)

public class VegetableServletForDisplayAll extends HttpServlet {

	VegetableService vegetableService = new VegetableServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<VegetableDTO> vegetableList = vegetableService.validateAndGetAll();

		req.setAttribute("vegList", vegetableList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("displayResults.jsp");
		dispatcher.forward(req, resp);

//		PrintWriter printWriter = resp.getWriter();
//
//		resp.setContentType("text/html");
//		printWriter.print(
//				"<center><h2>CHECK CONSOLE FOR RESULTS</h2><a href='http://localhost:8080/vegetable-hibernate-UI/' > HOME PAGE </a></center>");
//
//		for (VegetableDTO vegetableDTO : list) {
//			printWriter.print(vegetableDTO.getVegetableId());
//			printWriter.print(vegetableDTO.getVegetableName());
//			printWriter.print(vegetableDTO.getVegetableColor());
//			printWriter.print("<br>");
//
//		}
//
//		printWriter.flush();
//		printWriter.close();

	}

}

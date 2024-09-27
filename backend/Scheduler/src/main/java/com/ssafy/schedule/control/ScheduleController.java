package com.ssafy.schedule.control;


import com.ssafy.schedule.model.service.ScheduleService;
import com.ssafy.schedule.model.service.ScheduleServiceImpl;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/schdule")
public class ScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ScheduleService service = ScheduleServiceImpl.getInstance();
	
}

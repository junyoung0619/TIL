package com.ssafy.schedule.model.service;

import java.util.List;

import com.ssafy.schedule.model.dto.Schedule;
import com.ssafy.schedule.model.repository.ScheduleRepository;
import com.ssafy.schedule.model.repository.ScheduleRepositoryImpl;

public class ScheduleServiceImpl implements ScheduleService {

	private static ScheduleService service = new ScheduleServiceImpl();
	private ScheduleRepository repo = ScheduleRepositoryImpl.getInstance();
	
	public ScheduleServiceImpl() {
	}
	
	public static ScheduleService getInstanc() {
		return service;
	}
	@Override
	public List<Schedule> getList() {
		return repo.selectAll();
	}

	@Override
	public Schedule getSchedule(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifySchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSchedule(int id, int date) {
		// TODO Auto-generated method stub
		
	}

}

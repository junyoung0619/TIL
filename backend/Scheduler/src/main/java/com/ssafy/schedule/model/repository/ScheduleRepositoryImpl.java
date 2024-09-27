package com.ssafy.schedule.model.repository;

import java.util.List;

import com.ssafy.schedule.model.dto.Schedule;

public class ScheduleRepositoryImpl implements ScheduleRepository {

	private static ScheduleRepository repo = new ScheduleRepositoryImpl();
	
	public static ScheduleRepository getInstance() {
		return repo;
	}
	
	@Override
	public List<Schedule> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSchedule(int id, int date) {
		// TODO Auto-generated method stub
		
	}
	
}

package com.steffyfinalproject.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steffyfinalproject.springboot.dao.ScheduleDao;
import com.steffyfinalproject.springboot.entities.Enclosure;
@Service
public class ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	public void setFoodDao(ScheduleDao scheduleDao) {
		this.scheduleDao = scheduleDao;
	}
	public List<Enclosure> getschedule() {
		return scheduleDao.getAllSchedule();
	}

}

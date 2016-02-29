package com.steffyfinalproject.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steffyfinalproject.springboot.entities.Enclosure;
import com.steffyfinalproject.springboot.services.ScheduleService;

@RestController
public class ScheduleWebService {

	@Autowired
	ScheduleService scheduleService;

	public void setFoodService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	@RequestMapping(value = "/schedule/timings", method = RequestMethod.GET)
	public List<Enclosure> getAllSchedule() {
		return scheduleService.getschedule();
	}
}

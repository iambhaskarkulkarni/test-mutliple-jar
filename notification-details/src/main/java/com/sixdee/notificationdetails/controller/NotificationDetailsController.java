package com.sixdee.notificationdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sixdee.notificationdetails.dto.EmailDTO;

@RestController
public class NotificationDetailsController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/send-email-notification")
	public EmailDTO sendEmailNotification() {
		return restTemplate.getForObject("http://email-sender-service/send-email-notification", EmailDTO.class);
	}

}

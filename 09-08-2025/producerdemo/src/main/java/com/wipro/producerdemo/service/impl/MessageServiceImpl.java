package com.wipro.producerdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	KafkaTemplate<String,String> kafkTemplate;

	
	public void sendSubjectData(String subject, String message) {
		kafkTemplate.send("subject",subject);
		
	

}
}

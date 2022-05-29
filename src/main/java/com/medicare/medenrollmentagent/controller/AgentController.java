package com.medicare.medenrollmentagent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.medenrollmentagent.entity.Agent;
import com.medicare.medenrollmentagent.service.AgentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/agents")
@Slf4j
public class AgentController {
	
	@Autowired
	private AgentService agentService;
	
	@PostMapping("/")
	public Agent saveAgent(@RequestBody Agent agent) {
		log.info("Inside saveAgent method of AgentController Class");
		return agentService.saveAgent(agent);	
	}
	
	@GetMapping("{id}")
	public Agent getAgentById(@PathVariable("id") Long agentId) {
		log.info("Inside getAgentById method of AgentController Class");
		return agentService.findAgentById(agentId);
	}//
	// another comment
}

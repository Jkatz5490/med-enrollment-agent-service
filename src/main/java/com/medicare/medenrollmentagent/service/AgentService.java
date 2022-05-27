package com.medicare.medenrollmentagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.medenrollmentagent.entity.Agent;
import com.medicare.medenrollmentagent.repository.AgentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AgentService {
	
	@Autowired
	private AgentRepository agentRepository;

	public Agent saveAgent(Agent agent) {
		log.info("Inside saveAgent method of AgentService Class");
		return agentRepository.save(agent);
	}

	public Agent findAgentById(Long agentId) {
		// TODO Auto-generated method stub
		return agentRepository.findByAgentId(agentId);
	}
	
}

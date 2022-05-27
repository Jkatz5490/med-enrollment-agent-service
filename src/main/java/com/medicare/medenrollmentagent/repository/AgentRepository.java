package com.medicare.medenrollmentagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.medenrollmentagent.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long>{

	Agent findByAgentId(Long agentId);

}

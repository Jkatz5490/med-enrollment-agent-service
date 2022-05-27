package com.medicare.medenrollmentagent.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long agentId;
	private String agentFirstName;
	private String agentLastName;
	private String agentEmail;
	private String agentAddress;
	private String agentMobile;
	private LocalDate agentDOB; /* YYYY-MM-DD */
	
	
}

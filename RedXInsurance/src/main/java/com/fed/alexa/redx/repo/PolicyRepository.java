package com.fed.alexa.redx.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fed.alexa.redx.model.*;

@RepositoryRestResource
public interface PolicyRepository extends JpaRepository<Policy, Long> {

	 Policy findByPolicynumber(String policyNumber);
	 
	 Policy findPolicyexpdtByPolicynumberAndDob(String policyNumber, Date dob);
}

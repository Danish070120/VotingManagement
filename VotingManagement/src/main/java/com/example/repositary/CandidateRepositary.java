package com.example.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Candidate;

public interface CandidateRepositary extends JpaRepository<Candidate, Integer> {

	@Query("select u from Candidate c join  c.Candidate f where f.firstName=:firstName")
	List<Candidate> getAllCandidatesByCandidatefirstName(String firstName);

}

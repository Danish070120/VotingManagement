package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Candidate;

public interface CandidateService {

	Candidate savedCandidate(Candidate candidate);

	List<Candidate> fetchCandidateList();

	Optional<Candidate> findById(int id);

	List<Candidate> findAllByCandidatefirstName(String firstName);

}

package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Candidate;
import com.example.repositary.CandidateRepositary;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class CandidateServiceImpl implements CandidateService {
	@Autowired
	private CandidateRepositary candidateRepositary;

	@Override
	public Candidate savedCandidate(Candidate candidate) {
		return candidate;
	}

	@Override
	public List<Candidate> fetchCandidateList() {
		return (List<Candidate>) candidateRepositary.findAll();
	}

	@Override
	public Optional<Candidate> findById(int id) {
		return candidateRepositary.findById(id);
	}

	@Override
	public List<Candidate> findAllByCandidatefirstName(String firstName) {
		// TODO Auto-generated method stub
		return candidateRepositary.getAllCandidatesByCandidatefirstName(firstName);
	}

}

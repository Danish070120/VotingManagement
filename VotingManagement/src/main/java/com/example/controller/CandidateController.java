package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Candidate;
import com.example.service.CandidateService;

@RestController
public class CandidateController {
	@Autowired
	private CandidateService candidateService;

	@PostMapping("/candidate")
	public Candidate insertCandidate(@RequestBody Candidate candidate) {
		Candidate savedCandidate = candidateService.savedCandidate(candidate);
		return savedCandidate;
	}
	@GetMapping("/getcandidate")
	public List<Candidate> fetchCandidateList() {
		return candidateService.fetchCandidateList();
}
	@GetMapping("/candidate/{id}")
	public Optional<Candidate> getCandidateId(@PathVariable("id") int id) {
		return candidateService.findById(id);
}
	@GetMapping("/candidate/{firstName}")
	public List<Candidate> getAllCandidatesByCandidatefirstName(@PathVariable ("firstName") String firstName) {
		return candidateService.findAllByCandidatefirstName(firstName);
	}
}

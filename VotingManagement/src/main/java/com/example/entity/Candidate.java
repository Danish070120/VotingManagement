package com.example.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "candidate_id")
	private int candidateId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "political_party")
	private String politicalParty;

	@Column(name = "election")
	private String election;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<Vote> vote;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<VoteCount> voteCount;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<VoteCountWinner> voteCountWinner;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<CandidateVoterView> candidateVoterView;

}

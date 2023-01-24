package com.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Vote;

public interface VoteRepositary extends JpaRepository<Vote, Integer> {

}

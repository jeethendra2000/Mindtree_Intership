package com.sprigboot.Assignment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprigboot.Assignment1.entity.League;

public interface LeagueRepo extends JpaRepository<League, Integer> {

}

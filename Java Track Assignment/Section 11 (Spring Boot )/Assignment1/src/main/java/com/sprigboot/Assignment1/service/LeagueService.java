package com.sprigboot.Assignment1.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sprigboot.Assignment1.entity.League;

public interface LeagueService {
	public List<League> getLeagues();
	public ResponseEntity<?> addLeague(League league);
}

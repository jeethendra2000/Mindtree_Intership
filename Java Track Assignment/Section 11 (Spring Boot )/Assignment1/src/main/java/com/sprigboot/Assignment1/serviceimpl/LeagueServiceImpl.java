package com.sprigboot.Assignment1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sprigboot.Assignment1.entity.League;
import com.sprigboot.Assignment1.repository.LeagueRepo;
import com.sprigboot.Assignment1.service.LeagueService;
@Service
public class LeagueServiceImpl implements LeagueService{
	@Autowired
	private LeagueRepo leagueRepo;
	@Override
	public List<League> getLeagues() {
		return leagueRepo.findAll();
	}

	@Override
	public ResponseEntity<?> addLeague(League league) {
//		if(league.getYear()==0||league.getYear()<1950||league.getSeason().equals(null)||league.getTitle().equals(null))
//		{
//			return ResponseEntity.badRequest().body("Please enter correct data");
//		}
		return ResponseEntity.ok(leagueRepo.save(league));
	}

}

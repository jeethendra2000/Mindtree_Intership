package com.sprigboot.Assignment1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leagueId;
	@NonNull
	private int year;
	@NotBlank(message="Season is mandatory to fill")
	private String Season;
	@NotBlank(message="Title is mandatory to fill")
	private String Title;
	public League() {
		super();
		// TODO Auto-generated constructor stub
	}
	public League(int leagueId, int year, String season, String title) {
		super();
		this.leagueId = leagueId;
		this.year = year;
		Season = season;
		Title = title;
	}
	public int getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
}

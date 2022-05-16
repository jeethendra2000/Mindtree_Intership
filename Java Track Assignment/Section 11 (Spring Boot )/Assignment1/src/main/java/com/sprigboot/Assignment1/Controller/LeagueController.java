package com.sprigboot.Assignment1.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sprigboot.Assignment1.entity.League;
import com.sprigboot.Assignment1.service.LeagueService;

@RestController
@Validated
@RequestMapping("/api")
public class LeagueController {
	@Autowired
	private LeagueService leagueService;
	@GetMapping("/leagues")
	public ResponseEntity<?> getLeagues()
	{
		return ResponseEntity.ok( this.leagueService.getLeagues());
	}
	@PostMapping("/league")
	public ResponseEntity<?> addLeague(@Valid @RequestBody League league)
	{
		return ResponseEntity.ok().body(this.leagueService.addLeague(league));
	}
	@ResponseStatus
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
}

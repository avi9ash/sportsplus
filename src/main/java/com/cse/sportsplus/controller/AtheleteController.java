package com.cse.sportsplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse.sportsplus.models.Athelete;
import com.cse.sportsplus.repository.AtheleteRepository;

@RestController
@RequestMapping("/athelete")
public class AtheleteController {
	
	@Autowired
	private AtheleteRepository arepo;
	@GetMapping("/getallAthelete")
	public List<Athelete> atheleteList()
	{
	
		return arepo.findAll();
	
	}
	

	@PostMapping("/addAthelete")
	public Athelete atheleteAdd(@RequestBody Athelete athelete)
	{
		arepo.saveAndFlush(athelete);
		
		return athelete;
	}
	@PostMapping("/deleteAthelete")
	public Athelete atheleteDelete(@RequestBody Athelete athelete)
	{
		arepo.deleteById(athelete.getId());
		
		
		return athelete;
	}
	@PostMapping("/atheleteUpdate")
	 public Athelete atheleteUpdate(@RequestBody Athelete athelete)
	 {
		 return athelete;
		 
	 }

}

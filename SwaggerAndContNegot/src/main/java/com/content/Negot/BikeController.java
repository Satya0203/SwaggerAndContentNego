package com.content.Negot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController
{
	@Autowired
	BikeRepository bikerepo;
	
	@GetMapping("/getall")
	public List<Bike> getall()
	{
		return bikerepo.findAll();
	}
	
	@GetMapping("/getid/{id}")
	public Optional<Bike> getSingle(@PathVariable int id)
	{
		return bikerepo.findById(id);
	}
	
	@PostMapping("/post")
	public void save(@RequestBody Bike bike)
	{
		bikerepo.save(bike);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public void delete(@PathVariable int id)
	{
		bikerepo.deleteById(id);
	}
}

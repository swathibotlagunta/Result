package com.swathi.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.swathi.data.model.Result;
import com.swathi.data.service.ResultService;

@RestController
public class ResultController {
	@Autowired
	ResultService rs;

	@PostMapping("/result")
	public String save(@RequestBody Result r) {
		rs.save(r);
		return "successfully posted";
	}

	@PutMapping("/result/{rno}")
	public Result update(@RequestBody Result r) {
		rs.update(r);
		return r;
	}

	@DeleteMapping("/result/{rno}")
	public void delete(@PathVariable("rno") int rno) {
		rs.delete(rno);
	}

	@GetMapping("/result{rno}")
	public Result get(@PathVariable("rno") int rno) {
		return rs.getById(rno);
	}

	@GetMapping("/result")
	public List<Result> getAll() {
		return rs.getAll();
	}
}

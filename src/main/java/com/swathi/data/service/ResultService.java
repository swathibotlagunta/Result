package com.swathi.data.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swathi.data.model.Result;
import com.swathi.data.repository.ResultRepository;

@Service
public class ResultService {
	@Autowired
	ResultRepository rrepo;

	public void save(Result r) {
		rrepo.save(r);
	}

	public void update(Result r) {
		rrepo.save(r);
	}

	public void delete(int id) {
		rrepo.findById(id);
	}

	public Result getById(int id) {
		return rrepo.findById(id).get();
	}

	public List<Result> getAll() {
		return rrepo.findAll();
	}
}

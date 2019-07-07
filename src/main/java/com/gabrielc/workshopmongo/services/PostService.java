package com.gabrielc.workshopmongo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielc.workshopmongo.domain.Post;
import com.gabrielc.workshopmongo.repository.PostRepository;
import com.gabrielc.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Post user = repo.findById(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	public List<Post> findByTitle(String text){
		return repo.findByTitleContaninigIgnoreCase(text);
	}

}
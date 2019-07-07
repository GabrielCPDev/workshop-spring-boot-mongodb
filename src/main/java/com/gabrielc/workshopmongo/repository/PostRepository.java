package com.gabrielc.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gabrielc.workshopmongo.domain.Post;
import com.gabrielc.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<User, String> {
   @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	List <Post> findByTitleContaninigIgnoreCase(String text);
	void saveAll(List<Post> asList);

}
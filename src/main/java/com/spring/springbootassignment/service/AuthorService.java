/**
 * 
 */
package com.spring.springbootassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootassignment.entity.Author;
import com.spring.springbootassignment.repository.AuthorRepository;

/**
 * @author: Boqiang Cui
 * @date: Feb 9, 2023
 */
@Service
public class AuthorService {
	@Autowired
	AuthorRepository authorRepo;
	
	//Single author get
	  public Optional<Author> get(int authorId){
		  return authorRepo.findById(authorId);
	  }
	  //Get all authors
	  public List<Author> getAll(){
		  return (List<Author>) authorRepo.findAll();
	  }
	  //Update/create author
	  public Author update(Author author) {
		  return authorRepo.save(author);
	  }
	  //Delete author
	  public void delete(Author author) {
		  authorRepo.delete(author);
	  }
	  //Delete all authors
	  public void deleteAll() {
		  authorRepo.deleteAll();
	  }
}

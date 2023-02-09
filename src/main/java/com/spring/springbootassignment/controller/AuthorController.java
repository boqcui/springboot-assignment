/**
 * 
 */
package com.spring.springbootassignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootassignment.entity.Author;
import com.spring.springbootassignment.service.AuthorService;

/**
 * @author: Boqiang Cui
 * @date: Feb 9, 2023
 */
@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	//Get All authors
		@GetMapping(value= {"/authors"})
		public List<Author> getAll(){
			List<Author> authors = authorService.getAll();
			System.out.println("authors retrieved "+authors.size());
			return authors;
		}
		//Get an author
		@GetMapping("/authors/{authorId}")
		public Author get(@PathVariable("authorId") Integer id) {
			Optional<Author> i = authorService.get(id);
			return i.get();
		}
		//Insert an author
		@PostMapping("/authors")
		public Author add(@RequestBody Author author) {
			return authorService.update(author);
		}
		//Update an author
		@PutMapping("/authors")
		public Author edit(@RequestBody Author author) {
			return authorService.update(author);
		}
		//Delete an author
		@DeleteMapping("/authors")
		public String delete(@RequestParam(value="authorId") Integer id) {
			Optional<Author> i = authorService.get(id);
			authorService.delete(i.get());
			return "Item id "+id+" deleted successfully";
		}
}

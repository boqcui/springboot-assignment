/**
 * 
 */
package com.spring.springbootassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootassignment.entity.Author;

/**
 * @author: Boqiang Cui
 * @date: Feb 9, 2023
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}

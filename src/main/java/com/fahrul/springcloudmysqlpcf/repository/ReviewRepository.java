package com.fahrul.springcloudmysqlpcf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springcloudmysqlpcf.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}

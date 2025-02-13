package com.assignemnts.assignment2.repository;

import com.assignemnts.assignment2.model.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Long> {
    List<Review> findAllByProduct_Id(Long productId);
}

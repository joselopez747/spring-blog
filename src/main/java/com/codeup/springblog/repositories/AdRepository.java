package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {
    List<Ad> findByTitle(String title);

    @Query("from Ad a where a.title like %?1%")
    List<Ad> searchByTitleLike(String term);

    Ad findById(long id);
}
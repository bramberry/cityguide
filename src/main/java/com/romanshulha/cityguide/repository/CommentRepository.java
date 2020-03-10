package com.romanshulha.cityguide.repository;

import com.romanshulha.cityguide.domain.sql.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {}

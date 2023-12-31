package com.chamathfbclone.facebookclone.repository;

import com.chamathfbclone.facebookclone.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String > {
}

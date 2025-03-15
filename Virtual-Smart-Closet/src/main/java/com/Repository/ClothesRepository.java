package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Clothes;

public interface ClothesRepository extends JpaRepository<Clothes, Long>
{

}

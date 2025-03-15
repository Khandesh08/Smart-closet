package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Outfit;

public interface OutfitRepository extends JpaRepository<Outfit, Long>
{

}

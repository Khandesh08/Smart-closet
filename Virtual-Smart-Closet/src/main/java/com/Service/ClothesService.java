package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.ClothesRepository;
import com.model.Clothes;

@Service
public class ClothesService 
{
	@Autowired
    private ClothesRepository clothesRepository;

    public List<Clothes> getAllClothes() {
        return clothesRepository.findAll();
    }

    public Clothes saveClothes(Clothes clothes) {
        return clothesRepository.save(clothes);
    }
  
}

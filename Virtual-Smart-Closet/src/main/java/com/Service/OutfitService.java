package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.OutfitRepository;
import com.model.Outfit;

@Service
public class OutfitService 
{
	@Autowired
    private OutfitRepository outfitRepository;

    public List<Outfit> getAllOutfits() {
        return outfitRepository.findAll();
    }

    public Outfit saveOutfit(Outfit outfit) {
        return outfitRepository.save(outfit);
    }
}

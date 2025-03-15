package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Service.OutfitService;
import com.model.Clothes;
import com.model.Outfit;

@RestController
@RequestMapping("/outfits")
public class OutfitController {
    @Autowired
    private OutfitService outfitService;

    @GetMapping
    public List<Outfit> getAllOutfits() {
        return outfitService.getAllOutfits();
    }

    @PostMapping
    public Outfit createOutfit(@RequestBody Outfit outfit) {
        return outfitService.saveOutfit(outfit);
    }
    
    @GetMapping("/getList")
    public Map<String, Object> getFormattedOutfits() {
        List<Outfit> outfits = outfitService.getAllOutfits();
        Map<String, Object> response = new HashMap();

        if (!outfits.isEmpty()) {
            Outfit outfit = outfits.get(0);

            // Check if 'top' and 'bottom' are not null
            if (outfit.getTop() != null && outfit.getBottom() != null) {
                response.put("id", outfit.getId());
                response.put("outfitName", outfit.getOutfitName());

                // Building 'top' manually
                Map<String, Object> top = new HashMap<>();
                Clothes topClothes = outfit.getTop();
                top.put("id", topClothes.getId());
                top.put("type", topClothes.getType());
                top.put("color", topClothes.getColor());
                top.put("size", topClothes.getSize());
                top.put("imageUrl", topClothes.getImageUrl());

                // Building 'bottom' manually
                Map<String, Object> bottom = new HashMap<>();
                Clothes bottomClothes = outfit.getBottom();
                bottom.put("id", bottomClothes.getId());
                bottom.put("type", bottomClothes.getType());
                bottom.put("color", bottomClothes.getColor());
                bottom.put("size", bottomClothes.getSize());
                bottom.put("imageUrl", bottomClothes.getImageUrl());

                response.put("top", top);
                response.put("bottom", bottom);
            } else {
                response.put("error", "Top or bottom clothes are not set.");
            }
        } else {
            response.put("error", "No outfits found.");
        }

        return response;
    }
}

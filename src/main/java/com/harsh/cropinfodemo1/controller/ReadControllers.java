package com.harsh.cropinfodemo1.controller;

import com.harsh.cropinfodemo1.models.CropItem;
import com.harsh.cropinfodemo1.models.CropItems;
import com.harsh.cropinfodemo1.repository.CropService;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crops")
@AllArgsConstructor
public class ReadControllers {

    private final CropService cropService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CropItems getAllItems() {
        List<CropItem> items = cropService.getAllCrops();
        CropItems cropItems = new CropItems();
        cropItems.setItemList(items);
        return cropItems;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CropItem getItemById(@PathVariable("id") ObjectId id)
    {
        return cropService.getCropItemById(id);
    }

    @RequestMapping(value = "category/{type}", method = RequestMethod.GET)
    public CropItems getItemsByType(@PathVariable("type") String type) {
        List<CropItem> items = cropService.getCropItemsByType(type);
        CropItems cropItems = new CropItems();
        cropItems.setItemList(items);
        return cropItems;
    }
    @RequestMapping(value = "name/{name}", method = RequestMethod.GET)
    public CropItems getItemsByName(@PathVariable("name") String name) {
        List<CropItem> items = cropService.getCropItemsByName(name);
        CropItems cropItems = new CropItems();
        cropItems.setItemList(items);
        return cropItems;
    }

}

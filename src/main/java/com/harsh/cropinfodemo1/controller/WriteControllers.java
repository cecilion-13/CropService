package com.harsh.cropinfodemo1.controller;

import com.harsh.cropinfodemo1.models.CropItem;
import com.harsh.cropinfodemo1.repository.CropService;
import com.harsh.cropinfodemo1.request.UpdateRequest;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/crops")
@AllArgsConstructor
public class WriteControllers {
    private final CropService cropService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CropItem createItem(@Valid @RequestBody CropItem item)
    {
        return cropService.createCropItem(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public CropItem modifyItemById(@PathVariable("id") ObjectId id,
                               @Valid @RequestBody UpdateRequest item) {
        CropItem updatedItem = cropService.modifyCropItemById(id,item);
        return updatedItem;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable ObjectId id) {
        cropService.deleteCropItem(id);
    }
}

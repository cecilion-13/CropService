package com.harsh.cropinfodemo1.repository;

import com.harsh.cropinfodemo1.models.CropItem;
import com.harsh.cropinfodemo1.models.CropItems;
import com.harsh.cropinfodemo1.request.UpdateRequest;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CropService {

    private final CropRepository cropRepository;

    public List<CropItem> getAllCrops(){
        return cropRepository.findAll();
    }

    public CropItem getCropItemById(ObjectId id) {
        return cropRepository.findBy_id(id);
    }

    public List<CropItem> getCropItemsByType(String type){
        return cropRepository.findByType(type);
    }

    public List<CropItem> getCropItemsByName(String name){
        return cropRepository.findByName(name);
    }

    public List<CropItem> getCropItemsByEmail(String email){
        return cropRepository.findByEmail(email);
    }

    public CropItem modifyCropItemById(ObjectId id, UpdateRequest item) {
           CropItem cropItem = getCropItemById(id);
           cropItem.setPricePerKg(item.getPricePerKg());
           cropItem.setQuantityInKg(item.getQuantityInKg());
           cropItem.setAddress(item.getAddress());
           cropRepository.save(cropItem);
           return cropItem;
    }

    public CropItem createCropItem(CropItem item) {
        item.set_id(ObjectId.get());
        cropRepository.save(item);
        return item;
    }

    public void deleteCropItem(ObjectId id) {
        cropRepository.delete(cropRepository.findBy_id(id));
    }


}

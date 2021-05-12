package com.harsh.cropinfodemo1.repository;

import com.harsh.cropinfodemo1.models.CropItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CropRepository extends MongoRepository<CropItem,String> {
      List<CropItem> findByType(String type);
   List<CropItem> findByName(String name);
    List<CropItem> findByEmail(String email);

    CropItem findBy_id(ObjectId _id);



}

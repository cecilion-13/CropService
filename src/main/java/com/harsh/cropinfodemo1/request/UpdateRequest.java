package com.harsh.cropinfodemo1.request;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRequest {

    private Double quantityInKg;
    private Double pricePerKg;
    private String address;

}

package com.sokol.ecommerce.db.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("product")
@Builder
@Getter
@Setter
public class ProductEntity {

    @Id
    private String id;

    private long version;

    private long price;

    private String name;

    private boolean enabled;

    private int quantity;

    private Instant createdAt;

}

package com.ust.author_service.model;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Builder
//@Document(collection = "authors")
public class Author {

    @Id
    private Long id;
    private String name;



}

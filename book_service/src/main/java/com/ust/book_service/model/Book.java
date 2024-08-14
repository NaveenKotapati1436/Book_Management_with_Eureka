package com.ust.book_service.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long authorId;
}
//public class Book {
//    @Id
//    private Long id;
//
//    @Field("title")
//    private String title;
//
//    @Field("author_id")
//    private Long authorId;
//
//    public Book(String title, Long authorId) {
//        this.title = title;
//        this.authorId = authorId;
//    }
//    public void toDto() {
//
//    }
//}

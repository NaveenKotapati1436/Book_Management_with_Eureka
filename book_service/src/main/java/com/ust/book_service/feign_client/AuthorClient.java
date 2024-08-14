package com.ust.book_service.feign_client;

import com.ust.book_service.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "author-service", url = "http://localhost:8100/authors")
public interface AuthorClient {

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id);
}

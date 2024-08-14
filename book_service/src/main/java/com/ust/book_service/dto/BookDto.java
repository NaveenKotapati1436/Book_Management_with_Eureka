package com.ust.book_service.dto;


import com.ust.book_service.model.Author;
import jakarta.validation.constraints.NotEmpty;

public record BookDto(
        Long id,
        @NotEmpty(message = "Title should not be empty")
        String title,
        //@NotNull(message = "Author should not be null")
        Author author
) {
}

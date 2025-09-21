package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
	
	private Integer id; // 對應book.id
	private String name;// 對應book.title
	private Double price;// 對應book.price
	private Integer amount;// 對應book.stock
	private Boolean pub;// 對應book.published
	
}

package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private Integer id;
	private String title;
	private Double price;
	private Integer stock;
	private Boolean pub;
	
	
}

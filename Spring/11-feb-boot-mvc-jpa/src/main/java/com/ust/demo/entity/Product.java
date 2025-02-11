package com.ust.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Double price;
	private Date expiryDate;
	private String category;
	@Lob
	private String picture;	
	
	public String getExpiryDate1() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return sdf.format(expiryDate);
	}
	
}

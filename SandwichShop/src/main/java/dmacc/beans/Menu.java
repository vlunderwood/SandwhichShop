package dmacc.beans;

//@author valei - vlunderwood CIS175 - Fall 2023 Nov 02, 2023

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private String itemDescription;
	private double itemPrice;
}

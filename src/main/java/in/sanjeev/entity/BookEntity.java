package in.sanjeev.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="books")
public class BookEntity {
	@Id
	private Integer book_id;
	private String book_name;
	private Double book_price;
	
}

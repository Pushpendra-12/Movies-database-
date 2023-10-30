package movies.org.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WatchList {
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Integer Id;
	
	private String Name;

}

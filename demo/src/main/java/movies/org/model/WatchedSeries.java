package movies.org.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class WatchedSeries {
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="Series_Name")
	private String Name;
	
	@Column(name="Total_Seasons")
	private String Seasons;

}

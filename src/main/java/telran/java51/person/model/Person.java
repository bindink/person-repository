package telran.java51.person.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable {
	private static final long serialVersionUID = -2812010942738675155L;
	@Id
	Integer id;
	@Setter
	String name;
	LocalDate birthDate;
	@Setter
	Address address;
}

package tn.esprit.societe.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competence
 *
 */
@Entity
@Table(name="t_competence")

public class Competence implements Serializable {

	
	private Integer id;
	private String label;
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;

	public Competence() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	@ManyToMany(mappedBy="competences")
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
   
}

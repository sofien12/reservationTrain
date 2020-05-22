package com.transport.domain.reservationTrain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "IntervalleTemps")
public class IntervalleTemps implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "dateDepart")
	private LocalDate dateDepart;

	@Column(name = "dateArrivee")
	private LocalDate dateArrivee;
	
	@Column(name = "tempsDepart")
	private String tempsDepart;
	
	@Column(name = "tempsArrivee")
	private String tempsArrivee;

	@OneToMany(mappedBy="intervalleTemps")
	 @JsonIgnore
	 private List<Train>trains = new ArrayList<>();
	
	
	
	public IntervalleTemps() {
		super();
	}

	
	public IntervalleTemps(long id, LocalDate dateDepart, LocalDate dateArrivee, String tempsDepart,
			String tempsArrivee) {
		super();
		this.id = id;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.tempsDepart = tempsDepart;
		this.tempsArrivee = tempsArrivee;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getTempsDepart() {
		return tempsDepart;
	}

	public void setTempsDepart(String tempsDepart) {
		this.tempsDepart = tempsDepart;
	}

	public String getTempsArrivee() {
		return tempsArrivee;
	}

	public void setTempsArrivee(String tempsArrivee) {
		this.tempsArrivee = tempsArrivee;
	}
	
	
	
}


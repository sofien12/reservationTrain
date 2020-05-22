
package com.transport.domain.reservationTrain;

import java.io.Serializable;
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
@Table(name = "Client")

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Name")
	private String name;
	@Column(name = "Prenom")
	private String prenom;
	@Column(name = "Cin")
	private String cin;

	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Reservation> reservationss = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(String name, String prenom, String cin) {
		this.name = name;
		this.prenom = prenom;
		this.cin = cin;
	}

	public Long getId() {
		return this.id;

	}

	public void setId(Long id) {
		this.id = id;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String Prenom) {
		this.prenom = Prenom;
	}

	public String getCin() {
		return this.cin;
	}

	public void setCin(String Cin) {
		this.cin = Cin;
	}

	public void setReservationss(List<Reservation> reservations) {
		this.reservationss = reservations;
	}

	public List<Reservation> getReservationss() {
		return this.reservationss;
	}

}
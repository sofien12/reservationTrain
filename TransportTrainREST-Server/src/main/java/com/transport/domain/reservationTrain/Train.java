
package com.transport.domain.reservationTrain;

import com.fasterxml.jackson.annotation.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "Train")

public class Train implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "VilleDepart")
	private String villeDepart;
	
	@Column(name = "VilleArrivee")
	private String villeArrivee;



	@OneToMany(mappedBy = "train")
	@JsonIgnore
	private List<Reservation> reservationss = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("trains")
	private IntervalleTemps intervalleTemps;

	public Train() {
		super();
	}

	public Train(Long id, String villeDepart, String villeArrivee, LocalDate dateTimeDepart,
			IntervalleTemps intervalleTemps) {
		super();
		this.id = id;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.intervalleTemps = intervalleTemps;
	}

	public Long getId() {
		return this.id;

	}

	public void setId(Long id) {
		this.id = id;

	}

	public String getVilleDepart() {
		return this.villeDepart;
	}

	public void setVilleDepart(String VilleDepart) {
		this.villeDepart = VilleDepart;
	}

	public String getVilleArrivee() {
		return this.villeArrivee;
	}

	public void setVilleArrivee(String VilleArrivee) {
		this.villeArrivee = VilleArrivee;
	}

	public IntervalleTemps getIntervalleTemps() {
		return intervalleTemps;
	}

	public void setIntervalleTemps(IntervalleTemps intervalleTemps) {
		this.intervalleTemps = intervalleTemps;
	}



	public void setReservationss(List<Reservation> reservations) {
		this.reservationss = reservations;
	}

	public List<Reservation> getReservationss() {
		return this.reservationss;
	}

}
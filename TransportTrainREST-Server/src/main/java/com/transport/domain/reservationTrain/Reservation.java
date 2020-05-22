
package com.transport.domain.reservationTrain;

import com.fasterxml.jackson.annotation.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Reservation")

public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Code")
	private Long code;

	@Column(name = "DateReservation")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dateReservation;

	@Column(name = "tempsReservation")
	private String tempsReservation;
	
	@ManyToOne
	@JsonIgnoreProperties("reservationss")
	private Train train;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("reservationss")
	private Client client;

	public Reservation() {
		super();
	}


	public Reservation(Long id, Long code, LocalDate dateReservation, String tempsReservation, Train train,
			Client client) {
		super();
		this.id = id;
		this.code = code;
		this.dateReservation = dateReservation;
		this.tempsReservation = tempsReservation;
		this.train = train;
		this.client = client;
	}


	public String getTempsReservation() {
		return tempsReservation;
	}


	public void setTempsReservation(String tempsReservation) {
		this.tempsReservation = tempsReservation;
	}


	public Long getId() {
		return this.id;

	}

	public void setId(Long id) {
		this.id = id;

	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long Code) {
		this.code = Code;
	}

	public LocalDate getDateReservation() {
		return this.dateReservation;
	}

	public void setDateReservation(LocalDate DateReservation) {
		this.dateReservation = DateReservation;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Train getTrain() {
		return this.train;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return this.client;
	}

}
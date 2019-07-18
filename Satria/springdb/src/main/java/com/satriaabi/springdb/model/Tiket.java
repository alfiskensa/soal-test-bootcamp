package com.satriaabi.springdb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tiket")
public class Tiket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_penumpang", nullable = false)
	private Penumpang idPenumpang;
	
	@ManyToOne
	@JoinColumn(name = "id_travel", nullable = false)
	private Travel idTravel;
	
	@Column(name = "jadwal")
	private Date jadwal;

	

	@Override
	public String toString() {
		return "Tiket [id=" + id + ", idPenumpang=" + idPenumpang + ", idTravel=" + idTravel + ", jadwal=" + jadwal
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Penumpang getIdPenumpang() {
		return idPenumpang;
	}

	public void setIdPenumpang(Penumpang idPenumpang) {
		this.idPenumpang = idPenumpang;
	}

	public Travel getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(Travel idTravel) {
		this.idTravel = idTravel;
	}

	public Date getJadwal() {
		return jadwal;
	}

	public void setJadwal(Date jadwal) {
		this.jadwal = jadwal;
	}
	
	
	
	
}

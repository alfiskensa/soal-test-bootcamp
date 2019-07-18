package com.jhonfavo.springhibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="tiket")
public class TiketModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private long idTiket;
	
	@ManyToOne
	@JoinColumn(name ="id_penumpang", nullable = false)
	private PenumpangModel idPenumpang;
	
	@ManyToOne
	@JoinColumn(name ="id_travel", nullable = false)
	private TravelModel idTravel;

	@Column (name = "jadwal")
	private Date jadwal;

	public long getIdTiket() {
		return idTiket;
	}

	public void setIdTiket(long idTiket) {
		this.idTiket = idTiket;
	}

	public PenumpangModel getIdPenumpang() {
		return idPenumpang;
	}

	public void setIdPenumpang(PenumpangModel idPenumpang) {
		this.idPenumpang = idPenumpang;
	}

	public TravelModel getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(TravelModel idTravel) {
		this.idTravel = idTravel;
	}

	public Date getJadwal() {
		return jadwal;
	}

	public void setJadwal(Date jadwal) {
		this.jadwal = jadwal;
	}

	@Override
	public String toString() {
		return "TiketModel [idTiket=" + idTiket + ", idPenumpang=" + idPenumpang + ", idTravel=" + idTravel
				+ ", jadwal=" + jadwal + "]";
	}
	
	
}

package com.springdb.muhamadderryprasetyanugraha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Tiket.findAll", query="SELECT m FROM Tiket m")
public class Tiket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long idTiket;

	@ManyToOne
	@JoinColumn(name="id_penumpang")
	private Penumpang idPenumpang;

	@ManyToOne
	@JoinColumn(name="id_travel")
	private Travel idTravel;
	
	@Temporal(TemporalType.DATE)
	@Column(name="jadwal")
	private Date jadwal;

	public long getIdTiket() {
		return idTiket;
	}

	public void setIdTiket(long idTiket) {
		this.idTiket = idTiket;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Tiket [idTiket=" + idTiket + ", idPenumpang=" + idPenumpang + ", idTravel=" + idTravel + ", jadwal="
				+ jadwal + "]";
	}
	
	
}
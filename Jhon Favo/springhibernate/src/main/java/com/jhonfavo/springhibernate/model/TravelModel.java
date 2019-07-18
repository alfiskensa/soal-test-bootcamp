package com.jhonfavo.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="travel")
public class TravelModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private long idTravel;
	
	@Column (name = "nama_supir")
	private String nama;
	
	@Column (name = "no_telp")
	private String noTlp;
	
	@Column (name = "alamat")
	private String alamat;
	
	@Column (name = "no_polisi")
	private String noPolisi;

	public long getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(long idTravel) {
		this.idTravel = idTravel;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoTlp() {
		return noTlp;
	}

	public void setNoTlp(String noTlp) {
		this.noTlp = noTlp;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoPolisi() {
		return noPolisi;
	}

	public void setNoPolisi(String noPolisi) {
		this.noPolisi = noPolisi;
	}

	@Override
	public String toString() {
		return "TravelModel [idTravel=" + idTravel + ", nama=" + nama + ", noTlp=" + noTlp + ", alamat=" + alamat
				+ ", noPolisi=" + noPolisi + "]";
	}
	
	

}

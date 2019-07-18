package com.satriaabi.springdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "travel")
public class Travel {

	@Id
	@Column(name = "id_travel")
	private long idTravel;
	
	@Column(name = "nama_supir")
	private String namaSupir;
	
	@Column(name = "no_telp")
	private String noTelp;
	
	@Column(name = "alamat")
	private String alamat;
	
	@Column(name = "no_polisi")
	private String noPolisi;

	
	
	@Override
	public String toString() {
		return "Travel [idTravel=" + idTravel + ", namaSupir=" + namaSupir + ", noTelp=" + noTelp + ", alamat=" + alamat
				+ ", noPolisi=" + noPolisi + "]";
	}

	public long getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(long idTravel) {
		this.idTravel = idTravel;
	}

	public String getNamaSupir() {
		return namaSupir;
	}

	public void setNamaSupir(String namaSupir) {
		this.namaSupir = namaSupir;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
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
	
	
}

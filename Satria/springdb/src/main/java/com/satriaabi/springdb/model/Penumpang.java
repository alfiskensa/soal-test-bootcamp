package com.satriaabi.springdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="penumpang")
public class Penumpang {
	
	@Id
	@Column(name = "id_penumpang")
	private long idPenumpang;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "no_telp")
	private String noTelp;
	
	@Column(name = "alamat")
	private String alamat;
	


	@Override
	public String toString() {
		return "Penumpang [idPenumpang=" + idPenumpang + ", nama=" + nama + ", noTelp=" + noTelp + ", alamat=" + alamat
				+ "]";
	}

	
	public long getIdPenumpang() {
		return idPenumpang;
	}



	public void setIdPenumpang(long idPenumpang) {
		this.idPenumpang = idPenumpang;
	}



	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
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
	
	

}

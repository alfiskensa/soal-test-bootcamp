package com.jhonfavo.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="penumpang")

public class PenumpangModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private long idPenumpang;
	
	@Column (name = "nama")
	private String nama;
	
	@Column (name = "no_telp")
	private String noTlp;
	
	@Column (name = "alamat")
	private String alamat;

	
	

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

	@Override
	public String toString() {
		return "PenumpangModel [idPenumpang=" + idPenumpang + ", nama=" + nama + ", noTlp=" + noTlp + ", alamat="
				+ alamat + "]";
	}

	
	
	
	
	

}

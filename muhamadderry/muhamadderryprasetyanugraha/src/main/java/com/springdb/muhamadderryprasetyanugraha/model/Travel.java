package com.springdb.muhamadderryprasetyanugraha.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

	
	@Entity
	@NamedQuery(name="Travel.findAll", query="SELECT m FROM Penumpang m")
	public class Travel implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long idTravel;
		
		@Column(name="nama_supir")
		private String namaSupir;
		
		@Column(name="no_telp")
		private String noTelp;
		
		@Column(name="alamat")
		private String alamat;
		
		@Column(name="no_polisi")
		private String noPolisi;

		

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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Travel [idTravel=" + idTravel + ", namaSupir=" + namaSupir + ", noTelp=" + noTelp + ", alamat="
					+ alamat + ", noPolisi=" + noPolisi + "]";
		}

		
		

}

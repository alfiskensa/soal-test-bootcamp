package com.springdb.muhamadderryprasetyanugraha.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;




	@Entity
	@NamedQuery(name="Penumpang.findAll", query="SELECT m FROM Penumpang m")
	public class Penumpang implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private long idPenumpang;
		
		@Column(name="nama")
		private String nama;
		
		@Column(name="no_telp")
		private String noTelp;
		
		@Column(name="alamat")
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Penumpang [idPenumpang=" + idPenumpang + ", nama=" + nama + ", noTelp=" + noTelp + ", alamat="
					+ alamat + "]";
		}

		
		
		
}

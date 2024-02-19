package com.dex;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Departments {
	
	@Id
	@Column(name="d_id")
	int did;
	@Column
	String sname;
	@Column
	String dname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dd",referencedColumnName = "u_d")
	University uv;
	
	public University getUv() {
		return uv;
	}
	public void setUv(University uv) {
		this.uv = uv;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}	
}

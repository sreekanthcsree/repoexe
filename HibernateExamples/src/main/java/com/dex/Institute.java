package com.dex;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Institute {
	
	@Id
	@Column(name="i_id")
	int iid;
	@Column
	String iname;
	@Column
	String iloc;
	@OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
	@JoinColumn(name="io",referencedColumnName = "i_id")
	List<Course>co;
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIloc() {
		return iloc;
	}
	public void setIloc(String iloc) {
		this.iloc = iloc;
	}
	public List<Course> getCo() {
		return co;
	}
	public void setCo(List<Course> co) {
		this.co = co;
	}
}

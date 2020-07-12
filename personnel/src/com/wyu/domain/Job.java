package com.wyu.domain;

import java.io.Serializable;

public class Job implements Serializable{
	private Integer job;

	private String jname;

	private String jremark;

	public Integer getJob() {
		return job;
	}

	public void setJob(Integer job) {
		this.job = job;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname == null ? null : jname.trim();
	}

	public String getJremark() {
		return jremark;
	}

	public void setJremark(String jremark) {
		this.jremark = jremark == null ? null : jremark.trim();
	}
}

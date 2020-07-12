package com.wyu.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

public class Uploadfile implements Serializable{
	private Integer id;

	private String uploadname;

	private String filename;

	private Date uploaddate;

	private String fileurl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUploadname() {
		return uploadname;
	}

	public void setUploadname(String uploadname) {
		this.uploadname = uploadname == null ? null : uploadname.trim();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename == null ? null : filename.trim();
	}

	public Date getUploaddate() {
		return uploaddate;
	}

	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
}

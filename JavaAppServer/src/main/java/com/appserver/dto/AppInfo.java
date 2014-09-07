package com.appserver.dto;

import java.util.Date;

public class AppInfo {
	private String name;
	private String description;
	private Long sizeInByte;
	private String filePath;
	private String version;
	private String author;
	private String homepage;
	private Date uploadedDate;

	public AppInfo() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSizeInByte() {
		return sizeInByte;
	}

	public void setSizeInByte(Long size) {
		if (size < 0) {
			size = 0L;
		}
		this.sizeInByte = size;
	}

	public String geFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploaded) {
		this.uploadedDate = uploaded;
	}
}

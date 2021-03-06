package com.challenge.scraper.model;

import java.io.Serializable;

public class File implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	// Attributes related to Repository
	private String userGithub;
	private String nameGithub;

	// Attributes related to File
	private String description;
	private Long size;
	private Long quantLines;
	private String extension;

	public File() {
	}

	public File(String userGithub, String nameGithub) {
		this.userGithub = userGithub;
		this.nameGithub = nameGithub;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getQuantLines() {
		return quantLines;
	}

	public void setQuantLines(Long quantLines) {
		this.quantLines = quantLines;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getUserGithub() {
		return userGithub;
	}

	public void setUserGithub(String userGithub) {
		this.userGithub = userGithub;
	}

	public String getNameGithub() {
		return nameGithub;
	}

	public void setNameGithub(String nameGithub) {
		this.nameGithub = nameGithub;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

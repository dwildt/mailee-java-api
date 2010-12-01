package me.mailee;

import org.jactiveresource.ActiveResource;
import java.util.Date;

public class Template extends ActiveResource {
	private String id;
	private String title;
	private String html;
	private Integer clientId;
	private Date createdAt;
	private Date deletedAt;
	private String simulations;
	private String thumbContentType;
	private String thumbFileName;
	private Integer thumbFileSize;
	private Date thumbUpdatedAt;
	private Date updatedAt; 

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getSimulations() {
		return simulations;
	}

	public void setSimulations(String simulations) {
		this.simulations = simulations;
	}

	public String getThumbContentType() {
		return thumbContentType;
	}

	public void setThumbContentType(String thumbContentType) {
		this.thumbContentType = thumbContentType;
	}

	public String getThumbFileName() {
		return thumbFileName;
	}

	public void setThumbFileName(String thumbFileName) {
		this.thumbFileName = thumbFileName;
	}

	public Integer getThumbFileSize() {
		return thumbFileSize;
	}

	public void setThumbFileSize(Integer thumbFileSize) {
		this.thumbFileSize = thumbFileSize;
	}

	public Date getThumbUpdatedAt() {
		return thumbUpdatedAt;
	}

	public void setThumbUpdatedAt(Date thumbUpdatedAt) {
		this.thumbUpdatedAt = thumbUpdatedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}

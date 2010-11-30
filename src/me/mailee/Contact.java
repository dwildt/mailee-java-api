package me.mailee;

import java.math.BigDecimal;
import java.util.Date;

import org.jactiveresource.*;

public class Contact extends ActiveResource {
    private String id;
    private String name;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private String address;
    private String age;
    private Date birthday;
    private Integer clientId;
    private String company;
    private Integer contactStatusId;
    private String dynamicValues;
    private Integer facebookFollowers;
    private Integer forwardedBy;
    private Integer goodreadsConnections;
    private Integer importId;
    private String internalId;
    private Float kscore;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer linkedinFollowers;
    private Integer linkedinRecomendations;
    private String mobile;
    private String notes;
    private Integer originId;
    private Integer orkutFollowers;
    private String phone;
    private String photoContentType;
    private String photoFileName;
    private Integer photoFileSize;
    private Date photoUpdatedAt;
    private Integer plaxoConnections;
    private String position;
    private String sex;
    private Integer skoobConnections;
    private Integer twitterFollowers;
    private Date deletedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getContactStatusId() {
		return contactStatusId;
	}
	public void setContactStatusId(Integer contactStatusId) {
		this.contactStatusId = contactStatusId;
	}
	public String getDynamicValues() {
		return dynamicValues;
	}
	public void setDynamicValues(String dynamicValues) {
		this.dynamicValues = dynamicValues;
	}
	public Integer getFacebookFollowers() {
		return facebookFollowers;
	}
	public void setFacebookFollowers(Integer facebookFollowers) {
		this.facebookFollowers = facebookFollowers;
	}
	public Integer getForwardedBy() {
		return forwardedBy;
	}
	public void setForwardedBy(Integer forwardedBy) {
		this.forwardedBy = forwardedBy;
	}
	public Integer getGoodreadsConnections() {
		return goodreadsConnections;
	}
	public void setGoodreadsConnections(Integer goodreadsConnections) {
		this.goodreadsConnections = goodreadsConnections;
	}
	public Integer getImportId() {
		return importId;
	}
	public void setImportId(Integer importId) {
		this.importId = importId;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public Float getKscore() {
		return kscore;
	}
	public void setKscore(Float kscore) {
		this.kscore = kscore;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public Integer getLinkedinFollowers() {
		return linkedinFollowers;
	}
	public void setLinkedinFollowers(Integer linkedinFollowers) {
		this.linkedinFollowers = linkedinFollowers;
	}
	public Integer getLinkedinRecomendations() {
		return linkedinRecomendations;
	}
	public void setLinkedinRecomendations(Integer linkedinRecomendations) {
		this.linkedinRecomendations = linkedinRecomendations;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getOriginId() {
		return originId;
	}
	public void setOriginId(Integer originId) {
		this.originId = originId;
	}
	public Integer getOrkutFollowers() {
		return orkutFollowers;
	}
	public void setOrkutFollowers(Integer orkutFollowers) {
		this.orkutFollowers = orkutFollowers;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public Integer getPhotoFileSize() {
		return photoFileSize;
	}
	public void setPhotoFileSize(Integer photoFileSize) {
		this.photoFileSize = photoFileSize;
	}
	public Date getPhotoUpdatedAt() {
		return photoUpdatedAt;
	}
	public void setPhotoUpdatedAt(Date photoUpdatedAt) {
		this.photoUpdatedAt = photoUpdatedAt;
	}
	public Integer getPlaxoConnections() {
		return plaxoConnections;
	}
	public void setPlaxoConnections(Integer plaxoConnections) {
		this.plaxoConnections = plaxoConnections;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getSkoobConnections() {
		return skoobConnections;
	}
	public void setSkoobConnections(Integer skoobConnections) {
		this.skoobConnections = skoobConnections;
	}
	public Integer getTwitterFollowers() {
		return twitterFollowers;
	}
	public void setTwitterFollowers(Integer twitterFollowers) {
		this.twitterFollowers = twitterFollowers;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

}

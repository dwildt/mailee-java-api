package me.mailee;

import org.jactiveresource.ActiveResource;
import java.util.Date;
import java.util.HashMap;

public class Message extends ActiveResource {
	private String id;
	private String title;
	private String subject;
	private String fromEmail;
	private String fromName;
	private Integer listId;
	private String analytics;
	private String checked;
	private Integer clientId;
	private String contentFrom;
	private Date createdAt;
	private Date deletedAt;
	private String html;
	private String htmlFromUrl;
	private String log;
	private Integer newsletterId;
	private String replyEmail;
	private String rss;
	private Integer segmentId;
	private Date sendAfter;
	private Date sendWhen;
	private Integer status;
	private Integer templateId;
	private String text;
	private String thumbContentType;
	private String thumbFileName;
	private Integer thumbFileSize;
	private Date thumbUpdatedAt;
	private Integer total;
	private String url;
	private Object edit; 

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getListId() {
		return listId;
	}

	public void setListId(Integer listId) {
		this.listId = listId;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getAnalytics() {
		return analytics;
	}

	public void setAnalytics(String analytics) {
		this.analytics = analytics;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getContentFrom() {
		return contentFrom;
	}

	public void setContentFrom(String contentFrom) {
		this.contentFrom = contentFrom;
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

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getHtmlFromUrl() {
		return htmlFromUrl;
	}

	public void setHtmlFromUrl(String htmlFromUrl) {
		this.htmlFromUrl = htmlFromUrl;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Integer getNewsletterId() {
		return newsletterId;
	}

	public void setNewsletterId(Integer newsletterId) {
		this.newsletterId = newsletterId;
	}

	public String getReplyEmail() {
		return replyEmail;
	}

	public void setReplyEmail(String replyEmail) {
		this.replyEmail = replyEmail;
	}

	public String getRss() {
		return rss;
	}

	public void setRss(String rss) {
		this.rss = rss;
	}

	public Integer getSegmentId() {
		return segmentId;
	}

	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}

	public Date getSendAfter() {
		return sendAfter;
	}

	public void setSendAfter(Date sendAfter) {
		this.sendAfter = sendAfter;
	}

	public Date getSendWhen() {
		return sendWhen;
	}

	public void setSendWhen(Date sendWhen) {
		this.sendWhen = sendWhen;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setEdit(Object edit) {
		this.edit = edit;
	}

	public Object getEdit() {
		return edit;
	}
}

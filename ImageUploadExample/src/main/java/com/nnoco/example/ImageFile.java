package com.nnoco.example;

public class ImageFile {
	/**
	 * �뾽濡쒕뱶�븳 �씠誘몄� �뙆�씪�씠 ���옣�맆 寃쎈줈
	 */
	public static final String IMAGE_DIR = "/workspace/ImageUploadExample/src/main/webapp/resources/temp/";

	private String id;
	private String contentType;
	private int contentLength;
	private String fileName;

	public ImageFile(String id, String contentType, int contentLength,
			String fileName) {
		this.id = id;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.fileName = fileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getContentLength() {
		return contentLength;
	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}

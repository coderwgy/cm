package com.ma.cm.entity;

import java.io.Serializable;

public class Column implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6838379627585749557L;
	
	private long productId;

	private long columnId;
	
	private String name;
	
	private int type;
	
	private String poster;
	
	private String link;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getColumnId() {
		return columnId;
	}

	public void setColumnId(long columnId) {
		this.columnId = columnId;
	}
	
}

package br.ufc.mdcc.cc.hadoop;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class ModeloJuarez {

	String title;

	String bubbleCount;

	String createdAt;

	String text;

	String query;

	@JsonProperty("_id")
	Id id;

	Author author;

	CollectedAt collectedAt;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBubbleCount() {
		return bubbleCount;
	}

	public void setBubbleCount(String bubbleCount) {
		this.bubbleCount = bubbleCount;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public CollectedAt getCollectedAt() {
		return collectedAt;
	}

	public void setCollectedAt(CollectedAt collectedAt) {
		this.collectedAt = collectedAt;
	}
	
	
}

package com.iphoneservice.iintel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the word database table.
 * 
 */
@Entity
@Table(name="word")
public class Word implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

    @Lob()
	@Column(name="DEFINITION_DETAILS")
	private String definitionDetails;

	@Column(name="SOURCE")
	private String source;

	@Column(name="WORD_ITSELF")
	private String wordItself;

    public Word() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinitionDetails() {
		return this.definitionDetails;
	}

	public void setDefinitionDetails(String definitionDetails) {
		this.definitionDetails = definitionDetails;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getWordItself() {
		return this.wordItself;
	}

	public void setWordItself(String wordItself) {
		this.wordItself = wordItself;
	}

}
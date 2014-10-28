package com.iphoneservice.iintel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the photostand database table.
 * 
 */
@Entity
@Table(name="photostand")
public class Photostand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

    @Lob()
	@Column(name="DEFINITION_DETAILS1")
	private String definitionDetails1;

	@Column(name="NAME")
	private String name;

	@Column(name="SOURCE")
	private String source;

	@Column(name="SOURCE_URL")
	private String sourceUrl;

    public Photostand() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinitionDetails1() {
		return this.definitionDetails1;
	}

	public void setDefinitionDetails1(String definitionDetails1) {
		this.definitionDetails1 = definitionDetails1;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceUrl() {
		return this.sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
package com.iphoneservice.iintel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the recipe database table.
 * 
 */
@Entity
@Table(name="recipe")
public class Recipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATOR_TRAINER")
	private String creatorTrainer;

    @Lob()
	@Column(name="DEFINITION_DETAILS1")
	private String definitionDetails1;

    @Lob()
	@Column(name="DEFINITION_DETAILS2")
	private String definitionDetails2;

    @Lob()
	@Column(name="DEFINITION_DETAILS3")
	private String definitionDetails3;

	@Column(name="IMAGE_ID")
	private String imageId;

	@Column(name="NAME")
	private String name;

	@Column(name="SOURCE")
	private String source;

    public Recipe() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatorTrainer() {
		return this.creatorTrainer;
	}

	public void setCreatorTrainer(String creatorTrainer) {
		this.creatorTrainer = creatorTrainer;
	}

	public String getDefinitionDetails1() {
		return this.definitionDetails1;
	}

	public void setDefinitionDetails1(String definitionDetails1) {
		this.definitionDetails1 = definitionDetails1;
	}

	public String getDefinitionDetails2() {
		return this.definitionDetails2;
	}

	public void setDefinitionDetails2(String definitionDetails2) {
		this.definitionDetails2 = definitionDetails2;
	}

	public String getDefinitionDetails3() {
		return this.definitionDetails3;
	}

	public void setDefinitionDetails3(String definitionDetails3) {
		this.definitionDetails3 = definitionDetails3;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
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

}
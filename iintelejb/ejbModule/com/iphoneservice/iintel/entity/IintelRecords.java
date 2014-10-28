package com.iphoneservice.iintel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iintel_records database table.
 * 
 */
@Entity
@Table(name="iintel_records")
public class IintelRecords implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="IINTELNEWS_ID")
	private int iintelnewsId;

	@Column(name="JOKE_ID")
	private int jokeId;

	@Column(name="PHOTOSTAND_ID")
	private int photostandId;

	@Column(name="PHRASE_ID")
	private int phraseId;

	@Column(name="RECIPE_ID")
	private int recipeId;

	@Column(name="VIDEOTUBE_ID")
	private int videotubeId;

	@Column(name="WORD_ID")
	private int wordId;

    public IintelRecords() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIintelnewsId() {
		return this.iintelnewsId;
	}

	public void setIintelnewsId(int iintelnewsId) {
		this.iintelnewsId = iintelnewsId;
	}

	public int getJokeId() {
		return this.jokeId;
	}

	public void setJokeId(int jokeId) {
		this.jokeId = jokeId;
	}

	public int getPhotostandId() {
		return this.photostandId;
	}

	public void setPhotostandId(int photostandId) {
		this.photostandId = photostandId;
	}

	public int getPhraseId() {
		return this.phraseId;
	}

	public void setPhraseId(int phraseId) {
		this.phraseId = phraseId;
	}

	public int getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public int getVideotubeId() {
		return this.videotubeId;
	}

	public void setVideotubeId(int videotubeId) {
		this.videotubeId = videotubeId;
	}

	public int getWordId() {
		return this.wordId;
	}

	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

}
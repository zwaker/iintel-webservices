package com.iphoneservice.iintel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the phrase database table.
 * 
 */
@Entity
@Table(name="phrase")
public class Phrase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

    @Lob()
	@Column(name="DETAILS")
	private String details;

	@Column(name="SOURCE")
	private String source;

	@Column(name="TIME_WHEN")
	private String timeWhen;

	@Column(name="WHO")
	private String who;

    public Phrase() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTimeWhen() {
		return this.timeWhen;
	}

	public void setTimeWhen(String timeWhen) {
		this.timeWhen = timeWhen;
	}

	public String getWho() {
		return this.who;
	}

	public void setWho(String who) {
		this.who = who;
	}

}
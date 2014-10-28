package com.iphonewebservice.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.iphoneservice.iintel.IIntelManagerService;
import com.iphoneservice.iintel.entity.IintelRecordItem;
import com.iphoneservice.iintel.entity.IintelRecords;
import com.iphoneservice.iintel.entity.Iintelnews;
import com.iphoneservice.iintel.entity.Joke;
import com.iphoneservice.iintel.entity.Photostand;
import com.iphoneservice.iintel.entity.Phrase;
import com.iphoneservice.iintel.entity.Recipe;
import com.iphoneservice.iintel.entity.Videotube;
import com.iphoneservice.iintel.entity.Word;

@Named
@RequestScoped
public class IntelManagerController implements Serializable {

	private static final long serialVersionUID = 1L;
private String iintelRecordsId;	
private Phrase phrase=new Phrase();
private Joke joke= new Joke();
private Word word= new Word();
private Recipe recipe=new Recipe();
private Videotube videoTube=new Videotube();
private Photostand photoStand=new Photostand();
private Iintelnews iintelNews=new Iintelnews();
private IintelRecords iintelRecords=new IintelRecords();
private IintelRecordItem iintelRecordItem=new IintelRecordItem();


public Phrase getPhrase() {
	return phrase;
}
public void setPhrase(Phrase phrase) {
	this.phrase = phrase;
}

@Inject
private IIntelManagerService iintelMangerService;
private java.lang.String hello="ttttttHIS IS GOOD";
@PostConstruct
public void loadFromDB(){
	System.out.println("SSSS");
}
public IIntelManagerService getIintelMangerService() {
	return iintelMangerService;
}
public void setIintelMangerService(IIntelManagerService iintelMangerService) {
	this.iintelMangerService = iintelMangerService;
}
public String getHello() {
	return hello;
}
public void setHello(String hello) {
	this.hello = hello;
}
public String sayHello(){
	Phrase tp=new Phrase();
	tp.setDetails("SSS");
	tp.setSource("SSS");
	tp.setTimeWhen("SS");
	tp.setWho("SSS");
	iintelMangerService.savePhrase(tp);
	System.out.println("SSSS");
	return null;
	
}
public String saveIintelProcessAll(){
	
	IintelRecordItem iintelRecordItem=iintelMangerService.saveIintelProcess(phrase, word, joke, recipe, photoStand, videoTube, iintelNews);
	setIintelRecordsId(new Integer(iintelRecordItem.getIintelRecordsId()).toString());
	return null;
	
}
public Joke getJoke() {
	return joke;
}
public void setJoke(Joke joke) {
	this.joke = joke;
}
public Word getWord() {
	return word;
}
public void setWord(Word word) {
	this.word = word;
}
public Recipe getRecipe() {
	return recipe;
}
public void setRecipe(Recipe recipe) {
	this.recipe = recipe;
}
public Videotube getVideoTube() {
	return videoTube;
}
public void setVideoTube(Videotube videoTube) {
	this.videoTube = videoTube;
}
public Photostand getPhotoStand() {
	return photoStand;
}
public void setPhotoStand(Photostand photoStand) {
	this.photoStand = photoStand;
}
public Iintelnews getIintelNews() {
	return iintelNews;
}
public void setIintelNews(Iintelnews iintelNews) {
	this.iintelNews = iintelNews;
}
public IintelRecords getIintelRecords() {
	return iintelRecords;
}
public void setIintelRecords(IintelRecords iintelRecords) {
	this.iintelRecords = iintelRecords;
}
public IintelRecordItem getIintelRecordItem() {
	return iintelRecordItem;
}
public void setIintelRecordItem(IintelRecordItem iintelRecordItem) {
	this.iintelRecordItem = iintelRecordItem;
}
public String getIintelRecordsId() {
	return iintelRecordsId;
}
public void setIintelRecordsId(String iintelRecordsId) {
	this.iintelRecordsId = iintelRecordsId;
}


}

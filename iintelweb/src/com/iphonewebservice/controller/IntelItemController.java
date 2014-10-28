package com.iphonewebservice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

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
import com.iphonewebservice.iintel.enums.IntelType;

@Named
@RequestScoped
public class IntelItemController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String iintelRecordsId;
	private Phrase phrase = new Phrase();
	private Joke joke = new Joke();
	private Word word = new Word();
	private Recipe recipe = new Recipe();
	private Videotube videoTube = new Videotube();
	private Photostand photoStand = new Photostand();
	private Iintelnews iintelNews = new Iintelnews();
	private IintelRecords iintelRecords = new IintelRecords();
	private IintelRecordItem iintelRecordItem = new IintelRecordItem();

	public Phrase getPhrase() {
		return phrase;
	}

	public void setPhrase(Phrase phrase) {
		this.phrase = phrase;
	}

	@Inject
	private IIntelManagerService iintelMangerService;

	public IIntelManagerService getIintelMangerService() {
		return iintelMangerService;
	}

	public void setIintelMangerService(IIntelManagerService iintelMangerService) {
		this.iintelMangerService = iintelMangerService;
	}

	public String respondToRequest() {
		HttpServletRequest httpServletRequest = ((HttpServletRequest) (FacesContext
				.getCurrentInstance().getExternalContext().getRequest()));
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		String iintelType = (String) httpServletRequest.getParameter("type");
		IintelRecordItem iintelRecordItem=iintelMangerService.retrieveIintelRecordItem();
		JSONObject object=new JSONObject();
		String jsonObjectAsString="";
		if (iintelType.equals(IntelType.PHRASE.getType())) {
			phrase=iintelMangerService.retrievePhrase(iintelRecordItem.getPhraseId());
			object=JSONObject.fromObject(phrase);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.JOKE.getType())) {
			joke=iintelMangerService.retrieveJoke(iintelRecordItem.getJokeId());
			object=JSONObject.fromObject(joke);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.WORD.getType())) {
			word=iintelMangerService.retrieveWord(iintelRecordItem.getWordId());
			object=JSONObject.fromObject(word);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.RECIPE.getType())) {
			recipe=iintelMangerService.retrieveRecipe(iintelRecordItem.getRecipeId());
			object=JSONObject.fromObject(recipe);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.PHOTOSTAND.getType())) {
			photoStand=iintelMangerService.retrievePhotostand(iintelRecordItem.getPhotostandId());
			object=JSONObject.fromObject(photoStand);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.VIDEOTUBE.getType())) {
			videoTube=iintelMangerService.retrieveVideotube(iintelRecordItem.getVideotubeId());
			object=JSONObject.fromObject(videoTube);
			jsonObjectAsString=object.toString();
		}
		if (iintelType.equals(IntelType.IINTELNEWS.getType())) {
			iintelNews=iintelMangerService.retrieveIintelnews(iintelRecordItem.getIintelnewsId());
			object=JSONObject.fromObject(iintelNews);
			jsonObjectAsString=object.toString();
		}
		
		HttpServletResponse httpServletResponse = ((HttpServletResponse) (FacesContext
				.getCurrentInstance().getExternalContext().getResponse()));
		httpServletResponse.setContentType("text/json");
		PrintWriter out = null;
		try {
			out = httpServletResponse.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		out.println(jsonObjectAsString);
		FacesContext.getCurrentInstance().responseComplete();
		return "";

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

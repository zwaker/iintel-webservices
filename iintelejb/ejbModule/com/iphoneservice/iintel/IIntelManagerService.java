/**
 * 
 */
package com.iphoneservice.iintel;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;

import com.iphoneservice.iintel.entity.IintelRecordItem;
import com.iphoneservice.iintel.entity.IintelRecords;
import com.iphoneservice.iintel.entity.Iintelnews;
import com.iphoneservice.iintel.entity.Joke;
import com.iphoneservice.iintel.entity.Photostand;
import com.iphoneservice.iintel.entity.Phrase;
import com.iphoneservice.iintel.entity.Recipe;
import com.iphoneservice.iintel.entity.Videotube;
import com.iphoneservice.iintel.entity.Word;

/**
 * @author przaca
 *
 */

@LocalBean
@Stateless
public class IIntelManagerService {
	@PersistenceContext(unitName = "mypersistence")
	private EntityManager em;
	
	public IintelRecordItem saveIintelProcess(Phrase phrase,Word word,Joke joke,Recipe recipe,Photostand photoStand,Videotube videoTube,Iintelnews iintelNews){
		int phraseId=savePhrase(phrase);
		int jokeId=saveJoke(joke);
		int wordId = saveWord(word);
		int recipeId=saveRecipe(recipe);
		int photoStandId=savePhotostand(photoStand);
		int videoTubeId=saveVideotube(videoTube);
		int iintelNewsId=saveIintelNews(iintelNews);
		IintelRecords iintelRecords=new IintelRecords();
		iintelRecords.setPhraseId(phraseId);
		iintelRecords.setJokeId(jokeId);
		iintelRecords.setWordId(wordId);
		iintelRecords.setRecipeId(recipeId);
		iintelRecords.setPhotostandId(photoStandId);
		iintelRecords.setVideotubeId(videoTubeId);
		iintelRecords.setIintelnewsId(iintelNewsId);
		int iintelRecordsId=saveIintelRecords(iintelRecords);
		IintelRecordItem iintelRecordItem=new IintelRecordItem();
	    iintelRecordItem.setIintelRecordsId(iintelRecordsId);
		iintelRecordItem.setPhraseId(phraseId);
		iintelRecordItem.setJokeId(jokeId);
		iintelRecordItem.setWordId(wordId);
		iintelRecordItem.setRecipeId(recipeId);
		iintelRecordItem.setPhotostandId(photoStandId);
		iintelRecordItem.setVideotubeId(videoTubeId);
		iintelRecordItem.setIintelnewsId(iintelNewsId);
		iintelRecordItem=saveIintelRecordItem(iintelRecordItem);
		return iintelRecordItem;
		
	}
	
	private int saveWord(com.iphoneservice.iintel.entity.Word word) {
		em.persist(word);
		return word.getId();
	}

	public int savePhrase(Phrase phrase){	
		em.persist(phrase);
		em.flush();
		em.refresh(phrase);
		return phrase.getId();
	}
	public Phrase retrievePhrase(int id ){	
		Phrase phrase=em.find(Phrase.class, id);
		return phrase;
	}
	public int saveJoke(Joke joke){	
		em.persist(joke);
		return joke.getId();
	}
	public Joke retrieveJoke(int id ){	
		Joke joke=em.find(Joke.class, id);
		return joke;
	}
	public int Word(Word word){	
		em.persist(word);
		return word.getId();
	}
	public Word retrieveWord(int id ){	
		Word word=em.find(Word.class, id);
		return word;
	}
	public int saveRecipe(Recipe recipe){	
		em.persist(recipe);
		return recipe.getId();
	}
	public Recipe retrieveRecipe(int id ){	
		Recipe recipe=em.find(Recipe.class, id);
		return recipe;
	}
	public int saveVideotube(Videotube videotube){	
		em.persist(videotube);
		return videotube.getId();
	}
	public Videotube retrieveVideotube(int id ){	
		Videotube videotube=em.find(Videotube.class, id);
		return videotube;
	}
	public int savePhotostand(Photostand photoStand){	
		em.persist(photoStand);
		return photoStand.getId();
	}
	public Photostand retrievePhotostand(int id ){	
		Photostand photoStand=em.find(Photostand.class, id);
		return photoStand;
	}
	public int saveIintelNews(Iintelnews iintelNews){	
		em.persist(iintelNews);
		return iintelNews.getId();
	}
	public Iintelnews retrieveIintelnews(int id ){	
		Iintelnews iintelNews=em.find(Iintelnews.class, id);
		return iintelNews;
	}
	public int saveIintelRecords(IintelRecords iintelRecords){	
		em.persist(iintelRecords);
		return iintelRecords.getId();
	}
	public IintelRecords retrieveIintelRecors(int id ){	
		IintelRecords iintelRecords=em.find(IintelRecords.class, id);
		return iintelRecords;
	}
	public IintelRecordItem saveIintelRecordItem(IintelRecordItem iintelRecordItem){	
		IintelRecordItem iintelRecordItemR=em.find(IintelRecordItem.class, 1);
		if(iintelRecordItemR ==null){
			iintelRecordItemR=new IintelRecordItem();
		}
		iintelRecordItemR.setPhraseId(iintelRecordItem.getPhraseId());
		iintelRecordItemR.setJokeId(iintelRecordItem.getJokeId());
		iintelRecordItemR.setWordId(iintelRecordItem.getWordId());
		iintelRecordItemR.setRecipeId(iintelRecordItem.getRecipeId());
		iintelRecordItemR.setPhotostandId(iintelRecordItem.getPhotostandId());
		iintelRecordItemR.setVideotubeId(iintelRecordItem.getVideotubeId());
		iintelRecordItemR.setIintelnewsId(iintelRecordItem.getIintelnewsId());
		iintelRecordItemR.setIintelRecordsId(iintelRecordItem.getIintelRecordsId());
		em.persist(iintelRecordItemR);
		return iintelRecordItemR;
	}
	
	
	public IintelRecordItem retrieveIintelRecordItem(){	
		//IintelRecordItem iintelRecordItem=em.find(IintelRecordItem.class, id);
		Session session = ((org.hibernate.ejb.EntityManagerImpl) em.getDelegate()).getSession();
		DetachedCriteria maxId = DetachedCriteria.forClass(IintelRecordItem.class)
			    .setProjection( Projections.max("id") );
		List<IintelRecordItem> itemList=session.createCriteria(IintelRecordItem.class)
			    .add( Property.forName("id").eq(maxId) )
			    .list();
		IintelRecordItem iintelRecordItem = itemList.get(0);
		return iintelRecordItem;
	}
}

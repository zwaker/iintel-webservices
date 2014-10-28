/**
 * 
 */
package com.iphonewebservice.controller;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 * @author ArShaN
 * 
 */

@Named
@RequestScoped
public class MyTest implements Serializable {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void loadFromDB() {

	}

	public String mytest() {

		System.out.println("S");
		return "";
	}

	public void respond() {
		HttpServletRequest httpServletRequest = ((HttpServletRequest) (FacesContext
				.getCurrentInstance().getExternalContext().getRequest()));
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		String answer = (String) httpServletRequest.getParameter("answer");
		String voteResult = (String) httpServletRequest
				.getParameter("voteResult");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dateWithoutTime = null;
		try {
			dateWithoutTime = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}
}

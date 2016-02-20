package dbDataTypes;

import java.util.Date;

public class Movie extends Listing {
	
	//e.g. http://www.imdb.com/title/tt0111161/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042102&pf_rd_r=0KNPDE5EECDTXH1CFFEZ&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_tt_1
	private String name="";
	private Date releaseDate=null;
	private int budget=-1;
	private String contentRating="";
	private String castList="";
	private String productionCompanyList="";
	private boolean inColor=true;
	private int runtime=-1;
	private String languages="";
	private String storyline="";
	private String genreList="";
	private String trivia="";
	private String goofs="";
	
	
	
	public Movie(int listingID, AggregatedRating rating, String name, Date releaseDate, int budget,
			String contentRating, String castList, String productionCompanyList, boolean inColor, int runtime,
			String languages, String storyline, String genreList, String trivia, String goofs) {
		super(listingID, rating);
		this.name = name;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.contentRating = contentRating;
		this.castList = castList;
		this.productionCompanyList = productionCompanyList;
		this.inColor = inColor;
		this.runtime = runtime;
		this.languages = languages;
		this.storyline = storyline;
		this.genreList = genreList;
		this.trivia = trivia;
		this.goofs = goofs;
	}
	public String getName() {
		return name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public int getBudget() {
		return budget;
	}
	public String getContentRating() {
		return contentRating;
	}
	public String getCastList() {
		return castList;
	}
	public String getProductionCompanyList() {
		return productionCompanyList;
	}
	public boolean isInColor() {
		return inColor;
	}
	public int getRuntime() {
		return runtime;
	}
	public String getLanguages() {
		return languages;
	}
	public String getStoryline() {
		return storyline;
	}
	public String getGenreList() {
		return genreList;
	}
	public String getTrivia() {
		return trivia;
	}
	public String getGoofs() {
		return goofs;
	}

}

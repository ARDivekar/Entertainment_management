package dbDataTypes;

import java.util.Date;

public class TVShow extends Listing {
	//e.g. http://www.imdb.com/title/tt0903747/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2398042182&pf_rd_r=1C9KBSZSR37CE6K6H2M4&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=toptv&ref_=chttvtp_tt_3
	private String name="";
	private String creatorNameList="";
	private Date releaseDate=null;
	private Date startDate=null;
	private String genreList="";
	private String castList="";
	private String storyline="";
	private String certifications="";
	private String languages="";
	private int runtimePerEpisode=0;
	private int numberOfSeasons=0;
	private String productionCompanyList="";
	private boolean inColor=true;
	private String trivia="";
	private String goofs="";
	
	
	
	
	public TVShow(int listingID, AggregatedRating rating, String name, String creatorNameList, Date releaseDate,
			Date startDate, String genreList, String castList, String storyline, String certifications,
			String languages, int runtimePerEpisode, int numberOfSeasons, String productionCompanyList, boolean inColor,
			String trivia, String goofs) {
		super(listingID, rating);
		this.name = name;
		this.creatorNameList = creatorNameList;
		this.releaseDate = releaseDate;
		this.startDate = startDate;
		this.genreList = genreList;
		this.castList = castList;
		this.storyline = storyline;
		this.certifications = certifications;
		this.languages = languages;
		this.runtimePerEpisode = runtimePerEpisode;
		this.numberOfSeasons = numberOfSeasons;
		this.productionCompanyList = productionCompanyList;
		this.inColor = inColor;
		this.trivia = trivia;
		this.goofs = goofs;
	}
	public String getName() {
		return name;
	}
	public String getCreatorNameList() {
		return creatorNameList;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public String getGenreList() {
		return genreList;
	}
	public String getCastList() {
		return castList;
	}
	public String getStoryline() {
		return storyline;
	}
	public String getCertifications() {
		return certifications;
	}
	public String getLanguages() {
		return languages;
	}
	public int getRuntimePerEpisode() {
		return runtimePerEpisode;
	}
	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}
	public String getProductionCompanyList() {
		return productionCompanyList;
	}
	public boolean isInColor() {
		return inColor;
	}
	public String getTrivia() {
		return trivia;
	}
	public String getGoofs() {
		return goofs;
	}
		
}

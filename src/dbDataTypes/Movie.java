package dbDataTypes;

import java.sql.Date;

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
	
	
	
}

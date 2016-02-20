package dataExtractors;

import Exceptions.CannotExtractException;
import Exceptions.NoDBException;

abstract public class Extractor {
	protected String listingType="";
	protected int numListings=10;
	protected String[] sourceURLList;
	
	abstract protected void extract() throws CannotExtractException;
	
	abstract protected void saveToDB() throws NoDBException;
	
	public void setNumListings(int numListings){
		this.numListings = numListings;
	}
	
	
	
	public boolean updateDB(){
		try{
			extract();
			System.out.println("Extracted "+numListings+" "+listingType+" listings.");
		}catch(CannotExtractException e){
			e.printStackTrace();
			return false;
		}
		try{
			saveToDB();
			System.out.println("Saved "+numListings+" "+listingType+" listings to the database.");
		}catch(NoDBException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
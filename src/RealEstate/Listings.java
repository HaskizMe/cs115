package RealEstate;


import java.util.*;
public class Listings implements Listable {
	//attributes
	HashMap<String,Residential> listings;
	
	//constructor
	public Listings() {
		listings = new HashMap<String,Residential>();
	}
	
	//methods	
	//returns a HashMap<String, Residential> containing a list of street addresses (key) and their associated residences (value)
	public HashMap<String, Residential> getListings() {
		return listings;
	}

	//Takes a String argument and returns the Residential value for the associated String key in a HashMap<String, Residential>
	public Residential getListing(String s) {
		for (String key : listings.keySet()){  
			if(key.equals(s)) {
				return listings.get(key);
			}
		} 
		return null;
	}

	//Takes no arguments and returns a Set<String> of keys from a HashMap<String, Residential>
	public Set<String> getStreetAddress() {
		Set<String> hashSet = new HashSet<String>();
		for(String key : listings.keySet()) {
			 hashSet.add(key);
		}
		return hashSet;
	}

	//Takes no arguments and returns a Collection<Residential> of values from a HashMap<String, Residential>
	public ArrayList<Residential> getResidences() {
		ArrayList<Residential> array = new ArrayList<Residential>();
		for (String key: listings.keySet()){  
			array.add(listings.get(key));
		}
			return array;
	}

	//Takes no arguments and returns the number of listings in the HashMap<String, Residential>
	public int getListingCount() {
		return listings.size();
	}

	//Returns void. Adds a new key/value pair in a HashMap<String, Residential>
	public void addListing(String s, Residential r) {
		listings.put(s, r);
		
	}

}

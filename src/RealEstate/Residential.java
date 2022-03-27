package RealEstate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class Residential extends Property implements Biddable{

	//Attributes
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	private HashMap<String, Double> bids;
	//Constructors
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0.0;	
	}
	public Residential(String sa, int z, int bedc, int bathc, double sf) {
		super(sa,z);
		bedCount = bedc;
		bathCount = bathc;
		sqFootage = sf;
		bids = new HashMap<String,Double>();
	}
	//methods
	public int getBeds() {
		return bedCount;
	}
	public void setBeds(int bedc) {
		bedCount = bedc;
	}
	public int getBaths() {
		return bathCount;
	}
	public void setBaths(int bathc) {
		bathCount = bathc;
	}
	public double getSize() {
		return sqFootage;
	}
	public void setSize(double sf) {
		sqFootage = sf;
	}
	public abstract double calculateAppraisalPrice();
	
	//Takes no arguments and  returns a HashMap<String, Double> containing a list of bidder names (key) and their associated bid (value)
	public HashMap<String, Double> getBids(){
		return bids;
	}
	
	//Takes a String argument and returns the Double value for the associated String key in a HashMap<String, Double>
	public Double getBid(String str) {
		return bids.get(str);
	}
	
	//Takes no arguments and returns a Set<String> of keys from a HashMap<String, Double>
	public Set<String> getBidders(){
		Set<String> hashSet = new HashSet<String>();
		for(String key : bids.keySet()) {
			 hashSet.add(key);
		}
		return hashSet;
	}
	
	//Takes no arguments and returns the number of bids in the HashMap<String, Double>
	public int getBidCount() {
		return bids.size();
	}
	
	//Returns void. Either updates the value for the key or adds a new key/value pair in a HashMap<String, Double>
	public void newBid(String s, Double d) {
		bids.put(s, d);
	}
}
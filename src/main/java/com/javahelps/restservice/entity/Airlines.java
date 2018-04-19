package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Airlines {
	
	@Id
    private String keycode;
	public Airlines(String string) {
		
	// TODO Auto-generated constructor stub
	}
	
	protected Airlines(){}

	public String getKeycode() {
		return keycode;
	}


	public void setKeycode(String keycode) {
		this.keycode = keycode;
	}



	public String getIcao() {
		return icao;
	}



	public void setIcao(String icao) {
		this.icao = icao;
	}



	public String getIata() {
		return iata;
	}



	public void setIata(String iata) {
		this.iata = iata;
	}



	public String getAirlinename() {
		return airlinename;
	}



	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}


//
//	public String getIdcountry() {
//		return idcountry;
//	}
//
//
//
//	public void setIdcountry(String idcountry) {
//		this.idcountry = idcountry;
//	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getLastupdateby() {
		return lastupdateby;
	}



	public void setLastupdateby(String lastupdateby) {
		this.lastupdateby = lastupdateby;
	}



	public String getLastupdateon() {
		return lastupdateon;
	}

	public void setLastupdateon(String lastupdateon) {
		this.lastupdateon = lastupdateon;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	private String icao;
    private String iata;
    private String airlinename;
    private String idcountry;
    private String website;
    private String lastupdateby;
    private String lastupdateon;
    private String client;
   
    
    //@Override
    //public String toString() {
        //return String.format(
                //"Customer[id=%d, firstName='%s', lastName='%s']",
                //id, firstName, lastName);
   // }
    
    @Override
	public String toString() {
		return String.format(
				"Airlines[airlinename=%s]", airlinename);
	}
    

//    @Override
//public String toString() {
//	return "Airlines [keycode=" + keycode + ", icao=" + icao + ", iata=" + iata + ", airlinename=" + airlinename
//				+ ", idcountry=" + idcountry + ", website=" + website + ", lastupdateby=" + lastupdateby
//				+ ", lastupdateon=" + lastupdateon + ", client=" + client + "]";
//	}
}

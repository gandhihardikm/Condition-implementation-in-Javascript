package com.vipul.sjsu.cmpe273.interfacejava;

public interface Cricket extends Sports {
	
	public void team1Score(int iTeam1Score);
	public void team2Score(int iTeam2Score);
	
	public void selectManOfMatch(String sManOfMatch);
	
	public void highestRunGetterTeam1(String sHighestRunGetterTeam1);
	public void highestRunGetterTeam2(String sHighestRunGetterTeam2);
	
	public void mostNumberofWicketTakerTeam1(String sMostNumberofWicketTakerTeam1);
	public void mostNumberofWicketTakerTeam2(String sMostNumberofWicketTakerTeam2);
}

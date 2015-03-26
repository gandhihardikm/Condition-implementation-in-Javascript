package com.vipul.sjsu.cmpe273.javaprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.vipul.sjsu.cmpe273.interfacejava.Cricket;
import com.vipul.sjsu.cmpe273.interfacejava.Sports;

public class IndiaVsPakistan implements Cricket {
	
	static String sTeam1;
	static String sTeam2;
	static int iTeam1Score;
	static int iTeam2Score;
	static String sHighestRunGetterTeam1;
	static String sHighestRunGetterTeam2;
	static String sMostNumberofWicketTakerTeam1;
	static String sMostNumberofWicketTakerTeam2;
	static String sManOfTheMatch;
	static String sString;

	// Constructor
	public IndiaVsPakistan() {
	}

	@Override
	public void selectTeam1(String sTeam1) {
		IndiaVsPakistan.sTeam1 = sTeam1;
	}

	@Override
	public void selectTeam2(String sTeam2) {
		IndiaVsPakistan.sTeam2 = sTeam2;
	}

	@Override
	public void team1Score(int iTeam1Score) {
		IndiaVsPakistan.iTeam1Score = iTeam1Score;
	}

	@Override
	public void team2Score(int iTeam2Score) {
		IndiaVsPakistan.iTeam2Score = iTeam2Score;
	}

	@Override
	public void selectManOfMatch(String sManOfMatch) {
		IndiaVsPakistan.sManOfTheMatch = sManOfMatch;
	}

	@Override
	public void highestRunGetterTeam1(String sHighestRunGetterTeam1) {
		IndiaVsPakistan.sHighestRunGetterTeam1 = sHighestRunGetterTeam1;
	}

	@Override
	public void highestRunGetterTeam2(String sHighestRunGetterTeam2) {
		IndiaVsPakistan.sHighestRunGetterTeam2 = sHighestRunGetterTeam2;
	}

	@Override
	public void mostNumberofWicketTakerTeam1(
			String sMostNumberofWicketTakerTeam1) {
		IndiaVsPakistan.sMostNumberofWicketTakerTeam1 = sMostNumberofWicketTakerTeam1;
	}

	@Override
	public void mostNumberofWicketTakerTeam2(
			String sMostNumberofWicketTakerTeam2) {
		IndiaVsPakistan.sMostNumberofWicketTakerTeam2 = sMostNumberofWicketTakerTeam2;
	}
	
	public static String StringFromConsole() {
		BufferedReader bufferRead = new BufferedReader(
				new InputStreamReader(System.in));
		String sStringFromConsole = "";
		try {
			sStringFromConsole = bufferRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sStringFromConsole;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Team 1" + " : ");
		IndiaVsPakistan indiaVsPakistan = new IndiaVsPakistan();
		indiaVsPakistan.selectTeam1(StringFromConsole());
		System.out.println("Enter Team 2" + " : ");	
		indiaVsPakistan.selectTeam2(StringFromConsole());
		
		System.out.println("Enter Runs Scored by " + sTeam1 + " : ");
		indiaVsPakistan.team1Score(Integer.parseInt(StringFromConsole()));
		
		System.out.println("Enter Runs Scored by " + sTeam2 + " : ");
		indiaVsPakistan.team2Score(Integer.parseInt(StringFromConsole()));
		
		System.out.println("Enter Man of the Match : ");
		indiaVsPakistan.selectManOfMatch(StringFromConsole());
		
		System.out.println("Enter Highest Run Scorer of " + sTeam1 + " : ");
		indiaVsPakistan.highestRunGetterTeam1(StringFromConsole());
		
		System.out.println("Enter Highest Wicket taker from " + sTeam1 + " : ");
		indiaVsPakistan.mostNumberofWicketTakerTeam1(StringFromConsole());
		
		System.out.println("Enter Highest Run Scorer of " + sTeam2 + " : ");
		indiaVsPakistan.highestRunGetterTeam2(StringFromConsole());
		
		System.out.println("Enter Highest Wicket taker from " + sTeam2 + " : ");
		indiaVsPakistan.mostNumberofWicketTakerTeam2(StringFromConsole());
		
		if (iTeam1Score > iTeam2Score) 
			System.out.println(sTeam1 + " won the Match");
		else if (iTeam1Score == iTeam2Score) 
			System.out.println("Match was a Tie");
		else 
			System.out.println(sTeam2 + " won the Match");
		
		System.out.println("Result for :" + sTeam1 + " vs " + sTeam2);
		System.out.println(sTeam1 + " : " + iTeam1Score
				+ "\n" + sTeam2 + " : " + iTeam2Score
				+ "\n" + "Highest Scorer for : " + sTeam1 + " : " + sHighestRunGetterTeam1
				+ "\n" + "Highest Scorer for : " + sTeam2 + " : "  + sHighestRunGetterTeam2
				+ "\n" + "Most Wickets Taken for : " + sTeam1 + " : "  + sMostNumberofWicketTakerTeam1
				+ "\n" + "Most Wickets Taken for : " + sTeam2 + " : "  + sMostNumberofWicketTakerTeam2);
	}

}

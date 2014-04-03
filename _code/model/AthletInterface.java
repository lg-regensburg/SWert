package model;

import java.util.*;

interface AthletInterface {

	public long getId();
	public String getName();
	public LinkedList<Leistung> getLeistungen();
	public boolean addLeistung(Leistung leistung);
	public boolean removeLeistung(Leistung leistungToRemove);
	public Leistung getLeistungById(long id);
	public void updateLeistung(long id_leistung, int id_strecke, String bezeichnung, String datum, double geschwindigkeit);
	public String getSpeicherpfad();
	public void setSpeicherpfad(String speicherpfad);
	public boolean equalsWithoutID (Athlet andererAthlet);
	
	// Leistungen f�r Slope-Faktor bearbeiten
	public void setLeistungToAuswahlForSlopeFaktor(Leistung ausgewaehlteLeistung) throws Exception;
	public void removeLeistungFromAuswahlForSlopeFaktor(Leistung ausgewaehlteLeistung);
	public Leistung[] getLeistungAuswahlForSlopeFaktor();
	public void resetLeistungAuswahlForSlopeFaktor();
	public void setLeistungenAuswahlForSlopeFaktorAutomatisch() throws GleicheStreckeException, Exception;
	
	// Berechnete Leistungen
	public LinkedList<Leistung> getMoeglicheBestzeitenListe () throws SlopeFaktorNotSetException;
	public double getSpeedSecondsPerKm (double entfernung) throws SlopeFaktorNotSetException;
	public double getTime (double entfernung) throws SlopeFaktorNotSetException;
	public double getAnaerobeSchwelle() throws SlopeFaktorNotSetException;	
}
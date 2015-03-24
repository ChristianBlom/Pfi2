package se.mah.k3lara.skaneAPI.view;
import java.util.ArrayList;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
public class StationsThread extends Thread {
	private Parser parser;
	private GUI gui;
	public StationsThread(Parser p, GUI g) {
		this.parser = p;
		this.gui = g;
	}
	public void run() {
		gui.guiSearch.clear();
		gui.textArea.setText(null);
		gui.textArea.setText("Searching..");
		gui.guiSearch.addAll(Parser.getStationsFromURL(gui.textField.getText()));
		gui.textArea.setText(null);
		gui.textArea.append("List of stations that match your entry. \n");
		for(int i = 0; i < gui.guiSearch.size(); i++){ 
			gui.textArea.append(gui.guiSearch.get(i).getStationName()+" StationNumber: "+gui.guiSearch.get(i).getStationNbr()+" \n");
		}
	}
}
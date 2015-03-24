package se.mah.k3lara.skaneAPI.view;
import java.util.Calendar;
import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
public class JourneysThread extends Thread{
	private Parser parser;
	private GUI gui;
	public JourneysThread(Parser p, GUI g) {
		this.parser = p;
		this.gui = g;
	}
	public void run() {
		gui.textAreaResa.setText(null);
		gui.textAreaResa.setText("Searching...");
		String searchURL = Constants.getURL(gui.txtFrn.getText(),gui.txtTill.getText(),1); 
		Journeys journeys = Parser.getJourneys(searchURL); 
		for (Journey journey : journeys.getJourneys()) { 
			gui.textAreaResa.setText(null);
			gui.textAreaResa.append(journey.getStartStation()+" - " +journey.getEndStation() + " ");
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE); 
			String delayed = journey.getDepTimeDeviation();
			if (delayed.contentEquals("0") || delayed.isEmpty()){ 
				gui.textAreaResa.append(" Ankommer "+ time + " -  dvs. om "+journey.getTimeToDeparture()+ " minuter.");
			} else {
				gui.textAreaResa.append(" Ankommer "+ time + " -  dvs. om "+journey.getTimeToDeparture()+ " minuter. Och är "+journey.getDepTimeDeviation()+" minut(er) forsenad.");
			}
		}
	}
}
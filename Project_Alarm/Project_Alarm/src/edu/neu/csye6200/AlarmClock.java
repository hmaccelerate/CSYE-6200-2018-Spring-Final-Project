package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class AlarmClock {
	List<Clock> clockList  = new ArrayList<>();
	
	public void setClock(int h, int m, int repeatType) {
		Clock clk = new Clock(h, m, repeatType);
		clockList.add(clk);
		
	}
}

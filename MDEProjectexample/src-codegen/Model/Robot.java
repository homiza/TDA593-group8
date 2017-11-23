// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Controller.Observer;
import Model.Area;
import Model.IMission;
import Model.IRobot;
import Model.State;
import Model.Strategy;
import java.lang.String;
import java.util.List;
import project.Point;

/************************************************************/
/**
 * 
 */
public class Robot implements IRobot {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Point position;
	/**
	 * 
	 */
	private Strategy strategy;
	/**
	 * 
	 */
	private State state;
	/**
	 * 
	 */
	private IMission mission;
	/**
	 * 
	 */
	private List<Observer> observers;
	/**
				 * 
				 */
				public List<Area> list<area>;

	/**
	 * 
	 * @return 
	 */
	public Point getPosition() {
	}

	/**
	 * 
	 * @return 
	 */
	public Strategy getStrategy() {
	}

	/**
	 * 
	 */
	private void move() {
	}

	/**
	 * 
	 * @return 
	 */
	public String getState() {
	}

	/**
	 * 
	 * @return 
	 */
	public IMission getMission() {
	}

	/**
	 * 
	 * @return 
	 */
	public String getName() {
	}

	/**
	 * 
	 * @param mission 
	 */
	public void setMission(IMission mission) {
	}

	/**
	 * 
	 * @param strategy 
	 */
	public void setStrategy(Strategy strategy) {
	}

	/**
	 * 
	 * @param position 
	 */
	public void setPosition(Point position) {
	}

	/**
	 * 
	 */
	public void notifyAllObservers() {
	}

	/**
	 * 
	 * @param observer 
	 */
	public void attach(Observer observer) {
	}
};

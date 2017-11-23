// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Model.IMission;
import Model.IRobot;
import Model.Mission;
import Model.State;
import Model.Strategy;
import java.awt.Point;
import java.lang.String;

/************************************************************/
/**
 * 
 */
public class Robot implements IRobot {
	
	public Robot(String name, Point position, Strategy strategy, State state, IMission mission) {
		this.name = name;
		this.position = position;
		this.strategy = strategy;
		this.state = state;
		this.mission = mission;
	}
	
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
	public Strategy strategy;
	/**
	 * 
	 */
	public State state;
	/**
	 * 
	 */
	public IMission mission;

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
	public Mission getMission() {
	}

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
};

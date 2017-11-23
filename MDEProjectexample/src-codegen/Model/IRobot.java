// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Controller.Observer;
import Model.IMission;
import Model.Strategy;
import java.awt.Point;
import java.lang.String;

/************************************************************/
/**
 * 
 */
public interface IRobot {
	/**
	 * 
	 * @return 
	 */
	public String getState();

	/**
	 * 
	 * @return 
	 */
	public IMission getMission();

	/**
	 * 
	 * @return 
	 */
	public Point getPosition();

	/**
	 * 
	 * @return 
	 */
	public Strategy getStrategy();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @param mission 
	 */
	public void setMission(IMission mission);

	/**
	 * 
	 * @param position 
	 */
	public void setPosition(Point position);

	/**
	 * 
	 * @param strategy 
	 */
	public void setStrategy(Strategy strategy);

	/**
	 * 
	 */
	public void notifyAllObservers();

	/**
	 * 
	 * @param observer 
	 */
	public void attach(Observer observer);
};

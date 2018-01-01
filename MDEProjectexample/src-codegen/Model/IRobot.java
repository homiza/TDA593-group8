// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Controller.Observer;
import Model.IMission;
import Model.Strategy;
import java.lang.String;
import project.Point;
import project.RobotAvatar;

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
	 * @param reward 
	 */
	public void addReward(int reward);
	
	public void attach(Observer observer);
	
	public RobotAvatar getRobot();
	
	public void setState(State state);

	public boolean isAtPosition(Point point);
};
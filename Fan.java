

/**
 * 
 * @author Sharath
 *
 */
public class Fan {

	private static int STOPPED=0;
	private static int SLOW=1;
	private static int MEDIUM=2;
	private static int FAST=3;
	
	private int Fan_Speed=STOPPED;
	private boolean isFanOn;
	private Integer Fan_Radius=6;
	private String Fan_Color;
	
	public Fan() {
		
	}
	
	public Fan(int Fan_Speed, boolean isFanOn, double Fan_Radius, String Fan_Color) {
		
		this.Fan_Speed = Fan_Speed;
		this.isFanOn = isFanOn;
		this.Fan_Radius = Fan_Radius;
		this.Fan_Color = Fan_Color;
	}



	/**
	 * @return Fan_Speed
	 */
	public int getfanSpeed() {
		return Fan_Speed;
	}



	/**
	 * @set param fanSpeed
	 */
	public void setFanSpeed(int Fan_Speed) {
		this.Fan_Speed = Fan_Speed;
	}



	/**
	 * @return isFanOn
	 */
	public boolean isFanOn() {
		return isFanOn;
	}



	/**
	 * @set param isFanOn
	 */
	public void setFanOn(boolean isFanOn) {
		this.isFanOn = isFanOn;
	}



	/**
	 * @return Fan_Radius
	 */
	public double getFanRadius() {
		return Fan_Radius;
	}



	/**
	 * @set param Fan_Radius
	 */
	public void setFanRadius(double Fan_Radius) {
		this.Fan_Radius = Fan_Radius;
	}



	/**
	 * @return fanColor
	 */
	public String getFanColor() {
		return Fan_Color;
	}



	/**
	 * @set param fanColor
	 */
	public void setFanColor(String Fan_Color) {
		this.Fan_Color = Fan_Color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(isFanOn) {
			return "The Fan speed is set to " +Fan_Speed +" with a color of "+ Fan_Color +" and radius is of "  + Fan_Radius;
		}else {
			return "The Fan is white with a radius of " + Fan_Radius + " and the fan is off";
		}
		
	}

	
	
	
}

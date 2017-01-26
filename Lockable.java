/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * 1/3/17
 * Code that serves as an interface for Coin.java
 */
public interface Lockable {
	
	public void setKey (int key);
	public void lock (int key);
	public void unlock (int key);
	public boolean locked ();
		
	
	
	
}//end Lockable

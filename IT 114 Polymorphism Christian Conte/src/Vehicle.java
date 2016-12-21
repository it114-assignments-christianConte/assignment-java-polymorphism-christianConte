/**
 * 
 */

/**
 * @author Christian
 *
 */
public interface Vehicle 
{

	public Integer numberOfWheels();
	public Vehicle_Type getType();
	public ProducerDetail getProducer();
	public Boolean canFly();
	public Boolean canSwim();
	public Integer numberOfPassengers();
	
}

package easymodbus.exceptions;

/**
*
* @author Stefan Ro�mann
*/
@SuppressWarnings("serial")
public class StartingAddressInvalidException extends ModbusException
{
 public StartingAddressInvalidException()
 {
 }

 public StartingAddressInvalidException( String s )
 {
   super( s );
 }
}



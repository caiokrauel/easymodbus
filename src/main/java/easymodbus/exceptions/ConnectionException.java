package easymodbus.exceptions;

/**
*
* @author Stefan Ro�mann
*/
@SuppressWarnings("serial")
public class ConnectionException extends ModbusException
{
 public ConnectionException()
 {
 }

 public ConnectionException( String s )
 {
   super( s );
 }
}



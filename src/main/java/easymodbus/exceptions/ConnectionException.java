package easymodbus.exceptions;

/**
*
* @author Stefan Roﬂmann
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



package easymodbus.exceptions;

/**
*
* @author Stefan Roﬂmann
*/
@SuppressWarnings("serial")
public class CRCCheckFailedException extends ModbusException
{
 public CRCCheckFailedException()
 {
 }

 public CRCCheckFailedException( String s )
 {
   super( s );
 }
}



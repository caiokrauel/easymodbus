package easymodbus.exceptions;

/**
*
* @author Stefan Ro�mann
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



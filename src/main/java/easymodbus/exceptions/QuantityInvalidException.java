package easymodbus.exceptions;

/**
*
* @author Stefan Ro�mann
*/
@SuppressWarnings("serial")
public class QuantityInvalidException extends ModbusException
{
 public QuantityInvalidException()
 {
 }

 public QuantityInvalidException( String s )
 {
   super( s );
 }
}

package easymodbus.exceptions;

/**
*
* @author Stefan Roﬂmann
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

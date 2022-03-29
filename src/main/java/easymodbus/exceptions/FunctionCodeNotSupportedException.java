package easymodbus.exceptions;

/**
*
* @author Stefan Roﬂmann
*/
@SuppressWarnings("serial")
public class FunctionCodeNotSupportedException extends ModbusException
{
 public FunctionCodeNotSupportedException()
 {
 }

 public FunctionCodeNotSupportedException( String s )
 {
   super( s );
 }
}



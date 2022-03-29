package easymodbus.exceptions;

/**
*
* @author Stefan Roﬂmann
*/
@SuppressWarnings("serial")
public class SerialPortException extends ModbusException
{
 public SerialPortException()
 {
 }

 public SerialPortException( String s )
 {
   super( s );
 }
}



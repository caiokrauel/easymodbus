package easymodbus.exceptions;

/**
*
* @author Stefan Ro�mann
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



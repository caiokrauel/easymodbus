package easymodbus.exceptions;

/**
*
* @author Stefan Rossmann
*/
@SuppressWarnings("serial")
public class ModbusException extends Exception
{
 public ModbusException()
 {
 }

 public ModbusException( String s )
 {
   super( s );
 }
}



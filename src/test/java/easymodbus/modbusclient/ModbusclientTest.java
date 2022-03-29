package easymodbus.modbusclient;

public class ModbusclientTest {

	public void ModbusClient() {
		try {
			//
			// I am using the ModRSsim2.exe program to simulate communication
			//
			
			ModbusClient modbusClient = new ModbusClient();
			modbusClient.Connect("127.0.0.1", 502);

			// write the values ​​to the address 0
			int[] values1 = { 1, 2, 3, 4, 5 };
			modbusClient.WriteMultipleRegisters(0, values1);

			// write the values ​​to the address 10
			int[] values2 = { 50, 180, 210 };
			modbusClient.WriteMultipleRegisters(10, values2);

			modbusClient.Disconnect();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

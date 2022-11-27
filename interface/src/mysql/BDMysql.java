package mysql;

import bd_interface.InterfaceBD;

public class BDMysql implements InterfaceBD {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting in MySQL Server");
    }

    @Override
    public void execute(String command) {
        System.out.println("ms-access> " + command);
    }
}

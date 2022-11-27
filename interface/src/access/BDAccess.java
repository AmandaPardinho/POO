package access;

import bd_interface.InterfaceBD;

public class BDAccess implements InterfaceBD {
    @Override
    public void connect() {
        System.out.println("Connecting to Access database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting in Access Database");
    }

    @Override
    public void execute(String command) {
        System.out.println("ms-access> " + command);
    }
}

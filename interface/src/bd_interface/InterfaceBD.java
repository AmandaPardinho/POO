package bd_interface;

public interface InterfaceBD {
    //Interface: classe abstrata que contém métodos abstratos
    public void connect();
    public void disconnect();
    public void execute(String command);
}

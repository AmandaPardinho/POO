package user_interface;

import access.BDAccess;
import bd_interface.InterfaceBD;
import mysql.BDMysql;

public class MySystem {
    public static void main(String[] args) {
        InterfaceBD ibd;
        //ibd = new BDAccess();
        ibd = new BDMysql();

        ibd.connect();
        ibd.disconnect();
        ibd.execute("SELECT * FROM tb_clients");

    }
}
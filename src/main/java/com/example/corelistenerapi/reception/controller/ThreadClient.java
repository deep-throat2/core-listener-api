package com.example.corelistenerapi.reception.controller;

import com.example.corelistenerapi.reception.model.DataLink;
import org.json.JSONObject;

public class ThreadClient extends Thread{
    private int port = 7777; // значение ( от 1025 до 65535 )
    private String address = "127.0.0.1";

    private JSONObject obj;

    private Client client;

    public ThreadClient( Client client, int port ){
        this.client = client;
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                System.out.println("Client port: " + port);
                java.net.InetAddress ip_address = java.net.InetAddress.getByName(address);
                java.net.Socket socket_rcp = new java.net.Socket(ip_address, port);

                client.status_connected_client = true;

                // запуск потока приема пакетов из сокета
                while (true) {
                    Thread.sleep(10000);
                    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(socket_rcp.getInputStream());
                    System.out.println("Начало чтения данных из сокета");
                    obj = new JSONObject(ois.readObject().toString());
                    client.queue.add(obj);
                    System.out.println("Завершение чтения данных из сокета");

                    System.out.println("Данные от центра " + obj.get("addr_akc") + " успешно приняты!");
                    System.out.println(obj);

                    try {
                        System.out.println(((DataLink) obj.get("kpd_01")).toString());

                        System.out.println("000000000");

                    } catch (Exception e ) {

                    }

                }

            } catch (Exception e) {
                System.out.println("Ошибка!");
                System.out.println(e);
            }
        }
    }
}

// {"percent_load":0,"mean_current_capacity":0,"addr_akc":"3300","kpd_02":"simulation_network_v1_15_11_2022.ParamKpd@3f7c70d9","kpd_24":"simulation_network_v1_15_11_2022.ParamKpd@23fc2b50","kpd_01":"simulation_network_v1_15_11_2022.ParamKpd@474effb4","memory_size":0,"kpd_44":"simulation_network_v1_15_11_2022.ParamKpd@720b05d2"}
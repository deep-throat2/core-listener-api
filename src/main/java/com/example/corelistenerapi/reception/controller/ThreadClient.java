package com.example.corelistenerapi.reception.controller;

import lombok.SneakyThrows;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadClient extends Thread {
    private int port = 7777; // значение ( от 1025 до 65535 )
    private String address = "127.0.0.1";

    private Client client;

    public ThreadClient(Client client, int port) {
        this.client = client;
        this.port = port;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {

            Thread.sleep(2000);
            System.out.println("Client port: " + port);
            java.net.InetAddress ip_address = java.net.InetAddress.getByName(address);
            java.net.Socket socket_rcp = new java.net.Socket(ip_address, port);

            client.status_connected_client = true;

            // запуск потока приема пакетов из сокета
            while (true) {
                Thread.sleep(1000);
                java.io.ObjectInputStream ois = new java.io.ObjectInputStream(socket_rcp.getInputStream());
                System.out.println("Начало чтения данных из сокета");

                JSONObject obj = new JSONObject(ois.readObject().toString());
                client.queue.add(obj);
                System.out.println("Завершение чтения данных из сокета");

                System.out.println("Данные от центра " + obj.get("addr_akc") + " успешно приняты!");
                System.out.println(obj);

                JSONObject us = (JSONObject) obj.get("US");
                //List<String> list_addr = new ArrayList();
                //list_addr.add(obj.get("addr_akc").toString());


                List<String> l_kpd = new ArrayList();

                JSONArray obj_kpd = (JSONArray) obj.get("KPDs");

                for (int j = 0; j < obj_kpd.length(); ++j) {
                    obj = (JSONObject) obj_kpd.get(j);
                    l_kpd.add(obj.get("num_kpd").toString());
                }

                Map<String, List<String>> list_kpd = new HashMap<>();

                list_kpd.put(obj.get("addr_akc").toString(), l_kpd);


                System.out.println(list_kpd);

            }


        }
    }
}
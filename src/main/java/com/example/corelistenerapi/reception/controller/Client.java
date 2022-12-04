package com.example.corelistenerapi.reception.controller;

import org.json.JSONObject;

import javax.annotation.PostConstruct;
import java.util.Vector;

public class Client {

    public int value = 0;

    public boolean status_sender;
    public boolean status_reception;
    public boolean status_connected_client;

    private static Thread thread_client;
    protected Vector<JSONObject> queue; // ОЧЕРЕДЬ ДЛЯ ЗАПИСИ ПОСТУПИВШИХ ИНФОРМАЦИОННЫХ БЛОКОВ С УЗЛОВ СЕТИ

    private int port = 7777;

    public Client(int port, Vector<JSONObject> queue) {
        this.port = port;
        this.queue = queue;
        status_sender = false;
        status_connected_client = false;
    }

    public void startClient() {
        thread_client = new ThreadClient(this, port);
        thread_client.start();
    }

    public static void stopClient() {
        thread_client.stop();
    }

    public boolean getStatusConnectedClient() {
        return status_connected_client;
    }

    public void sendPackage() {
        if (status_connected_client) {
            status_sender = true;
        } else {
            System.out.println("Сервер еще не подключен! Ожидание подключения...");
        }
    }
}

package com.semana02.ejercicio05;

import java.net.Socket;

public class ClienteZipPais {
    public static void main(String[] args) {
        new ClienteZipPais();
    }

    private final int PORT = 13;
    private final String HOST = "localhost";


    public ClienteZipPais(){
        //PASO 1 Generar los archivos
        System.out.println("1 Generando archivos JSON, XML y ZIP");
        GenerateZipPais generateZipPais = new GenerateZipPais();
        generateZipPais.procesar();
        

        //PASO 2 Crear el Socket CLiente
        try {
            System.out.println("2 Client started");
            Socket socket = new Socket(HOST, PORT);
            System.out.println("3 Connected to server");

            //PASO 3 Enviar el archivo ZIP            

            System.out.println("4 Client finished");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

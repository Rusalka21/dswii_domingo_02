package com.semana02.propuesto;

import java.net.Socket;

public class ClienteZipCatalogo {
    public static void main(String[] args) {
        new ClienteZipCatalogo();
    }

    private final int PORT = 13;
    private final String HOST = "localhost";

    public ClienteZipCatalogo(){
        //PASO 1 Generar los archivos
        System.out.println("1 Generando archivos JSON, XML y ZIP");
        GenerateZipCatalogo generateZipCatalogo = new GenerateZipCatalogo();
        generateZipCatalogo.procesar();
        
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

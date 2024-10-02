package org.example;

import org.example.MODELOS.Beneficiario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("Bievenido a su Aseguradora");
        System.out.println("************************************");

        Beneficiario beneficiario = new Beneficiario();


        System.out.print("DIGITE SU ID:");
        beneficiario.setId(lea.nextLong());

        System.out.print("DIGITE SU NOMBRE:");
        beneficiario.setNombre(lea.nextLine());

        System.out.print("DIGITE SU EDAD:");
        beneficiario.setEdad(lea.nextLine());

        System.out.println("DIGITE SU TELEFONO:");
        beneficiario.setTelefono(lea.nextLine());

        System.out.println("DIGITE FECHA DE NACIMIENTO:");
        beneficiario.setFechaNacimiento(lea.nextLine());

        System.out.println("DIGITE CON CUANTAS PERSONAS VIVE:");
        beneficiario.setCuantasPersonasVive(lea.nextInt());

        System.out.println("DIGITE SU CORREO:");
        beneficiario.setCorreo(lea.nextLine());

        System.out.println("DIGITE SU CIUDAD:");
        beneficiario.setCiudad(lea.nextLine());

        System.out.println("DIGITE NOMBRE DE BARRIO:");
        beneficiario.setBarrio(lea.nextLine());

        System.out.println("DIGITE DIRECCION DOMICILIO:");
        beneficiario.setDireccion(lea.nextLine());




    }
}
package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        try {
            throw new Exception("Excepción controlada en main");
        } catch (Exception e) {
            System.out.println("Se ha capturado una excepción: " + e.getMessage());
        }

    }
}

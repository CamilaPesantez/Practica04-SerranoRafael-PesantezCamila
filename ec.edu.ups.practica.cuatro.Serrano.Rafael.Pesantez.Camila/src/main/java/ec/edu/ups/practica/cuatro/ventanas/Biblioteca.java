package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Biblioteca {
	public static void main(String[] args) {
        Frame biblioteca = new Frame();
        Label bienvenida = new Label("Bienvenido a nuestra biblioteca. Estamos gustosos de atenderte.");
        Label instruccion = new Label("Por favor selecciona la opción que deseas realizar.");
        Button botonA = new Button("Añadir Usuario");
        Button botonB = new Button("Añadir Libro");
        Button botonC = new Button("Buscar Libro");
        Button botonD = new Button("Prestar Libro");
        Button botonE = new Button("Devolver Libro");
        Button botonF = new Button("Salir");
        Panel entradaDatosBiblioteca = new Panel(new BorderLayout());

        Panel panelBienvenida = new Panel(new GridLayout(2, 1));
        panelBienvenida.add(bienvenida);
        panelBienvenida.add(instruccion);
        entradaDatosBiblioteca.add(panelBienvenida, BorderLayout.NORTH);

        Panel botonesBiblioteca = new Panel(new GridLayout(6,1));
        botonesBiblioteca.add(botonA);
        botonesBiblioteca.add(botonB);
        botonesBiblioteca.add(botonC);
        botonesBiblioteca.add(botonD);
        botonesBiblioteca.add(botonE);
        botonesBiblioteca.add(botonF);
        entradaDatosBiblioteca.add(botonesBiblioteca, BorderLayout.CENTER);

        biblioteca.add(entradaDatosBiblioteca);
        biblioteca.setSize(600, 400);
        biblioteca.setTitle("Biblioteca");
        biblioteca.setVisible(true);
          
        }
 }
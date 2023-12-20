package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class BuscarLibro {
	public static void main(String[] args) {
		Frame biblioteca = new Frame();
		Label titulo = new Label("BuscarLibro ");
		Button botonA = new Button("Buscar libro por titulo");
		Button botonB = new Button("Buscar libro por año");
		Button botonC = new Button("Buscar libro por autor");
		Panel entradaDatosLibro = new Panel(new BorderLayout());
		
		Panel tituloLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloLibro.add(titulo);		
		entradaDatosLibro.add(tituloLibro, BorderLayout.NORTH);

		Panel botonesLibro = new Panel(new FlowLayout());
		botonesLibro.add(botonA);
		botonesLibro.add(botonB);
		botonesLibro.add(botonC);
		entradaDatosLibro.add(botonesLibro, BorderLayout.CENTER);
		
		
		biblioteca.add(entradaDatosLibro);
		biblioteca.setSize(600,150);
		biblioteca.setTitle("Biblioteca");
		biblioteca.setVisible(true);
		}

}

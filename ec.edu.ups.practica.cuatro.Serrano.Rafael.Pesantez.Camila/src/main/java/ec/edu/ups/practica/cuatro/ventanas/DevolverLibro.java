package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class DevolverLibro {
	public static void main(String[] args) {
		Label titulo = new Label("Devolver Libro");
		Label titulo1 = new Label("Introduzca el titulo del libro a devolver:  ");
		Label titulo2 = new Label("Introduzca el codigo del usuario que devuelve: ");
		Frame libro = new Frame();
		Panel devolverLibro = new Panel(new BorderLayout());
		
		Panel tituloLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloLibro.add(titulo);
		devolverLibro.add(tituloLibro,BorderLayout.NORTH);
		
		Panel panelTitulo = new Panel(new FlowLayout());
		panelTitulo.add(titulo1);
		panelTitulo.add(new TextField(15));
		devolverLibro.add(panelTitulo, BorderLayout.CENTER);
		
		Panel panelUsuario= new Panel(new FlowLayout());
		panelUsuario.add(titulo2);
		panelUsuario.add(new TextField(15));
		devolverLibro.add(panelUsuario, BorderLayout.SOUTH);
		
	
		
		libro.add(devolverLibro);
		
		libro.setSize(600,150);
		libro.setTitle("Biblioteca");
		libro.setVisible(true);
		}

}

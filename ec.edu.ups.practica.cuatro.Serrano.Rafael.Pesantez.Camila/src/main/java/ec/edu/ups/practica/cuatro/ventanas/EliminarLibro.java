package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class EliminarLibro {
	public static void main(String[] args) {
		Label titulo = new Label("Eliminar Libro");
		Label titulo1 = new Label("Ingrese el titulo del libro a eliminar: ");
		Frame libro = new Frame();
		Panel eliminarLibro = new Panel(new BorderLayout());
		
		Panel tituloLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloLibro.add(titulo);
		eliminarLibro.add(tituloLibro,BorderLayout.NORTH);
		
		Panel panelAutor= new Panel(new FlowLayout());
		panelAutor.add(titulo1);
		panelAutor.add(new TextField(15));
		eliminarLibro.add(panelAutor, BorderLayout.CENTER);
		
		
		libro.add(eliminarLibro);
		
		libro.setSize(600,150);
		libro.setTitle("Biblioteca");
		libro.setVisible(true);
		}

}

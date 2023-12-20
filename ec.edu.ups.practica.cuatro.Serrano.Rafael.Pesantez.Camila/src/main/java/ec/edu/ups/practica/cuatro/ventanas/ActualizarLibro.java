package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class ActualizarLibro {
	public static void main(String[] args) {
		Label titulo = new Label("Actualizar Libro");
		Label titulo1 = new Label("Titulo: ");
		Label titulo2 = new Label("Autor:");
		Label titulo3 = new Label("Año:");
		Frame libro = new Frame();
		Panel actualizarLibro = new Panel(new BorderLayout());
		
		Panel tituloLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloLibro.add(titulo);
		actualizarLibro.add(tituloLibro,BorderLayout.NORTH);
		
		Panel panelTitulo = new Panel(new FlowLayout());
		panelTitulo.add(titulo1);
		panelTitulo.add(new TextField(15));
		actualizarLibro.add(panelTitulo, BorderLayout.WEST);
		
		Panel panelAutor= new Panel(new FlowLayout());
		panelAutor.add(titulo2);
		panelAutor.add(new TextField(15));
		actualizarLibro.add(panelAutor, BorderLayout.CENTER);
		
		Panel panelAño= new Panel(new FlowLayout());
		panelAño.add(titulo3);
		panelAño.add(new TextField(15));
		actualizarLibro.add(panelAño, BorderLayout.EAST);
		
		libro.add(actualizarLibro);
		
		libro.setSize(600,150);
		libro.setTitle("Biblioteca");
		libro.setVisible(true);
		}

}

package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BuscarLibroAutor {
	public static void main(String[] args) {
		Label titulo = new Label("Buscar libro autor");
		Label titulo1 = new Label("Introduzca el autor del libro a buscar: ");
		Frame libroBuscar = new Frame();
		Panel buscarLibroAutor = new Panel(new BorderLayout());
		
		Panel tituloLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloLibro.add(titulo);
		buscarLibroAutor.add(tituloLibro,BorderLayout.NORTH);
		
		Panel panelBuscar= new Panel(new FlowLayout());
		panelBuscar.add(titulo1);
		panelBuscar.add(new TextField(15));
		buscarLibroAutor.add(panelBuscar, BorderLayout.CENTER);
		
		
		libroBuscar.add(buscarLibroAutor);
		libroBuscar.setSize(600,150);
		libroBuscar.setTitle("Biblioteca");
		libroBuscar.setVisible(true);
		}


}

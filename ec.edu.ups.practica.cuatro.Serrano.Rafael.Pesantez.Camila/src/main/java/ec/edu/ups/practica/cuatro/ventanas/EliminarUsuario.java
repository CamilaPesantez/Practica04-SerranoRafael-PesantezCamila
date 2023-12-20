package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class EliminarUsuario {
	public static void main(String[] args) {
		Label titulo = new Label("Eliminar usuario");
		Label titulo1 = new Label("Ingrese el codigo del usuario a eliminar: ");
		Frame libro = new Frame();
		Panel eliminarUsuario = new Panel(new BorderLayout());
		
		Panel tituloUsuario = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloUsuario.add(titulo);
		eliminarUsuario.add(tituloUsuario,BorderLayout.NORTH);
		
		Panel panelUsuario= new Panel(new FlowLayout());
		panelUsuario.add(titulo1);
		panelUsuario.add(new TextField(15));
		eliminarUsuario.add(panelUsuario, BorderLayout.CENTER);
		
		
		libro.add(eliminarUsuario);
		
		libro.setSize(600,150);
		libro.setTitle("Biblioteca");
		libro.setVisible(true);
		}


}

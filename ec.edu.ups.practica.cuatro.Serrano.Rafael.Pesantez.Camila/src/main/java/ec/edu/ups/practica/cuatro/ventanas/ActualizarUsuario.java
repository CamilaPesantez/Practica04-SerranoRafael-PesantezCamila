package ec.edu.ups.practica.cuatro.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class ActualizarUsuario {
	public static void main(String[] args) {
		Label titulo = new Label("Actualizar Usuario");
		Label titulo1 = new Label("Nombre: ");
		Label titulo2 = new Label("Apellido:");
		Label titulo3 = new Label("Codigo:");
		Label titulo4 = new Label("Correo:");
		Frame usuario = new Frame();
		Panel actualizarUsuario = new Panel(new BorderLayout());
		
		Panel tituloUsuario = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloUsuario.add(titulo);
		actualizarUsuario.add(tituloUsuario,BorderLayout.NORTH);
		
		Panel nombre = new Panel(new FlowLayout());
		nombre.add(titulo1);
		nombre.add(new TextField(15));
		actualizarUsuario.add(nombre, BorderLayout.WEST);
		
		Panel apellido = new Panel(new FlowLayout());
		apellido.add(titulo2);
		apellido.add(new TextField(15));
		actualizarUsuario.add(apellido, BorderLayout.CENTER);
		
		Panel codigo = new Panel(new FlowLayout());
		codigo.add(titulo3);
		codigo.add(new TextField(15));
		actualizarUsuario.add(codigo, BorderLayout.EAST);
		
		Panel correo = new Panel(new FlowLayout());
		correo.add(titulo4);
		correo.add(new TextField(15));
		actualizarUsuario.add(correo, BorderLayout.SOUTH);
		usuario.add(actualizarUsuario);
		
		usuario.setSize(700,150);
		usuario.setTitle("Biblioteca");
		usuario.setVisible(true);
		}


}

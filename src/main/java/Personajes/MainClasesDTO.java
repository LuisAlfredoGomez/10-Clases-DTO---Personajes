package Personajes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClasesDTO {
    private static final String[] personajes = {
            "Escoga",
            "Donkey Kong",
            "Kirby",
            "Kratos",
            "Link",
            "Mario Bros",
            "Princess Ale Peach",
            "Snake",
            "Sonic",
            "Wesker",
            "Zelda"
    };

    public static void main(String[] args) {
        // Crear una ventana
        JFrame frame = new JFrame("Selección de Personaje");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Crear elementos de la interfaz
        JLabel label = new JLabel("Seleccione un personaje:");
        JComboBox<String> comboBox = new JComboBox<>(personajes);
        JButton button = new JButton("Mostrar");

        // Configurar el diseño de la ventana
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(comboBox);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);

        // Agregar acción al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                String personaje = seleccion.replaceAll("DTO", "");
                JOptionPane.showMessageDialog(frame, "Usted escogió el personaje: " + personaje);

                if (personaje.equals("Princess Ale Peach")) {
                    PrincessAlePeachDTO princess = new PrincessAlePeachDTO("Princesa Ale Peach, aún no tiene su Koopa", 18, "Programadora y Vendedora de Medicamentos, Excelente amiga", "Vestido Los mejores", true, true);
                    String mensaje = "Nombre: " + princess.getNombre() + "\n"
                            + "Vida: " + princess.getVida() + "\n"
                            + "Habilidad: " + princess.getHabilidad() + "\n"
                            + "Vestido: " + princess.getVestido() + "\n"
                            + "Rescatada: " + princess.isRescatada() + "\n"
                            + "Activa: " + princess.isActiva();
                    JOptionPane.showMessageDialog(frame, mensaje);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

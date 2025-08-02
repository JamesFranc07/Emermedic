// Archivo: src/main/java/com/emermedic/repositorio/PacienteRepository.java

package com.emermedic.repositorio;

import com.emermedic.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {

    // Simulación de una base de datos con una lista estática
    private static List<Paciente> pacientes = new ArrayList<>();

    // Inicializamos algunos datos de ejemplo
    static {
        pacientes.add(new Paciente(1, "Ana", "Gómez", "A+", "1990-05-15", "Penicilina"));
        pacientes.add(new Paciente(2, "Luis", "Martínez", "O-", "1985-11-20", "Ninguna"));
    }

    /**
     * Obtiene todos los pacientes de la "base de datos".
     * @return Una lista de objetos Paciente.
     */
    public List<Paciente> obtenerTodos() {
        return new ArrayList<>(pacientes); // Devolvemos una copia para evitar modificaciones externas
    }

    /**
     * Guarda un nuevo paciente.
     * @param paciente El objeto Paciente a guardar.
     */
    public void guardar(Paciente paciente) {
        // Lógica real de inserción en base de datos...
        // Aquí simulamos la adición a la lista
        pacientes.add(paciente);
    }

    /**
     * Obtiene un paciente por su ID.
     * @param id El ID del paciente.
     * @return El objeto Paciente si se encuentra, o null.
     */
    public Paciente obtenerPorId(int id) {
        // Lógica real de consulta en base de datos...
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Actualiza un paciente existente.
     * @param paciente El objeto Paciente con los datos actualizados.
     */
    public void actualizar(Paciente paciente) {
        // Lógica real de actualización en base de datos...
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId() == paciente.getId()) {
                pacientes.set(i, paciente);
                return;
            }
        }
    }

    /**
     * Elimina un paciente por su ID.
     * @param id El ID del paciente a eliminar.
     */
    public void eliminar(int id) {
        // Lógica real de eliminación en base de datos...
        pacientes.removeIf(p -> p.getId() == id);
    }
}

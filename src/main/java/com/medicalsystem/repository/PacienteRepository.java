public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    boolean existsByEmailAndTelefono(String email, String telefono);
}

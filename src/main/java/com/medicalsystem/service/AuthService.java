@Service
public class AuthService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public boolean authenticate(String email, String telefono) {
        return pacienteRepository.existsByEmailAndTelefono(email, telefono);
    }
}

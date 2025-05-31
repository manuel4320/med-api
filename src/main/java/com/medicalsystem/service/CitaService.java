@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private UsuarioRepository medicoRepository;

    public Cita agendarCita(CitaRequest request) {
        Paciente paciente = pacienteRepository.findById(request.getPacienteId()).orElseThrow();
        Usuario medico = medicoRepository.findById(request.getMedicoId()).orElseThrow();

        Cita cita = new Cita();
        cita.setFecha(request.getFecha());
        cita.setHora(request.getHora());
        cita.setPaciente(paciente);
        cita.setMedico(medico);
        return citaRepository.save(cita);
    }

    public Cita modificarCita(Long id, CitaUpdateRequest request) {
    Cita cita = citaRepository.findById(id).orElseThrow();
    cita.setFecha(request.getNuevaFecha());
    cita.setHora(request.getNuevaHora());
    return citaRepository.save(cita);
    }
}


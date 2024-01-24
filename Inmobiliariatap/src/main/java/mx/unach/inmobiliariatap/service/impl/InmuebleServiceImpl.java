package mx.unach.inmobiliariatap.service.impl; 

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mx.unach.inmobiliariatap.entity.Inmueble;
import mx.unach.inmobiliariatap.repository.InmuebleRepository;
import mx.unach.inmobiliariatap.service.InmuebleService;

@Service("inmuebleServiceImpl")
@Transactional
public class InmuebleServiceImpl implements InmuebleService {

    @Autowired
    @Qualifier("inmuebleRepository")
    private InmuebleRepository inmuebleRepository;

    @Override
    public List<Inmueble> listAllInmuebles() {
        return (List<Inmueble>) inmuebleRepository.findAll();
    }

    @Override 
    public Optional<Inmueble> findByIdInmueble(String id) {
        return inmuebleRepository.findById(id);
    }

    @Override
    public Inmueble updateInmueble(Inmueble inmueble) {
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public int deleteInmueble(String id) {
        return inmuebleRepository.deleteByIdcliente(id);
    }

    @Override
    public Inmueble addInmueble(Inmueble inmueble) {
        Inmueble nuevo = new Inmueble(inmueble.getIdcliente(),
                                      inmueble.getMunicipio(),
                                      inmueble.getColonia(),
                                      inmueble.getCodigopostal(),
                                      inmueble.getPrecio(),
                                      inmueble.getImagen());

        return inmuebleRepository.save(nuevo);
    }


}

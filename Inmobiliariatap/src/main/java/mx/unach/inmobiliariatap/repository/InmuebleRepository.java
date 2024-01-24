package mx.unach.inmobiliariatap.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import mx.unach.inmobiliariatap.entity.Inmueble;

@Repository("inmuebleRepository")
public interface InmuebleRepository extends CrudRepository<Inmueble, String>{

    int deleteByIdcliente(String id);

}

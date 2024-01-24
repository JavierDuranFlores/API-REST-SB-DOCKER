package mx.unach.inmobiliariatap.service;

import java.util.List;
import java.util.Optional;

import mx.unach.inmobiliariatap.entity.Inmueble;

public interface InmuebleService {

    public abstract List<Inmueble> listAllInmuebles();
	
	public abstract Optional<Inmueble> findByIdInmueble(String id);
	
	public abstract Inmueble updateInmueble(Inmueble inmueble);
		
	public abstract int deleteInmueble(String id);
	
	public abstract Inmueble addInmueble(Inmueble inmueble);

}

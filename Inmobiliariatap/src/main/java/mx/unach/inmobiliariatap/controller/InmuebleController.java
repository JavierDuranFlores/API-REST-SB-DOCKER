package mx.unach.inmobiliariatap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.unach.inmobiliariatap.entity.Inmueble;
import mx.unach.inmobiliariatap.service.impl.InmuebleServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class InmuebleController {

    @Autowired
	@Qualifier("inmuebleServiceImpl")
    private InmuebleServiceImpl inmuebleServiceImpl;

    @GetMapping(path="/inmuebles", produces={"application/json"})
	public List<Inmueble> getInmuebles() {
		return inmuebleServiceImpl.listAllInmuebles();
	}

	@GetMapping(path="/inmuebles/{id}", produces={"application/json"})
	public Optional<Inmueble> getInmueble(@PathVariable String id) {
		return inmuebleServiceImpl.findByIdInmueble(id);
	}

	@PutMapping(path="/inmuebles/{id}", produces={"application/json"})
	public Inmueble updateInmueble(@RequestBody Inmueble inmueble, @PathVariable String id) {
		Optional<Inmueble> actualizar = inmuebleServiceImpl.findByIdInmueble(id);
		
		actualizar.get().setMunicipio(inmueble.getMunicipio());
		actualizar.get().setColonia(inmueble.getColonia());
		actualizar.get().setCodigopostal(inmueble.getCodigopostal());
		actualizar.get().setPrecio(inmueble.getPrecio());
		actualizar.get().setImagen(inmueble.getImagen());
		
		return inmuebleServiceImpl.updateInmueble(actualizar.get());
	}

	@DeleteMapping(path="/inmuebles/{id}", produces={"application/json"})
	public int deteleInmueble(@PathVariable String id) {
		return inmuebleServiceImpl.deleteInmueble(id);
	}

	@PostMapping(path="/inmuebles", produces={"application/json"})
	public Inmueble createInmueble(@RequestBody Inmueble inmueble) {
		return inmuebleServiceImpl.addInmueble(inmueble);
	}

}


package br.com.caelum.carangobom.repository;

import br.com.caelum.carangobom.model.entity.Marca;
import br.com.caelum.carangobom.service.ExistentMarcaService;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MarcaRepository extends CrudRepository<Marca, Long>, ExistentMarcaService {
    List<Marca> findAllByOrderByNome();
}

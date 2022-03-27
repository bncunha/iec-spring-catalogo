package pro.gsilva.catalogo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pro.gsilva.catalogo.model.Categoria;
import pro.gsilva.catalogo.model.Musica;

public interface CategoriaService {
    Page<Categoria> findAll(Pageable pageable);
    Categoria save(Categoria categoria);
}

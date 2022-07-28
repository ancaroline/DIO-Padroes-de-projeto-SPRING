package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Injetar os componentes do Spring com @Autowired
    //TODO Strategy: Implementar os métodos definidos na interface
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }
    
}

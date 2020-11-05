package com.spring.autowired;

import beanqualification.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ClienteServico {

    @Autowired
    @Qualifier("importante")
    private Notificador importante;

    @Autowired
    @Qualifier("urgente")
    private Notificador urgente;

    @Autowired
    private ClienteRepositorio repositorio;

    @Autowired
    public ClienteServico(ClienteRepositorio repositorio) {
        this.repositorio = repositorio;

    }

}

/**
 * Injeção de dependências
 * É um inversão de controle. Processo de prover instâncias de classe que um objeto precisa pra funcionar.
 * Nós terceirizamos o processo de instanciar ao Spring.
 * A ideia é programar voltado a interfaces e manter baixo acomplamento(baixa correlação ou conexão)
 * entre as classes.
 * <p>
 * Pontos de Injeção:
 * Propriedades, construtores e Métodos
 * <p>
 * Para que uma classe possa ser injetada ela precisa se tornar um bean Spring.
 * Deve-se anotar a instância com algumas das anotações abaixo:
 *
 * @Repositary, @Service ou @Controller.
 * <p>
 * "Um bean é um objeto que é criado, gerenciado e destruído pelo container do spring,
 * o framework é totalmente responsável por este objeto, criando, injetando suas propriedades
 * (Injeção de dependência). Podemos injetar este objeto no container (aplicação spring)
 * através de declarações no xml ou através de anotação, desta forma utilizamos o padrão de inversão
 * de controle (IoC - Inversion of Control)".
 * <p>
 * Se houver duas implementações da mesma intereface é só qualificar os beans atraveś da anotação:
 * @Qualifier.
 */


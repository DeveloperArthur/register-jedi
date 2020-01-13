package br.com.globallabs.springwebmvc.repository;

import br.com.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedis;

    public JediRepository() {
        this.jedis = new ArrayList<>();
    }

    public List<Jedi> getAllJedi() {
        return jedis;
    }

    public void add(final Jedi jedi) {
        this.jedis.add(jedi);
    }
}

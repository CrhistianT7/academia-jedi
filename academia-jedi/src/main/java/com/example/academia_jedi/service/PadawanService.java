package com.example.academia_jedi.service;

import com.example.academia_jedi.entity.Padawan;
import com.example.academia_jedi.repository.PadawanRepository;
import com.example.academia_jedi.repository.RepositoryFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadawanService {
    private final PadawanRepository repo = RepositoryFactory.getPadawanRepository();

    public List<Padawan> getAll() {
        return repo.findAll().stream().toList();
    }
}

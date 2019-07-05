package com.mirannaalina.aplicatie.aplicatiedemo.repository;

import com.mirannaalina.aplicatie.aplicatiedemo.model.Utilizator;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UtilizatorRepository extends CrudRepository<Utilizator, Integer> {

}

package com.example.form.repository;

import com.example.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Pattern;
import java.util.Collection;
import java.util.List;

public interface FormRepository extends JpaRepository<Form, String> {
    List<Form> findAllByFirstNameContainingOrPhonesContaining(String firstname, String phones);

    void deleteAllByIdIn(Collection<@Pattern(regexp = "SV-[0-9]{3}") String> id);
}

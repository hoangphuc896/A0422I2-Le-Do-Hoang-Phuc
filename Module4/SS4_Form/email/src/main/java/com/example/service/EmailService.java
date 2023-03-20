package com.example.service;

import com.example.model.Email;
import org.springframework.stereotype.Service;


@Service
public class EmailService implements IEmailServiceIpml{
    private Email emails = new Email("English",10,false,"hoang phuc");

    @Override
    public Email findAll() {
        return emails;
    }

    @Override
    public Email update(Email email) {
    emails.setLanguages(email.getLanguages());
    emails.setPageSize(email.getPageSize());
    emails.setSpams(email.getSpams());
    emails.setSingnature(email.getSingnature());
    return emails;
    }
}

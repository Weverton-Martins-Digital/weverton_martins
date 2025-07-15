package com.devlop.banco.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity // Indica que esta classe é uma entidade JPA
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome de usuário para login
    @Setter
    @Getter
    @Column(nullable = false, unique = true)
    private String username;

    // Senha do usuário
    @Setter
    @Getter
    @Column(nullable = false)
    private String password;

    // Endereço de email do usuário
    @Setter
    @Getter
    @Column(nullable = false, unique = true)
    private String email;

    // Nome completo do usuário
    @Setter
    @Getter
    @Column(name = "full_name")
    private String fullName;

    // Data e hora de criação do usuário
    @Getter
    @Column(name = "date_create", updatable = false)
    private LocalDateTime dateCreated;

    // Data e hora da última atualização do usuário
    @Setter
    @Getter
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    // Construtor padrão
    public UserModel() {
    }

    // Construtor para facilitar a criação de novos usuários
    public UserModel(String username, String password, String email, String fullName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.dateCreated = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
    }

    // --- Getters e Setters ---
    private Long getId() {
        return id;
    }

    // --- Métodos Adicionais ---
    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}

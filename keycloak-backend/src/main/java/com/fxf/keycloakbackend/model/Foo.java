package com.fxf.keycloakbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foo {

    private int id;
    private String name;

    public Foo(String name) {
        this.name = name;
    }
}

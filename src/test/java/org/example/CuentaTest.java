package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Cuenta cuenta = new Cuenta("Juan", 1000.0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        Cuenta cuenta = null;
    }

    @org.junit.jupiter.api.Test
    void getNombre() {
        Cuenta cuenta = new Cuenta("Juan", 1000.0);
        assertEquals("Juan", cuenta.getNombre());
        assertNotEquals("Pedro", cuenta.getNombre());
    }

    @org.junit.jupiter.api.Test
    void getSaldo() {
        Cuenta cuenta = new Cuenta("Juan", 1000.0);
        assertTrue(cuenta.getSaldo() > 1000.0);
        assertFalse(cuenta.getSaldo() < 1000.0);
    }

    @org.junit.jupiter.api.Test
    void depositar() {
        Cuenta cuenta = new Cuenta("Juan", 1000.0);
        cuenta.depositar(500.0);
        assertEquals(1500.0, cuenta.getSaldo());
    }

    @org.junit.jupiter.api.Test
    void retirar() {
        Cuenta cuenta = null;
        assertNull(cuenta,"La cuenta no debe ser nula");
        cuenta.retirar(200.0);

    }
}
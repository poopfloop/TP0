package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    private  Matrix mat1, mat2, mat3;

    @BeforeEach
    public void setUp(){
        mat1 = new Matrix(3);
        mat2 = new Matrix(3);
        mat3 = new Matrix(2);
        mat3.set(0, 0, 1);
        mat3.set(0, 1, 2);
        mat3.set(1, 0, 3);
        mat3.set(1, 1, 4);

        // Initialisation des valeurs pour les tests
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat1.set(i, j, i * 3 + j);
                mat2.set(i, j, (i * 3 + j) * 2);
            }
            //mat1 = [0 1 2, 3 4 5, 6 7 8]
            //mat2 = [0 2 4, 6 8 10, 12 14 16 ]
        }
    }

    @Test
    void SetAndGet() {
        mat1.set(0,0,5);
        assertEquals(5, mat1.get(0,0));
    }


    @Test
    void addMatNull() {
        assertThrows(NullPointerException.class, ()->mat1.add(null));
    }

    @Test
    void addMatSize() {
        assertThrows( IllegalArgumentException.class, ()->mat1.add(mat3));
    }

    @Test
    void Add2Mat(){
        mat1.add(mat2);
        assertEquals(12, mat1.get(1, 1));
    }

    @Test
    void multiplyNull() {
        assertThrows(NullPointerException.class, ()->mat1.multiply(null));
    }

    @Test
    void multiplySize() {
        assertThrows(IllegalArgumentException.class, ()->mat1.multiply(mat3));
    }

    @Test
    void multiplyMat(){
        mat1.multiply(mat2);
        assertEquals(30, mat1.get(0, 0));

    }
    @Test
    void transpose() {
        mat1.transpose();
        assertEquals(0, mat1.get(0, 0));
        assertEquals(3, mat1.get(0, 1));
        assertEquals(6, mat1.get(0, 2));
        assertEquals(1, mat1.get(1, 0));
        assertEquals(4, mat1.get(1, 1));
        assertEquals(7, mat1.get(1, 2));

    }
    @Test
    void testToString() {
        String expected = "[0, 1, 2]\n[3, 4, 5]\n[6, 7, 8]\n";
        assertEquals(expected, mat1.toString());
    }
}
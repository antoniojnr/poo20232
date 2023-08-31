import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @org.junit.jupiter.api.Test
    void getNome() {
        Estudante e = new Estudante("Antonio", 12345);

        String nome = e.getNome();

        assertEquals("Antonio", nome);
    }

    @org.junit.jupiter.api.Test
    void setNome() {
        Estudante e = new Estudante("Antonio", 12345);

        e.setNome("Maria");

        assertEquals("Maria", e.getNome());
    }

    @org.junit.jupiter.api.Test
    void getMatricula() {
        Estudante e = new Estudante("Antonio", 12345);

        int matricula = e.getMatricula();

        assertEquals(12345, matricula);
    }

    @org.junit.jupiter.api.Test
    void setMatricula() {
        Estudante e = new Estudante("Antonio", 12345);

        e.setMatricula(12346);

        assertEquals(12346, e.getMatricula());
    }
}
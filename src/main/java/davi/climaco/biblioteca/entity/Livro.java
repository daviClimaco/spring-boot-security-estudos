package davi.climaco.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity(name = "Livro")
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeLivro;

    private String autorLivro;
    private Date dataLancamento;
    private Double precoLivro;
    private Usuario usuarioCadastro;

}

package davi.climaco.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity(name = "usuarios")
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeUsu;
    private boolean admin; //sim é admin = tem permissao | nao é admin = nao tem permissao

    private String login;
    private String senha;

}

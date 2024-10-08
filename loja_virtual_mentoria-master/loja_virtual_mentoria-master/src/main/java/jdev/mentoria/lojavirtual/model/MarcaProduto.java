package jdev.mentoria.lojavirtual.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name =  "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id;

    private String nomeDesc;

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setNomeDesc(String nomeDesc){
        this.nomeDesc = nomeDesc;
    }
    public String getNomeDesc(){
        return nomeDesc;
    }
}
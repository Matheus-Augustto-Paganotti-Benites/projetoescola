package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario {
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Tecnico(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String setor) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        this.setor = setor;
    }

    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Imprimir'");
    }
}

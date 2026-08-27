package med.voll.api.paciente;

import med.voll.api.dto.DadosEndereco;

public record DadosCadastroPaciente(String nome , String email, String telefone, String cpf , DadosEndereco endereco) {
}

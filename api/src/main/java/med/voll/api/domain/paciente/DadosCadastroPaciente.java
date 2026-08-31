package med.voll.api.domain.paciente;

import med.voll.api.dto.DadosEndereco;

public record DadosCadastroPaciente(String nome , String email, String telefone, String cpf , DadosEndereco endereco) {
}

package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.medico.Especialidade;

public record DadosEndereco(@NotBlank
                            String logradouro,

                            @NotBlank
                            String bairro,
                            @NotBlank
                            @Pattern(regexp = "\\d{8}")
                            String cep,
                            @NotBlank
                            String cidade,
                            @NotBlank
                            String uf,
                            String complemento,
                            String numero) {
}

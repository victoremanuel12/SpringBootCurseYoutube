package cursoSpringTutorial.Curse.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank(message = "O nome do produto não pode estar em branco") String name,
                               @NotNull BigDecimal value) {

}

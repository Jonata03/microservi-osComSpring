package io.github.jonata03.bookservice.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cambio implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String from ;
    private String to;
    private Double conversionFactor;
    private Double convertedValue;
    private String enviroment;
}

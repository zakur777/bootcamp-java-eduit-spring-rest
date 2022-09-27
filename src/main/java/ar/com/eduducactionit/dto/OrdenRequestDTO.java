package ar.com.eduducactionit.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class OrdenRequestDTO {

    @NotNull
    private Long estadoOrdenId;

    @NotNull
    private Long socioId;

    @NotNull
    private Double montoTotal;
}

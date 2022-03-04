package com.spring.universidad.ubackend.modelo.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.spring.universidad.ubackend.modelo.entidades.Alumno;
import com.spring.universidad.ubackend.modelo.entidades.Direccion;
import com.spring.universidad.ubackend.modelo.entidades.Empleado;
import com.spring.universidad.ubackend.modelo.entidades.Profesor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo"
)
@JsonSubTypes(
        {
                @JsonSubTypes.Type(value = AlumnoDTO.class, name = "alumno"),
                @JsonSubTypes.Type(value = ProfesorDTO.class, name = "profesor"),
                @JsonSubTypes.Type(value = EmpleadoDTO.class, name = "empleado")
        }
)
public abstract class PersonaDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    @Pattern(regexp = "[0-9]+")
    @Size(min =  1, max = 10)
    private String dni;
    private Direccion direccion;



}

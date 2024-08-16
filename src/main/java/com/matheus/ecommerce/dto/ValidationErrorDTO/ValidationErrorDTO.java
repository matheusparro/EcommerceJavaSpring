package com.matheus.ecommerce.dto.ValidationErrorDTO;

import com.matheus.ecommerce.dto.CustomErrorDTO;
import com.matheus.ecommerce.dto.FiledMessageDTO.FieldMessageDTO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO {

    private List<FieldMessageDTO> errors = new ArrayList<>();


    public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageDTO> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessageDTO(fieldName, message));
    }
}

package cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private Date timestamp;
    private String message;
    private String description;
}

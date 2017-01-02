package cn.zmlio.tinycms2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zml on 2017/1/2.
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class GenericException extends RuntimeException {

    public GenericException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericException(String message) {
        super(message);
    }
}

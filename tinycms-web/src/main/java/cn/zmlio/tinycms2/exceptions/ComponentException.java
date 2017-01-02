package cn.zmlio.tinycms2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zml on 2017/1/2.
 */
@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE)
public class ComponentException extends GenericException {
    public ComponentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComponentException(String message) {
        super(message);
    }
}

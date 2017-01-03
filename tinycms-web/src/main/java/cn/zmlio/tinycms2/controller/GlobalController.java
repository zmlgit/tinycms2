package cn.zmlio.tinycms2.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zml on 2017/1/2.
 */
@Controller
public class GlobalController implements ErrorController{
    private static final String PAGE_NOT_FOUND="/errors/404";
    private static final String ERROR_PATH = "/error";

    @RequestMapping(value ={"/","","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping(value = ERROR_PATH)
    public String error(){
        return PAGE_NOT_FOUND;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}

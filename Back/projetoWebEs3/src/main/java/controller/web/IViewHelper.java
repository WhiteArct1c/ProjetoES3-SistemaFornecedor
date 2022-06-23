
package controller.web;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EntidadeDominio;

public interface IViewHelper {
    
    public EntidadeDominio getEntidade(HttpServletRequest request);
    public void setEntidade(HttpServletResponse response, HttpServletRequest request, Object msg) throws IOException;
    
}

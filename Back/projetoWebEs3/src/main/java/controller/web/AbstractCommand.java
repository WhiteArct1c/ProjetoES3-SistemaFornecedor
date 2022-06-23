package controller.web;

import controller.IFachada;
import controller.impl.Fachada;

public abstract class AbstractCommand implements ICommand {

	protected IFachada fachada = new Fachada();

}

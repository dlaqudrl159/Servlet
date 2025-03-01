package info.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.domain.ControllerAction;

public interface Controller {

	public ControllerAction execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException;
}

//package br.com.bandtec.bora.controller.api.sms;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@ControllerAdvice
//public class GlobalExceptionController {
//	@ExceptionHandler(Exception.class)
//	@ResponseBody
//	public String handleAllException(Exception ex) {
//		String message = customMessage(ex.getMessage());
//		String mediaUrl = "http://goo.gl/ObTXdX";
//
//		Administrador[] administradores = new AdministradorService().getAdministradores();
//		for (Administrador administrador : administradores) {
//			new Cliente().sendMessage(administrador.getCelular(), message, mediaUrl);
//		}
//
//		return "Something unexpected happened. Keep calm, administrators were notified.";
//	}
//
//	private String customMessage(String exceptionMessage) {
//		return String.format("It appears the server is having Exception: %s "
//				+ "Go to: http://newrelic.com for more details. " + "Image URL: http://goo.gl/ObTXdX",
//				exceptionMessage);
//	}
//
//}

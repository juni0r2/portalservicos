package br.com.cassems.portalservico.portalservico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProtocoloController {

	@GetMapping("/novo")
	public String novo() {
		System.out.println("teste");
		return "protocolo/BuscaProtocolo";
	}
}

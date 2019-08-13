package com.everis.gameStore.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class GameStoreController.
 */
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/")
public class GameStoreController {

	/**
	 * Game store controller.
	 */
	public void gameStoreController() {
	}
}

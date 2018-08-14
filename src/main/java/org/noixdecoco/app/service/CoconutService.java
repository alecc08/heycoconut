package org.noixdecoco.app.service;

import org.noixdecoco.app.data.model.CoconutLedger;
import org.noixdecoco.app.exception.CoconutException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoconutService {
	long addCoconut(String fromUser, String toUser, int numCoconuts) throws CoconutException;
	Flux<CoconutLedger> getAllLedgers();
	long getCoconutsRemaining(String user);
}
package com.liquid.unabiz;

import com.liquid.unabiz.decoder.UnabizProtectDecoder;
import com.liquid.unabiz.responses.UnabizProtectResponse;

public class UnabizProtect {

	public String flat;

	public String door;

	public UnabizProtect(String message) {

		UnabizProtectResponse decode = UnabizProtectDecoder.decode(message);

		this.flat = decode.getFlat();
		this.door = decode.getDoor();
	}
}

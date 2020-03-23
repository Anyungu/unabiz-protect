package com.liquid.unabiz.decoder;

import java.util.ArrayList;
import java.util.List;

import com.liquid.unabiz.responses.UnabizProtectResponse;

public class UnabizProtectDecoder {

	public static UnabizProtectResponse decode(String message) {

		List<String> splitParts = SplitParts(message, 2);

		UnabizProtectResponse un = new UnabizProtectResponse();

		if (splitParts.get(0).contentEquals("02")) {

			if (splitParts.get(1).contentEquals("01")) {
				un.setDoor("Closed");
			} else {
				un.setDoor("Opened");
			}

			return un;
		} else {
			un.setFlat("Ignore");
			return un;
		}

	}

	private static List<String> SplitParts(String string, int partitionSize) {
		List<String> parts = new ArrayList<String>();
		int len = string.length();
		for (int i = 0; i < len; i += partitionSize) {

			parts.add(string.substring(i, Math.min(len, i + partitionSize)));
		}
		return parts;
	}

}

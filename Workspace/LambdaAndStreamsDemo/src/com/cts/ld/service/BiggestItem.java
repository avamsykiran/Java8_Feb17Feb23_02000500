package com.cts.ld.service;

import com.cts.ld.model.Item;

@FunctionalInterface
public interface BiggestItem {
	Item getBiggest(Item a,Item b);
}

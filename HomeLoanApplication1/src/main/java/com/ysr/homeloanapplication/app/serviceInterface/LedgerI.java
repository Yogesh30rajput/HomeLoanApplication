package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.Ledger;

public interface LedgerI {

	void saveLedger(Ledger l);

	List<Ledger> getLedger();

}

package com.developersBook.trade.bean;

import com.developersBook.trade.domain.TradeData;
import com.developersBook.trade.service.ITradeService;

public class TradeBean {
	private long tradeId;
	private ITradeService tradeService;

	public void setTradeService(ITradeService tradeService) {
		this.tradeService = tradeService;
	}

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}	

	public TradeData getTradeDetails(long tradeId) {
		return tradeService.getTrade(tradeId);
	}

}

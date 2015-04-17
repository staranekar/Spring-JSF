package com.developersBook.trade.domain;

public class TradeData {
	private long tradeId;
	private String symbol;
	private double price;

	public TradeData() {
		super();
	}

	public TradeData(long tradeId, String symbol, double price) {
		super();
		this.tradeId = tradeId;
		this.symbol = symbol;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

}

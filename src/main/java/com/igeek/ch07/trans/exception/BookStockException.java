package com.igeek.ch07.trans.exception;

public class BookStockException extends  RuntimeException {

    public BookStockException() {
    }

    public BookStockException(String message) {
        super(message);
    }
}

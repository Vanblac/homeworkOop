package log.impl;

import java.time.LocalDateTime;

import log.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        System.err.println(LocalDateTime.now() + ": " + text);
    }
}
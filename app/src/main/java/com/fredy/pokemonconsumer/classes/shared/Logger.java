package com.fredy.pokemonconsumer.classes.shared;

import com.fredy.pokemonconsumer.services.LoggerService;

public class Logger{
    public LoggerService loggerServiceInstance;

    public Logger() {
        loggerServiceInstance = LoggerService.getInstance();
    }

    public void logInfo(String message) {
        loggerServiceInstance.logInfo(message);
    }

    private void logError(String message) {
        loggerServiceInstance.logError(message);
    }

    private void logWarning(String message) {
        loggerServiceInstance.logWarning(message);
    }
}

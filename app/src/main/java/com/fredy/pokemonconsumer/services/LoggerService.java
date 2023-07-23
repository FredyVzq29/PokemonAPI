package com.fredy.pokemonconsumer.services;

import android.util.Log;

public final class LoggerService {
    private static LoggerService instance;

    public static synchronized LoggerService getInstance()
    {
        if (instance == null) instance = new LoggerService();
        return instance;
    }

    public void logInfo(String message) {
        Log.i("INFO:", message);
    }

    public void logError(String message) {
        Log.e("ERROR:", message);
    }

    public void logWarning(String message) {
        Log.w("WARNING:", message);
    }

}

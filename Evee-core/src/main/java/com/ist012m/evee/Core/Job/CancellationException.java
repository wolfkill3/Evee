package com.ist012m.evee.Core.Job;

public class CancellationException extends Exception {
    public CancellationException(final String message) {
        super(message);
    }

    public CancellationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CancellationException(final Throwable cause) {
        super(cause);
    }
}

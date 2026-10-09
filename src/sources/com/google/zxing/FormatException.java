package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FormatException f21456c;

    static {
        FormatException formatException = new FormatException();
        f21456c = formatException;
        formatException.setStackTrace(ReaderException.f21459b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f21458a ? new FormatException() : f21456c;
    }
}

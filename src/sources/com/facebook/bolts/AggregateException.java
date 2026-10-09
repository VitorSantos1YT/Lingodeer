package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream err) {
        m.f(err, "err");
        super.printStackTrace(err);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter err) {
        m.f(err, "err");
        super.printStackTrace(err);
        throw null;
    }
}

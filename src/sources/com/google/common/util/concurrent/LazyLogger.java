package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class LazyLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17660a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f17662c;

    public LazyLogger(Class cls) {
        this.f17661b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f17662c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f17660a) {
            try {
                Logger logger2 = this.f17662c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f17661b);
                this.f17662c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

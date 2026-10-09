package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbm f12327a = new zzbm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f12329c;

    public zzcy(Class cls) {
        this.f12328b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f12329c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f12327a) {
            try {
                Logger logger2 = this.f12329c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f12328b);
                this.f12329c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

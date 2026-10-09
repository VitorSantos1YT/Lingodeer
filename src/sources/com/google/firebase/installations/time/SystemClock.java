package com.google.firebase.installations.time;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SystemClock implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SystemClock f20425a;

    private SystemClock() {
    }

    public static SystemClock b() {
        if (f20425a == null) {
            f20425a = new SystemClock();
        }
        return f20425a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public final long a() {
        return System.currentTimeMillis();
    }
}

package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzy f9188c = new zzy(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f9190b;

    public zzy(boolean z11, String str, Exception exc) {
        this.f9189a = z11;
        this.f9190b = exc;
    }

    public static zzy b(String str) {
        return new zzy(false, str, null);
    }

    public static zzy c(String str, Exception exc) {
        return new zzy(false, str, exc);
    }

    public void a() {
    }
}

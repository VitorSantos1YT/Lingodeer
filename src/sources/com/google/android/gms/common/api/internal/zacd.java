package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zacd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegisterListenerMethod f8813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnregisterListenerMethod f8814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f8815c;

    public zacd(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        this.f8813a = registerListenerMethod;
        this.f8814b = unregisterListenerMethod;
        this.f8815c = runnable;
    }
}

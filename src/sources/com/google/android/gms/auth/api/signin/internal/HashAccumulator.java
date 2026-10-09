package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HashAccumulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8517a = 1;

    public final void a(Object obj) {
        this.f8517a = (this.f8517a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}

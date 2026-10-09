package com.google.android.gms.internal.auth;

import ep.a;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdk implements Serializable, zzdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdj f9466a;

    public zzdk(zzdj zzdjVar) {
        this.f9466a = zzdjVar;
    }

    public final String toString() {
        return a.g("Suppliers.memoize(", this.f9466a.toString(), ")");
    }
}

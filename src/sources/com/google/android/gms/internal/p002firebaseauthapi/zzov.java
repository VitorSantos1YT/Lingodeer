package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzov {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzov f10820b = new zzov();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10821a = new AtomicReference(new zzpr(new zzpq(0)));

    public final synchronized void a(zzpn zzpnVar) {
        zzpq zzpqVar = new zzpq((zzpr) this.f10821a.get());
        zzpqVar.a(zzpnVar);
        this.f10821a.set(new zzpr(zzpqVar));
    }

    public final synchronized void b(zzpv zzpvVar) {
        zzpq zzpqVar = new zzpq((zzpr) this.f10821a.get());
        zzpqVar.b(zzpvVar);
        this.f10821a.set(new zzpr(zzpqVar));
    }
}

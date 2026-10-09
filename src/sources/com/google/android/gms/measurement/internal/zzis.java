package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzis implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbh f13162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f13164c;

    public zzis(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.f13162a = zzbhVar;
        this.f13163b = str;
        Objects.requireNonNull(zzjdVar);
        this.f13164c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjd zzjdVar = this.f13164c;
        zzjdVar.f13199a.W();
        zzjdVar.f13199a.h(this.f13162a, this.f13163b);
    }
}

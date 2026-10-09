package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjv implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlj f13231a;

    public zzjv(zzlj zzljVar) {
        this.f13231a = zzljVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzhz zzhzVar = this.f13231a.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(runnable);
    }
}

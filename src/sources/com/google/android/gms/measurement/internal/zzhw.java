package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhw implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzhz f13071b;

    public zzhw(zzhz zzhzVar, String str) {
        this.f13071b = zzhzVar;
        this.f13070a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        zzgu zzguVar = this.f13071b.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12942f.b(th2, this.f13070a);
    }
}

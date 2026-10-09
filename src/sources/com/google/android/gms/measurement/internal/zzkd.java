package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzlj f13257e;

    public zzkd(zzlj zzljVar, String str, String str2, Object obj, long j11) {
        this.f13253a = str;
        this.f13254b = str2;
        this.f13255c = obj;
        this.f13256d = j11;
        this.f13257e = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f13255c;
        this.f13257e.r(this.f13256d, obj, this.f13253a, this.f13254b);
    }
}

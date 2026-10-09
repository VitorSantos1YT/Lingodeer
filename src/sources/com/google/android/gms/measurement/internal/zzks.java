package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzks implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f13287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13288b;

    public zzks(zzlj zzljVar, Boolean bool) {
        this.f13287a = bool;
        this.f13288b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13288b.D(this.f13287a, true);
    }
}

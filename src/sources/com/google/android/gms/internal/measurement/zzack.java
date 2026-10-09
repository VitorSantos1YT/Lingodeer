package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzack extends zzacl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11206a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzacr f11208c;

    public zzack(zzacr zzacrVar) {
        this.f11208c = zzacrVar;
        this.f11207b = zzacrVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11206a < this.f11207b;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzea extends zzeb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12345a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzei f12347c;

    public zzea(zzei zzeiVar) {
        this.f12347c = zzeiVar;
        this.f12346b = zzeiVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12345a < this.f12346b;
    }
}

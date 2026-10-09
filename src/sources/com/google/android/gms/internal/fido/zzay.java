package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzaz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f9648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaz f9650e;

    public zzay(zzaz zzazVar, int i11, int i12) {
        this.f9650e = zzazVar;
        this.f9648c = i11;
        this.f9649d = i12;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int d() {
        return this.f9650e.e() + this.f9648c + this.f9649d;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int e() {
        return this.f9650e.e() + this.f9648c;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] g() {
        return this.f9650e.g();
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzap.a(i11, this.f9649d);
        return this.f9650e.get(i11 + this.f9648c);
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* JADX INFO: renamed from: j */
    public final zzaz subList(int i11, int i12) {
        zzap.b(i11, i12, this.f9649d);
        int i13 = this.f9648c;
        return this.f9650e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9649d;
    }
}

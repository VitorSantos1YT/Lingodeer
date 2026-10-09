package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzaz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzaz f9647c;

    public zzax(zzaz zzazVar) {
        this.f9647c = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9647c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzaz zzazVar = this.f9647c;
        zzap.a(i11, zzazVar.size());
        return zzazVar.get((zzazVar.size() - 1) - i11);
    }

    @Override // com.google.android.gms.internal.fido.zzaz
    public final zzaz h() {
        return this.f9647c;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    public final int indexOf(Object obj) {
        zzaz zzazVar = this.f9647c;
        int iLastIndexOf = zzazVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzazVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* JADX INFO: renamed from: j */
    public final zzaz subList(int i11, int i12) {
        zzaz zzazVar = this.f9647c;
        zzap.b(i11, i12, zzazVar.size());
        return zzazVar.subList(zzazVar.size() - i12, zzazVar.size() - i11).h();
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    public final int lastIndexOf(Object obj) {
        zzaz zzazVar = this.f9647c;
        int iIndexOf = zzazVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzazVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9647c.size();
    }
}

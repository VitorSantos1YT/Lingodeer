package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzah f9614c;

    public zzaf(zzah zzahVar) {
        this.f9614c = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f9614c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzah zzahVar = this.f9614c;
        zzr.a(i11, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i11);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean h() {
        return this.f9614c.h();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        zzah zzahVar = this.f9614c;
        int iLastIndexOf = zzahVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzahVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah k() {
        return this.f9614c;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i11, int i12) {
        zzah zzahVar = this.f9614c;
        zzr.c(i11, i12, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i12, zzahVar.size() - i11).k();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        zzah zzahVar = this.f9614c;
        int iIndexOf = zzahVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzahVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9614c.size();
    }
}

package com.google.android.gms.internal.fido;

import ep.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzby extends zzbc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f9677c;

    public zzby(Object obj) {
        this.f9677c = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int b(Object[] objArr) {
        objArr[0] = this.f9677c;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9677c.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    /* JADX INFO: renamed from: f */
    public final zzcb iterator() {
        return new zzbl(this.f9677c);
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9677c.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbl(this.f9677c);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz l() {
        zzcc zzccVar = zzaz.f9651b;
        Object[] objArr = {this.f9677c};
        if (objArr[0] != null) {
            return new zzbs(1, objArr);
        }
        throw new NullPointerException("at index 0");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.g("[", this.f9677c.toString(), "]");
    }
}

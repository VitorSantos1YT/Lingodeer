package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzax<E> extends zzaq<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f10254c = "global";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10254c.equals(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d(Object[] objArr) {
        objArr[0] = this.f10254c;
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: f */
    public final zzba iterator() {
        return new zzap(this.f10254c);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10254c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.g("[", this.f10254c.toString(), "]");
    }
}

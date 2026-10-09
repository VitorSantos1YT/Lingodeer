package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw<K> extends zzaq<K> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzal f10252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzah f10253d;

    public zzaw(zzal zzalVar, zzah zzahVar) {
        this.f10252c = zzalVar;
        this.f10253d = zzahVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10252c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d(Object[] objArr) {
        return this.f10253d.d(objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: f */
    public final zzba iterator() {
        return (zzba) this.f10253d.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10252c.size();
    }
}

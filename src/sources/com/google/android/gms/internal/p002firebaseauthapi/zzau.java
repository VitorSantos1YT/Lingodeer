package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzau<K, V> extends zzaq<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzal f10246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f10247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f10248e;

    public zzau(zzal zzalVar, Object[] objArr, int i11) {
        this.f10246c = zzalVar;
        this.f10247d = objArr;
        this.f10248e = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f10246c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d(Object[] objArr) {
        zzah zzatVar = this.f10237b;
        if (zzatVar == null) {
            zzatVar = new zzat(this);
            this.f10237b = zzatVar;
        }
        return zzatVar.d(objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: f */
    public final zzba iterator() {
        zzah zzatVar = this.f10237b;
        if (zzatVar == null) {
            zzatVar = new zzat(this);
            this.f10237b = zzatVar;
        }
        return (zzaz) zzatVar.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10248e;
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcc extends zzbx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzbw f12277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f12278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f12279e;

    public zzcc(zzbw zzbwVar, Object[] objArr, int i11) {
        this.f12277c = zzbwVar;
        this.f12278d = objArr;
        this.f12279e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int b(Object[] objArr) {
        return f().b(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12277c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: g */
    public final zzch iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final zzbt k() {
        return new zzcb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12279e;
    }
}

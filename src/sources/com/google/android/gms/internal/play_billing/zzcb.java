package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcb extends zzbt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzcc f12276c;

    public zzcb(zzcc zzccVar) {
        this.f12276c = zzccVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzcc zzccVar = this.f12276c;
        zzbg.a(i11, zzccVar.f12279e);
        Object[] objArr = zzccVar.f12278d;
        int i12 = i11 + i11;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12276c.f12279e;
    }
}

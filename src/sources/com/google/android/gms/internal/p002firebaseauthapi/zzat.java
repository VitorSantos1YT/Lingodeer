package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzau f10245c;

    public zzat(zzau zzauVar) {
        this.f10245c = zzauVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzau zzauVar = this.f10245c;
        zzu.a(i11, zzauVar.f10248e);
        Object[] objArr = zzauVar.f10247d;
        int i12 = i11 * 2;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10245c.f10248e;
    }
}

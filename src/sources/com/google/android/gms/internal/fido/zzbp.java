package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbp extends zzbr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzbp f9664a = new zzbp();

    private zzbp() {
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr a() {
        return zzbv.f9675a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

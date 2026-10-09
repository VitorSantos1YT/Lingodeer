package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzx implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzyl f12228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzzy f12231d;

    public /* synthetic */ zzzx(zzzy zzzyVar, zzyl zzylVar, int i11) {
        this.f12231d = zzzyVar;
        this.f12228a = zzylVar;
        int i12 = i11 & 31;
        this.f12229b = i12;
        this.f12230c = i11 >>> (i12 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12229b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f12229b;
        zzzy zzzyVar = this.f12231d;
        zzzj zzzjVar = zzzyVar.f12232b;
        int iA = zzzjVar.a();
        Object objCast = this.f12228a.f12180b.cast(i11 >= iA ? zzzyVar.f12233c.c(i11 - iA) : zzzjVar.c(i11));
        int i12 = this.f12230c;
        if (i12 == 0) {
            this.f12229b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i12) + 1;
        this.f12230c >>>= iNumberOfTrailingZeros;
        this.f12229b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

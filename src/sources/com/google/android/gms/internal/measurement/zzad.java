package com.google.android.gms.internal.measurement;

import defpackage.e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzae f11244b;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.f11244b = zzaeVar;
        this.f11243a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11243a < this.f11244b.l();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i11 = this.f11243a;
        zzae zzaeVar = this.f11244b;
        if (i11 >= zzaeVar.l()) {
            int i12 = this.f11243a;
            throw new NoSuchElementException(e.g(i12, "Out of bounds index: ", new StringBuilder(String.valueOf(i12).length() + 21)));
        }
        int i13 = this.f11243a;
        this.f11243a = i13 + 1;
        return zzaeVar.m(i13);
    }
}

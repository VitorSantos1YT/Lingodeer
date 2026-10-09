package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaba implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11166a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzabb f11167b;

    public zzaba(zzabb zzabbVar) {
        this.f11167b = zzabbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f11166a;
        zzabb zzabbVar = this.f11167b;
        return i11 < zzabbVar.d() - zzabbVar.b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f11166a;
        zzabb zzabbVar = this.f11167b;
        if (i11 >= zzabbVar.d() - zzabbVar.b()) {
            throw new NoSuchElementException();
        }
        zzabc zzabcVar = zzabbVar.f11169b;
        Object obj = zzabcVar.f11171a[zzabbVar.b() + i11];
        this.f11166a = i11 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

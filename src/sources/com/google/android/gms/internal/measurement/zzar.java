package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzar implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11456a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzas f11457b;

    public zzar(zzas zzasVar) {
        this.f11457b = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11456a < this.f11457b.f11458a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        zzas zzasVar = this.f11457b;
        String str = zzasVar.f11458a;
        int i11 = this.f11456a;
        if (i11 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.f11456a = i11 + 1;
        return new zzas(String.valueOf(zzasVar.f11458a.charAt(i11)));
    }
}

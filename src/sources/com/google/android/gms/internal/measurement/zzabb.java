package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabb extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzabc f11169b;

    public zzabb(zzabc zzabcVar, int i11) {
        this.f11169b = zzabcVar;
        this.f11168a = i11;
    }

    public final int b() {
        int i11 = this.f11168a;
        if (i11 == -1) {
            return 0;
        }
        return this.f11169b.f11172b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f11169b.f11171a, b(), d(), obj, this.f11168a == -1 ? zzabc.f11170f : zzabe.f11176b) >= 0;
    }

    public final int d() {
        return this.f11169b.f11172b[this.f11168a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaba(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d() - b();
    }
}

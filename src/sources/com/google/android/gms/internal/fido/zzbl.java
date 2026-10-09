package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbl extends zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9663b;

    public zzbl(Object obj) {
        this.f9663b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f9662a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9662a) {
            throw new NoSuchElementException();
        }
        this.f9662a = true;
        return this.f9663b;
    }
}

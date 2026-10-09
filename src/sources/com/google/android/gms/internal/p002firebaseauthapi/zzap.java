package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzap<T> extends zzba<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10236b;

    public zzap(String str) {
        this.f10235a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f10236b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10236b) {
            throw new NoSuchElementException();
        }
        this.f10236b = true;
        return this.f10235a;
    }
}

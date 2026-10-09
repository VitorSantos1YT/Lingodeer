package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzd<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10290a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10291b;

    public abstract String a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f10290a;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        if (i12 == 0) {
            return true;
        }
        if (i12 == 2) {
            return false;
        }
        this.f10290a = 4;
        this.f10291b = a();
        if (this.f10290a == 3) {
            return false;
        }
        this.f10290a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10290a = 2;
        Object obj = this.f10291b;
        this.f10291b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

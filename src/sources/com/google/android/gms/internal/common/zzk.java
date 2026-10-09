package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzk implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9628b = 2;

    public abstract String a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f9628b;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.f9628b = 4;
            this.f9627a = a();
            if (this.f9628b != 3) {
                this.f9628b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9628b = 2;
        Object obj = this.f9627a;
        this.f9627a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

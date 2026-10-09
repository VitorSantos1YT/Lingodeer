package lz;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40529d;

    public b(char c11, char c12, int i11) {
        this.f40526a = i11;
        this.f40527b = c12;
        boolean z11 = false;
        if (i11 <= 0 ? m.h(c11, c12) >= 0 : m.h(c11, c12) <= 0) {
            z11 = true;
        }
        this.f40528c = z11;
        this.f40529d = z11 ? c11 : c12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40528c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f40529d;
        if (i11 != this.f40527b) {
            this.f40529d = this.f40526a + i11;
        } else {
            if (!this.f40528c) {
                throw new NoSuchElementException();
            }
            this.f40528c = false;
        }
        return Character.valueOf((char) i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

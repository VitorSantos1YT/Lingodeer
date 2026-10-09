package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzeb implements zzed {
    @Override // java.util.Iterator
    public final Object next() {
        zzea zzeaVar = (zzea) this;
        int i11 = zzeaVar.f12345a;
        if (i11 >= zzeaVar.f12346b) {
            throw new NoSuchElementException();
        }
        zzeaVar.f12345a = i11 + 1;
        return Byte.valueOf(zzeaVar.f12347c.d(i11));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

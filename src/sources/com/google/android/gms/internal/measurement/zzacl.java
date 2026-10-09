package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzacl implements zzacn {
    @Override // java.util.Iterator
    public final Object next() {
        zzack zzackVar = (zzack) this;
        int i11 = zzackVar.f11206a;
        if (i11 >= zzackVar.f11207b) {
            throw new NoSuchElementException();
        }
        zzackVar.f11206a = i11 + 1;
        return Byte.valueOf(zzackVar.f11208c.b(i11));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

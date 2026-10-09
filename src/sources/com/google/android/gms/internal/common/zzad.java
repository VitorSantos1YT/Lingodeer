package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad extends zzaa {
    public zzad() {
        this.f9609a = new Object[4];
        this.f9610b = 0;
    }

    public final void a(Object obj) {
        int i11;
        obj.getClass();
        int length = this.f9609a.length;
        int i12 = this.f9610b;
        int i13 = i12 + 1;
        if (i13 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i13 <= length) {
            i11 = length;
        } else {
            i11 = (length >> 1) + length + 1;
            if (i11 < i13) {
                int iHighestOneBit = Integer.highestOneBit(i12);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        if (i11 > length || this.f9611c) {
            this.f9609a = Arrays.copyOf(this.f9609a, i11);
            this.f9611c = false;
        }
        Object[] objArr = this.f9609a;
        int i14 = this.f9610b;
        this.f9610b = i14 + 1;
        objArr[i14] = obj;
    }

    public final zzah b() {
        this.f9611c = true;
        return zzah.o(this.f9610b, this.f9609a);
    }
}

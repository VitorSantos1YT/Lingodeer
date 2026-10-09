package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import defpackage.e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvk extends AbstractFuture {
    public zzvm H;
    public final int K;

    public /* synthetic */ zzvk(zzvm zzvmVar, int i11) {
        this.H = zzvmVar;
        this.K = i11;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        AtomicLong atomicLong;
        long j11;
        int i11;
        int i12;
        boolean z11;
        zzvm zzvmVar = this.H;
        this.H = null;
        if (zzvmVar == null) {
            return;
        }
        AtomicReference atomicReference = zzvmVar.f12071c;
        do {
            atomicLong = zzvmVar.f12070b;
            j11 = atomicLong.get();
            i11 = (int) j11;
            long j12 = j11 >>> 32;
            if (i11 == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j11);
                throw new AssertionError(sb2.toString());
            }
            i12 = (int) j12;
            z11 = i11 == -2147483647;
            if (z11) {
                i12++;
            }
        } while (!atomicLong.compareAndSet(j11, (((long) i12) << 32) | (4294967295L & ((long) (i11 - 1)))));
        if (z11) {
            while (true) {
                zzvl zzvlVar = (zzvl) atomicReference.get();
                if (zzvlVar != null) {
                    if (zzvlVar.H <= this.K) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null)) {
                            if (atomicReference.get() != zzvlVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        AsyncCallable asyncCallable;
        zzvm zzvmVar = this.H;
        if (zzvmVar == null || (asyncCallable = zzvmVar.f12069a.f12060a) == null) {
            return null;
        }
        String string = asyncCallable.toString();
        String strU = p.u(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        zzvl zzvlVar = (zzvl) this.H.f12071c.get();
        if (zzvlVar == null) {
            return strU;
        }
        int length = strU.length();
        String string2 = zzvlVar.toString();
        return e.p(new StringBuilder(string2.length() + length + 9 + 1), strU, ", trial=[", string2, "]");
    }
}

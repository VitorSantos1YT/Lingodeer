package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import ry.l;
import ry.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhy {
    private List zza = r.f50854a;

    public final long zza(long[] jArr) {
        Iterator it = m.H0(this.zza, l.j0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = l.j0(jArr);
    }
}

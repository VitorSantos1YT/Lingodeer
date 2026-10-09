package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzjp(Iterable iterable, int i11) {
        this.zza = iterable;
        this.zzb = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i11 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzjf.zzb(i11 >= 0, "numberToAdvance must be nonnegative");
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}

package vz;

import uz.g1;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends w0 implements g1 {
    @Override // uz.g1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.K + ((long) ((int) ((p() + ((long) this.M)) - this.K)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i11) {
        synchronized (this) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.c(objArr);
            d(Integer.valueOf(((Number) objArr[((int) ((this.K + ((long) ((int) ((p() + ((long) this.M)) - this.K)))) - 1)) & (objArr.length - 1)]).intValue() + i11));
        }
    }
}

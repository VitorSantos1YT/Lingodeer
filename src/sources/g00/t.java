package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f28464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28465b;

    @Override // g00.h1
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f28464a, this.f28465b);
        kotlin.jvm.internal.m.e(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        double[] dArr = this.f28464a;
        if (dArr.length < i11) {
            int length = dArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
            kotlin.jvm.internal.m.e(dArrCopyOf, "copyOf(...)");
            this.f28464a = dArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28465b;
    }
}

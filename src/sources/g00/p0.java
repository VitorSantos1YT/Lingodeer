package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f28448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28449b;

    @Override // g00.h1
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f28448a, this.f28449b);
        kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        long[] jArr = this.f28448a;
        if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
            kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
            this.f28448a = jArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28449b;
    }
}

package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f28453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28454b;

    @Override // g00.h1
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f28453a, this.f28454b);
        kotlin.jvm.internal.m.e(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        short[] sArr = this.f28453a;
        if (sArr.length < i11) {
            int length = sArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i11);
            kotlin.jvm.internal.m.e(sArrCopyOf, "copyOf(...)");
            this.f28453a = sArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28454b;
    }
}

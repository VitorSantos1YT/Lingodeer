package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f28500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28501b;

    @Override // g00.h1
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f28500a, this.f28501b);
        kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
        return new qy.v(iArrCopyOf);
    }

    @Override // g00.h1
    public final void b(int i11) {
        int[] iArr = this.f28500a;
        if (iArr.length < i11) {
            int length = iArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f28500a = iArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28501b;
    }
}

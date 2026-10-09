package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f28362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28363b;

    @Override // g00.h1
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f28362a, this.f28363b);
        kotlin.jvm.internal.m.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        float[] fArr = this.f28362a;
        if (fArr.length < i11) {
            int length = fArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i11);
            kotlin.jvm.internal.m.e(fArrCopyOf, "copyOf(...)");
            this.f28362a = fArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28363b;
    }
}

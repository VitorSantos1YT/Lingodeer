package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f28438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28439b;

    @Override // g00.h1
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f28438a, this.f28439b);
        kotlin.jvm.internal.m.e(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        char[] cArr = this.f28438a;
        if (cArr.length < i11) {
            int length = cArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            kotlin.jvm.internal.m.e(cArrCopyOf, "copyOf(...)");
            this.f28438a = cArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28439b;
    }
}

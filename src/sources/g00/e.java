package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28380b;

    @Override // g00.h1
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f28379a, this.f28380b);
        kotlin.jvm.internal.m.e(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        boolean[] zArr = this.f28379a;
        if (zArr.length < i11) {
            int length = zArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i11);
            kotlin.jvm.internal.m.e(zArrCopyOf, "copyOf(...)");
            this.f28379a = zArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28380b;
    }
}

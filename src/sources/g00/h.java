package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f28411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28412b;

    @Override // g00.h1
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f28411a, this.f28412b);
        kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // g00.h1
    public final void b(int i11) {
        byte[] bArr = this.f28411a;
        if (bArr.length < i11) {
            int length = bArr.length * 2;
            if (i11 < length) {
                i11 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
            this.f28411a = bArrCopyOf;
        }
    }

    @Override // g00.h1
    public final int d() {
        return this.f28412b;
    }
}

package e9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f25266f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f25271e;

    public final void a(byte[] bArr, int i11, int i12) {
        if (this.f25267a) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f25271e;
            int length = bArr2.length;
            int i14 = this.f25269c + i13;
            if (length < i14) {
                this.f25271e = Arrays.copyOf(bArr2, i14 * 2);
            }
            System.arraycopy(bArr, i11, this.f25271e, this.f25269c, i13);
            this.f25269c += i13;
        }
    }
}

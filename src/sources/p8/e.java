package p8;

import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f46634d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46635a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46637c;

    public static long a(byte[] bArr, int i11, boolean z11) {
        long j11 = ((long) bArr[0]) & 255;
        if (z11) {
            j11 &= ~f46634d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (((long) bArr[i12]) & 255);
        }
        return j11;
    }

    public final long b(n nVar, boolean z11, boolean z12, int i11) {
        int i12;
        int i13 = this.f46636b;
        byte[] bArr = this.f46635a;
        if (i13 == 0) {
            if (!nVar.a(bArr, 0, 1, z11)) {
                return -1L;
            }
            int i14 = bArr[0] & 255;
            int i15 = 0;
            while (true) {
                if (i15 >= 8) {
                    i12 = -1;
                    break;
                }
                if ((f46634d[i15] & ((long) i14)) != 0) {
                    i12 = i15 + 1;
                    break;
                }
                i15++;
            }
            this.f46637c = i12;
            if (i12 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f46636b = 1;
        }
        int i16 = this.f46637c;
        if (i16 > i11) {
            this.f46636b = 0;
            return -2L;
        }
        if (i16 != 1) {
            nVar.readFully(bArr, 1, i16 - 1);
        }
        this.f46636b = 0;
        return a(bArr, this.f46637c, z12);
    }
}

package i00;

import com.android.billingclient.api.c0;
import com.android.billingclient.api.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33904c;

    public g(c0 c0Var, boolean z11) {
        super(c0Var);
        this.f33904c = z11;
    }

    @Override // com.android.billingclient.api.k0
    public final void h(byte b3) {
        if (this.f33904c) {
            n(String.valueOf(b3 & 255));
        } else {
            l(String.valueOf(b3 & 255));
        }
    }

    @Override // com.android.billingclient.api.k0
    public final void j(int i11) {
        if (this.f33904c) {
            n(Long.toString(((long) i11) & 4294967295L, 10));
        } else {
            l(Long.toString(((long) i11) & 4294967295L, 10));
        }
    }

    @Override // com.android.billingclient.api.k0
    public final void k(long j11) {
        int i11 = 63;
        String str = "0";
        if (this.f33904c) {
            if (j11 != 0) {
                if (j11 > 0) {
                    str = Long.toString(j11, 10);
                } else {
                    char[] cArr = new char[64];
                    long j12 = (j11 >>> 1) / ((long) 5);
                    long j13 = 10;
                    cArr[63] = Character.forDigit((int) (j11 - (j12 * j13)), 10);
                    while (j12 > 0) {
                        i11--;
                        cArr[i11] = Character.forDigit((int) (j12 % j13), 10);
                        j12 /= j13;
                    }
                    str = new String(cArr, i11, 64 - i11);
                }
            }
            n(str);
            return;
        }
        if (j11 != 0) {
            if (j11 > 0) {
                str = Long.toString(j11, 10);
            } else {
                char[] cArr2 = new char[64];
                long j14 = (j11 >>> 1) / ((long) 5);
                long j15 = 10;
                cArr2[63] = Character.forDigit((int) (j11 - (j14 * j15)), 10);
                while (j14 > 0) {
                    i11--;
                    cArr2[i11] = Character.forDigit((int) (j14 % j15), 10);
                    j14 /= j15;
                }
                str = new String(cArr2, i11, 64 - i11);
            }
        }
        l(str);
    }

    @Override // com.android.billingclient.api.k0
    public final void m(short s3) {
        if (this.f33904c) {
            n(String.valueOf(s3 & 65535));
        } else {
            l(String.valueOf(s3 & 65535));
        }
    }
}

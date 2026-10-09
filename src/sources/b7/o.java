package b7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f4014c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(int i11, byte b3) {
        this(32);
        this.f4012a = i11;
        switch (i11) {
            case 1:
                break;
            default:
                break;
        }
    }

    public final void a(long j11) {
        switch (this.f4012a) {
            case 0:
                int i11 = this.f4013b;
                long[] jArr = this.f4014c;
                if (i11 == jArr.length) {
                    this.f4014c = Arrays.copyOf(jArr, i11 * 2);
                }
                long[] jArr2 = this.f4014c;
                int i12 = this.f4013b;
                this.f4013b = i12 + 1;
                jArr2[i12] = j11;
                break;
            default:
                if (!c(j11)) {
                    int i13 = this.f4013b;
                    long[] jArrCopyOf = this.f4014c;
                    if (i13 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i13 + 1, jArrCopyOf.length * 2));
                        kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
                        this.f4014c = jArrCopyOf;
                    }
                    jArrCopyOf[i13] = j11;
                    if (i13 >= this.f4013b) {
                        this.f4013b = i13 + 1;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.f4013b + jArr.length;
        long[] jArr2 = this.f4014c;
        if (length > jArr2.length) {
            this.f4014c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f4014c, this.f4013b, jArr.length);
        this.f4013b = length;
    }

    public boolean c(long j11) {
        int i11 = this.f4013b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f4014c[i12] == j11) {
                return true;
            }
        }
        return false;
    }

    public long d(int i11) {
        if (i11 >= 0 && i11 < this.f4013b) {
            return this.f4014c[i11];
        }
        StringBuilder sbI = w4.c.i(i11, "Invalid index ", ", size is ");
        sbI.append(this.f4013b);
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public void e(long j11) {
        int i11 = this.f4013b;
        int i12 = 0;
        while (i12 < i11) {
            if (j11 == this.f4014c[i12]) {
                int i13 = this.f4013b - 1;
                while (i12 < i13) {
                    long[] jArr = this.f4014c;
                    int i14 = i12 + 1;
                    jArr[i12] = jArr[i14];
                    i12 = i14;
                }
                this.f4013b--;
                return;
            }
            i12++;
        }
    }

    public o(int i11) {
        this.f4012a = 0;
        this.f4014c = new long[i11];
    }
}

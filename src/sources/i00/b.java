package i00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ub.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f33896k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f33897l;
    public final /* synthetic */ String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33898n;

    public b(m mVar, String str) {
        this.f33897l = mVar;
        this.m = str;
        this.f33898n = mVar.f33913b.f29917b;
    }

    @Override // ub.a, f00.d
    public void C(long j11) {
        String str;
        switch (this.f33896k) {
            case 1:
                if (j11 == 0) {
                    str = "0";
                } else if (j11 > 0) {
                    str = Long.toString(j11, 10);
                } else {
                    char[] cArr = new char[64];
                    long j12 = (j11 >>> 1) / ((long) 5);
                    long j13 = 10;
                    int i11 = 63;
                    cArr[63] = Character.forDigit((int) (j11 - (j12 * j13)), 10);
                    while (j12 > 0) {
                        i11--;
                        cArr[i11] = Character.forDigit((int) (j12 % j13), 10);
                        j12 /= j13;
                    }
                    str = new String(cArr, i11, 64 - i11);
                }
                j0(str);
                break;
            default:
                super.C(j11);
                break;
        }
    }

    @Override // ub.a, f00.d
    public void F(String value) {
        switch (this.f33896k) {
            case 0:
                kotlin.jvm.internal.m.f(value, "value");
                this.f33897l.O(new h00.t(value, false, (e00.g) this.f33898n), this.m);
                break;
            default:
                super.F(value);
                break;
        }
    }

    @Override // f00.d
    public final com.android.billingclient.api.h a() {
        switch (this.f33896k) {
            case 0:
                return this.f33897l.f33913b.f29917b;
            default:
                return (com.android.billingclient.api.h) this.f33898n;
        }
    }

    public void j0(String s3) {
        kotlin.jvm.internal.m.f(s3, "s");
        this.f33897l.O(new h00.t(s3, false, null), this.m);
    }

    @Override // ub.a, f00.d
    public void k(short s3) {
        switch (this.f33896k) {
            case 1:
                j0(String.valueOf(s3 & 65535));
                break;
            default:
                super.k(s3);
                break;
        }
    }

    @Override // ub.a, f00.d
    public void m(byte b3) {
        switch (this.f33896k) {
            case 1:
                j0(String.valueOf(b3 & 255));
                break;
            default:
                super.m(b3);
                break;
        }
    }

    @Override // ub.a, f00.d
    public void z(int i11) {
        switch (this.f33896k) {
            case 1:
                j0(Long.toString(((long) i11) & 4294967295L, 10));
                break;
            default:
                super.z(i11);
                break;
        }
    }

    public b(m mVar, String str, e00.g gVar) {
        this.f33897l = mVar;
        this.m = str;
        this.f33898n = gVar;
    }
}

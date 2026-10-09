package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f55881a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55887g;

    public final void a(e0 e0Var, d0 d0Var) {
        if (this.f55883c > 0) {
            e0Var.d(this.f55884d, this.f55885e, this.f55886f, this.f55887g, d0Var);
            this.f55883c = 0;
        }
    }

    public final void b(e0 e0Var, long j11, int i11, int i12, int i13, d0 d0Var) {
        b7.a.i("TrueHD chunk samples must be contiguous in the sample queue.", this.f55887g <= i12 + i13);
        if (this.f55882b) {
            int i14 = this.f55883c;
            int i15 = i14 + 1;
            this.f55883c = i15;
            if (i14 == 0) {
                this.f55884d = j11;
                this.f55885e = i11;
                this.f55886f = 0;
            }
            this.f55886f += i12;
            this.f55887g = i13;
            if (i15 >= 16) {
                a(e0Var, d0Var);
            }
        }
    }

    public final void c(n nVar) {
        if (this.f55882b) {
            return;
        }
        byte[] bArr = this.f55881a;
        int i11 = 0;
        nVar.A(bArr, 0, 10);
        nVar.r();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                i11 = 40 << ((bArr[((b3 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i11 == 0) {
            return;
        }
        this.f55882b = true;
    }
}

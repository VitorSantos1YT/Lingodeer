package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.b0 f25439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25446i;

    public y(int i11) {
        this.f25438a = i11;
        switch (i11) {
            case 1:
                this.f25439b = new b7.b0(0L);
                this.f25444g = -9223372036854775807L;
                this.f25445h = -9223372036854775807L;
                this.f25446i = -9223372036854775807L;
                this.f25440c = new b7.w();
                break;
            default:
                this.f25439b = new b7.b0(0L);
                this.f25444g = -9223372036854775807L;
                this.f25445h = -9223372036854775807L;
                this.f25446i = -9223372036854775807L;
                this.f25440c = new b7.w();
                break;
        }
    }

    public static int b(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static long c(b7.w wVar) {
        int i11 = wVar.f4040b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.h(bArr, 0, 9);
        wVar.I(i11);
        byte b3 = bArr[0];
        if ((b3 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j11 = b3;
                    long j12 = b11;
                    return ((j12 & 3) << 13) | ((j11 & 3) << 28) | (((56 & j11) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j12 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(x7.n nVar) {
        switch (this.f25438a) {
            case 0:
                byte[] bArr = b7.f0.f3976b;
                b7.w wVar = this.f25440c;
                wVar.getClass();
                wVar.G(bArr, bArr.length);
                this.f25441d = true;
                nVar.r();
                break;
            default:
                byte[] bArr2 = b7.f0.f3976b;
                b7.w wVar2 = this.f25440c;
                wVar2.getClass();
                wVar2.G(bArr2, bArr2.length);
                this.f25441d = true;
                nVar.r();
                break;
        }
    }
}

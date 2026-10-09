package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.w f25385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7.w f25386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x7.e0 f25390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25392h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25396l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25397n;

    public t(String str, int i11, String str2) {
        b7.w wVar = new b7.w(4);
        this.f25385a = wVar;
        wVar.f4039a[0] = -1;
        this.f25386b = new x7.w();
        this.f25397n = -9223372036854775807L;
        this.f25387c = str;
        this.f25388d = i11;
        this.f25389e = str2;
    }

    @Override // e9.h
    public final void a() {
        this.f25392h = 0;
        this.f25393i = 0;
        this.f25395k = false;
        this.f25397n = -9223372036854775807L;
    }

    @Override // e9.h
    public final void c(b7.w wVar) {
        b7.a.k(this.f25390f);
        while (wVar.a() > 0) {
            int i11 = this.f25392h;
            b7.w wVar2 = this.f25385a;
            if (i11 == 0) {
                byte[] bArr = wVar.f4039a;
                int i12 = wVar.f4040b;
                int i13 = wVar.f4041c;
                while (true) {
                    if (i12 >= i13) {
                        wVar.I(i13);
                        break;
                    }
                    byte b3 = bArr[i12];
                    boolean z11 = (b3 & 255) == 255;
                    boolean z12 = this.f25395k && (b3 & 224) == 224;
                    this.f25395k = z11;
                    if (z12) {
                        wVar.I(i12 + 1);
                        this.f25395k = false;
                        wVar2.f4039a[1] = bArr[i12];
                        this.f25393i = 2;
                        this.f25392h = 1;
                        break;
                    }
                    i12++;
                }
            } else if (i11 == 1) {
                int iMin = Math.min(wVar.a(), 4 - this.f25393i);
                wVar.h(wVar2.f4039a, this.f25393i, iMin);
                int i14 = this.f25393i + iMin;
                this.f25393i = i14;
                if (i14 >= 4) {
                    wVar2.I(0);
                    int iJ = wVar2.j();
                    x7.w wVar3 = this.f25386b;
                    if (wVar3.a(iJ)) {
                        this.m = wVar3.f55950b;
                        if (!this.f25394j) {
                            this.f25396l = (((long) wVar3.f55954f) * 1000000) / ((long) wVar3.f55951c);
                            y6.o oVar = new y6.o();
                            oVar.f57253a = this.f25391g;
                            oVar.f57264l = y6.d0.o(this.f25389e);
                            oVar.m = y6.d0.o((String) wVar3.f55955g);
                            oVar.f57265n = 4096;
                            oVar.E = wVar3.f55952d;
                            oVar.F = wVar3.f55951c;
                            oVar.f57256d = this.f25387c;
                            oVar.f57258f = this.f25388d;
                            this.f25390f.b(new y6.p(oVar));
                            this.f25394j = true;
                        }
                        wVar2.I(0);
                        this.f25390f.a(wVar2, 4, 0);
                        this.f25392h = 2;
                    } else {
                        this.f25393i = 0;
                        this.f25392h = 1;
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(wVar.a(), this.m - this.f25393i);
                this.f25390f.a(wVar, iMin2, 0);
                int i15 = this.f25393i + iMin2;
                this.f25393i = i15;
                if (i15 >= this.m) {
                    b7.a.j(this.f25397n != -9223372036854775807L);
                    this.f25390f.d(this.f25397n, 1, this.m, 0, null);
                    this.f25397n += this.f25396l;
                    this.f25393i = 0;
                    this.f25392h = 0;
                }
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25391g = (String) bVar.f3850e;
        bVar.j();
        this.f25390f = oVar.v(bVar.f3848c, 1);
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25397n = j11;
    }

    @Override // e9.h
    public final void e(boolean z11) {
    }
}

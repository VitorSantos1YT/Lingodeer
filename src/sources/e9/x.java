package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.v f25427b = new b7.v(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25428c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b7.b0 f25430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25437l;

    public x(h hVar) {
        this.f25426a = hVar;
    }

    @Override // e9.f0
    public final void a() {
        this.f25428c = 0;
        this.f25429d = 0;
        this.f25433h = false;
        this.f25426a.a();
    }

    @Override // e9.f0
    public final void b(b7.b0 b0Var, x7.o oVar, b10.b bVar) {
        this.f25430e = b0Var;
        this.f25426a.d(oVar, bVar);
    }

    @Override // e9.f0
    public final void c(int i11, b7.w wVar) {
        int i12;
        int i13;
        b7.a.k(this.f25430e);
        int i14 = i11 & 1;
        int i15 = -1;
        int i16 = 2;
        h hVar = this.f25426a;
        if (i14 != 0) {
            int i17 = this.f25428c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    b7.a.B("Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f25435j != -1) {
                        b7.a.B("Unexpected start indicator: expected " + this.f25435j + " more bytes");
                    }
                    hVar.e(wVar.f4041c == 0);
                }
            }
            this.f25428c = 1;
            this.f25429d = 0;
        }
        int i18 = i11;
        while (wVar.a() > 0) {
            int i19 = this.f25428c;
            if (i19 != 0) {
                b7.v vVar = this.f25427b;
                if (i19 != 1) {
                    if (i19 == i16) {
                        if (d(wVar, vVar.f4032b, Math.min(10, this.f25434i)) && d(wVar, null, this.f25434i)) {
                            vVar.q(0);
                            this.f25437l = -9223372036854775807L;
                            if (this.f25431f) {
                                vVar.t(4);
                                long jI = ((long) vVar.i(3)) << 30;
                                vVar.t(1);
                                long jI2 = ((long) (vVar.i(15) << 15)) | jI;
                                vVar.t(1);
                                long jI3 = jI2 | ((long) vVar.i(15));
                                vVar.t(1);
                                if (!this.f25433h && this.f25432g) {
                                    vVar.t(4);
                                    long jI4 = ((long) vVar.i(3)) << 30;
                                    vVar.t(1);
                                    long jI5 = jI4 | ((long) (vVar.i(15) << 15));
                                    vVar.t(1);
                                    long jI6 = jI5 | ((long) vVar.i(15));
                                    vVar.t(1);
                                    this.f25430e.b(jI6);
                                    this.f25433h = true;
                                }
                                this.f25437l = this.f25430e.b(jI3);
                            }
                            i18 |= this.f25436k ? 4 : 0;
                            hVar.f(i18, this.f25437l);
                            this.f25428c = 3;
                            this.f25429d = 0;
                            i15 = -1;
                            i16 = 2;
                        }
                    } else {
                        if (i19 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = wVar.a();
                        int i21 = this.f25435j;
                        int i22 = i21 == i15 ? 0 : iA - i21;
                        if (i22 > 0) {
                            iA -= i22;
                            wVar.H(wVar.f4040b + iA);
                        }
                        hVar.c(wVar);
                        int i23 = this.f25435j;
                        if (i23 != i15) {
                            int i24 = i23 - iA;
                            this.f25435j = i24;
                            if (i24 == 0) {
                                hVar.e(false);
                                this.f25428c = 1;
                                this.f25429d = 0;
                            }
                        }
                    }
                    i12 = i16;
                } else if (d(wVar, vVar.f4032b, 9)) {
                    vVar.q(0);
                    int i25 = vVar.i(24);
                    if (i25 != 1) {
                        defpackage.e.y(i25, "Unexpected start code prefix: ");
                        i15 = -1;
                        this.f25435j = -1;
                        i13 = 0;
                        i12 = 2;
                    } else {
                        vVar.t(8);
                        int i26 = vVar.i(16);
                        vVar.t(5);
                        this.f25436k = vVar.h();
                        i12 = 2;
                        vVar.t(2);
                        this.f25431f = vVar.h();
                        this.f25432g = vVar.h();
                        vVar.t(6);
                        int i27 = vVar.i(8);
                        this.f25434i = i27;
                        if (i26 == 0) {
                            this.f25435j = -1;
                            i15 = -1;
                        } else {
                            int i28 = (i26 - 3) - i27;
                            this.f25435j = i28;
                            if (i28 < 0) {
                                b7.a.B("Found negative packet payload size: " + this.f25435j);
                                i15 = -1;
                                this.f25435j = -1;
                            } else {
                                i15 = -1;
                            }
                        }
                        i13 = 2;
                    }
                    this.f25428c = i13;
                    this.f25429d = 0;
                } else {
                    i15 = -1;
                    i12 = 2;
                }
            } else {
                i12 = i16;
                wVar.J(wVar.a());
            }
            i16 = i12;
        }
    }

    public final boolean d(b7.w wVar, byte[] bArr, int i11) {
        int iMin = Math.min(wVar.a(), i11 - this.f25429d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.J(iMin);
        } else {
            wVar.h(bArr, this.f25429d, iMin);
        }
        int i12 = this.f25429d + iMin;
        this.f25429d = i12;
        return i12 == i11;
    }
}

package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f25165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.w f25166b = new b7.w(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25170f;

    public c0(b0 b0Var) {
        this.f25165a = b0Var;
    }

    @Override // e9.f0
    public final void a() {
        this.f25170f = true;
    }

    @Override // e9.f0
    public final void b(b7.b0 b0Var, x7.o oVar, b10.b bVar) {
        this.f25165a.b(b0Var, oVar, bVar);
        this.f25170f = true;
    }

    @Override // e9.f0
    public final void c(int i11, b7.w wVar) {
        int iW;
        boolean z11 = (i11 & 1) != 0;
        if (z11) {
            iW = wVar.f4040b + wVar.w();
        } else {
            iW = -1;
        }
        if (this.f25170f) {
            if (!z11) {
                return;
            }
            this.f25170f = false;
            wVar.I(iW);
            this.f25168d = 0;
        }
        while (wVar.a() > 0) {
            int i12 = this.f25168d;
            b7.w wVar2 = this.f25166b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iW2 = wVar.w();
                    wVar.I(wVar.f4040b - 1);
                    if (iW2 == 255) {
                        this.f25170f = true;
                        return;
                    }
                }
                int iMin = Math.min(wVar.a(), 3 - this.f25168d);
                wVar.h(wVar2.f4039a, this.f25168d, iMin);
                int i13 = this.f25168d + iMin;
                this.f25168d = i13;
                if (i13 == 3) {
                    wVar2.I(0);
                    wVar2.H(3);
                    wVar2.J(1);
                    int iW3 = wVar2.w();
                    int iW4 = wVar2.w();
                    this.f25169e = (iW3 & 128) != 0;
                    int i14 = (((iW3 & 15) << 8) | iW4) + 3;
                    this.f25167c = i14;
                    byte[] bArr = wVar2.f4039a;
                    if (bArr.length < i14) {
                        wVar2.c(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(wVar.a(), this.f25167c - this.f25168d);
                wVar.h(wVar2.f4039a, this.f25168d, iMin2);
                int i15 = this.f25168d + iMin2;
                this.f25168d = i15;
                int i16 = this.f25167c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f25169e) {
                        wVar2.H(i16);
                    } else {
                        if (b7.f0.l(0, wVar2.f4039a, i16, -1) != 0) {
                            this.f25170f = true;
                            return;
                        }
                        wVar2.H(this.f25167c - 4);
                    }
                    wVar2.I(0);
                    this.f25165a.c(wVar2);
                    this.f25168d = 0;
                }
            }
        }
    }
}

package e9;

import com.google.common.base.Preconditions;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.m f25351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x7.e0 f25353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f25354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25355e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25362l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f25356f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f25357g = new w(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f25358h = new w(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f25359i = new w(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f25360j = new w(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f25361k = new w(40);
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b7.w f25363n = new b7.w();

    public r(ob.m mVar) {
        this.f25351a = mVar;
    }

    @Override // e9.h
    public final void a() {
        this.f25362l = 0L;
        this.m = -9223372036854775807L;
        c7.q.a(this.f25356f);
        this.f25357g.d();
        this.f25358h.d();
        this.f25359i.d();
        this.f25360j.d();
        this.f25361k.d();
        ((b7.c) this.f25351a.f44828d).b(0);
        q qVar = this.f25354d;
        if (qVar != null) {
            qVar.f25344f = false;
            qVar.f25345g = false;
            qVar.f25346h = false;
            qVar.f25347i = false;
            qVar.f25348j = false;
        }
    }

    public final void b(int i11, int i12, long j11, long j12) {
        b7.c cVar = (b7.c) this.f25351a.f44828d;
        q qVar = this.f25354d;
        boolean z11 = this.f25355e;
        if (qVar.f25348j && qVar.f25345g) {
            qVar.m = qVar.f25341c;
            qVar.f25348j = false;
        } else if (qVar.f25346h || qVar.f25345g) {
            if (z11 && qVar.f25347i) {
                qVar.a(i11 + ((int) (j11 - qVar.f25340b)));
            }
            qVar.f25349k = qVar.f25340b;
            qVar.f25350l = qVar.f25343e;
            qVar.m = qVar.f25341c;
            qVar.f25347i = true;
        }
        if (!this.f25355e) {
            w wVar = this.f25357g;
            wVar.b(i12);
            w wVar2 = this.f25358h;
            wVar2.b(i12);
            w wVar3 = this.f25359i;
            wVar3.b(i12);
            if (wVar.f25423c && wVar2.f25423c && wVar3.f25423c) {
                String str = this.f25352b;
                int i13 = wVar.f25424d;
                byte[] bArr = new byte[wVar2.f25424d + i13 + wVar3.f25424d];
                System.arraycopy((byte[]) wVar.f25425e, 0, bArr, 0, i13);
                System.arraycopy((byte[]) wVar2.f25425e, 0, bArr, wVar.f25424d, wVar2.f25424d);
                System.arraycopy((byte[]) wVar3.f25425e, 0, bArr, wVar.f25424d + wVar2.f25424d, wVar3.f25424d);
                c7.m mVarH = c7.q.h((byte[]) wVar2.f25425e, 3, wVar2.f25424d, null);
                c7.k kVar = mVarH.f6675b;
                String strA = kVar != null ? b7.d.a(kVar.f6663a, kVar.f6664b, kVar.f6665c, kVar.f6666d, kVar.f6667e, kVar.f6668f) : null;
                y6.o oVar = new y6.o();
                oVar.f57253a = str;
                oVar.f57264l = y6.d0.o("video/mp2t");
                oVar.m = y6.d0.o("video/hevc");
                oVar.f57262j = strA;
                oVar.f57271t = mVarH.f6678e;
                oVar.f57272u = mVarH.f6679f;
                oVar.f57273v = mVarH.f6680g;
                oVar.f57274w = mVarH.f6681h;
                oVar.C = new y6.g(mVarH.f6684k, mVarH.f6685l, mVarH.m, mVarH.f6676c + 8, mVarH.f6677d + 8, null);
                oVar.f57277z = mVarH.f6682i;
                oVar.f57266o = mVarH.f6683j;
                oVar.D = mVarH.f6674a + 1;
                oVar.f57267p = Collections.singletonList(bArr);
                y6.p pVar = new y6.p(oVar);
                this.f25353c.b(pVar);
                int i14 = pVar.f57293p;
                Preconditions.r(i14 != -1);
                cVar.e(i14);
                this.f25355e = true;
            }
        }
        w wVar4 = this.f25360j;
        boolean zB = wVar4.b(i12);
        b7.w wVar5 = this.f25363n;
        if (zB) {
            wVar5.G((byte[]) wVar4.f25425e, c7.q.l((byte[]) wVar4.f25425e, wVar4.f25424d));
            wVar5.J(5);
            cVar.a(j12, wVar5);
        }
        w wVar6 = this.f25361k;
        if (wVar6.b(i12)) {
            wVar5.G((byte[]) wVar6.f25425e, c7.q.l((byte[]) wVar6.f25425e, wVar6.f25424d));
            wVar5.J(5);
            cVar.a(j12, wVar5);
        }
    }

    @Override // e9.h
    public final void c(b7.w wVar) {
        int i11;
        b7.a.k(this.f25353c);
        String str = b7.f0.f3975a;
        while (wVar.a() > 0) {
            int i12 = wVar.f4040b;
            int i13 = wVar.f4041c;
            byte[] bArr = wVar.f4039a;
            this.f25362l += (long) wVar.a();
            this.f25353c.a(wVar, wVar.a(), 0);
            while (i12 < i13) {
                int iB = c7.q.b(bArr, i12, i13, this.f25356f);
                if (iB == i13) {
                    g(bArr, i12, i13);
                    return;
                }
                int i14 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i11 = 3;
                } else {
                    iB--;
                    i11 = 4;
                }
                int i15 = iB;
                int i16 = i11;
                int i17 = i15 - i12;
                if (i17 > 0) {
                    g(bArr, i12, i15);
                }
                int i18 = i13 - i15;
                long j11 = this.f25362l - ((long) i18);
                b(i18, i17 < 0 ? -i17 : 0, j11, this.m);
                h(i18, i14, j11, this.m);
                i12 = i15 + i16;
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25352b = (String) bVar.f3850e;
        bVar.j();
        x7.e0 e0VarV = oVar.v(bVar.f3848c, 2);
        this.f25353c = e0VarV;
        this.f25354d = new q(e0VarV);
        this.f25351a.J(oVar, bVar);
    }

    @Override // e9.h
    public final void e(boolean z11) {
        b7.a.k(this.f25353c);
        String str = b7.f0.f3975a;
        if (z11) {
            ((b7.c) this.f25351a.f44828d).b(0);
            b(0, 0, this.f25362l, this.m);
            h(0, 48, this.f25362l, this.m);
        }
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.m = j11;
    }

    public final void g(byte[] bArr, int i11, int i12) {
        q qVar = this.f25354d;
        if (qVar.f25344f) {
            int i13 = qVar.f25342d;
            int i14 = (i11 + 2) - i13;
            if (i14 < i12) {
                qVar.f25345g = (bArr[i14] & 128) != 0;
                qVar.f25344f = false;
            } else {
                qVar.f25342d = (i12 - i11) + i13;
            }
        }
        if (!this.f25355e) {
            this.f25357g.a(bArr, i11, i12);
            this.f25358h.a(bArr, i11, i12);
            this.f25359i.a(bArr, i11, i12);
        }
        this.f25360j.a(bArr, i11, i12);
        this.f25361k.a(bArr, i11, i12);
    }

    public final void h(int i11, int i12, long j11, long j12) {
        q qVar = this.f25354d;
        boolean z11 = this.f25355e;
        qVar.f25345g = false;
        qVar.f25346h = false;
        qVar.f25343e = j12;
        qVar.f25342d = 0;
        qVar.f25340b = j11;
        if (i12 >= 32 && i12 != 40) {
            if (qVar.f25347i && !qVar.f25348j) {
                if (z11) {
                    qVar.a(i11);
                }
                qVar.f25347i = false;
            }
            if ((32 <= i12 && i12 <= 35) || i12 == 39) {
                qVar.f25346h = !qVar.f25348j;
                qVar.f25348j = true;
            }
        }
        boolean z12 = i12 >= 16 && i12 <= 21;
        qVar.f25341c = z12;
        qVar.f25344f = z12 || i12 <= 9;
        if (!this.f25355e) {
            this.f25357g.e(i12);
            this.f25358h.e(i12);
            this.f25359i.e(i12);
        }
        this.f25360j.e(i12);
        this.f25361k.e(i12);
    }
}

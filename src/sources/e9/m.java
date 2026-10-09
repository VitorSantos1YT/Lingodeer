package e9;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f25280l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq.c f25281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.w f25282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f25283c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f25284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f25285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f25286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x7.e0 f25289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25291k;

    public m(xq.c cVar) {
        this.f25281a = cVar;
        k kVar = new k();
        kVar.f25271e = new byte[128];
        this.f25284d = kVar;
        this.f25291k = -9223372036854775807L;
        this.f25285e = new w(178);
        this.f25282b = new b7.w();
    }

    @Override // e9.h
    public final void a() {
        c7.q.a(this.f25283c);
        k kVar = this.f25284d;
        kVar.f25267a = false;
        kVar.f25269c = 0;
        kVar.f25268b = 0;
        l lVar = this.f25286f;
        if (lVar != null) {
            lVar.f25273b = false;
            lVar.f25274c = false;
            lVar.f25275d = false;
            lVar.f25276e = -1;
        }
        w wVar = this.f25285e;
        if (wVar != null) {
            wVar.d();
        }
        this.f25287g = 0L;
        this.f25291k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x023b  */
    @Override // e9.h
    public final void c(b7.w wVar) {
        boolean z11;
        int i11;
        int i12;
        float f5;
        b7.a.k(this.f25286f);
        b7.a.k(this.f25289i);
        int i13 = wVar.f4040b;
        int i14 = wVar.f4041c;
        byte[] bArr = wVar.f4039a;
        this.f25287g += (long) wVar.a();
        int i15 = 0;
        this.f25289i.a(wVar, wVar.a(), 0);
        while (true) {
            int iB = c7.q.b(bArr, i13, i14, this.f25283c);
            k kVar = this.f25284d;
            w wVar2 = this.f25285e;
            if (iB == i14) {
                if (!this.f25290j) {
                    kVar.a(bArr, i13, i14);
                }
                this.f25286f.a(bArr, i13, i14);
                if (wVar2 != null) {
                    wVar2.a(bArr, i13, i14);
                    return;
                }
                return;
            }
            int i16 = iB + 3;
            byte b3 = wVar.f4039a[i16];
            int i17 = b3 & 255;
            int i18 = iB - i13;
            if (this.f25290j) {
                i14 = i14;
            } else {
                if (i18 > 0) {
                    kVar.a(bArr, i13, iB);
                }
                int i19 = i18 < 0 ? -i18 : i15;
                int i21 = kVar.f25268b;
                if (i21 == 0) {
                    i14 = i14;
                    i12 = 0;
                    if (i17 == 176) {
                        kVar.f25268b = 1;
                        kVar.f25267a = true;
                    }
                } else if (i21 == 1) {
                    i14 = i14;
                    i12 = 0;
                    if (i17 != 181) {
                        b7.a.B("Unexpected start code value");
                        kVar.f25267a = false;
                        kVar.f25269c = 0;
                        kVar.f25268b = 0;
                    } else {
                        kVar.f25268b = 2;
                    }
                } else if (i21 == 2) {
                    i14 = i14;
                    i12 = 0;
                    if (i17 > 31) {
                        b7.a.B("Unexpected start code value");
                        kVar.f25267a = false;
                        kVar.f25269c = 0;
                        kVar.f25268b = 0;
                    } else {
                        kVar.f25268b = 3;
                    }
                } else if (i21 == 3) {
                    i14 = i14;
                    if ((b3 & 240) != 32) {
                        b7.a.B("Unexpected start code value");
                        i12 = 0;
                        kVar.f25267a = false;
                        kVar.f25269c = 0;
                        kVar.f25268b = 0;
                    } else {
                        i12 = 0;
                        kVar.f25270d = kVar.f25269c;
                        kVar.f25268b = 4;
                    }
                } else {
                    if (i21 != 4) {
                        throw new IllegalStateException();
                    }
                    if (i17 == 179 || i17 == 181) {
                        kVar.f25269c -= i19;
                        kVar.f25267a = false;
                        x7.e0 e0Var = this.f25289i;
                        int i22 = kVar.f25270d;
                        String str = this.f25288h;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(kVar.f25271e, kVar.f25269c);
                        b7.v vVar = new b7.v(bArrCopyOf, bArrCopyOf.length);
                        vVar.u(i22);
                        vVar.u(4);
                        vVar.s();
                        vVar.t(8);
                        if (vVar.h()) {
                            vVar.t(4);
                            vVar.t(3);
                        }
                        int i23 = vVar.i(4);
                        if (i23 == 15) {
                            int i24 = vVar.i(8);
                            int i25 = vVar.i(8);
                            if (i25 == 0) {
                                b7.a.B("Invalid aspect ratio");
                                f5 = 1.0f;
                            } else {
                                f5 = i24 / i25;
                            }
                        } else if (i23 < 7) {
                            f5 = f25280l[i23];
                        } else {
                            b7.a.B("Invalid aspect ratio");
                            f5 = 1.0f;
                        }
                        if (vVar.h()) {
                            vVar.t(2);
                            vVar.t(1);
                            if (vVar.h()) {
                                vVar.t(15);
                                vVar.s();
                                vVar.t(15);
                                vVar.s();
                                vVar.t(15);
                                vVar.s();
                                vVar.t(3);
                                vVar.t(11);
                                vVar.s();
                                vVar.t(15);
                                vVar.s();
                            }
                        }
                        if (vVar.i(2) != 0) {
                            b7.a.B("Unhandled video object layer shape");
                        }
                        vVar.s();
                        int i26 = vVar.i(16);
                        vVar.s();
                        if (vVar.h()) {
                            if (i26 == 0) {
                                b7.a.B("Invalid vop_increment_time_resolution");
                            } else {
                                int i27 = 0;
                                for (int i28 = i26 - 1; i28 > 0; i28 >>= 1) {
                                    i27++;
                                }
                                vVar.t(i27);
                            }
                        }
                        vVar.s();
                        int i29 = vVar.i(13);
                        vVar.s();
                        int i30 = vVar.i(13);
                        vVar.s();
                        vVar.s();
                        y6.o oVar = new y6.o();
                        oVar.f57253a = str;
                        oVar.f57264l = y6.d0.o("video/mp2t");
                        oVar.m = y6.d0.o("video/mp4v-es");
                        oVar.f57271t = i29;
                        oVar.f57272u = i30;
                        oVar.f57277z = f5;
                        oVar.f57267p = Collections.singletonList(bArrCopyOf);
                        nv.p.D(oVar, e0Var);
                        this.f25290j = true;
                    } else {
                        i14 = i14;
                        i12 = 0;
                    }
                }
                kVar.a(k.f25266f, i12, 3);
            }
            this.f25286f.a(bArr, i13, iB);
            if (wVar2 == null) {
                z11 = true;
            } else {
                if (i18 > 0) {
                    wVar2.a(bArr, i13, iB);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (wVar2.b(i11)) {
                    int iL = c7.q.l((byte[]) wVar2.f25425e, wVar2.f25424d);
                    String str2 = b7.f0.f3975a;
                    byte[] bArr2 = (byte[]) wVar2.f25425e;
                    b7.w wVar3 = this.f25282b;
                    wVar3.G(bArr2, iL);
                    this.f25281a.q(this.f25291k, wVar3);
                }
                if (i17 == 178) {
                    z11 = true;
                    if (wVar.f4039a[iB + 2] == 1) {
                        wVar2.e(i17);
                    }
                } else {
                    z11 = true;
                }
            }
            int i31 = i14 - iB;
            this.f25286f.b(i31, this.f25287g - ((long) i31), this.f25290j);
            l lVar = this.f25286f;
            long j11 = this.f25291k;
            lVar.f25276e = i17;
            lVar.f25275d = false;
            lVar.f25273b = (i17 == 182 || i17 == 179) ? z11 : false;
            lVar.f25274c = i17 == 182 ? z11 : false;
            i15 = 0;
            lVar.f25277f = 0;
            lVar.f25279h = j11;
            i13 = i16;
            i14 = i14;
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25288h = (String) bVar.f3850e;
        bVar.j();
        x7.e0 e0VarV = oVar.v(bVar.f3848c, 2);
        this.f25289i = e0VarV;
        this.f25286f = new l(e0VarV);
        this.f25281a.s(oVar, bVar);
    }

    @Override // e9.h
    public final void e(boolean z11) {
        b7.a.k(this.f25286f);
        if (z11) {
            this.f25286f.b(0, this.f25287g, this.f25290j);
            l lVar = this.f25286f;
            lVar.f25273b = false;
            lVar.f25274c = false;
            lVar.f25275d = false;
            lVar.f25276e = -1;
        }
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25291k = j11;
    }
}

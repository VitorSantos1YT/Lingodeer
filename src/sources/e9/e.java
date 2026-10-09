package e9;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f25196x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25197a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x7.e0 f25204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x7.e0 f25205i;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25209n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25213r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f25215t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x7.e0 f25217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f25218w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.v f25198b = new b7.v(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25199c = new b7.w(Arrays.copyOf(f25196x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25210o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25211p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f25214s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f25216u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25206j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25207k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25208l = 256;

    public e(int i11, String str, String str2, boolean z11) {
        this.f25197a = z11;
        this.f25200d = str;
        this.f25201e = i11;
        this.f25202f = str2;
    }

    @Override // e9.h
    public final void a() {
        this.f25216u = -9223372036854775807L;
        this.f25209n = false;
        this.f25206j = 0;
        this.f25207k = 0;
        this.f25208l = 256;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e9.h
    public final void c(b7.w wVar) throws ParserException {
        byte b3;
        int i11;
        int i12;
        char c11;
        int i13;
        char c12;
        int i14;
        int i15;
        int i16;
        this.f25204h.getClass();
        String str = b7.f0.f3975a;
        while (wVar.a() > 0) {
            int i17 = this.f25206j;
            byte b11 = -1;
            b7.w wVar2 = this.f25199c;
            int i18 = 3;
            b7.v vVar = this.f25198b;
            int i19 = 4;
            int i21 = 0;
            int i22 = 1;
            if (i17 == 0) {
                byte[] bArr = wVar.f4039a;
                int i23 = wVar.f4040b;
                int i24 = wVar.f4041c;
                while (true) {
                    if (i23 < i24) {
                        int i25 = i23 + 1;
                        int i26 = i18;
                        byte b12 = bArr[i23];
                        int i27 = b12 & 255;
                        if (this.f25208l == 512 && ((65280 | (((byte) i27) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f25209n) {
                                int i28 = i23 - 1;
                                wVar.I(i23);
                                byte[] bArr2 = vVar.f4032b;
                                if (wVar.a() < i22) {
                                    b3 = -1;
                                } else {
                                    wVar.h(bArr2, i21, i22);
                                    vVar.q(i19);
                                    int i29 = vVar.i(i22);
                                    int i30 = this.f25210o;
                                    if (i30 == -1 || i29 == i30) {
                                        if (this.f25211p != -1) {
                                            byte[] bArr3 = vVar.f4032b;
                                            if (wVar.a() >= i22) {
                                                wVar.h(bArr3, i21, i22);
                                                vVar.q(2);
                                                i14 = 4;
                                                if (vVar.i(4) != this.f25211p) {
                                                    b3 = -1;
                                                } else {
                                                    wVar.I(i25);
                                                }
                                            }
                                        } else {
                                            i14 = 4;
                                        }
                                        byte[] bArr4 = vVar.f4032b;
                                        if (wVar.a() >= i14) {
                                            wVar.h(bArr4, i21, i14);
                                            vVar.q(14);
                                            int i31 = vVar.i(13);
                                            if (i31 < 7) {
                                                b3 = -1;
                                            } else {
                                                byte[] bArr5 = wVar.f4039a;
                                                int i32 = wVar.f4041c;
                                                int i33 = i28 + i31;
                                                if (i33 < i32) {
                                                    byte b13 = bArr5[i33];
                                                    b3 = -1;
                                                    if (b13 == -1) {
                                                        int i34 = i33 + 1;
                                                        if (i34 != i32) {
                                                            byte b14 = bArr5[i34];
                                                            if (((65280 | (b14 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b14 & 8) >> 3) == i29) {
                                                            }
                                                        }
                                                    } else if (b13 == 73 && ((i15 = i33 + 1) == i32 || (bArr5[i15] == 68 && ((i16 = i33 + 2) == i32 || bArr5[i16] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b3 = -1;
                                    }
                                }
                                i11 = 1;
                            }
                            this.f25212q = (b12 & 8) >> 3;
                            this.m = (b12 & 1) == 0;
                            if (this.f25209n) {
                                this.f25206j = i26;
                                this.f25207k = 0;
                            } else {
                                this.f25206j = 1;
                                this.f25207k = 0;
                            }
                            wVar.I(i25);
                        } else {
                            b3 = b11;
                            i11 = i22;
                        }
                        int i35 = this.f25208l;
                        int i36 = i27 | i35;
                        if (i36 == 329) {
                            i12 = 3;
                            c11 = 256;
                            i13 = 0;
                            c12 = 2;
                            this.f25208l = 768;
                        } else if (i36 == 511) {
                            i12 = 3;
                            c11 = 256;
                            i13 = 0;
                            c12 = 2;
                            this.f25208l = 512;
                        } else if (i36 == 836) {
                            i12 = 3;
                            c11 = 256;
                            i13 = 0;
                            c12 = 2;
                            this.f25208l = 1024;
                        } else if (i36 != 1075) {
                            c11 = 256;
                            if (i35 != 256) {
                                this.f25208l = 256;
                                i12 = 3;
                                i13 = 0;
                                c12 = 2;
                            } else {
                                i12 = 3;
                                i13 = 0;
                                c12 = 2;
                            }
                            i22 = i11;
                            b11 = b3;
                            i19 = 4;
                            i21 = i13;
                            i18 = i12;
                        } else {
                            this.f25206j = 2;
                            this.f25207k = 3;
                            this.f25215t = 0;
                            wVar2.I(0);
                            wVar.I(i25);
                        }
                        i23 = i25;
                        i22 = i11;
                        b11 = b3;
                        i19 = 4;
                        i21 = i13;
                        i18 = i12;
                    } else {
                        wVar.I(i23);
                    }
                }
            } else if (i17 != 1) {
                if (i17 == 2) {
                    byte[] bArr6 = wVar2.f4039a;
                    int iMin = Math.min(wVar.a(), 10 - this.f25207k);
                    wVar.h(bArr6, this.f25207k, iMin);
                    int i37 = this.f25207k + iMin;
                    this.f25207k = i37;
                    if (i37 == 10) {
                        this.f25205i.a(wVar2, 10, 0);
                        wVar2.I(6);
                        x7.e0 e0Var = this.f25205i;
                        int iV = wVar2.v() + 10;
                        this.f25206j = 4;
                        this.f25207k = 10;
                        this.f25217v = e0Var;
                        this.f25218w = 0L;
                        this.f25215t = iV;
                    }
                } else if (i17 == 3) {
                    int i38 = this.m ? 7 : 5;
                    byte[] bArr7 = vVar.f4032b;
                    int iMin2 = Math.min(wVar.a(), i38 - this.f25207k);
                    wVar.h(bArr7, this.f25207k, iMin2);
                    int i39 = this.f25207k + iMin2;
                    this.f25207k = i39;
                    if (i39 == i38) {
                        vVar.q(0);
                        if (this.f25213r) {
                            vVar.t(10);
                        } else {
                            int i40 = vVar.i(2) + 1;
                            if (i40 != 2) {
                                b7.a.B("Detected audio object type: " + i40 + ", but assuming AAC LC.");
                                i40 = 2;
                            }
                            vVar.t(5);
                            int i41 = vVar.i(3);
                            int i42 = this.f25211p;
                            byte[] bArr8 = {(byte) (((i40 << 3) & 248) | ((i42 >> 1) & 7)), (byte) (((i41 << 3) & 120) | ((i42 << 7) & 128))};
                            com.android.billingclient.api.i iVarN = x7.a.n(new b7.v(bArr8, 2), false);
                            y6.o oVar = new y6.o();
                            oVar.f57253a = this.f25203g;
                            oVar.f57264l = y6.d0.o(this.f25202f);
                            oVar.m = y6.d0.o("audio/mp4a-latm");
                            oVar.f57262j = iVarN.f7517c;
                            oVar.E = iVarN.f7516b;
                            oVar.F = iVarN.f7515a;
                            oVar.f57267p = Collections.singletonList(bArr8);
                            oVar.f57256d = this.f25200d;
                            oVar.f57258f = this.f25201e;
                            y6.p pVar = new y6.p(oVar);
                            this.f25214s = 1024000000 / ((long) pVar.G);
                            this.f25204h.b(pVar);
                            this.f25213r = true;
                        }
                        vVar.t(4);
                        int i43 = vVar.i(13);
                        int i44 = i43 - 7;
                        if (this.m) {
                            i44 = i43 - 9;
                        }
                        x7.e0 e0Var2 = this.f25204h;
                        long j11 = this.f25214s;
                        this.f25206j = 4;
                        this.f25207k = 0;
                        this.f25217v = e0Var2;
                        this.f25218w = j11;
                        this.f25215t = i44;
                    }
                } else {
                    if (i17 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(wVar.a(), this.f25215t - this.f25207k);
                    this.f25217v.a(wVar, iMin3, 0);
                    int i45 = this.f25207k + iMin3;
                    this.f25207k = i45;
                    if (i45 == this.f25215t) {
                        b7.a.j(this.f25216u != -9223372036854775807L);
                        this.f25217v.d(this.f25216u, 1, this.f25215t, 0, null);
                        this.f25216u += this.f25218w;
                        this.f25206j = 0;
                        this.f25207k = 0;
                        this.f25208l = 256;
                    }
                }
            } else if (wVar.a() != 0) {
                vVar.f4032b[0] = wVar.f4039a[wVar.f4040b];
                vVar.q(2);
                int i46 = vVar.i(4);
                int i47 = this.f25211p;
                if (i47 == -1 || i46 == i47) {
                    if (!this.f25209n) {
                        this.f25209n = true;
                        this.f25210o = this.f25212q;
                        this.f25211p = i46;
                    }
                    this.f25206j = 3;
                    this.f25207k = 0;
                } else {
                    this.f25209n = false;
                    this.f25206j = 0;
                    this.f25207k = 0;
                    this.f25208l = 256;
                }
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25203g = (String) bVar.f3850e;
        bVar.j();
        x7.e0 e0VarV = oVar.v(bVar.f3848c, 1);
        this.f25204h = e0VarV;
        this.f25217v = e0VarV;
        if (!this.f25197a) {
            this.f25205i = new x7.l();
            return;
        }
        bVar.d();
        bVar.j();
        x7.e0 e0VarV2 = oVar.v(bVar.f3848c, 5);
        this.f25205i = e0VarV2;
        y6.o oVar2 = new y6.o();
        bVar.j();
        oVar2.f57253a = (String) bVar.f3850e;
        oVar2.f57264l = y6.d0.o(this.f25202f);
        oVar2.m = y6.d0.o("application/id3");
        nv.p.D(oVar2, e0VarV2);
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25216u = j11;
    }

    @Override // e9.h
    public final void e(boolean z11) {
    }
}

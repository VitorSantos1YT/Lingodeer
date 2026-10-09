package e9;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.m f25325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25327c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25331g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x7.e0 f25334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f25335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25336l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25337n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f25332h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f25328d = new w(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f25329e = new w(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f25330f = new w(6);
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b7.w f25338o = new b7.w();

    public p(ob.m mVar, boolean z11, boolean z12) {
        this.f25325a = mVar;
        this.f25326b = z11;
        this.f25327c = z12;
    }

    @Override // e9.h
    public final void a() {
        this.f25331g = 0L;
        this.f25337n = false;
        this.m = -9223372036854775807L;
        c7.q.a(this.f25332h);
        this.f25328d.d();
        this.f25329e.d();
        this.f25330f.d();
        ((b7.c) this.f25325a.f44828d).b(0);
        o oVar = this.f25335k;
        if (oVar != null) {
            oVar.f25317k = false;
            oVar.f25320o = false;
            n nVar = oVar.f25319n;
            nVar.f25293b = false;
            nVar.f25292a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x020d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0214  */
    /* JADX WARN: Code duplicated, block: B:94:0x0251  */
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
    public final void b(int i11, int i12, long j11, long j12) {
        long j13;
        int i13;
        long j14;
        long j15;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        b7.c cVar = (b7.c) this.f25325a.f44828d;
        if (!this.f25336l || this.f25335k.f25309c) {
            w wVar = this.f25328d;
            wVar.b(i12);
            w wVar2 = this.f25329e;
            wVar2.b(i12);
            if (this.f25336l) {
                if (wVar.f25423c) {
                    c7.p pVarJ = c7.q.j((byte[]) wVar.f25425e, 3, wVar.f25424d);
                    cVar.e(pVarJ.f6708s);
                    this.f25335k.f25310d.append(pVarJ.f6694d, pVarJ);
                    wVar.d();
                } else if (wVar2.f25423c) {
                    b7.v vVar = new b7.v((byte[]) wVar2.f25425e, 4, wVar2.f25424d);
                    int iM = vVar.m();
                    int iM2 = vVar.m();
                    vVar.s();
                    this.f25335k.f25311e.append(iM, new c7.o(iM, iM2, vVar.h()));
                    wVar2.d();
                }
            } else if (wVar.f25423c && wVar2.f25423c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) wVar.f25425e, wVar.f25424d));
                arrayList.add(Arrays.copyOf((byte[]) wVar2.f25425e, wVar2.f25424d));
                c7.p pVarJ2 = c7.q.j((byte[]) wVar.f25425e, 3, wVar.f25424d);
                int i18 = pVarJ2.f6708s;
                b7.v vVar2 = new b7.v((byte[]) wVar2.f25425e, 4, wVar2.f25424d);
                int iM3 = vVar2.m();
                int iM4 = vVar2.m();
                vVar2.s();
                c7.o oVar = new c7.o(iM3, iM4, vVar2.h());
                int i19 = pVarJ2.f6691a;
                int i21 = pVarJ2.f6692b;
                int i22 = pVarJ2.f6693c;
                byte[] bArr = b7.d.f3966a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i21), Integer.valueOf(i22));
                x7.e0 e0Var = this.f25334j;
                y6.o oVar2 = new y6.o();
                oVar2.f57253a = this.f25333i;
                oVar2.f57264l = y6.d0.o("video/mp2t");
                oVar2.m = y6.d0.o("video/avc");
                oVar2.f57262j = str;
                oVar2.f57271t = pVarJ2.f6695e;
                oVar2.f57272u = pVarJ2.f6696f;
                oVar2.C = new y6.g(pVarJ2.f6705p, pVarJ2.f6706q, pVarJ2.f6707r, pVarJ2.f6698h + 8, pVarJ2.f6699i + 8, null);
                oVar2.f57277z = pVarJ2.f6697g;
                oVar2.f57267p = arrayList;
                oVar2.f57266o = i18;
                nv.p.D(oVar2, e0Var);
                this.f25336l = true;
                cVar.e(i18);
                this.f25335k.f25310d.append(pVarJ2.f6694d, pVarJ2);
                this.f25335k.f25311e.append(iM3, oVar);
                wVar.d();
                wVar2.d();
            }
        }
        w wVar3 = this.f25330f;
        if (wVar3.b(i12)) {
            int iL = c7.q.l((byte[]) wVar3.f25425e, wVar3.f25424d);
            byte[] bArr2 = (byte[]) wVar3.f25425e;
            b7.w wVar4 = this.f25338o;
            wVar4.G(bArr2, iL);
            wVar4.I(4);
            cVar.a(j12, wVar4);
        }
        o oVar3 = this.f25335k;
        boolean z14 = this.f25336l;
        if (oVar3.f25315i == 9) {
            if (z14 && oVar3.f25320o) {
                j13 = oVar3.f25316j;
                i13 = i11 + ((int) (j11 - j13));
                j14 = oVar3.f25322q;
                if (j14 != -9223372036854775807L) {
                    j15 = oVar3.f25321p;
                    if (j13 != j15) {
                        oVar3.f25307a.d(j14, oVar3.f25323r ? 1 : 0, (int) (j13 - j15), i13, null);
                    }
                }
            }
            oVar3.f25321p = oVar3.f25316j;
            oVar3.f25322q = oVar3.f25318l;
            oVar3.f25323r = false;
            oVar3.f25320o = true;
        } else if (oVar3.f25309c) {
            n nVar = oVar3.f25319n;
            n nVar2 = oVar3.m;
            if (nVar.f25292a) {
                if (nVar2.f25292a) {
                    c7.p pVar = nVar.f25294c;
                    b7.a.k(pVar);
                    c7.p pVar2 = nVar2.f25294c;
                    b7.a.k(pVar2);
                    int i23 = pVar2.m;
                    if (nVar.f25297f != nVar2.f25297f || nVar.f25298g != nVar2.f25298g || nVar.f25299h != nVar2.f25299h || ((nVar.f25300i && nVar2.f25300i && nVar.f25301j != nVar2.f25301j) || (((i15 = nVar.f25295d) != (i16 = nVar2.f25295d) && (i15 == 0 || i16 == 0)) || (((i17 = pVar.m) == 0 && i23 == 0 && (nVar.m != nVar2.m || nVar.f25304n != nVar2.f25304n)) || ((i17 == 1 && i23 == 1 && (nVar.f25305o != nVar2.f25305o || nVar.f25306p != nVar2.f25306p)) || (z13 = nVar.f25302k) != nVar2.f25302k || (z13 && nVar.f25303l != nVar2.f25303l)))))) {
                        if (z14) {
                            j13 = oVar3.f25316j;
                            i13 = i11 + ((int) (j11 - j13));
                            j14 = oVar3.f25322q;
                            if (j14 != -9223372036854775807L) {
                                j15 = oVar3.f25321p;
                                if (j13 != j15) {
                                    oVar3.f25307a.d(j14, oVar3.f25323r ? 1 : 0, (int) (j13 - j15), i13, null);
                                }
                            }
                        }
                        oVar3.f25321p = oVar3.f25316j;
                        oVar3.f25322q = oVar3.f25318l;
                        oVar3.f25323r = false;
                        oVar3.f25320o = true;
                    }
                } else {
                    if (z14) {
                        j13 = oVar3.f25316j;
                        i13 = i11 + ((int) (j11 - j13));
                        j14 = oVar3.f25322q;
                        if (j14 != -9223372036854775807L) {
                            j15 = oVar3.f25321p;
                            if (j13 != j15) {
                                oVar3.f25307a.d(j14, oVar3.f25323r ? 1 : 0, (int) (j13 - j15), i13, null);
                            }
                        }
                    }
                    oVar3.f25321p = oVar3.f25316j;
                    oVar3.f25322q = oVar3.f25318l;
                    oVar3.f25323r = false;
                    oVar3.f25320o = true;
                }
            }
        }
        if (oVar3.f25308b) {
            n nVar3 = oVar3.f25319n;
            z11 = nVar3.f25293b && ((i14 = nVar3.f25296e) == 7 || i14 == 2);
        } else {
            z11 = oVar3.f25324s;
        }
        boolean z15 = oVar3.f25323r;
        int i24 = oVar3.f25315i;
        if (i24 == 5) {
            z12 = true;
        } else if (z11) {
            z12 = true;
            if (i24 != 1) {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        boolean z16 = z15 | z12;
        oVar3.f25323r = z16;
        oVar3.f25315i = 24;
        if (z16) {
            this.f25337n = false;
        }
    }

    @Override // e9.h
    public final void c(b7.w wVar) {
        int i11;
        b7.a.k(this.f25334j);
        String str = b7.f0.f3975a;
        int i12 = wVar.f4040b;
        int i13 = wVar.f4041c;
        byte[] bArr = wVar.f4039a;
        this.f25331g += (long) wVar.a();
        this.f25334j.a(wVar, wVar.a(), 0);
        while (true) {
            int iB = c7.q.b(bArr, i12, i13, this.f25332h);
            if (iB == i13) {
                g(bArr, i12, i13);
                return;
            }
            int i14 = bArr[iB + 3] & 31;
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
            long j11 = this.f25331g - ((long) i18);
            b(i18, i17 < 0 ? -i17 : 0, j11, this.m);
            h(j11, i14, this.m);
            i12 = i15 + i16;
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25333i = (String) bVar.f3850e;
        bVar.j();
        x7.e0 e0VarV = oVar.v(bVar.f3848c, 2);
        this.f25334j = e0VarV;
        this.f25335k = new o(e0VarV, this.f25326b, this.f25327c);
        this.f25325a.J(oVar, bVar);
    }

    @Override // e9.h
    public final void e(boolean z11) {
        b7.a.k(this.f25334j);
        String str = b7.f0.f3975a;
        if (z11) {
            ((b7.c) this.f25325a.f44828d).b(0);
            b(0, 0, this.f25331g, this.m);
            h(this.f25331g, 9, this.m);
            b(0, 0, this.f25331g, this.m);
        }
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.m = j11;
        this.f25337n = ((i11 & 2) != 0) | this.f25337n;
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    public final void g(byte[] bArr, int i11, int i12) {
        boolean zH;
        boolean zH2;
        boolean z11;
        boolean z12;
        int iM;
        int i13;
        int iN;
        int iN2;
        int i14;
        int iN3;
        if (!this.f25336l || this.f25335k.f25309c) {
            this.f25328d.a(bArr, i11, i12);
            this.f25329e.a(bArr, i11, i12);
        }
        this.f25330f.a(bArr, i11, i12);
        o oVar = this.f25335k;
        SparseArray sparseArray = oVar.f25311e;
        b7.v vVar = oVar.f25312f;
        if (oVar.f25317k) {
            int i15 = i12 - i11;
            byte[] bArr2 = oVar.f25313g;
            int length = bArr2.length;
            int i16 = oVar.f25314h + i15;
            if (length < i16) {
                oVar.f25313g = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i11, oVar.f25313g, oVar.f25314h, i15);
            int i17 = oVar.f25314h + i15;
            oVar.f25314h = i17;
            vVar.f4032b = oVar.f25313g;
            vVar.f4034d = 0;
            vVar.f4033c = i17;
            vVar.f4035e = 0;
            vVar.a();
            if (vVar.d(8)) {
                vVar.s();
                int i18 = vVar.i(2);
                vVar.t(5);
                if (vVar.e()) {
                    vVar.m();
                    if (vVar.e()) {
                        int iM2 = vVar.m();
                        if (!oVar.f25309c) {
                            oVar.f25317k = false;
                            n nVar = oVar.f25319n;
                            nVar.f25296e = iM2;
                            nVar.f25293b = true;
                            return;
                        }
                        if (vVar.e()) {
                            int iM3 = vVar.m();
                            if (sparseArray.indexOfKey(iM3) < 0) {
                                oVar.f25317k = false;
                                return;
                            }
                            c7.o oVar2 = (c7.o) sparseArray.get(iM3);
                            SparseArray sparseArray2 = oVar.f25310d;
                            int i19 = oVar2.f6689a;
                            boolean z13 = oVar2.f6690b;
                            c7.p pVar = (c7.p) sparseArray2.get(i19);
                            boolean z14 = pVar.f6700j;
                            int i21 = pVar.f6703n;
                            int i22 = pVar.f6702l;
                            if (z14) {
                                if (!vVar.d(2)) {
                                    return;
                                } else {
                                    vVar.t(2);
                                }
                            }
                            if (vVar.d(i22)) {
                                int i23 = vVar.i(i22);
                                if (!pVar.f6701k) {
                                    if (vVar.d(1)) {
                                        zH = vVar.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!vVar.d(1)) {
                                                return;
                                            }
                                            zH2 = vVar.h();
                                            z11 = true;
                                        }
                                        if (oVar.f25315i == 5) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            iM = 0;
                                        } else if (!vVar.e()) {
                                            return;
                                        } else {
                                            iM = vVar.m();
                                        }
                                        i13 = pVar.m;
                                        if (i13 == 0) {
                                            if (i13 == 1 || pVar.f6704o) {
                                                iN = 0;
                                                iN2 = 0;
                                                i14 = 0;
                                            } else {
                                                if (!vVar.e()) {
                                                    return;
                                                }
                                                iN3 = vVar.n();
                                                if (!z13 || zH) {
                                                    iN = 0;
                                                    iN2 = 0;
                                                } else {
                                                    if (!vVar.e()) {
                                                        return;
                                                    }
                                                    iN2 = vVar.n();
                                                    iN = 0;
                                                }
                                                i14 = 0;
                                            }
                                            n nVar2 = oVar.f25319n;
                                            nVar2.f25294c = pVar;
                                            nVar2.f25295d = i18;
                                            nVar2.f25296e = iM2;
                                            nVar2.f25297f = i23;
                                            nVar2.f25298g = iM3;
                                            nVar2.f25299h = zH;
                                            nVar2.f25300i = z11;
                                            nVar2.f25301j = zH2;
                                            nVar2.f25302k = z12;
                                            nVar2.f25303l = iM;
                                            nVar2.m = i14;
                                            nVar2.f25304n = iN;
                                            nVar2.f25305o = iN3;
                                            nVar2.f25306p = iN2;
                                            nVar2.f25292a = true;
                                            nVar2.f25293b = true;
                                            oVar.f25317k = false;
                                        }
                                        if (!vVar.d(i21)) {
                                            return;
                                        }
                                        i14 = vVar.i(i21);
                                        if (z13 || zH) {
                                            iN = 0;
                                        } else if (!vVar.e()) {
                                            return;
                                        } else {
                                            iN = vVar.n();
                                        }
                                        iN2 = 0;
                                        iN3 = 0;
                                        n nVar3 = oVar.f25319n;
                                        nVar3.f25294c = pVar;
                                        nVar3.f25295d = i18;
                                        nVar3.f25296e = iM2;
                                        nVar3.f25297f = i23;
                                        nVar3.f25298g = iM3;
                                        nVar3.f25299h = zH;
                                        nVar3.f25300i = z11;
                                        nVar3.f25301j = zH2;
                                        nVar3.f25302k = z12;
                                        nVar3.f25303l = iM;
                                        nVar3.m = i14;
                                        nVar3.f25304n = iN;
                                        nVar3.f25305o = iN3;
                                        nVar3.f25306p = iN2;
                                        nVar3.f25292a = true;
                                        nVar3.f25293b = true;
                                        oVar.f25317k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z11 = zH2;
                                if (oVar.f25315i == 5) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    iM = 0;
                                } else if (!vVar.e()) {
                                    return;
                                } else {
                                    iM = vVar.m();
                                }
                                i13 = pVar.m;
                                if (i13 == 0) {
                                    if (i13 == 1) {
                                    }
                                    iN = 0;
                                    iN2 = 0;
                                    i14 = 0;
                                } else {
                                    if (!vVar.d(i21)) {
                                        return;
                                    }
                                    i14 = vVar.i(i21);
                                    if (z13) {
                                        iN = 0;
                                    } else {
                                        iN = 0;
                                    }
                                    iN2 = 0;
                                }
                                iN3 = 0;
                                n nVar4 = oVar.f25319n;
                                nVar4.f25294c = pVar;
                                nVar4.f25295d = i18;
                                nVar4.f25296e = iM2;
                                nVar4.f25297f = i23;
                                nVar4.f25298g = iM3;
                                nVar4.f25299h = zH;
                                nVar4.f25300i = z11;
                                nVar4.f25301j = zH2;
                                nVar4.f25302k = z12;
                                nVar4.f25303l = iM;
                                nVar4.m = i14;
                                nVar4.f25304n = iN;
                                nVar4.f25305o = iN3;
                                nVar4.f25306p = iN2;
                                nVar4.f25292a = true;
                                nVar4.f25293b = true;
                                oVar.f25317k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(long j11, int i11, long j12) {
        if (!this.f25336l || this.f25335k.f25309c) {
            this.f25328d.e(i11);
            this.f25329e.e(i11);
        }
        this.f25330f.e(i11);
        o oVar = this.f25335k;
        boolean z11 = this.f25337n;
        oVar.f25315i = i11;
        oVar.f25318l = j12;
        oVar.f25316j = j11;
        oVar.f25324s = z11;
        if (!oVar.f25308b || i11 != 1) {
            if (!oVar.f25309c) {
                return;
            }
            if (i11 != 5 && i11 != 1 && i11 != 2) {
                return;
            }
        }
        n nVar = oVar.m;
        oVar.m = oVar.f25319n;
        oVar.f25319n = nVar;
        nVar.f25293b = false;
        nVar.f25292a = false;
        oVar.f25314h = 0;
        oVar.f25317k = true;
    }
}

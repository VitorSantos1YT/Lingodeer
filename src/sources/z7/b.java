package z7;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import c7.j;
import com.google.common.collect.UnmodifiableListIterator;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import re.g0;
import re.v;
import x7.e0;
import x7.m;
import x7.n;
import x7.o;
import x7.q;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f58987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f58988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f58990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f58992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f58993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f58994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f58995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f58996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f58997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58998l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f58999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f59000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59001p;

    public b(int i11, g0 g0Var) {
        this.f58990d = g0Var;
        this.f58989c = (i11 & 1) == 0;
        this.f58987a = new w(12);
        this.f58988b = new j();
        this.f58992f = new v(13);
        this.f58995i = new e[0];
        this.m = -1L;
        this.f58999n = -1L;
        this.f58998l = -1;
        this.f58994h = -9223372036854775807L;
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        w wVar = this.f58987a;
        nVar.A(wVar.f4039a, 0, 12);
        wVar.I(0);
        if (wVar.l() == 1179011410) {
            wVar.J(4);
            if (wVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f58991e = 0;
        if (this.f58989c) {
            oVar = new bq.f(oVar, this.f58990d);
        }
        this.f58992f = oVar;
        this.f58996j = -1L;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f58996j = -1L;
        this.f58997k = null;
        for (e eVar : this.f58995i) {
            if (eVar.f59021k == 0) {
                eVar.f59019i = 0;
            } else {
                eVar.f59019i = eVar.f59023n[f0.d(eVar.m, j11, true)];
            }
        }
        if (j11 != 0) {
            this.f58991e = 6;
        } else if (this.f58995i.length == 0) {
            this.f58991e = 0;
        } else {
            this.f58991e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0394  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        boolean z11;
        e eVar;
        int i11;
        e eVar2;
        if (this.f58996j != -1) {
            long position = nVar.getPosition();
            long j11 = this.f58996j;
            if (j11 < position || j11 > 262144 + position) {
                bVar.f38845a = j11;
                z11 = true;
            } else {
                nVar.s((int) (j11 - position));
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f58996j = -1L;
        if (z11) {
            return 1;
        }
        int i12 = this.f58991e;
        int i13 = 4;
        e eVar3 = null;
        j jVar = this.f58988b;
        w wVar = this.f58987a;
        switch (i12) {
            case 0:
                if (!c(nVar)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                nVar.s(12);
                this.f58991e = 1;
                return 0;
            case 1:
                nVar.readFully(wVar.f4039a, 0, 12);
                wVar.I(0);
                jVar.getClass();
                jVar.f6660a = wVar.l();
                jVar.f6661b = wVar.l();
                jVar.f6662c = 0;
                if (jVar.f6660a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + jVar.f6660a);
                }
                int iL = wVar.l();
                jVar.f6662c = iL;
                if (iL == 1819436136) {
                    this.f58998l = jVar.f6661b;
                    this.f58991e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + jVar.f6662c);
            case 2:
                int i14 = this.f58998l - 4;
                w wVar2 = new w(i14);
                nVar.readFully(wVar2.f4039a, 0, i14);
                f fVarB = f.b(1819436136, wVar2);
                int i15 = fVarB.f59025b;
                if (i15 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i15);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.f58993g = cVar;
                this.f58994h = ((long) cVar.f59004c) * ((long) cVar.f59002a);
                ArrayList arrayList = new ArrayList();
                UnmodifiableListIterator unmodifiableListIteratorListIterator = fVarB.f59024a.listIterator(0);
                int i16 = 0;
                while (unmodifiableListIteratorListIterator.hasNext()) {
                    a aVar = (a) unmodifiableListIteratorListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i17 = i16 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            b7.a.B("Missing Stream Header");
                        } else if (gVar == null) {
                            b7.a.B("Missing Stream Format");
                        } else {
                            long j12 = dVar.f59008d;
                            long j13 = 1000000 * ((long) dVar.f59006b);
                            long j14 = dVar.f59007c;
                            String str = f0.f3975a;
                            long jR = f0.R(j12, j13, j14, RoundingMode.DOWN);
                            p pVar = gVar.f59026a;
                            y6.o oVarA = pVar.a();
                            oVarA.f57253a = Integer.toString(i16);
                            int i18 = dVar.f59009e;
                            if (i18 != 0) {
                                oVarA.f57265n = i18;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                oVarA.f57254b = hVar.f59027a;
                            }
                            int i19 = d0.i(pVar.f57291n);
                            if (i19 == 1 || i19 == 2) {
                                e0 e0VarV = this.f58992f.v(i16, i19);
                                nv.p.D(oVarA, e0VarV);
                                this.f58994h = Math.max(this.f58994h, jR);
                                eVar = new e(i16, dVar, e0VarV);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i16 = i17;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i16 = i17;
                    }
                }
                this.f58995i = (e[]) arrayList.toArray(new e[0]);
                this.f58992f.o();
                this.f58991e = 3;
                return 0;
            case 3:
                if (this.m != -1) {
                    long position2 = nVar.getPosition();
                    long j15 = this.m;
                    if (position2 != j15) {
                        this.f58996j = j15;
                        return 0;
                    }
                }
                nVar.A(wVar.f4039a, 0, 12);
                nVar.r();
                wVar.I(0);
                jVar.getClass();
                jVar.f6660a = wVar.l();
                jVar.f6661b = wVar.l();
                jVar.f6662c = 0;
                int iL2 = wVar.l();
                int i21 = jVar.f6660a;
                if (i21 == 1179011410) {
                    nVar.s(12);
                    return 0;
                }
                if (i21 != 1414744396 || iL2 != 1769369453) {
                    this.f58996j = nVar.getPosition() + ((long) jVar.f6661b) + 8;
                    return 0;
                }
                long position3 = nVar.getPosition();
                this.m = position3;
                this.f58999n = position3 + ((long) jVar.f6661b) + 8;
                if (!this.f59001p) {
                    c cVar2 = this.f58993g;
                    cVar2.getClass();
                    if ((cVar2.f59003b & 16) == 16) {
                        this.f58991e = 4;
                        this.f58996j = this.f58999n;
                        return 0;
                    }
                    this.f58992f.q(new q(this.f58994h));
                    this.f59001p = true;
                }
                this.f58996j = nVar.getPosition() + 12;
                this.f58991e = 6;
                return 0;
            case 4:
                nVar.readFully(wVar.f4039a, 0, 8);
                wVar.I(0);
                int iL3 = wVar.l();
                int iL4 = wVar.l();
                if (iL3 != 829973609) {
                    this.f58996j = nVar.getPosition() + ((long) iL4);
                    return 0;
                }
                this.f58991e = 5;
                this.f59000o = iL4;
                return 0;
            case 5:
                w wVar3 = new w(this.f59000o);
                nVar.readFully(wVar3.f4039a, 0, this.f59000o);
                long j16 = 0;
                if (wVar3.a() >= 16) {
                    int i22 = wVar3.f4040b;
                    wVar3.J(8);
                    long jL = wVar3.l();
                    long j17 = this.m;
                    j16 = jL <= j17 ? j17 + 8 : 0L;
                    wVar3.I(i22);
                }
                while (wVar3.a() >= 16) {
                    int iL5 = wVar3.l();
                    int iL6 = wVar3.l();
                    long jL2 = ((long) wVar3.l()) + j16;
                    wVar3.J(i13);
                    e[] eVarArr = this.f58995i;
                    int length = eVarArr.length;
                    int i23 = 0;
                    while (true) {
                        if (i23 < length) {
                            eVar2 = eVarArr[i23];
                            if (eVar2.f59013c != iL5 && eVar2.f59014d != iL5) {
                                i23++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        boolean z12 = (iL6 & 16) == 16;
                        if (eVar2.f59022l == -1) {
                            eVar2.f59022l = jL2;
                        }
                        if (z12) {
                            if (eVar2.f59021k == eVar2.f59023n.length) {
                                long[] jArr = eVar2.m;
                                eVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f59023n;
                                eVar2.f59023n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.m;
                            int i24 = eVar2.f59021k;
                            jArr2[i24] = jL2;
                            eVar2.f59023n[i24] = eVar2.f59020j;
                            eVar2.f59021k = i24 + 1;
                        }
                        eVar2.f59020j++;
                    }
                    i13 = 4;
                }
                for (e eVar4 : this.f58995i) {
                    eVar4.m = Arrays.copyOf(eVar4.m, eVar4.f59021k);
                    eVar4.f59023n = Arrays.copyOf(eVar4.f59023n, eVar4.f59021k);
                    if ((eVar4.f59013c & 1651965952) == 1651965952 && eVar4.f59011a.f59010f != 0 && (i11 = eVar4.f59021k) > 0) {
                        eVar4.f59016f = i11;
                    }
                }
                this.f59001p = true;
                if (this.f58995i.length == 0) {
                    this.f58992f.q(new q(this.f58994h));
                } else {
                    this.f58992f.q(new q(this, this.f58994h, 2));
                }
                this.f58991e = 6;
                this.f58996j = this.m;
                return 0;
            case 6:
                if (nVar.getPosition() >= this.f58999n) {
                    return -1;
                }
                e eVar5 = this.f58997k;
                if (eVar5 != null) {
                    int i25 = eVar5.f59018h;
                    int iC = i25 - eVar5.f59012b.c(nVar, i25, false);
                    eVar5.f59018h = iC;
                    boolean z13 = iC == 0;
                    if (z13) {
                        if (eVar5.f59017g > 0) {
                            e0 e0Var = eVar5.f59012b;
                            int i26 = eVar5.f59019i;
                            e0Var.d((eVar5.f59015e * ((long) i26)) / ((long) eVar5.f59016f), Arrays.binarySearch(eVar5.f59023n, i26) >= 0 ? 1 : 0, eVar5.f59017g, 0, null);
                        }
                        eVar5.f59019i++;
                    }
                    if (z13) {
                        this.f58997k = null;
                    }
                    return 0;
                }
                if ((nVar.getPosition() & 1) == 1) {
                    nVar.s(1);
                }
                nVar.A(wVar.f4039a, 0, 12);
                wVar.I(0);
                int iL7 = wVar.l();
                if (iL7 == 1414744396) {
                    wVar.I(8);
                    nVar.s(wVar.l() == 1769369453 ? 12 : 8);
                    nVar.r();
                    return 0;
                }
                int iL8 = wVar.l();
                if (iL7 == 1263424842) {
                    this.f58996j = nVar.getPosition() + ((long) iL8) + 8;
                    return 0;
                }
                nVar.s(8);
                nVar.r();
                for (e eVar6 : this.f58995i) {
                    if (eVar6.f59013c == iL7 || eVar6.f59014d == iL7) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f58996j = nVar.getPosition() + ((long) iL8);
                            return 0;
                        }
                        eVar3.f59017g = iL8;
                        eVar3.f59018h = iL8;
                        this.f58997k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f58996j = nVar.getPosition() + ((long) iL8);
                    return 0;
                }
                eVar3.f59017g = iL8;
                eVar3.f59018h = iL8;
                this.f58997k = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // x7.m
    public final void release() {
    }
}

package xn;

import bp.a0;
import bp.e0;
import bp.z;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d1.d1;
import fr.j3;
import g2.v0;
import h1.k7;
import h1.ua;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.i1;
import j0.o;
import j0.u;
import j0.v1;
import j0.z1;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import n3.p;
import nv.v;
import oz.q;
import sz.xej.iFLeRCXvYCGdPW;
import u3.l;
import w2.q0;
import y2.i;
import y2.j;
import y2.k;
import z1.r;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f56116a = new t1.d(new wr.a(7), false, 1386115643);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f56117b = new t1.d(new qu.a(9), false, -982560119);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f56118c = new t1.d(new qu.a(10), false, 152432704);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f56119d = new t1.d(new qu.a(11), false, -640670077);

    /* JADX WARN: Code duplicated, block: B:102:0x0305  */
    /* JADX WARN: Code duplicated, block: B:105:0x0311  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[PHI: r2
      0x008b: PHI (r2v16 java.util.List) = (r2v13 java.util.List), (r2v18 java.util.List) binds: [B:56:0x0095, B:50:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:91:0x022b A[LOOP:1: B:89:0x0225->B:91:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0274  */
    /* JADX WARN: Code duplicated, block: B:97:0x0290 A[LOOP:2: B:96:0x028e->B:97:0x0290, LOOP_END] */
    public static final void a(String str, r rVar, List list, y0 y0Var, n nVar, int i11, int i12) {
        List list2;
        y0 y0Var2;
        boolean z11;
        s sVar;
        List list3;
        y0 y0Var3;
        x1 x1VarT;
        List list4;
        y0 y0VarA;
        int iHashCode;
        i iVar;
        y2.h hVar;
        int iHashCode2;
        int i13;
        int i14;
        y0 y0Var4;
        StringBuilder sb2;
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        int size;
        int i15;
        Iterator it;
        s sVar2 = (s) nVar;
        sVar2.f0(1655616131);
        int i16 = (i11 & 6) == 0 ? (sVar2.f(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i16 |= sVar2.f(rVar) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 == 0) {
            if ((i11 & 384) == 0) {
                list2 = list;
                i16 |= sVar2.h(list2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    y0Var2 = y0Var;
                    int i18 = sVar2.f(y0Var2) ? 2048 : 1024;
                    i16 |= i18;
                } else {
                    y0Var2 = y0Var;
                }
                i16 |= i18;
            } else {
                y0Var2 = y0Var;
            }
            if ((i16 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i16 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    if (i17 != 0) {
                        list4 = ry.r.f50854a;
                    } else {
                        list4 = list2;
                    }
                    if ((i12 & 8) != 0) {
                        y0VarA = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                    }
                    sVar2.q();
                    r rVarH = d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), r0.f.d(4));
                    q0 q0VarD = o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    r rVarC = z1.a.c(sVar2, rVarH);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar2 = j.f56917f;
                    t.J(hVar2, q0VarD, sVar2);
                    y2.h hVar3 = j.f56916e;
                    t.J(hVar3, q1VarL, sVar2);
                    hVar = j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    y2.h hVar4 = j.f56915d;
                    t.J(hVar4, rVarC, sVar2);
                    float f5 = 6;
                    r rVarB = j0.c.B(e2.e(z1.o.f58481a, 1.0f), f5, f5);
                    u uVarA = j0.t.a(j0.i.f35310h, z1.c.P, sVar2, 54);
                    iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    r rVarC2 = z1.a.c(sVar2, rVarB);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(hVar2, uVarA, sVar2);
                    t.J(hVar3, q1VarL2, sVar2);
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                    }
                    t.J(hVar4, rVarC2, sVar2);
                    sVar2.d0(1753720220);
                    i13 = 0;
                    for (Object obj : q.W0(str, new String[]{"\n"}, 0, 6)) {
                        i14 = i13 + 1;
                        if (i13 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str2 = (String) obj;
                        if (i13 == 0) {
                            sVar2.d0(-1135652440);
                            sVar2.p(false);
                            y0Var4 = y0VarA;
                        } else {
                            sVar2.d0(-1135587495);
                            y0 y0VarA2 = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                            sVar2.p(false);
                            y0Var4 = y0VarA2;
                        }
                        sVar2.d0(1753733995);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        sb2.append(str2);
                        if (i13 == 0) {
                            sVar2.d0(-1713685604);
                            it = list4.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                arrayList.add(new j3.d(iIntValue, iIntValue + 1, 8, new p0(se.i.k(sVar2, R.color.colorAccent), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65534), null));
                            }
                            z12 = false;
                        } else {
                            z12 = false;
                            sVar2.d0(-1777720847);
                        }
                        sVar2.p(z12);
                        String string = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        for (i15 = 0; i15 < size; i15++) {
                            arrayList2.add(((j3.d) arrayList.get(i15)).a(sb2.length()));
                        }
                        j3.h hVar5 = new j3.h(string, arrayList2);
                        sVar2.p(false);
                        s sVar3 = sVar2;
                        ua.c(hVar5, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var4, sVar3, 0, 0, 131070);
                        sVar2 = sVar3;
                        i13 = i14;
                    }
                    sVar = sVar2;
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    y0Var3 = y0VarA;
                    list3 = list4;
                } else {
                    sVar2.W();
                    list4 = list2;
                }
                y0VarA = y0Var2;
                sVar2.q();
                r rVarH2 = d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), r0.f.d(4));
                q0 q0VarD2 = o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                r rVarC3 = z1.a.c(sVar2, rVarH2);
                k.J.getClass();
                iVar = j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                y2.h hVar6 = j.f56917f;
                t.J(hVar6, q0VarD2, sVar2);
                y2.h hVar7 = j.f56916e;
                t.J(hVar7, q1VarL3, sVar2);
                hVar = j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                y2.h hVar8 = j.f56915d;
                t.J(hVar8, rVarC3, sVar2);
                float f11 = 6;
                r rVarB2 = j0.c.B(e2.e(z1.o.f58481a, 1.0f), f11, f11);
                u uVarA2 = j0.t.a(j0.i.f35310h, z1.c.P, sVar2, 54);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL4 = sVar2.l();
                r rVarC4 = z1.a.c(sVar2, rVarB2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, uVarA2, sVar2);
                t.J(hVar7, q1VarL4, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                t.J(hVar8, rVarC4, sVar2);
                sVar2.d0(1753720220);
                i13 = 0;
                while (r3.hasNext()) {
                    i14 = i13 + 1;
                    if (i13 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    String str3 = (String) obj;
                    if (i13 == 0) {
                        sVar2.d0(-1135652440);
                        sVar2.p(false);
                        y0Var4 = y0VarA;
                    } else {
                        sVar2.d0(-1135587495);
                        y0 y0VarA3 = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                        sVar2.p(false);
                        y0Var4 = y0VarA3;
                    }
                    sVar2.d0(1753733995);
                    sb2 = new StringBuilder(16);
                    new ArrayList();
                    arrayList = new ArrayList();
                    new ArrayList();
                    sb2.append(str3);
                    if (i13 == 0) {
                        sVar2.d0(-1713685604);
                        it = list4.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            arrayList.add(new j3.d(iIntValue2, iIntValue2 + 1, 8, new p0(se.i.k(sVar2, R.color.colorAccent), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65534), null));
                        }
                        z12 = false;
                    } else {
                        z12 = false;
                        sVar2.d0(-1777720847);
                    }
                    sVar2.p(z12);
                    String string2 = sb2.toString();
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    while (i15 < size) {
                        arrayList2.add(((j3.d) arrayList.get(i15)).a(sb2.length()));
                    }
                    j3.h hVar9 = new j3.h(string2, arrayList2);
                    sVar2.p(false);
                    s sVar4 = sVar2;
                    ua.c(hVar9, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var4, sVar4, 0, 0, 131070);
                    sVar2 = sVar4;
                    i13 = i14;
                }
                sVar = sVar2;
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                y0Var3 = y0VarA;
                list3 = list4;
            } else {
                sVar = sVar2;
                sVar.W();
                list3 = list2;
                y0Var3 = y0Var2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z(i11, i12, y0Var3, str, list3, rVar);
            }
        }
        i16 |= 384;
        list2 = list;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                y0Var2 = y0Var;
                if (sVar2.f(y0Var2)) {
                }
                i16 |= i18;
            } else {
                y0Var2 = y0Var;
            }
            i16 |= i18;
        } else {
            y0Var2 = y0Var;
        }
        if ((i16 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i16 & 1, z11)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    list4 = ry.r.f50854a;
                } else {
                    list4 = list2;
                }
                if ((i12 & 8) != 0) {
                    y0VarA = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                } else {
                    y0VarA = y0Var2;
                }
            } else {
                if (i17 != 0) {
                    list4 = ry.r.f50854a;
                } else {
                    list4 = list2;
                }
                if ((i12 & 8) != 0) {
                    y0VarA = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                } else {
                    y0VarA = y0Var2;
                }
            }
            sVar2.q();
            r rVarH3 = d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), r0.f.d(4));
            q0 q0VarD3 = o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL5 = sVar2.l();
            r rVarC5 = z1.a.c(sVar2, rVarH3);
            k.J.getClass();
            iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar10 = j.f56917f;
            t.J(hVar10, q0VarD3, sVar2);
            y2.h hVar11 = j.f56916e;
            t.J(hVar11, q1VarL5, sVar2);
            hVar = j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            y2.h hVar12 = j.f56915d;
            t.J(hVar12, rVarC5, sVar2);
            float f12 = 6;
            r rVarB3 = j0.c.B(e2.e(z1.o.f58481a, 1.0f), f12, f12);
            u uVarA3 = j0.t.a(j0.i.f35310h, z1.c.P, sVar2, 54);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL6 = sVar2.l();
            r rVarC6 = z1.a.c(sVar2, rVarB3);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar10, uVarA3, sVar2);
            t.J(hVar11, q1VarL6, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            }
            t.J(hVar12, rVarC6, sVar2);
            sVar2.d0(1753720220);
            i13 = 0;
            while (r3.hasNext()) {
                i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str4 = (String) obj;
                if (i13 == 0) {
                    sVar2.d0(-1135652440);
                    sVar2.p(false);
                    y0Var4 = y0VarA;
                } else {
                    sVar2.d0(-1135587495);
                    y0 y0VarA4 = y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                    sVar2.p(false);
                    y0Var4 = y0VarA4;
                }
                sVar2.d0(1753733995);
                sb2 = new StringBuilder(16);
                new ArrayList();
                arrayList = new ArrayList();
                new ArrayList();
                sb2.append(str4);
                if (i13 == 0) {
                    sVar2.d0(-1713685604);
                    it = list4.iterator();
                    while (it.hasNext()) {
                        int iIntValue3 = ((Number) it.next()).intValue();
                        arrayList.add(new j3.d(iIntValue3, iIntValue3 + 1, 8, new p0(se.i.k(sVar2, R.color.colorAccent), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65534), null));
                    }
                    z12 = false;
                } else {
                    z12 = false;
                    sVar2.d0(-1777720847);
                }
                sVar2.p(z12);
                String string3 = sb2.toString();
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i15 < size) {
                    arrayList2.add(((j3.d) arrayList.get(i15)).a(sb2.length()));
                }
                j3.h hVar13 = new j3.h(string3, arrayList2);
                sVar2.p(false);
                s sVar5 = sVar2;
                ua.c(hVar13, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var4, sVar5, 0, 0, 131070);
                sVar2 = sVar5;
                i13 = i14;
            }
            sVar = sVar2;
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
            y0Var3 = y0VarA;
            list3 = list4;
        } else {
            sVar = sVar2;
            sVar.W();
            list3 = list2;
            y0Var3 = y0Var2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(i11, i12, y0Var3, str, list3, rVar);
        }
    }

    public static final void b(fz.c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1832553003);
        int i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                List listW0 = q.W0("A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z", new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                sVar.o0(arrayList);
                objQ = arrayList;
            }
            List list = (List) objQ;
            m0.b bVar = new m0.b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            boolean zH = sVar.h(list) | ((i12 & 14) == 4);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new pr.a(2, cVar, list);
                sVar.o0(objQ2);
            }
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (fz.c) objQ2, sVar, 0, 1014);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar, i11, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:35:0x013d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0158  */
    /* JADX WARN: Code duplicated, block: B:44:0x0177  */
    /* JADX WARN: Code duplicated, block: B:47:0x0183  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x020d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0215  */
    /* JADX WARN: Code duplicated, block: B:64:0x023c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0240  */
    /* JADX WARN: Code duplicated, block: B:70:0x0261  */
    /* JADX WARN: Code duplicated, block: B:73:0x0278  */
    /* JADX WARN: Code duplicated, block: B:74:0x027a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0283  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b0  */
    public static final void c(fz.c cVar, n nVar, int i11) {
        Integer num;
        int iHashCode;
        float f5;
        List listL;
        int i12;
        int i13;
        int iHashCode2;
        i iVar;
        y2.h hVar;
        int i14;
        boolean z11;
        Object objQ;
        boolean z12;
        Object objQ2;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(1556912853);
        int i15 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i15 & 1, (i15 & 3) != 2)) {
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_7);
            String strE1 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_8);
            String strE2 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_9);
            String strE3 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_10);
            String strE4 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_90);
            int i16 = 4;
            StringBuilder sbS = defpackage.e.s("a\nolá\n", strE0, "\ne\ncafé\n", strE1, "\ni\nvida\n");
            com.google.android.material.datepicker.d.w(sbS, strE2, "\no\navó\n", strE3, "\nu\numa\n");
            sbS.append(strE4);
            String string = sbS.toString();
            Object objQ3 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ3 == gVar) {
                List listW0 = q.W0(string, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ3 = ry.m.g1(arrayList, 3, 3);
                sVar.o0(objQ3);
            }
            List list = (List) objQ3;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = j.f56918g;
            if (sVar.S) {
                num = 2;
            } else {
                num = 2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                y2.h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_4), sVar, 0);
                float f11 = 8;
                j0.c.g(sVar, e2.g(oVar, f11));
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                String strE5 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
                float f12 = 1;
                r rVarA = j0.c.A(oVar, f12);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                float f13 = 42;
                m(0, strE5, sVar, e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f13));
                String strE6 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_6);
                r rVarA2 = j0.c.A(oVar, f12);
                if (2.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (2.0f > Float.MAX_VALUE) {
                    f5 = Float.MAX_VALUE;
                } else {
                    f5 = 2.0f;
                }
                m(0, strE6, sVar, e2.g(rVarA2.i(new i1(f5, true)), f13));
                sVar.p(true);
                listL = ns.o.L(ns.o.K(num), ns.o.K(3), ns.o.K(1), ns.o.K(num), ns.o.K(0));
                sVar.d0(872570841);
                i12 = 0;
                for (Object obj2 : list) {
                    i13 = i12 + 1;
                    if (i12 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list2 = (List) obj2;
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, oVar);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    z1.i iVar4 = iVar2;
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    t.J(j.f56915d, rVarC3, sVar);
                    String str = (String) list2.get(0);
                    i14 = i15 & 14;
                    if (i14 == i16) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objQ = sVar.Q();
                    if (z11 || objQ == gVar) {
                        objQ = new uu.b(cVar, 13);
                        sVar.o0(objQ);
                    }
                    k(str, (fz.c) objQ, sVar, 6);
                    List listSubList = list2.subList(1, list2.size());
                    List list3 = (List) listL.get(i12);
                    if (i14 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12 || objQ2 == gVar) {
                        objQ2 = new uu.b(cVar, 14);
                        sVar.o0(objQ2);
                    }
                    l(listSubList, list3, (fz.c) objQ2, sVar, 3078);
                    sVar.p(true);
                    i16 = 4;
                    iVar2 = iVar4;
                    i12 = i13;
                }
                sVar.p(false);
                j0.c.g(sVar, e2.g(oVar, f11));
                sVar.p(true);
            }
            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            y2.h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_4), sVar, 0);
            float f14 = 8;
            j0.c.g(sVar, e2.g(oVar, f14));
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC4, sVar);
            String strE7 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f15 = 1;
            r rVarA3 = j0.c.A(oVar, f15);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f16 = 42;
            m(0, strE7, sVar, e2.g(rVarA3.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f16));
            String strE8 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_6);
            r rVarA4 = j0.c.A(oVar, f15);
            if (2.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            if (2.0f > Float.MAX_VALUE) {
                f5 = Float.MAX_VALUE;
            } else {
                f5 = 2.0f;
            }
            m(0, strE8, sVar, e2.g(rVarA4.i(new i1(f5, true)), f16));
            sVar.p(true);
            listL = ns.o.L(ns.o.K(num), ns.o.K(3), ns.o.K(1), ns.o.K(num), ns.o.K(0));
            sVar.d0(872570841);
            i12 = 0;
            while (r3.hasNext()) {
                i13 = i12 + 1;
                if (i12 >= 0) {
                    ns.o.V();
                    throw null;
                }
                List list4 = (List) obj2;
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, oVar);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                z1.i iVar5 = iVar2;
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                t.J(j.f56915d, rVarC5, sVar);
                String str2 = (String) list4.get(0);
                i14 = i15 & 14;
                if (i14 == i16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (z11) {
                    objQ = new uu.b(cVar, 13);
                    sVar.o0(objQ);
                } else {
                    objQ = new uu.b(cVar, 13);
                    sVar.o0(objQ);
                }
                k(str2, (fz.c) objQ, sVar, 6);
                List listSubList2 = list4.subList(1, list4.size());
                List list5 = (List) listL.get(i12);
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ2 = sVar.Q();
                if (z12) {
                    objQ2 = new uu.b(cVar, 14);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new uu.b(cVar, 14);
                    sVar.o0(objQ2);
                }
                l(listSubList2, list5, (fz.c) objQ2, sVar, 3078);
                sVar.p(true);
                i16 = 4;
                iVar2 = iVar5;
                i12 = i13;
            }
            sVar.p(false);
            j0.c.g(sVar, e2.g(oVar, f14));
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar, i11, 29);
        }
    }

    public static final void d(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(624469021);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e0(str, i11, 29);
        }
    }

    public static final void e(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(-977665829);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_69), sVar, 0);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_70), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_71), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_72), sVar, 0);
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 1.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_13), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 1.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            o("e", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_73), ub.a.e0(sVar, R.string.pt_alp_new_section_content_74), ub.a.e0(sVar, R.string.pt_alp_new_section_content_75)), ns.o.K("[i]"), ns.o.L(ep.a.e("estudo\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_76)), ep.a.e("saúde\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_77)), ep.a.e("óleo\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_78))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.K(4), ns.o.K(2))), cVar2, sVar, i13);
            cVar2 = cVar;
            o("o", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_79), ub.a.e0(sVar, R.string.pt_alp_new_section_content_80)), ns.o.K("[u]"), ns.o.L(ep.a.e("amigo\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_81)), ep.a.e("motivo\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_82))))), ns.o.K(ns.o.L(ns.o.K(4), ns.o.K(1))), cVar2, sVar, i13);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 20);
        }
    }

    public static final void f(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(153120796);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_83), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_84), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_85);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 2.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            n("ã、am、an", ns.o.K(ns.o.L(ns.o.K("[ã]"), ns.o.K("irmã\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_86)))), ns.o.K(ns.o.K(ns.o.K(3))), cVar, sVar, i13);
            n("em、en", ns.o.K(ns.o.L(ns.o.K("[ẽ]"), ns.o.K("bem\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_87)))), ns.o.K(ns.o.K(ns.o.L(1, 2))), cVar, sVar, i13);
            n("im、in", ns.o.K(ns.o.L(ns.o.K("[ĩ]"), ns.o.K("fim\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_88)))), ns.o.K(ns.o.K(ns.o.L(1, 2))), cVar, sVar, i13);
            n("om、on", ns.o.K(ns.o.L(ns.o.K("[õ]"), ns.o.K("bom\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_89)))), ns.o.K(ns.o.K(ns.o.L(1, 2))), cVar, sVar, i13);
            cVar2 = cVar;
            n("um、un", ns.o.K(ns.o.L(ns.o.K("[ũ]"), ns.o.K("um\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_90)))), ns.o.K(ns.o.K(ns.o.L(0, 1))), cVar2, sVar, i13);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_91), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 25);
        }
    }

    public static final void g(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(1283907421);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_92), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_93), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_94), sVar, 0);
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_85);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 2.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            n("ch", ns.o.K(ns.o.L(ns.o.K("[ʃ]"), ns.o.K("chá\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_95)))), ns.o.K(ns.o.K(ns.o.L(0, 1))), cVar2, sVar, i13);
            n("nh", ns.o.K(ns.o.L(ns.o.K("[ɲ]"), ns.o.K("minha\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_96)))), ns.o.K(ns.o.K(ns.o.L(2, 3))), cVar, sVar, i13);
            cVar2 = cVar;
            n("lh", ns.o.K(ns.o.L(ns.o.K("[ʎ]"), ns.o.K("trabalham\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_97)))), ns.o.K(ns.o.K(ns.o.L(5, 6))), cVar2, sVar, i13);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 28);
        }
    }

    public static final void h(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(-1880273250);
        int i12 = i11 | (sVar.h(cVar2) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_98), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_85);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 1.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_13), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 1.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            o("gu", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_99), ub.a.e0(sVar, R.string.pt_alp_new_section_content_100)), ns.o.L("[g]", "[gw]"), ns.o.L(ep.a.e("niguém\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_101)), ep.a.e("igual\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_102))))), ns.o.K(ns.o.L(ns.o.L(2, 3), ns.o.L(1, 2))), cVar, sVar, i13);
            cVar2 = cVar;
            o("qu", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_103), ub.a.e0(sVar, R.string.pt_alp_new_section_content_104)), ns.o.L("[k]*", "[kw]*"), ns.o.L(ep.a.e("quente\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_105)), ep.a.e("qual\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_106))))), ns.o.K(ns.o.L(ns.o.L(0, 1), ns.o.L(0, 1))), cVar2, sVar, i13);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_107), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 23);
        }
    }

    public static final void i(fz.c cVar, n nVar, int i11) {
        fz.c cVar2;
        fz.c cVar3;
        z1.i iVar = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(-749486625);
        int i12 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            String strU = nv.p.u(defpackage.e.s("´\nolá\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_7), "\n^\nlâmpada\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_111), "\n~\nmaçã\n"), ub.a.e0(sVar, R.string.pt_alp_new_section_content_112), "\n`\nàs 9h\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_113));
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                List listW0 = q.W0(strU, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ = ry.m.g1(arrayList, 3, 3);
                sVar.o0(objQ);
            }
            List list = (List) objQ;
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar2 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_108), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_109), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_110);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f12 = 42;
            m(0, strE0, sVar, e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f12));
            String strE1 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_6);
            r rVarA2 = j0.c.A(oVar, f11);
            if (2.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            m(0, strE1, sVar, e2.g(rVarA2.i(new i1(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), f12));
            sVar.p(true);
            List listL = ns.o.L(ns.o.K(2), ns.o.K(1), ns.o.K(3), ns.o.K(0));
            sVar.d0(-7349048);
            int i13 = 0;
            for (Object obj2 : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                List list2 = (List) obj2;
                a2 a2VarA2 = z1.a(j0.i.f35303a, iVar, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, oVar);
                k.J.getClass();
                i iVar3 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA2, sVar);
                t.J(j.f56916e, q1VarL3, sVar);
                y2.h hVar5 = j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                }
                t.J(j.f56915d, rVarC3, sVar);
                String str = (String) list2.get(0);
                boolean z11 = (i12 & 14) == 4;
                Object objQ2 = sVar.Q();
                if (z11 || objQ2 == gVar) {
                    cVar3 = cVar;
                    objQ2 = new uu.b(cVar3, 8);
                    sVar.o0(objQ2);
                } else {
                    cVar3 = cVar;
                }
                k(str, (fz.c) objQ2, sVar, 6);
                l(list2.subList(1, list2.size()), (List) listL.get(i13), cVar3, sVar, 3078 | ((i12 << 12) & 57344));
                sVar.p(true);
                i13 = i14;
            }
            cVar2 = cVar;
            sVar.p(false);
            j0.c.g(sVar, e2.g(oVar, f5));
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 19);
        }
    }

    public static final void j(String str, fz.c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1670870413);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(j0.c.j(e2.e(j0.c.A(z1.o.f58481a, 1), 1.0f), 1.0f), r0.f.d(4), k7.p(se.i.k(sVar, R.color.white), sVar, 0), k7.q(62, 0), null, t1.e.d(-911504155, new in.d(cVar, str, 5), sVar), sVar, 196614, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(str, cVar, i11, 1);
        }
    }

    public static final void k(String str, fz.c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1685216002);
        int i12 = (sVar.f(str) ? 32 : 16) | i11 | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            r rVarA = j0.c.A(z1.o.f58481a, 1);
            if (1.0f <= 0.0d) {
                k0.a.a(iFLeRCXvYCGdPW.rkjMW);
            }
            float f5 = 0;
            k7.d(e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 72), r0.f.d(f5), k7.p(se.i.k(sVar, R.color.white), sVar, 0), k7.q(62, f5), null, t1.e.d(-1843759120, new in.d(cVar, str, 4), sVar), sVar, 196608, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(str, cVar, i11, 0);
        }
    }

    public static final void l(List list, List list2, fz.c cVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(619671147);
        int i13 = i11 & 6;
        c2 c2Var = c2.f35266a;
        if (i13 == 0) {
            i12 = (sVar.f(c2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(list2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.c(2.0f) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            float f5 = 0;
            k7.d(e2.g(c2Var.a(j0.c.A(z1.o.f58481a, 1), 2.0f), 72), r0.f.d(f5), k7.p(se.i.k(sVar, R.color.white), sVar, 0), k7.q(62, f5), null, t1.e.d(-1219577123, new d(cVar, list, list2, 0), sVar), sVar, 196608, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(list, list2, cVar, i11, 6);
        }
    }

    public static final void m(int i11, String str, n nVar, r rVar) {
        r rVar2;
        s sVar = (s) nVar;
        sVar.f0(-678259099);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 0;
            rVar2 = rVar;
            k7.d(rVar2, r0.f.d(f5), k7.p(se.i.k(sVar, R.color.colorAccent), sVar, 0), k7.q(62, f5), null, t1.e.d(9184947, new a0(str, 14), sVar), sVar, ((i12 >> 3) & 14) | 196608, 16);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar2, i11, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0321  */
    /* JADX WARN: Code duplicated, block: B:103:0x032f  */
    /* JADX WARN: Code duplicated, block: B:107:0x034d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0355  */
    /* JADX WARN: Code duplicated, block: B:111:0x0361  */
    /* JADX WARN: Code duplicated, block: B:119:0x0390  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x043d  */
    /* JADX WARN: Code duplicated, block: B:134:0x046f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0473  */
    /* JADX WARN: Code duplicated, block: B:138:0x0486  */
    /* JADX WARN: Code duplicated, block: B:140:0x0494  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0517  */
    /* JADX WARN: Code duplicated, block: B:163:0x0535  */
    /* JADX WARN: Code duplicated, block: B:164:0x0537  */
    /* JADX WARN: Code duplicated, block: B:167:0x0544 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x054a  */
    /* JADX WARN: Code duplicated, block: B:173:0x056f  */
    /* JADX WARN: Code duplicated, block: B:175:0x057f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0588  */
    /* JADX WARN: Code duplicated, block: B:191:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:89:0x0234  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x030e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0312  */
    public static final void n(String str, List list, List list2, fz.c cVar, n nVar, int i11) {
        List list3;
        v3.c cVar2;
        c2 c2Var;
        l1.g gVar;
        v3.c cVar3;
        z1.i iVar;
        int i12;
        boolean zF;
        Object objQ;
        int iHashCode;
        Iterator itO;
        int i13;
        Object next;
        int i14;
        List list4;
        int iHashCode2;
        i iVar2;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        int i15;
        y2.h hVar4;
        Object objQ2;
        List list5;
        Object objQ3;
        List list6;
        Object objQ4;
        b1 b1Var;
        b1 b1Var2;
        List list7;
        z1.o oVar;
        int iHashCode3;
        Iterator it;
        int i16;
        List list8;
        b1 b1Var3;
        float f5;
        String str2;
        c2 c2Var2;
        float f11;
        Object next2;
        int i17;
        float f12;
        boolean zH;
        Object objQ5;
        boolean zF2;
        Object objQ6;
        int iHashCode4;
        i iVar3;
        y2.h hVar5;
        int i18;
        int i19;
        String str3;
        List list9;
        float f13;
        boolean zH2;
        Object objQ7;
        int i21;
        boolean z11;
        boolean zF3;
        Object objQ8;
        r rVarO;
        int size;
        List list10;
        int i22;
        r rVar;
        List list11;
        z1.i iVar4 = z1.c.L;
        z1.h hVar6 = z1.c.O;
        s sVar = (s) nVar;
        sVar.f0(-1586423805);
        int i23 = (i11 & 6) == 0 ? (sVar.f(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i23 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i23 |= sVar.h(list2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i23 |= sVar.h(cVar) ? 2048 : 1024;
        }
        int i24 = i23;
        if (sVar.T(i24 & 1, (i24 & 1171) != 1170)) {
            v3.c cVar4 = (v3.c) sVar.j(g1.f58547h);
            Object objQ9 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ9 == gVar2) {
                objQ9 = t.B(new v3.f(0));
                sVar.o0(objQ9);
            }
            b1 b1Var4 = (b1) objQ9;
            a2 a2VarA = z1.a(j0.i.f35303a, iVar4, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar2 = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar2);
            k.J.getClass();
            i iVar5 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            y2.h hVar7 = j.f56917f;
            t.J(hVar7, a2VarA, sVar);
            y2.h hVar8 = j.f56916e;
            t.J(hVar8, q1VarL, sVar);
            y2.h hVar9 = j.f56918g;
            if (sVar.S) {
                cVar2 = cVar4;
            } else {
                cVar2 = cVar4;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                }
                y2.h hVar10 = j.f56915d;
                t.J(hVar10, rVarC, sVar);
                c2Var = c2.f35266a;
                gVar = gVar2;
                cVar3 = cVar2;
                iVar = iVar4;
                i12 = i24;
                a(str, e2.i(c2Var.a(oVar2, 2.0f), ((v3.f) b1Var4.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, sVar, i24 & 14, 12);
                r rVarA = c2Var.a(oVar2, 4.0f);
                zF = sVar.f(cVar3);
                objQ = sVar.Q();
                if (zF || objQ == gVar) {
                    objQ = new d1(cVar3, b1Var4, 6);
                    sVar.o0(objQ);
                }
                r rVarM = w2.a0.m(rVarA, (fz.c) objQ);
                u uVarA = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarM);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(hVar7, uVarA, sVar);
                t.J(hVar8, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar9);
                }
                itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, hVar10, -1493471286, list);
                i13 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    list4 = (List) next;
                    z1.i iVar6 = iVar;
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar6, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, oVar2);
                    k.J.getClass();
                    Iterator it2 = itO;
                    iVar2 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    hVar = j.f56917f;
                    t.J(hVar, a2VarA2, sVar);
                    hVar2 = j.f56916e;
                    t.J(hVar2, q1VarL3, sVar);
                    hVar3 = j.f56918g;
                    iVar = iVar6;
                    if (sVar.S) {
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        }
                        hVar4 = j.f56915d;
                        t.J(hVar4, rVarC3, sVar);
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new ArrayList();
                            sVar.o0(objQ2);
                        }
                        list5 = (List) objQ2;
                        objQ3 = sVar.Q();
                        if (objQ3 == gVar) {
                            objQ3 = new ArrayList();
                            sVar.o0(objQ3);
                        }
                        list6 = (List) objQ3;
                        objQ4 = sVar.Q();
                        if (objQ4 == gVar) {
                            objQ4 = t.B(new v3.f(0));
                            sVar.o0(objQ4);
                        }
                        b1Var = (b1) objQ4;
                        if (((List) list4.get(0)).size() == 1 || ((List) list4.get(0)).size() >= ((List) list4.get(1)).size()) {
                            b1Var2 = b1Var;
                            list7 = list6;
                            sVar.d0(1416594201);
                            r rVarA2 = c2Var.a(oVar2, 2.0f);
                            u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                            c2 c2Var3 = c2Var;
                            oVar = oVar2;
                            iHashCode3 = Long.hashCode(sVar.T);
                            q1 q1VarL4 = sVar.l();
                            r rVarC4 = z1.a.c(sVar, rVarA2);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar2);
                            } else {
                                sVar.r0();
                            }
                            t.J(hVar, uVarA2, sVar);
                            t.J(hVar2, q1VarL4, sVar);
                            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                            }
                            t.J(hVar4, rVarC4, sVar);
                            sVar.d0(-1285353242);
                            it = ((Iterable) list4.get(0)).iterator();
                            i16 = 0;
                            while (it.hasNext()) {
                                next2 = it.next();
                                i17 = i16 + 1;
                                if (i16 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                String str4 = (String) next2;
                                if (list5.size() == list7.size() || list7.size() != ((List) list4.get(1)).size() || list5.isEmpty()) {
                                    f12 = 72;
                                } else {
                                    f12 = ((v3.f) list5.get(i16)).f53489a;
                                    float f14 = ((v3.f) list7.get(i16)).f53489a;
                                    if (f12 < f14) {
                                        f12 = f14;
                                    }
                                }
                                zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                                objQ5 = sVar.Q();
                                if (zH || objQ5 == gVar) {
                                    objQ5 = new e(list5, list4, cVar3, 0);
                                    sVar.o0(objQ5);
                                }
                                a(str4, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                                list4 = list4;
                                i16 = i17;
                                list7 = list7;
                                it = it;
                                b1Var2 = b1Var2;
                            }
                            list8 = list4;
                            list6 = list7;
                            b1Var3 = b1Var2;
                            oVar2 = oVar;
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            str2 = null;
                            com.google.android.material.datepicker.d.B(sVar, false, true, false);
                            c2Var2 = c2Var3;
                            f11 = 2.0f;
                        } else {
                            sVar.d0(1415985826);
                            a((String) ry.m.q0((List) list4.get(0)), c2Var.a(e2.g(oVar2, ((v3.f) b1Var.getValue()).f53489a), 2.0f), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            sVar.p(false);
                            str2 = null;
                            c2Var2 = c2Var;
                            b1Var3 = b1Var;
                            f11 = 2.0f;
                            list8 = list4;
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        r rVarA3 = c2Var2.a(oVar2, f11);
                        zF2 = sVar.f(cVar3);
                        objQ6 = sVar.Q();
                        if (zF2 || objQ6 == gVar) {
                            objQ6 = new d1(cVar3, b1Var3, 7);
                            sVar.o0(objQ6);
                        }
                        r rVarM2 = w2.a0.m(rVarA3, (fz.c) objQ6);
                        u uVarA3 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL5 = sVar.l();
                        r rVarC5 = z1.a.c(sVar, rVarM2);
                        k.J.getClass();
                        iVar3 = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA3, sVar);
                        t.J(j.f56916e, q1VarL5, sVar);
                        hVar5 = j.f56918g;
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        }
                        t.J(j.f56915d, rVarC5, sVar);
                        sVar.d0(-965098527);
                        i18 = 0;
                        for (Object obj : (Iterable) list8.get(1)) {
                            i19 = i18 + 1;
                            if (i18 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str3 = (String) obj;
                            if (list5.size() == list6.size() || list6.size() != ((List) list8.get(1)).size() || list5.isEmpty()) {
                                list9 = list6;
                                f13 = 72;
                            } else {
                                float f15 = ((v3.f) list5.get(i18)).f53489a;
                                list9 = list6;
                                float f16 = ((v3.f) list9.get(i18)).f53489a;
                                if (f15 < f16) {
                                    f15 = f16;
                                }
                                f13 = f15;
                            }
                            zH2 = sVar.h(list9) | sVar.h(list8) | sVar.f(cVar3);
                            objQ7 = sVar.Q();
                            if (zH2 || objQ7 == gVar) {
                                objQ7 = new e(list9, list8, cVar3, 1);
                                sVar.o0(objQ7);
                            }
                            r rVarI = e2.i(w2.a0.n(oVar2, (fz.c) objQ7), f13, f5, 2);
                            i21 = i12;
                            list6 = list9;
                            if ((i21 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF3 = z11 | sVar.f(str3);
                            objQ8 = sVar.Q();
                            if (zF3 || objQ8 == gVar) {
                                objQ8 = new in.h(cVar, str3, 24);
                                sVar.o0(objQ8);
                            }
                            z1.h hVar11 = hVar6;
                            l1.g gVar3 = gVar;
                            rVarO = d0.n.o(rVarI, false, str2, (fz.a) objQ8, 15);
                            size = list2.size();
                            list10 = ry.r.f50854a;
                            i22 = i13;
                            if (i22 < size) {
                                list11 = (List) list2.get(i22);
                                rVar = rVarO;
                                if (i18 < list11.size()) {
                                    list10 = (List) list11.get(i18);
                                }
                            } else {
                                rVar = rVarO;
                            }
                            a(str3, rVar, list10, null, sVar, 0, 8);
                            i13 = i22;
                            hVar6 = hVar11;
                            i18 = i19;
                            gVar = gVar3;
                            c2Var2 = c2Var2;
                            str2 = null;
                            i12 = i21;
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        com.google.android.material.datepicker.d.B(sVar, false, true, true);
                        hVar6 = hVar6;
                        i13 = i15;
                        c2Var = c2Var2;
                        i12 = i12;
                        itO = it2;
                    }
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    hVar4 = j.f56915d;
                    t.J(hVar4, rVarC3, sVar);
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new ArrayList();
                        sVar.o0(objQ2);
                    }
                    list5 = (List) objQ2;
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new ArrayList();
                        sVar.o0(objQ3);
                    }
                    list6 = (List) objQ3;
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(new v3.f(0));
                        sVar.o0(objQ4);
                    }
                    b1Var = (b1) objQ4;
                    if (((List) list4.get(0)).size() == 1) {
                        b1Var2 = b1Var;
                        list7 = list6;
                        sVar.d0(1416594201);
                        r rVarA4 = c2Var.a(oVar2, 2.0f);
                        u uVarA4 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                        c2 c2Var4 = c2Var;
                        oVar = oVar2;
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL6 = sVar.l();
                        r rVarC6 = z1.a.c(sVar, rVarA4);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar, uVarA4, sVar);
                        t.J(hVar2, q1VarL6, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        t.J(hVar4, rVarC6, sVar);
                        sVar.d0(-1285353242);
                        it = ((Iterable) list4.get(0)).iterator();
                        i16 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i17 = i16 + 1;
                            if (i16 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str5 = (String) next2;
                            if (list5.size() == list7.size()) {
                                f12 = 72;
                            } else {
                                f12 = 72;
                            }
                            zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                            objQ5 = sVar.Q();
                            if (zH) {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            } else {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            }
                            a(str5, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            list4 = list4;
                            i16 = i17;
                            list7 = list7;
                            it = it;
                            b1Var2 = b1Var2;
                        }
                        list8 = list4;
                        list6 = list7;
                        b1Var3 = b1Var2;
                        oVar2 = oVar;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                        c2Var2 = c2Var4;
                        f11 = 2.0f;
                    } else {
                        b1Var2 = b1Var;
                        list7 = list6;
                        sVar.d0(1416594201);
                        r rVarA5 = c2Var.a(oVar2, 2.0f);
                        u uVarA5 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                        c2 c2Var5 = c2Var;
                        oVar = oVar2;
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL7 = sVar.l();
                        r rVarC7 = z1.a.c(sVar, rVarA5);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar, uVarA5, sVar);
                        t.J(hVar2, q1VarL7, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        t.J(hVar4, rVarC7, sVar);
                        sVar.d0(-1285353242);
                        it = ((Iterable) list4.get(0)).iterator();
                        i16 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i17 = i16 + 1;
                            if (i16 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str6 = (String) next2;
                            if (list5.size() == list7.size()) {
                                f12 = 72;
                            } else {
                                f12 = 72;
                            }
                            zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                            objQ5 = sVar.Q();
                            if (zH) {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            } else {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            }
                            a(str6, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            list4 = list4;
                            i16 = i17;
                            list7 = list7;
                            it = it;
                            b1Var2 = b1Var2;
                        }
                        list8 = list4;
                        list6 = list7;
                        b1Var3 = b1Var2;
                        oVar2 = oVar;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                        c2Var2 = c2Var5;
                        f11 = 2.0f;
                    }
                    r rVarA6 = c2Var2.a(oVar2, f11);
                    zF2 = sVar.f(cVar3);
                    objQ6 = sVar.Q();
                    if (zF2) {
                        objQ6 = new d1(cVar3, b1Var3, 7);
                        sVar.o0(objQ6);
                    } else {
                        objQ6 = new d1(cVar3, b1Var3, 7);
                        sVar.o0(objQ6);
                    }
                    r rVarM3 = w2.a0.m(rVarA6, (fz.c) objQ6);
                    u uVarA6 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL8 = sVar.l();
                    r rVarC8 = z1.a.c(sVar, rVarM3);
                    k.J.getClass();
                    iVar3 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA6, sVar);
                    t.J(j.f56916e, q1VarL8, sVar);
                    hVar5 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    } else {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    }
                    t.J(j.f56915d, rVarC8, sVar);
                    sVar.d0(-965098527);
                    i18 = 0;
                    while (r13.hasNext()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) obj;
                        if (list5.size() == list6.size()) {
                            list9 = list6;
                            f13 = 72;
                        } else {
                            list9 = list6;
                            f13 = 72;
                        }
                        zH2 = sVar.h(list9) | sVar.h(list8) | sVar.f(cVar3);
                        objQ7 = sVar.Q();
                        if (zH2) {
                            objQ7 = new e(list9, list8, cVar3, 1);
                            sVar.o0(objQ7);
                        } else {
                            objQ7 = new e(list9, list8, cVar3, 1);
                            sVar.o0(objQ7);
                        }
                        r rVarI2 = e2.i(w2.a0.n(oVar2, (fz.c) objQ7), f13, f5, 2);
                        i21 = i12;
                        list6 = list9;
                        if ((i21 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF3 = z11 | sVar.f(str3);
                        objQ8 = sVar.Q();
                        if (zF3) {
                            objQ8 = new in.h(cVar, str3, 24);
                            sVar.o0(objQ8);
                        } else {
                            objQ8 = new in.h(cVar, str3, 24);
                            sVar.o0(objQ8);
                        }
                        z1.h hVar12 = hVar6;
                        l1.g gVar4 = gVar;
                        rVarO = d0.n.o(rVarI2, false, str2, (fz.a) objQ8, 15);
                        size = list2.size();
                        list10 = ry.r.f50854a;
                        i22 = i13;
                        if (i22 < size) {
                            list11 = (List) list2.get(i22);
                            rVar = rVarO;
                            if (i18 < list11.size()) {
                                list10 = (List) list11.get(i18);
                            }
                        } else {
                            rVar = rVarO;
                        }
                        a(str3, rVar, list10, null, sVar, 0, 8);
                        i13 = i22;
                        hVar6 = hVar12;
                        i18 = i19;
                        gVar = gVar4;
                        c2Var2 = c2Var2;
                        str2 = null;
                        i12 = i21;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    hVar6 = hVar6;
                    i13 = i15;
                    c2Var = c2Var2;
                    i12 = i12;
                    itO = it2;
                }
                list3 = list2;
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
            }
            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar9);
            y2.h hVar13 = j.f56915d;
            t.J(hVar13, rVarC, sVar);
            c2Var = c2.f35266a;
            gVar = gVar2;
            cVar3 = cVar2;
            iVar = iVar4;
            i12 = i24;
            a(str, e2.i(c2Var.a(oVar2, 2.0f), ((v3.f) b1Var4.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, sVar, i24 & 14, 12);
            r rVarA7 = c2Var.a(oVar2, 4.0f);
            zF = sVar.f(cVar3);
            objQ = sVar.Q();
            if (zF) {
                objQ = new d1(cVar3, b1Var4, 6);
                sVar.o0(objQ);
            } else {
                objQ = new d1(cVar3, b1Var4, 6);
                sVar.o0(objQ);
            }
            r rVarM4 = w2.a0.m(rVarA7, (fz.c) objQ);
            u uVarA7 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL9 = sVar.l();
            r rVarC9 = z1.a.c(sVar, rVarM4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            t.J(hVar7, uVarA7, sVar);
            t.J(hVar8, q1VarL9, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar9);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar9);
            }
            itO = com.google.android.material.datepicker.d.o(sVar, rVarC9, hVar13, -1493471286, list);
            i13 = 0;
            while (itO.hasNext()) {
                next = itO.next();
                i14 = i13 + 1;
                if (i13 >= 0) {
                    ns.o.V();
                    throw null;
                }
                list4 = (List) next;
                z1.i iVar7 = iVar;
                a2 a2VarA3 = z1.a(j0.i.f35303a, iVar7, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL10 = sVar.l();
                r rVarC10 = z1.a.c(sVar, oVar2);
                k.J.getClass();
                Iterator it3 = itO;
                iVar2 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                hVar = j.f56917f;
                t.J(hVar, a2VarA3, sVar);
                hVar2 = j.f56916e;
                t.J(hVar2, q1VarL10, sVar);
                hVar3 = j.f56918g;
                iVar = iVar7;
                if (sVar.S) {
                    i15 = i14;
                    if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    }
                    hVar4 = j.f56915d;
                    t.J(hVar4, rVarC10, sVar);
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new ArrayList();
                        sVar.o0(objQ2);
                    }
                    list5 = (List) objQ2;
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new ArrayList();
                        sVar.o0(objQ3);
                    }
                    list6 = (List) objQ3;
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = t.B(new v3.f(0));
                        sVar.o0(objQ4);
                    }
                    b1Var = (b1) objQ4;
                    if (((List) list4.get(0)).size() == 1) {
                        b1Var2 = b1Var;
                        list7 = list6;
                        sVar.d0(1416594201);
                        r rVarA8 = c2Var.a(oVar2, 2.0f);
                        u uVarA8 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                        c2 c2Var6 = c2Var;
                        oVar = oVar2;
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL11 = sVar.l();
                        r rVarC11 = z1.a.c(sVar, rVarA8);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar, uVarA8, sVar);
                        t.J(hVar2, q1VarL11, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        t.J(hVar4, rVarC11, sVar);
                        sVar.d0(-1285353242);
                        it = ((Iterable) list4.get(0)).iterator();
                        i16 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i17 = i16 + 1;
                            if (i16 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str7 = (String) next2;
                            if (list5.size() == list7.size()) {
                                f12 = 72;
                            } else {
                                f12 = 72;
                            }
                            zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                            objQ5 = sVar.Q();
                            if (zH) {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            } else {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            }
                            a(str7, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            list4 = list4;
                            i16 = i17;
                            list7 = list7;
                            it = it;
                            b1Var2 = b1Var2;
                        }
                        list8 = list4;
                        list6 = list7;
                        b1Var3 = b1Var2;
                        oVar2 = oVar;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                        c2Var2 = c2Var6;
                        f11 = 2.0f;
                    } else {
                        b1Var2 = b1Var;
                        list7 = list6;
                        sVar.d0(1416594201);
                        r rVarA9 = c2Var.a(oVar2, 2.0f);
                        u uVarA9 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                        c2 c2Var7 = c2Var;
                        oVar = oVar2;
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL12 = sVar.l();
                        r rVarC12 = z1.a.c(sVar, rVarA9);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar, uVarA9, sVar);
                        t.J(hVar2, q1VarL12, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        t.J(hVar4, rVarC12, sVar);
                        sVar.d0(-1285353242);
                        it = ((Iterable) list4.get(0)).iterator();
                        i16 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i17 = i16 + 1;
                            if (i16 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str8 = (String) next2;
                            if (list5.size() == list7.size()) {
                                f12 = 72;
                            } else {
                                f12 = 72;
                            }
                            zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                            objQ5 = sVar.Q();
                            if (zH) {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            } else {
                                objQ5 = new e(list5, list4, cVar3, 0);
                                sVar.o0(objQ5);
                            }
                            a(str8, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            list4 = list4;
                            i16 = i17;
                            list7 = list7;
                            it = it;
                            b1Var2 = b1Var2;
                        }
                        list8 = list4;
                        list6 = list7;
                        b1Var3 = b1Var2;
                        oVar2 = oVar;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                        c2Var2 = c2Var7;
                        f11 = 2.0f;
                    }
                    r rVarA10 = c2Var2.a(oVar2, f11);
                    zF2 = sVar.f(cVar3);
                    objQ6 = sVar.Q();
                    if (zF2) {
                        objQ6 = new d1(cVar3, b1Var3, 7);
                        sVar.o0(objQ6);
                    } else {
                        objQ6 = new d1(cVar3, b1Var3, 7);
                        sVar.o0(objQ6);
                    }
                    r rVarM5 = w2.a0.m(rVarA10, (fz.c) objQ6);
                    u uVarA10 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL13 = sVar.l();
                    r rVarC13 = z1.a.c(sVar, rVarM5);
                    k.J.getClass();
                    iVar3 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA10, sVar);
                    t.J(j.f56916e, q1VarL13, sVar);
                    hVar5 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    } else {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    }
                    t.J(j.f56915d, rVarC13, sVar);
                    sVar.d0(-965098527);
                    i18 = 0;
                    while (r13.hasNext()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) obj;
                        if (list5.size() == list6.size()) {
                            list9 = list6;
                            f13 = 72;
                        } else {
                            list9 = list6;
                            f13 = 72;
                        }
                        zH2 = sVar.h(list9) | sVar.h(list8) | sVar.f(cVar3);
                        objQ7 = sVar.Q();
                        if (zH2) {
                            objQ7 = new e(list9, list8, cVar3, 1);
                            sVar.o0(objQ7);
                        } else {
                            objQ7 = new e(list9, list8, cVar3, 1);
                            sVar.o0(objQ7);
                        }
                        r rVarI3 = e2.i(w2.a0.n(oVar2, (fz.c) objQ7), f13, f5, 2);
                        i21 = i12;
                        list6 = list9;
                        if ((i21 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF3 = z11 | sVar.f(str3);
                        objQ8 = sVar.Q();
                        if (zF3) {
                            objQ8 = new in.h(cVar, str3, 24);
                            sVar.o0(objQ8);
                        } else {
                            objQ8 = new in.h(cVar, str3, 24);
                            sVar.o0(objQ8);
                        }
                        z1.h hVar14 = hVar6;
                        l1.g gVar5 = gVar;
                        rVarO = d0.n.o(rVarI3, false, str2, (fz.a) objQ8, 15);
                        size = list2.size();
                        list10 = ry.r.f50854a;
                        i22 = i13;
                        if (i22 < size) {
                            list11 = (List) list2.get(i22);
                            rVar = rVarO;
                            if (i18 < list11.size()) {
                                list10 = (List) list11.get(i18);
                            }
                        } else {
                            rVar = rVarO;
                        }
                        a(str3, rVar, list10, null, sVar, 0, 8);
                        i13 = i22;
                        hVar6 = hVar14;
                        i18 = i19;
                        gVar = gVar5;
                        c2Var2 = c2Var2;
                        str2 = null;
                        i12 = i21;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    hVar6 = hVar6;
                    i13 = i15;
                    c2Var = c2Var2;
                    i12 = i12;
                    itO = it3;
                } else {
                    i15 = i14;
                }
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                hVar4 = j.f56915d;
                t.J(hVar4, rVarC10, sVar);
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new ArrayList();
                    sVar.o0(objQ2);
                }
                list5 = (List) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new ArrayList();
                    sVar.o0(objQ3);
                }
                list6 = (List) objQ3;
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = t.B(new v3.f(0));
                    sVar.o0(objQ4);
                }
                b1Var = (b1) objQ4;
                if (((List) list4.get(0)).size() == 1) {
                    b1Var2 = b1Var;
                    list7 = list6;
                    sVar.d0(1416594201);
                    r rVarA11 = c2Var.a(oVar2, 2.0f);
                    u uVarA11 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                    c2 c2Var8 = c2Var;
                    oVar = oVar2;
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL14 = sVar.l();
                    r rVarC14 = z1.a.c(sVar, rVarA11);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar, uVarA11, sVar);
                    t.J(hVar2, q1VarL14, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    t.J(hVar4, rVarC14, sVar);
                    sVar.d0(-1285353242);
                    it = ((Iterable) list4.get(0)).iterator();
                    i16 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i17 = i16 + 1;
                        if (i16 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str9 = (String) next2;
                        if (list5.size() == list7.size()) {
                            f12 = 72;
                        } else {
                            f12 = 72;
                        }
                        zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                        objQ5 = sVar.Q();
                        if (zH) {
                            objQ5 = new e(list5, list4, cVar3, 0);
                            sVar.o0(objQ5);
                        } else {
                            objQ5 = new e(list5, list4, cVar3, 0);
                            sVar.o0(objQ5);
                        }
                        a(str9, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        list4 = list4;
                        i16 = i17;
                        list7 = list7;
                        it = it;
                        b1Var2 = b1Var2;
                    }
                    list8 = list4;
                    list6 = list7;
                    b1Var3 = b1Var2;
                    oVar2 = oVar;
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    str2 = null;
                    com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    c2Var2 = c2Var8;
                    f11 = 2.0f;
                } else {
                    b1Var2 = b1Var;
                    list7 = list6;
                    sVar.d0(1416594201);
                    r rVarA12 = c2Var.a(oVar2, 2.0f);
                    u uVarA12 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                    c2 c2Var9 = c2Var;
                    oVar = oVar2;
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL15 = sVar.l();
                    r rVarC15 = z1.a.c(sVar, rVarA12);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar, uVarA12, sVar);
                    t.J(hVar2, q1VarL15, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    t.J(hVar4, rVarC15, sVar);
                    sVar.d0(-1285353242);
                    it = ((Iterable) list4.get(0)).iterator();
                    i16 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i17 = i16 + 1;
                        if (i16 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str10 = (String) next2;
                        if (list5.size() == list7.size()) {
                            f12 = 72;
                        } else {
                            f12 = 72;
                        }
                        zH = sVar.h(list5) | sVar.h(list4) | sVar.f(cVar3);
                        objQ5 = sVar.Q();
                        if (zH) {
                            objQ5 = new e(list5, list4, cVar3, 0);
                            sVar.o0(objQ5);
                        } else {
                            objQ5 = new e(list5, list4, cVar3, 0);
                            sVar.o0(objQ5);
                        }
                        a(str10, e2.i(w2.a0.n(oVar, (fz.c) objQ5), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        list4 = list4;
                        i16 = i17;
                        list7 = list7;
                        it = it;
                        b1Var2 = b1Var2;
                    }
                    list8 = list4;
                    list6 = list7;
                    b1Var3 = b1Var2;
                    oVar2 = oVar;
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    str2 = null;
                    com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    c2Var2 = c2Var9;
                    f11 = 2.0f;
                }
                r rVarA13 = c2Var2.a(oVar2, f11);
                zF2 = sVar.f(cVar3);
                objQ6 = sVar.Q();
                if (zF2) {
                    objQ6 = new d1(cVar3, b1Var3, 7);
                    sVar.o0(objQ6);
                } else {
                    objQ6 = new d1(cVar3, b1Var3, 7);
                    sVar.o0(objQ6);
                }
                r rVarM6 = w2.a0.m(rVarA13, (fz.c) objQ6);
                u uVarA13 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
                iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL16 = sVar.l();
                r rVarC16 = z1.a.c(sVar, rVarM6);
                k.J.getClass();
                iVar3 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, uVarA13, sVar);
                t.J(j.f56916e, q1VarL16, sVar);
                hVar5 = j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                } else {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                }
                t.J(j.f56915d, rVarC16, sVar);
                sVar.d0(-965098527);
                i18 = 0;
                while (r13.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str3 = (String) obj;
                    if (list5.size() == list6.size()) {
                        list9 = list6;
                        f13 = 72;
                    } else {
                        list9 = list6;
                        f13 = 72;
                    }
                    zH2 = sVar.h(list9) | sVar.h(list8) | sVar.f(cVar3);
                    objQ7 = sVar.Q();
                    if (zH2) {
                        objQ7 = new e(list9, list8, cVar3, 1);
                        sVar.o0(objQ7);
                    } else {
                        objQ7 = new e(list9, list8, cVar3, 1);
                        sVar.o0(objQ7);
                    }
                    r rVarI4 = e2.i(w2.a0.n(oVar2, (fz.c) objQ7), f13, f5, 2);
                    i21 = i12;
                    list6 = list9;
                    if ((i21 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF3 = z11 | sVar.f(str3);
                    objQ8 = sVar.Q();
                    if (zF3) {
                        objQ8 = new in.h(cVar, str3, 24);
                        sVar.o0(objQ8);
                    } else {
                        objQ8 = new in.h(cVar, str3, 24);
                        sVar.o0(objQ8);
                    }
                    z1.h hVar15 = hVar6;
                    l1.g gVar6 = gVar;
                    rVarO = d0.n.o(rVarI4, false, str2, (fz.a) objQ8, 15);
                    size = list2.size();
                    list10 = ry.r.f50854a;
                    i22 = i13;
                    if (i22 < size) {
                        list11 = (List) list2.get(i22);
                        rVar = rVarO;
                        if (i18 < list11.size()) {
                            list10 = (List) list11.get(i18);
                        }
                    } else {
                        rVar = rVarO;
                    }
                    a(str3, rVar, list10, null, sVar, 0, 8);
                    i13 = i22;
                    hVar6 = hVar15;
                    i18 = i19;
                    gVar = gVar6;
                    c2Var2 = c2Var2;
                    str2 = null;
                    i12 = i21;
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                hVar6 = hVar6;
                i13 = i15;
                c2Var = c2Var2;
                i12 = i12;
                itO = it3;
            }
            list3 = list2;
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
        } else {
            list3 = list2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(str, list, list3, cVar, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:103:0x0266  */
    /* JADX WARN: Code duplicated, block: B:104:0x0277  */
    /* JADX WARN: Code duplicated, block: B:107:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0295  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:123:0x030c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0314  */
    /* JADX WARN: Code duplicated, block: B:127:0x0320  */
    /* JADX WARN: Code duplicated, block: B:134:0x034f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0368  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:148:0x045e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0499  */
    /* JADX WARN: Code duplicated, block: B:151:0x049d  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:156:0x04be  */
    /* JADX WARN: Code duplicated, block: B:160:0x04de  */
    /* JADX WARN: Code duplicated, block: B:162:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:164:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:172:0x0521  */
    /* JADX WARN: Code duplicated, block: B:176:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x053e  */
    /* JADX WARN: Code duplicated, block: B:184:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:185:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:188:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0608  */
    /* JADX WARN: Code duplicated, block: B:194:0x0628  */
    /* JADX WARN: Code duplicated, block: B:196:0x0630  */
    /* JADX WARN: Code duplicated, block: B:198:0x063c  */
    /* JADX WARN: Code duplicated, block: B:206:0x066e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0689 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x068b  */
    /* JADX WARN: Code duplicated, block: B:213:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x06b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x06be  */
    /* JADX WARN: Code duplicated, block: B:223:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:225:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:239:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x06fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x06fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    /* JADX WARN: Code duplicated, block: B:90:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243  */
    public static final void o(String str, List list, List list2, fz.c cVar, n nVar, int i11) {
        y2.h hVar;
        c2 c2Var;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        Object objQ;
        int i14;
        z1.i iVar;
        boolean zF;
        Object objQ2;
        int iHashCode;
        Iterator itO;
        int i15;
        Object next;
        int i16;
        List list3;
        int iHashCode2;
        i iVar2;
        y2.h hVar2;
        int i17;
        Object objQ3;
        List list4;
        Object objQ4;
        List list5;
        Object objQ5;
        int i18;
        Object objQ6;
        b1 b1Var;
        List list6;
        boolean zF2;
        Object objQ7;
        z1.h hVar3;
        int iHashCode3;
        int i19;
        List list7;
        List list8;
        c2 c2Var2;
        float f5;
        z1.h hVar4;
        int iHashCode4;
        i iVar3;
        String str2;
        y2.h hVar5;
        Iterator it;
        int i21;
        List list9;
        c2 c2Var3;
        float f11;
        int i22;
        Object next2;
        int i23;
        float f12;
        float f13;
        List list10;
        boolean zH;
        Object objQ8;
        int iHashCode5;
        i iVar4;
        y2.h hVar6;
        int i24;
        int i25;
        String str3;
        List list11;
        float f14;
        boolean zH2;
        Object objQ9;
        boolean z14;
        boolean zF3;
        Object objQ10;
        int size;
        List list12;
        int i26;
        List list13;
        int i27;
        List list14;
        float f15;
        boolean zH3;
        Object objQ11;
        z1.i iVar5 = z1.c.L;
        z1.h hVar7 = z1.c.O;
        s sVar = (s) nVar;
        sVar.f0(1297964252);
        int i28 = (i11 & 6) == 0 ? (sVar.f(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i28 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i28 |= sVar.h(list2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i28 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.T(i28 & 1, (i28 & 1171) != 1170)) {
            v3.c cVar2 = (v3.c) sVar.j(g1.f58547h);
            Object objQ12 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ12 == gVar) {
                objQ12 = t.B(new v3.f(0));
                sVar.o0(objQ12);
            }
            b1 b1Var2 = (b1) objQ12;
            a2 a2VarA = z1.a(j0.i.f35303a, iVar5, sVar, 0);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            i iVar6 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar6);
            } else {
                sVar.r0();
            }
            y2.h hVar8 = j.f56917f;
            t.J(hVar8, a2VarA, sVar);
            y2.h hVar9 = j.f56916e;
            t.J(hVar9, q1VarL, sVar);
            y2.h hVar10 = j.f56918g;
            if (sVar.S) {
                hVar = hVar8;
            } else {
                hVar = hVar8;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                }
                y2.h hVar11 = j.f56915d;
                t.J(hVar11, rVarC, sVar);
                c2Var = c2.f35266a;
                r rVarI = e2.i(c2Var.a(oVar, 1.0f), ((v3.f) b1Var2.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                i12 = i28 & 7168;
                if (i12 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i13 = i28 & 14;
                if (i13 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | z11;
                objQ = sVar.Q();
                if (z13 || objQ == gVar) {
                    objQ = new in.h(cVar, str, 25);
                    sVar.o0(objQ);
                }
                i14 = i12;
                y2.h hVar12 = hVar;
                iVar = iVar5;
                a(str, d0.n.o(rVarI, false, null, (fz.a) objQ, 15), null, null, sVar, i13, 12);
                r rVarA = c2Var.a(oVar, 5.0f);
                zF = sVar.f(cVar2);
                objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new d1(cVar2, b1Var2, 8);
                    sVar.o0(objQ2);
                }
                r rVarM = w2.a0.m(rVarA, (fz.c) objQ2);
                u uVarA = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarM);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar6);
                } else {
                    sVar.r0();
                }
                t.J(hVar12, uVarA, sVar);
                t.J(hVar9, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar10);
                }
                itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, hVar11, -1852434768, list);
                i15 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    list3 = (List) next;
                    z1.i iVar7 = iVar;
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar7, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, oVar);
                    k.J.getClass();
                    iVar = iVar7;
                    iVar2 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar13 = j.f56917f;
                    t.J(hVar13, a2VarA2, sVar);
                    y2.h hVar14 = j.f56916e;
                    t.J(hVar14, q1VarL3, sVar);
                    hVar2 = j.f56918g;
                    Iterator it2 = itO;
                    if (sVar.S) {
                        i17 = i16;
                    } else {
                        i17 = i16;
                        if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        }
                        y2.h hVar15 = j.f56915d;
                        t.J(hVar15, rVarC3, sVar);
                        objQ3 = sVar.Q();
                        if (objQ3 == gVar) {
                            objQ3 = new ArrayList();
                            sVar.o0(objQ3);
                        }
                        list4 = (List) objQ3;
                        objQ4 = sVar.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new ArrayList();
                            sVar.o0(objQ4);
                        }
                        list5 = (List) objQ4;
                        objQ5 = sVar.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new ArrayList();
                            sVar.o0(objQ5);
                        }
                        List list15 = (List) objQ5;
                        i18 = i15;
                        objQ6 = sVar.Q();
                        if (objQ6 == gVar) {
                            objQ6 = t.B(new v3.f(0));
                            sVar.o0(objQ6);
                        }
                        b1Var = (b1) objQ6;
                        list6 = list15;
                        r rVarA2 = c2Var.a(oVar, 2.0f);
                        zF2 = sVar.f(cVar2);
                        objQ7 = sVar.Q();
                        if (zF2 || objQ7 == gVar) {
                            objQ7 = new d1(cVar2, b1Var, 9);
                            sVar.o0(objQ7);
                        }
                        r rVarM2 = w2.a0.m(rVarA2, (fz.c) objQ7);
                        u uVarA2 = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
                        hVar3 = hVar7;
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL4 = sVar.l();
                        r rVarC4 = z1.a.c(sVar, rVarM2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar13, uVarA2, sVar);
                        t.J(hVar14, q1VarL4, sVar);
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                        }
                        t.J(hVar15, rVarC4, sVar);
                        sVar.d0(381362371);
                        i19 = 0;
                        for (Object obj : (Iterable) list3.get(0)) {
                            i27 = i19 + 1;
                            if (i19 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str4 = (String) obj;
                            if (list4.size() == list6.size() || list4.size() != ((List) list3.get(0)).size() || list4.isEmpty()) {
                                list14 = list6;
                                f15 = 72;
                            } else {
                                f15 = ((v3.f) list4.get(i19)).f53489a;
                                list14 = list6;
                                float f16 = ((v3.f) list14.get(i19)).f53489a;
                                if (f15 < f16) {
                                    f15 = f16;
                                }
                            }
                            zH3 = sVar.h(list4) | sVar.h(list3) | sVar.f(cVar2);
                            objQ11 = sVar.Q();
                            if (zH3 || objQ11 == gVar) {
                                objQ11 = new e(list4, list3, cVar2, 2);
                                sVar.o0(objQ11);
                            }
                            list6 = list14;
                            a(str4, e2.i(w2.a0.n(oVar, (fz.c) objQ11), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            list3 = list3;
                            i19 = i27;
                        }
                        list7 = list3;
                        sVar.p(false);
                        sVar.p(true);
                        if (((List) list7.get(1)).size() == 1 || ((List) list7.get(1)).size() >= ((List) list7.get(2)).size()) {
                            list8 = list6;
                            c2Var2 = c2Var;
                            f5 = 0.0f;
                            sVar.d0(2029217875);
                            r rVarA3 = c2Var2.a(oVar, 1.0f);
                            hVar4 = hVar3;
                            u uVarA3 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                            iHashCode4 = Long.hashCode(sVar.T);
                            q1 q1VarL5 = sVar.l();
                            r rVarC5 = z1.a.c(sVar, rVarA3);
                            k.J.getClass();
                            iVar3 = j.f56913b;
                            sVar.h0();
                            str2 = null;
                            if (sVar.S) {
                                sVar.k(iVar3);
                            } else {
                                sVar.r0();
                            }
                            t.J(j.f56917f, uVarA3, sVar);
                            t.J(j.f56916e, q1VarL5, sVar);
                            hVar5 = j.f56918g;
                            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                            }
                            t.J(j.f56915d, rVarC5, sVar);
                            sVar.d0(509579128);
                            it = ((Iterable) list7.get(1)).iterator();
                            i21 = 0;
                            while (it.hasNext()) {
                                next2 = it.next();
                                i23 = i21 + 1;
                                if (i21 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                String str5 = (String) next2;
                                if (list4.size() == list8.size() || list4.size() != ((List) list7.get(0)).size() || list4.isEmpty()) {
                                    f12 = 72;
                                } else {
                                    f13 = ((v3.f) list4.get(i21)).f53489a;
                                    f12 = ((v3.f) list8.get(i21)).f53489a;
                                    if (f13 < f12) {
                                    }
                                    list10 = list5;
                                    zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                                    objQ8 = sVar.Q();
                                    if (zH || objQ8 == gVar) {
                                        objQ8 = new e(list10, list7, cVar2, 3);
                                        sVar.o0(objQ8);
                                    }
                                    a(str5, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                                    c2Var2 = c2Var2;
                                    f5 = 0.0f;
                                    it = it;
                                    i21 = i23;
                                    list8 = list8;
                                    list5 = list10;
                                }
                                f13 = f12;
                                list10 = list5;
                                zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                                objQ8 = sVar.Q();
                                if (zH) {
                                    objQ8 = new e(list10, list7, cVar2, 3);
                                    sVar.o0(objQ8);
                                } else {
                                    objQ8 = new e(list10, list7, cVar2, 3);
                                    sVar.o0(objQ8);
                                }
                                a(str5, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                                c2Var2 = c2Var2;
                                f5 = 0.0f;
                                it = it;
                                i21 = i23;
                                list8 = list8;
                                list5 = list10;
                            }
                            list9 = list8;
                            c2Var3 = c2Var2;
                            f11 = f5;
                            i22 = 0;
                            com.google.android.material.datepicker.d.B(sVar, false, true, false);
                        } else {
                            sVar.d0(2028603703);
                            a((String) ry.m.q0((List) list7.get(1)), c2Var.a(e2.g(oVar, ((v3.f) b1Var.getValue()).f53489a), 1.0f), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            i22 = 0;
                            sVar.p(false);
                            str2 = null;
                            c2Var3 = c2Var;
                            hVar4 = hVar3;
                            f11 = 0.0f;
                            list9 = list6;
                        }
                        r rVarA4 = c2Var3.a(oVar, 2.0f);
                        u uVarA4 = j0.t.a(j0.i.f35305c, hVar4, sVar, i22);
                        iHashCode5 = Long.hashCode(sVar.T);
                        q1 q1VarL6 = sVar.l();
                        r rVarC6 = z1.a.c(sVar, rVarA4);
                        k.J.getClass();
                        iVar4 = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar4);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA4, sVar);
                        t.J(j.f56916e, q1VarL6, sVar);
                        hVar6 = j.f56918g;
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                        }
                        t.J(j.f56915d, rVarC6, sVar);
                        sVar.d0(-257153016);
                        i24 = 0;
                        for (Object obj2 : (Iterable) list7.get(2)) {
                            i25 = i24 + 1;
                            if (i24 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str3 = (String) obj2;
                            if (list4.size() == list9.size() || list4.size() != ((List) list7.get(0)).size() || list4.isEmpty()) {
                                list11 = list9;
                                f14 = 72;
                            } else {
                                float f17 = ((v3.f) list4.get(i24)).f53489a;
                                list11 = list9;
                                float f18 = ((v3.f) list11.get(i24)).f53489a;
                                if (f17 < f18) {
                                    f17 = f18;
                                }
                                f14 = f17;
                            }
                            zH2 = sVar.h(list11) | sVar.h(list7) | sVar.f(cVar2);
                            objQ9 = sVar.Q();
                            if (zH2 || objQ9 == gVar) {
                                objQ9 = new e(list11, list7, cVar2, 4);
                                sVar.o0(objQ9);
                            }
                            r rVarI2 = e2.i(w2.a0.n(oVar, (fz.c) objQ9), f14, f11, 2);
                            i14 = i14;
                            if (i14 == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zF3 = z14 | sVar.f(str3);
                            objQ10 = sVar.Q();
                            if (zF3 || objQ10 == gVar) {
                                objQ10 = new in.h(cVar, str3, 26);
                                sVar.o0(objQ10);
                            }
                            list9 = list11;
                            r rVarO = d0.n.o(rVarI2, false, str2, (fz.a) objQ10, 15);
                            size = list2.size();
                            list12 = ry.r.f50854a;
                            i26 = i18;
                            if (i26 < size) {
                                list13 = (List) list2.get(i26);
                                if (i24 < list13.size()) {
                                    list12 = (List) list13.get(i24);
                                }
                            }
                            i18 = i26;
                            a(str3, rVarO, list12, null, sVar, 0, 8);
                            i24 = i25;
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                            str2 = null;
                        }
                        com.google.android.material.datepicker.d.B(sVar, false, true, true);
                        c2Var = c2Var3;
                        hVar7 = hVar4;
                        itO = it2;
                        i15 = i17;
                    }
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                    y2.h hVar16 = j.f56915d;
                    t.J(hVar16, rVarC3, sVar);
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new ArrayList();
                        sVar.o0(objQ3);
                    }
                    list4 = (List) objQ3;
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new ArrayList();
                        sVar.o0(objQ4);
                    }
                    list5 = (List) objQ4;
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new ArrayList();
                        sVar.o0(objQ5);
                    }
                    List list16 = (List) objQ5;
                    i18 = i15;
                    objQ6 = sVar.Q();
                    if (objQ6 == gVar) {
                        objQ6 = t.B(new v3.f(0));
                        sVar.o0(objQ6);
                    }
                    b1Var = (b1) objQ6;
                    list6 = list16;
                    r rVarA5 = c2Var.a(oVar, 2.0f);
                    zF2 = sVar.f(cVar2);
                    objQ7 = sVar.Q();
                    if (zF2) {
                        objQ7 = new d1(cVar2, b1Var, 9);
                        sVar.o0(objQ7);
                    } else {
                        objQ7 = new d1(cVar2, b1Var, 9);
                        sVar.o0(objQ7);
                    }
                    r rVarM3 = w2.a0.m(rVarA5, (fz.c) objQ7);
                    u uVarA5 = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
                    hVar3 = hVar7;
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL7 = sVar.l();
                    r rVarC7 = z1.a.c(sVar, rVarM3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar13, uVarA5, sVar);
                    t.J(hVar14, q1VarL7, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                    } else {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                    }
                    t.J(hVar16, rVarC7, sVar);
                    sVar.d0(381362371);
                    i19 = 0;
                    while (r8.hasNext()) {
                        i27 = i19 + 1;
                        if (i19 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str6 = (String) obj;
                        if (list4.size() == list6.size()) {
                            list14 = list6;
                            f15 = 72;
                        } else {
                            list14 = list6;
                            f15 = 72;
                        }
                        zH3 = sVar.h(list4) | sVar.h(list3) | sVar.f(cVar2);
                        objQ11 = sVar.Q();
                        if (zH3) {
                            objQ11 = new e(list4, list3, cVar2, 2);
                            sVar.o0(objQ11);
                        } else {
                            objQ11 = new e(list4, list3, cVar2, 2);
                            sVar.o0(objQ11);
                        }
                        list6 = list14;
                        a(str6, e2.i(w2.a0.n(oVar, (fz.c) objQ11), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        list3 = list3;
                        i19 = i27;
                    }
                    list7 = list3;
                    sVar.p(false);
                    sVar.p(true);
                    if (((List) list7.get(1)).size() == 1) {
                        list8 = list6;
                        c2Var2 = c2Var;
                        f5 = 0.0f;
                        sVar.d0(2029217875);
                        r rVarA6 = c2Var2.a(oVar, 1.0f);
                        hVar4 = hVar3;
                        u uVarA6 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL8 = sVar.l();
                        r rVarC8 = z1.a.c(sVar, rVarA6);
                        k.J.getClass();
                        iVar3 = j.f56913b;
                        sVar.h0();
                        str2 = null;
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA6, sVar);
                        t.J(j.f56916e, q1VarL8, sVar);
                        hVar5 = j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        }
                        t.J(j.f56915d, rVarC8, sVar);
                        sVar.d0(509579128);
                        it = ((Iterable) list7.get(1)).iterator();
                        i21 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i23 = i21 + 1;
                            if (i21 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str7 = (String) next2;
                            if (list4.size() == list8.size()) {
                                f12 = 72;
                                f13 = f12;
                            } else {
                                f12 = 72;
                                f13 = f12;
                            }
                            list10 = list5;
                            zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                            objQ8 = sVar.Q();
                            if (zH) {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            }
                            a(str7, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            c2Var2 = c2Var2;
                            f5 = 0.0f;
                            it = it;
                            i21 = i23;
                            list8 = list8;
                            list5 = list10;
                        }
                        list9 = list8;
                        c2Var3 = c2Var2;
                        f11 = f5;
                        i22 = 0;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    } else {
                        list8 = list6;
                        c2Var2 = c2Var;
                        f5 = 0.0f;
                        sVar.d0(2029217875);
                        r rVarA7 = c2Var2.a(oVar, 1.0f);
                        hVar4 = hVar3;
                        u uVarA7 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL9 = sVar.l();
                        r rVarC9 = z1.a.c(sVar, rVarA7);
                        k.J.getClass();
                        iVar3 = j.f56913b;
                        sVar.h0();
                        str2 = null;
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA7, sVar);
                        t.J(j.f56916e, q1VarL9, sVar);
                        hVar5 = j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        }
                        t.J(j.f56915d, rVarC9, sVar);
                        sVar.d0(509579128);
                        it = ((Iterable) list7.get(1)).iterator();
                        i21 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i23 = i21 + 1;
                            if (i21 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str8 = (String) next2;
                            if (list4.size() == list8.size()) {
                                f12 = 72;
                                f13 = f12;
                            } else {
                                f12 = 72;
                                f13 = f12;
                            }
                            list10 = list5;
                            zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                            objQ8 = sVar.Q();
                            if (zH) {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            }
                            a(str8, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            c2Var2 = c2Var2;
                            f5 = 0.0f;
                            it = it;
                            i21 = i23;
                            list8 = list8;
                            list5 = list10;
                        }
                        list9 = list8;
                        c2Var3 = c2Var2;
                        f11 = f5;
                        i22 = 0;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    }
                    r rVarA8 = c2Var3.a(oVar, 2.0f);
                    u uVarA8 = j0.t.a(j0.i.f35305c, hVar4, sVar, i22);
                    iHashCode5 = Long.hashCode(sVar.T);
                    q1 q1VarL10 = sVar.l();
                    r rVarC10 = z1.a.c(sVar, rVarA8);
                    k.J.getClass();
                    iVar4 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA8, sVar);
                    t.J(j.f56916e, q1VarL10, sVar);
                    hVar6 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                    } else {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                    }
                    t.J(j.f56915d, rVarC10, sVar);
                    sVar.d0(-257153016);
                    i24 = 0;
                    while (r13.hasNext()) {
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) obj2;
                        if (list4.size() == list9.size()) {
                            list11 = list9;
                            f14 = 72;
                        } else {
                            list11 = list9;
                            f14 = 72;
                        }
                        zH2 = sVar.h(list11) | sVar.h(list7) | sVar.f(cVar2);
                        objQ9 = sVar.Q();
                        if (zH2) {
                            objQ9 = new e(list11, list7, cVar2, 4);
                            sVar.o0(objQ9);
                        } else {
                            objQ9 = new e(list11, list7, cVar2, 4);
                            sVar.o0(objQ9);
                        }
                        r rVarI3 = e2.i(w2.a0.n(oVar, (fz.c) objQ9), f14, f11, 2);
                        i14 = i14;
                        if (i14 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zF3 = z14 | sVar.f(str3);
                        objQ10 = sVar.Q();
                        if (zF3) {
                            objQ10 = new in.h(cVar, str3, 26);
                            sVar.o0(objQ10);
                        } else {
                            objQ10 = new in.h(cVar, str3, 26);
                            sVar.o0(objQ10);
                        }
                        list9 = list11;
                        r rVarO2 = d0.n.o(rVarI3, false, str2, (fz.a) objQ10, 15);
                        size = list2.size();
                        list12 = ry.r.f50854a;
                        i26 = i18;
                        if (i26 < size) {
                            list13 = (List) list2.get(i26);
                            if (i24 < list13.size()) {
                                list12 = (List) list13.get(i24);
                            }
                        }
                        i18 = i26;
                        a(str3, rVarO2, list12, null, sVar, 0, 8);
                        i24 = i25;
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                    }
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    c2Var = c2Var3;
                    hVar7 = hVar4;
                    itO = it2;
                    i15 = i17;
                }
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
            }
            defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar10);
            y2.h hVar17 = j.f56915d;
            t.J(hVar17, rVarC, sVar);
            c2Var = c2.f35266a;
            r rVarI4 = e2.i(c2Var.a(oVar, 1.0f), ((v3.f) b1Var2.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            i12 = i28 & 7168;
            if (i12 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            i13 = i28 & 14;
            if (i13 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | z11;
            objQ = sVar.Q();
            if (z13) {
                objQ = new in.h(cVar, str, 25);
                sVar.o0(objQ);
            } else {
                objQ = new in.h(cVar, str, 25);
                sVar.o0(objQ);
            }
            i14 = i12;
            y2.h hVar18 = hVar;
            iVar = iVar5;
            a(str, d0.n.o(rVarI4, false, null, (fz.a) objQ, 15), null, null, sVar, i13, 12);
            r rVarA9 = c2Var.a(oVar, 5.0f);
            zF = sVar.f(cVar2);
            objQ2 = sVar.Q();
            if (zF) {
                objQ2 = new d1(cVar2, b1Var2, 8);
                sVar.o0(objQ2);
            } else {
                objQ2 = new d1(cVar2, b1Var2, 8);
                sVar.o0(objQ2);
            }
            r rVarM4 = w2.a0.m(rVarA9, (fz.c) objQ2);
            u uVarA9 = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL11 = sVar.l();
            r rVarC11 = z1.a.c(sVar, rVarM4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar6);
            } else {
                sVar.r0();
            }
            t.J(hVar18, uVarA9, sVar);
            t.J(hVar9, q1VarL11, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar10);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar10);
            }
            itO = com.google.android.material.datepicker.d.o(sVar, rVarC11, hVar17, -1852434768, list);
            i15 = 0;
            while (itO.hasNext()) {
                next = itO.next();
                i16 = i15 + 1;
                if (i15 >= 0) {
                    ns.o.V();
                    throw null;
                }
                list3 = (List) next;
                z1.i iVar8 = iVar;
                a2 a2VarA3 = z1.a(j0.i.f35303a, iVar8, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL12 = sVar.l();
                r rVarC12 = z1.a.c(sVar, oVar);
                k.J.getClass();
                iVar = iVar8;
                iVar2 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                y2.h hVar19 = j.f56917f;
                t.J(hVar19, a2VarA3, sVar);
                y2.h hVar110 = j.f56916e;
                t.J(hVar110, q1VarL12, sVar);
                hVar2 = j.f56918g;
                Iterator it3 = itO;
                if (sVar.S) {
                    i17 = i16;
                    if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    }
                    y2.h hVar111 = j.f56915d;
                    t.J(hVar111, rVarC12, sVar);
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new ArrayList();
                        sVar.o0(objQ3);
                    }
                    list4 = (List) objQ3;
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new ArrayList();
                        sVar.o0(objQ4);
                    }
                    list5 = (List) objQ4;
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new ArrayList();
                        sVar.o0(objQ5);
                    }
                    List list17 = (List) objQ5;
                    i18 = i15;
                    objQ6 = sVar.Q();
                    if (objQ6 == gVar) {
                        objQ6 = t.B(new v3.f(0));
                        sVar.o0(objQ6);
                    }
                    b1Var = (b1) objQ6;
                    list6 = list17;
                    r rVarA10 = c2Var.a(oVar, 2.0f);
                    zF2 = sVar.f(cVar2);
                    objQ7 = sVar.Q();
                    if (zF2) {
                        objQ7 = new d1(cVar2, b1Var, 9);
                        sVar.o0(objQ7);
                    } else {
                        objQ7 = new d1(cVar2, b1Var, 9);
                        sVar.o0(objQ7);
                    }
                    r rVarM5 = w2.a0.m(rVarA10, (fz.c) objQ7);
                    u uVarA10 = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
                    hVar3 = hVar7;
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL13 = sVar.l();
                    r rVarC13 = z1.a.c(sVar, rVarM5);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar19, uVarA10, sVar);
                    t.J(hVar110, q1VarL13, sVar);
                    if (sVar.S) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                    } else {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                    }
                    t.J(hVar111, rVarC13, sVar);
                    sVar.d0(381362371);
                    i19 = 0;
                    while (r8.hasNext()) {
                        i27 = i19 + 1;
                        if (i19 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str9 = (String) obj;
                        if (list4.size() == list6.size()) {
                            list14 = list6;
                            f15 = 72;
                        } else {
                            list14 = list6;
                            f15 = 72;
                        }
                        zH3 = sVar.h(list4) | sVar.h(list3) | sVar.f(cVar2);
                        objQ11 = sVar.Q();
                        if (zH3) {
                            objQ11 = new e(list4, list3, cVar2, 2);
                            sVar.o0(objQ11);
                        } else {
                            objQ11 = new e(list4, list3, cVar2, 2);
                            sVar.o0(objQ11);
                        }
                        list6 = list14;
                        a(str9, e2.i(w2.a0.n(oVar, (fz.c) objQ11), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        list3 = list3;
                        i19 = i27;
                    }
                    list7 = list3;
                    sVar.p(false);
                    sVar.p(true);
                    if (((List) list7.get(1)).size() == 1) {
                        list8 = list6;
                        c2Var2 = c2Var;
                        f5 = 0.0f;
                        sVar.d0(2029217875);
                        r rVarA11 = c2Var2.a(oVar, 1.0f);
                        hVar4 = hVar3;
                        u uVarA11 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL14 = sVar.l();
                        r rVarC14 = z1.a.c(sVar, rVarA11);
                        k.J.getClass();
                        iVar3 = j.f56913b;
                        sVar.h0();
                        str2 = null;
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA11, sVar);
                        t.J(j.f56916e, q1VarL14, sVar);
                        hVar5 = j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        }
                        t.J(j.f56915d, rVarC14, sVar);
                        sVar.d0(509579128);
                        it = ((Iterable) list7.get(1)).iterator();
                        i21 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i23 = i21 + 1;
                            if (i21 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str10 = (String) next2;
                            if (list4.size() == list8.size()) {
                                f12 = 72;
                                f13 = f12;
                            } else {
                                f12 = 72;
                                f13 = f12;
                            }
                            list10 = list5;
                            zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                            objQ8 = sVar.Q();
                            if (zH) {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            }
                            a(str10, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            c2Var2 = c2Var2;
                            f5 = 0.0f;
                            it = it;
                            i21 = i23;
                            list8 = list8;
                            list5 = list10;
                        }
                        list9 = list8;
                        c2Var3 = c2Var2;
                        f11 = f5;
                        i22 = 0;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    } else {
                        list8 = list6;
                        c2Var2 = c2Var;
                        f5 = 0.0f;
                        sVar.d0(2029217875);
                        r rVarA12 = c2Var2.a(oVar, 1.0f);
                        hVar4 = hVar3;
                        u uVarA12 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL15 = sVar.l();
                        r rVarC15 = z1.a.c(sVar, rVarA12);
                        k.J.getClass();
                        iVar3 = j.f56913b;
                        sVar.h0();
                        str2 = null;
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA12, sVar);
                        t.J(j.f56916e, q1VarL15, sVar);
                        hVar5 = j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                        }
                        t.J(j.f56915d, rVarC15, sVar);
                        sVar.d0(509579128);
                        it = ((Iterable) list7.get(1)).iterator();
                        i21 = 0;
                        while (it.hasNext()) {
                            next2 = it.next();
                            i23 = i21 + 1;
                            if (i21 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            String str11 = (String) next2;
                            if (list4.size() == list8.size()) {
                                f12 = 72;
                                f13 = f12;
                            } else {
                                f12 = 72;
                                f13 = f12;
                            }
                            list10 = list5;
                            zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                            objQ8 = sVar.Q();
                            if (zH) {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new e(list10, list7, cVar2, 3);
                                sVar.o0(objQ8);
                            }
                            a(str11, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                            c2Var2 = c2Var2;
                            f5 = 0.0f;
                            it = it;
                            i21 = i23;
                            list8 = list8;
                            list5 = list10;
                        }
                        list9 = list8;
                        c2Var3 = c2Var2;
                        f11 = f5;
                        i22 = 0;
                        com.google.android.material.datepicker.d.B(sVar, false, true, false);
                    }
                    r rVarA13 = c2Var3.a(oVar, 2.0f);
                    u uVarA13 = j0.t.a(j0.i.f35305c, hVar4, sVar, i22);
                    iHashCode5 = Long.hashCode(sVar.T);
                    q1 q1VarL16 = sVar.l();
                    r rVarC16 = z1.a.c(sVar, rVarA13);
                    k.J.getClass();
                    iVar4 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA13, sVar);
                    t.J(j.f56916e, q1VarL16, sVar);
                    hVar6 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                    } else {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                    }
                    t.J(j.f56915d, rVarC16, sVar);
                    sVar.d0(-257153016);
                    i24 = 0;
                    while (r13.hasNext()) {
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) obj2;
                        if (list4.size() == list9.size()) {
                            list11 = list9;
                            f14 = 72;
                        } else {
                            list11 = list9;
                            f14 = 72;
                        }
                        zH2 = sVar.h(list11) | sVar.h(list7) | sVar.f(cVar2);
                        objQ9 = sVar.Q();
                        if (zH2) {
                            objQ9 = new e(list11, list7, cVar2, 4);
                            sVar.o0(objQ9);
                        } else {
                            objQ9 = new e(list11, list7, cVar2, 4);
                            sVar.o0(objQ9);
                        }
                        r rVarI5 = e2.i(w2.a0.n(oVar, (fz.c) objQ9), f14, f11, 2);
                        i14 = i14;
                        if (i14 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zF3 = z14 | sVar.f(str3);
                        objQ10 = sVar.Q();
                        if (zF3) {
                            objQ10 = new in.h(cVar, str3, 26);
                            sVar.o0(objQ10);
                        } else {
                            objQ10 = new in.h(cVar, str3, 26);
                            sVar.o0(objQ10);
                        }
                        list9 = list11;
                        r rVarO3 = d0.n.o(rVarI5, false, str2, (fz.a) objQ10, 15);
                        size = list2.size();
                        list12 = ry.r.f50854a;
                        i26 = i18;
                        if (i26 < size) {
                            list13 = (List) list2.get(i26);
                            if (i24 < list13.size()) {
                                list12 = (List) list13.get(i24);
                            }
                        }
                        i18 = i26;
                        a(str3, rVarO3, list12, null, sVar, 0, 8);
                        i24 = i25;
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str2 = null;
                    }
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    c2Var = c2Var3;
                    hVar7 = hVar4;
                    itO = it3;
                    i15 = i17;
                } else {
                    i17 = i16;
                }
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                y2.h hVar112 = j.f56915d;
                t.J(hVar112, rVarC12, sVar);
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new ArrayList();
                    sVar.o0(objQ3);
                }
                list4 = (List) objQ3;
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new ArrayList();
                    sVar.o0(objQ4);
                }
                list5 = (List) objQ4;
                objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new ArrayList();
                    sVar.o0(objQ5);
                }
                List list18 = (List) objQ5;
                i18 = i15;
                objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = t.B(new v3.f(0));
                    sVar.o0(objQ6);
                }
                b1Var = (b1) objQ6;
                list6 = list18;
                r rVarA14 = c2Var.a(oVar, 2.0f);
                zF2 = sVar.f(cVar2);
                objQ7 = sVar.Q();
                if (zF2) {
                    objQ7 = new d1(cVar2, b1Var, 9);
                    sVar.o0(objQ7);
                } else {
                    objQ7 = new d1(cVar2, b1Var, 9);
                    sVar.o0(objQ7);
                }
                r rVarM6 = w2.a0.m(rVarA14, (fz.c) objQ7);
                u uVarA14 = j0.t.a(j0.i.f35305c, hVar7, sVar, 0);
                hVar3 = hVar7;
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL17 = sVar.l();
                r rVarC17 = z1.a.c(sVar, rVarM6);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                t.J(hVar19, uVarA14, sVar);
                t.J(hVar110, q1VarL17, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                }
                t.J(hVar112, rVarC17, sVar);
                sVar.d0(381362371);
                i19 = 0;
                while (r8.hasNext()) {
                    i27 = i19 + 1;
                    if (i19 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    String str12 = (String) obj;
                    if (list4.size() == list6.size()) {
                        list14 = list6;
                        f15 = 72;
                    } else {
                        list14 = list6;
                        f15 = 72;
                    }
                    zH3 = sVar.h(list4) | sVar.h(list3) | sVar.f(cVar2);
                    objQ11 = sVar.Q();
                    if (zH3) {
                        objQ11 = new e(list4, list3, cVar2, 2);
                        sVar.o0(objQ11);
                    } else {
                        objQ11 = new e(list4, list3, cVar2, 2);
                        sVar.o0(objQ11);
                    }
                    list6 = list14;
                    a(str12, e2.i(w2.a0.n(oVar, (fz.c) objQ11), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                    list3 = list3;
                    i19 = i27;
                }
                list7 = list3;
                sVar.p(false);
                sVar.p(true);
                if (((List) list7.get(1)).size() == 1) {
                    list8 = list6;
                    c2Var2 = c2Var;
                    f5 = 0.0f;
                    sVar.d0(2029217875);
                    r rVarA15 = c2Var2.a(oVar, 1.0f);
                    hVar4 = hVar3;
                    u uVarA15 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL18 = sVar.l();
                    r rVarC18 = z1.a.c(sVar, rVarA15);
                    k.J.getClass();
                    iVar3 = j.f56913b;
                    sVar.h0();
                    str2 = null;
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA15, sVar);
                    t.J(j.f56916e, q1VarL18, sVar);
                    hVar5 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    } else {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    }
                    t.J(j.f56915d, rVarC18, sVar);
                    sVar.d0(509579128);
                    it = ((Iterable) list7.get(1)).iterator();
                    i21 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i23 = i21 + 1;
                        if (i21 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str13 = (String) next2;
                        if (list4.size() == list8.size()) {
                            f12 = 72;
                            f13 = f12;
                        } else {
                            f12 = 72;
                            f13 = f12;
                        }
                        list10 = list5;
                        zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                        objQ8 = sVar.Q();
                        if (zH) {
                            objQ8 = new e(list10, list7, cVar2, 3);
                            sVar.o0(objQ8);
                        } else {
                            objQ8 = new e(list10, list7, cVar2, 3);
                            sVar.o0(objQ8);
                        }
                        a(str13, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        c2Var2 = c2Var2;
                        f5 = 0.0f;
                        it = it;
                        i21 = i23;
                        list8 = list8;
                        list5 = list10;
                    }
                    list9 = list8;
                    c2Var3 = c2Var2;
                    f11 = f5;
                    i22 = 0;
                    com.google.android.material.datepicker.d.B(sVar, false, true, false);
                } else {
                    list8 = list6;
                    c2Var2 = c2Var;
                    f5 = 0.0f;
                    sVar.d0(2029217875);
                    r rVarA16 = c2Var2.a(oVar, 1.0f);
                    hVar4 = hVar3;
                    u uVarA16 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL19 = sVar.l();
                    r rVarC19 = z1.a.c(sVar, rVarA16);
                    k.J.getClass();
                    iVar3 = j.f56913b;
                    sVar.h0();
                    str2 = null;
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA16, sVar);
                    t.J(j.f56916e, q1VarL19, sVar);
                    hVar5 = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    } else {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                    }
                    t.J(j.f56915d, rVarC19, sVar);
                    sVar.d0(509579128);
                    it = ((Iterable) list7.get(1)).iterator();
                    i21 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i23 = i21 + 1;
                        if (i21 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str14 = (String) next2;
                        if (list4.size() == list8.size()) {
                            f12 = 72;
                            f13 = f12;
                        } else {
                            f12 = 72;
                            f13 = f12;
                        }
                        list10 = list5;
                        zH = sVar.h(list10) | sVar.h(list7) | sVar.f(cVar2);
                        objQ8 = sVar.Q();
                        if (zH) {
                            objQ8 = new e(list10, list7, cVar2, 3);
                            sVar.o0(objQ8);
                        } else {
                            objQ8 = new e(list10, list7, cVar2, 3);
                            sVar.o0(objQ8);
                        }
                        a(str14, e2.i(w2.a0.n(oVar, (fz.c) objQ8), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar, 0, 4);
                        c2Var2 = c2Var2;
                        f5 = 0.0f;
                        it = it;
                        i21 = i23;
                        list8 = list8;
                        list5 = list10;
                    }
                    list9 = list8;
                    c2Var3 = c2Var2;
                    f11 = f5;
                    i22 = 0;
                    com.google.android.material.datepicker.d.B(sVar, false, true, false);
                }
                r rVarA17 = c2Var3.a(oVar, 2.0f);
                u uVarA17 = j0.t.a(j0.i.f35305c, hVar4, sVar, i22);
                iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL110 = sVar.l();
                r rVarC110 = z1.a.c(sVar, rVarA17);
                k.J.getClass();
                iVar4 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, uVarA17, sVar);
                t.J(j.f56916e, q1VarL110, sVar);
                hVar6 = j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                } else {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                }
                t.J(j.f56915d, rVarC110, sVar);
                sVar.d0(-257153016);
                i24 = 0;
                while (r13.hasNext()) {
                    i25 = i24 + 1;
                    if (i24 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str3 = (String) obj2;
                    if (list4.size() == list9.size()) {
                        list11 = list9;
                        f14 = 72;
                    } else {
                        list11 = list9;
                        f14 = 72;
                    }
                    zH2 = sVar.h(list11) | sVar.h(list7) | sVar.f(cVar2);
                    objQ9 = sVar.Q();
                    if (zH2) {
                        objQ9 = new e(list11, list7, cVar2, 4);
                        sVar.o0(objQ9);
                    } else {
                        objQ9 = new e(list11, list7, cVar2, 4);
                        sVar.o0(objQ9);
                    }
                    r rVarI6 = e2.i(w2.a0.n(oVar, (fz.c) objQ9), f14, f11, 2);
                    i14 = i14;
                    if (i14 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zF3 = z14 | sVar.f(str3);
                    objQ10 = sVar.Q();
                    if (zF3) {
                        objQ10 = new in.h(cVar, str3, 26);
                        sVar.o0(objQ10);
                    } else {
                        objQ10 = new in.h(cVar, str3, 26);
                        sVar.o0(objQ10);
                    }
                    list9 = list11;
                    r rVarO4 = d0.n.o(rVarI6, false, str2, (fz.a) objQ10, 15);
                    size = list2.size();
                    list12 = ry.r.f50854a;
                    i26 = i18;
                    if (i26 < size) {
                        list13 = (List) list2.get(i26);
                        if (i24 < list13.size()) {
                            list12 = (List) list13.get(i24);
                        }
                    }
                    i18 = i26;
                    a(str3, rVarO4, list12, null, sVar, 0, 8);
                    i24 = i25;
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    str2 = null;
                }
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                c2Var = c2Var3;
                hVar7 = hVar4;
                itO = it3;
                i15 = i17;
            }
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(str, list, list2, cVar, i11, 1);
        }
    }

    public static final void p(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1664773412);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e0(str, i11, 27);
        }
    }

    public static final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1170217218);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e0(str, i11, 28);
        }
    }

    public static final void r(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(371154119);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_11), sVar, 0);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_12), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 1.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_13), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 1.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            o("c", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_15), ub.a.e0(sVar, R.string.pt_alp_new_section_content_16), ub.a.e0(sVar, R.string.pt_alp_new_section_content_17)), ns.o.L("[k]*", "[s]", "[s]"), ns.o.L(ep.a.e("cá\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_18)), ep.a.e("cedo\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_19)), ep.a.e("moça\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_20))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(2))), cVar2, sVar, i13);
            o("g", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_21), ub.a.e0(sVar, R.string.pt_alp_new_section_content_22)), ns.o.L("[g]", "[ʒ]"), ns.o.L(ep.a.e("gosto\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_23)), ep.a.e("gigante\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_24))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.K(0))), cVar, sVar, i13);
            o("h", ns.o.K(ns.o.L(ns.o.K(ub.a.e0(sVar, R.string.pt_alp_new_section_content_25)), ns.o.K(BuildConfig.VERSION_NAME), ns.o.K("hoje\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_26)))), ns.o.K(ns.o.K(ns.o.K(0))), cVar, sVar, i13);
            cVar2 = cVar;
            o("z", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_27), ub.a.e0(sVar, R.string.pt_alp_new_section_content_28)), ns.o.L("[z]", "[s]"), ns.o.L(ep.a.e("zero\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_29)), ep.a.e("dez\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_30))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.K(2))), cVar2, sVar, i13);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_31), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 24);
        }
    }

    public static final void s(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(1501940744);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_32), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_33), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 1.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_13), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 1.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            o("d", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_34), ub.a.e0(sVar, R.string.pt_alp_new_section_content_35)), ns.o.K("[dʒ]"), ns.o.L(ep.a.e("verde\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_36)), ep.a.e("dia\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_37))))), ns.o.K(ns.o.L(ns.o.K(3), ns.o.K(0))), cVar2, sVar, i13);
            cVar2 = cVar;
            o("t", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_34), ub.a.e0(sVar, R.string.pt_alp_new_section_content_35)), ns.o.K("[tʃ]"), ns.o.L(ep.a.e("dente\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_38)), ep.a.e("tio\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_39))))), ns.o.K(ns.o.L(ns.o.K(3), ns.o.K(0))), cVar2, sVar, i13);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_40), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 21);
        }
    }

    public static final void t(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(-1662239927);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_41), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_42), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_43), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_44), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_45), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 2.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = (i12 << 9) & 7168;
            n(ub.a.e0(sVar, R.string.pt_alp_new_section_content_127), ns.o.K(ns.o.L(ns.o.K(ub.a.e0(sVar, R.string.pt_alp_new_section_content_46)), ns.o.L(ep.a.e("rato\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_47)), ep.a.e("carro\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_48))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.L(2, 3))), cVar2, sVar, i13 | 384);
            cVar2 = cVar;
            n("r", ns.o.K(ns.o.L(ns.o.K(ub.a.e0(sVar, R.string.pt_alp_new_section_content_49)), ns.o.K("cara\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_50)))), ns.o.K(ns.o.K(ns.o.K(2))), cVar2, sVar, i13 | 390);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_51), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 18);
        }
    }

    public static final void u(fz.c cVar, n nVar, int i11) {
        fz.c cVar2 = cVar;
        s sVar = (s) nVar;
        sVar.f0(-531453302);
        int i12 = (sVar.h(cVar2) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            p(ub.a.e0(sVar, R.string.pt_alp_new_section_content_52), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_53), sVar, 0);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f11 = 1;
            r rVarA = j0.c.A(oVar, f11);
            c2 c2Var = c2.f35266a;
            float f12 = 42;
            m(0, strE0, sVar, e2.g(c2Var.a(rVarA, 1.0f), f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_13), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_14), sVar, w4.c.q(oVar, f11, c2Var, 1.0f, f12));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f11, c2Var, 2.0f, f12));
            sVar.p(true);
            int i13 = ((i12 << 9) & 7168) | 390;
            o("s", ns.o.L(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_54), ub.a.e0(sVar, R.string.pt_alp_new_section_content_55)), ns.o.K("[s]"), ns.o.L(ep.a.e("sala\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_56)), ep.a.e("lápis\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_57)))), ns.o.L(ns.o.K(ub.a.e0(sVar, R.string.pt_alp_new_section_content_58)), ns.o.K("[z]"), ns.o.K("mesa\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_59))), ns.o.L(ns.o.K(ub.a.e0(sVar, R.string.pt_alp_new_section_content_60)), ns.o.K("[ʒ]"), ns.o.K("mesmo\n" + ub.a.e0(sVar, R.string.pt_alp_new_section_content_61)))), ns.o.L(ns.o.L(ns.o.K(0), ns.o.K(4)), ns.o.K(ns.o.K(2)), ns.o.K(ns.o.K(2))), cVar2, sVar, i13);
            cVar2 = cVar;
            o("x", ns.o.K(ns.o.L(ns.o.L(ub.a.e0(sVar, R.string.pt_alp_new_section_content_62), ub.a.e0(sVar, R.string.pt_alp_new_section_content_63), ub.a.e0(sVar, R.string.pt_alp_new_section_content_64)), ns.o.L("[ʃ]", "[ks]", "[z]"), ns.o.L(ep.a.e("xarope\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_65)), ep.a.e("fênix\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_66)), ep.a.e("exame\n", ub.a.e0(sVar, R.string.pt_alp_new_section_content_67))))), ns.o.K(ns.o.L(ns.o.K(0), ns.o.K(4), ns.o.K(1))), cVar2, sVar, i13);
            j0.c.g(sVar, e2.g(oVar, f5));
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_68), sVar, 0);
            ep.a.C(oVar, f5, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x040f  */
    /* JADX WARN: Code duplicated, block: B:109:0x048b  */
    /* JADX WARN: Code duplicated, block: B:110:0x048f  */
    /* JADX WARN: Code duplicated, block: B:115:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:123:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:124:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0519  */
    /* JADX WARN: Code duplicated, block: B:132:0x052d  */
    /* JADX WARN: Code duplicated, block: B:133:0x052f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0538  */
    /* JADX WARN: Code duplicated, block: B:140:0x055a  */
    /* JADX WARN: Code duplicated, block: B:141:0x055c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0565  */
    /* JADX WARN: Code duplicated, block: B:165:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02db  */
    /* JADX WARN: Code duplicated, block: B:61:0x032c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0330  */
    /* JADX WARN: Code duplicated, block: B:67:0x034b  */
    /* JADX WARN: Code duplicated, block: B:71:0x035f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0367  */
    /* JADX WARN: Code duplicated, block: B:75:0x038c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0390  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:88:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0400  */
    /* JADX WARN: Code duplicated, block: B:97:0x0402  */
    public static final void v(fz.c cVar, n nVar, int i11) {
        fz.c cVar2;
        List list;
        int iHashCode;
        l1.g gVar;
        c2 c2Var;
        int iHashCode2;
        List listL;
        int iHashCode3;
        Iterator itO;
        int i12;
        Throwable th2;
        List listL2;
        int iHashCode4;
        i iVar;
        y2.h hVar;
        Iterator itO2;
        int i13;
        Object next;
        int i14;
        int iHashCode5;
        i iVar2;
        y2.h hVar2;
        int i15;
        boolean z11;
        Object objQ;
        boolean z12;
        Object objQ2;
        Object next2;
        int i16;
        int iHashCode6;
        i iVar3;
        y2.h hVar3;
        int i17;
        boolean z13;
        Object objQ3;
        l1.g gVar2;
        fz.c cVar3;
        boolean z14;
        Object objQ4;
        z1.h hVar4 = z1.c.O;
        z1.i iVar4 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(309754966);
        int i18 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i18 & 1, (i18 & 3) != 2)) {
            String strE0 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_118);
            String strE1 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_120);
            String strE2 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_122);
            String strE3 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_124);
            int i19 = 4;
            String strE4 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_125);
            StringBuilder sbS = defpackage.e.s("b\nboa\n", strE0, "\nd\ndama\n", strE1, "\nf\nficar\n");
            com.google.android.material.datepicker.d.w(sbS, strE2, "\nj\njanela\n", strE3, "\nm\nmala\n");
            sbS.append(strE4);
            String string = sbS.toString();
            String strE5 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_119);
            String strE6 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_121);
            String strE7 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_123);
            String strE8 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_125);
            String strE9 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_126);
            StringBuilder sbS2 = defpackage.e.s("p\nporta\n", strE5, "\nt\ntema\n", strE6, "\nv\nvida\n");
            com.google.android.material.datepicker.d.w(sbS2, strE7, "\nl\nmala\n", strE8, "\nn\nnome\n");
            sbS2.append(strE9);
            String string2 = sbS2.toString();
            Object objQ5 = sVar.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ5 == gVar3) {
                List listW0 = q.W0(string, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ5 = ry.m.g1(arrayList, 3, 3);
                sVar.o0(objQ5);
            }
            List list2 = (List) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar3) {
                List listW1 = q.W0(string2, new String[]{"\n"}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listW1) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                objQ6 = ry.m.g1(arrayList2, 3, 3);
                sVar.o0(objQ6);
            }
            List list3 = (List) objQ6;
            z1.o oVar = z1.o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            j0.d dVar = j0.i.f35305c;
            int i21 = 6;
            u uVarA = j0.t.a(dVar, hVar4, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            i iVar5 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            y2.h hVar5 = j.f56917f;
            t.J(hVar5, uVarA, sVar);
            y2.h hVar6 = j.f56916e;
            t.J(hVar6, q1VarL, sVar);
            y2.h hVar7 = j.f56918g;
            if (!sVar.S) {
                list = list3;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                }
                y2.h hVar8 = j.f56915d;
                t.J(hVar8, rVarC, sVar);
                q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_114), sVar, 0);
                q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_115), sVar, 0);
                d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_116), sVar, 0);
                j0.c.g(sVar, e2.g(oVar, 8));
                j0.b bVar = j0.i.f35303a;
                a2 a2VarA = z1.a(bVar, iVar4, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, oVar);
                sVar.h0();
                gVar = gVar3;
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(hVar5, a2VarA, sVar);
                t.J(hVar6, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar7);
                }
                t.J(hVar8, rVarC2, sVar);
                String strE10 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
                float f5 = 1;
                r rVarA = j0.c.A(oVar, f5);
                c2Var = c2.f35266a;
                float f11 = 42;
                m(0, strE10, sVar, e2.g(c2Var.a(rVarA, 1.0f), f11));
                m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f5, c2Var, 2.0f, f11));
                m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_5), sVar, w4.c.q(oVar, f5, c2Var, 1.0f, f11));
                m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f5, c2Var, 2.0f, f11));
                sVar.p(true);
                ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0));
                a2 a2VarA2 = z1.a(bVar, iVar4, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(hVar5, a2VarA2, sVar);
                t.J(hVar6, q1VarL3, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar7);
                }
                t.J(hVar8, rVarC3, sVar);
                listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                r rVarA2 = c2Var.a(oVar, 1.0f);
                u uVarA2 = j0.t.a(dVar, hVar4, sVar, 0);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, rVarA2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(hVar5, uVarA2, sVar);
                t.J(hVar6, q1VarL4, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar7);
                }
                itO = com.google.android.material.datepicker.d.o(sVar, rVarC4, hVar8, 1219187031, list2);
                i12 = 0;
                while (true) {
                    th2 = null;
                    if (itO.hasNext()) {
                        l1.g gVar4 = gVar;
                        cVar2 = cVar;
                        sVar.p(false);
                        sVar.p(true);
                        listL2 = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0));
                        r rVarA3 = c2Var.a(oVar, 1.0f);
                        u uVarA3 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                        iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL5 = sVar.l();
                        r rVarC5 = z1.a.c(sVar, rVarA3);
                        k.J.getClass();
                        iVar = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, uVarA3, sVar);
                        t.J(j.f56916e, q1VarL5, sVar);
                        hVar = j.f56918g;
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                        }
                        itO2 = com.google.android.material.datepicker.d.o(sVar, rVarC5, j.f56915d, 82154479, list);
                        i13 = 0;
                        while (itO2.hasNext()) {
                            next = itO2.next();
                            i14 = i13 + 1;
                            if (i13 >= 0) {
                                Throwable th3 = th2;
                                ns.o.V();
                                throw th3;
                            }
                            List list4 = (List) next;
                            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar4, sVar, 0);
                            iHashCode5 = Long.hashCode(sVar.T);
                            q1 q1VarL6 = sVar.l();
                            r rVarC6 = z1.a.c(sVar, oVar);
                            k.J.getClass();
                            iVar2 = j.f56913b;
                            sVar.h0();
                            Throwable th4 = th2;
                            if (sVar.S) {
                                sVar.k(iVar2);
                            } else {
                                sVar.r0();
                            }
                            t.J(j.f56917f, a2VarA3, sVar);
                            t.J(j.f56916e, q1VarL6, sVar);
                            hVar2 = j.f56918g;
                            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar2);
                            }
                            t.J(j.f56915d, rVarC6, sVar);
                            String str = (String) list4.get(0);
                            i15 = i18 & 14;
                            if (i15 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objQ = sVar.Q();
                            if (z11 || objQ == gVar4) {
                                objQ = new uu.b(cVar2, 11);
                                sVar.o0(objQ);
                            }
                            k(str, (fz.c) objQ, sVar, 6);
                            List listSubList = list4.subList(1, list4.size());
                            List list5 = (List) listL2.get(i13);
                            if (i15 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12 || objQ2 == gVar4) {
                                objQ2 = new uu.b(cVar2, 12);
                                sVar.o0(objQ2);
                            }
                            l(listSubList, list5, (fz.c) objQ2, sVar, 3078);
                            sVar.p(true);
                            i13 = i14;
                            th2 = th4;
                        }
                        com.google.android.material.datepicker.d.B(sVar, false, true, true);
                        d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_117), sVar, 0);
                        sVar.p(true);
                        break;
                    }
                    next2 = itO.next();
                    i16 = i12 + 1;
                    if (i12 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list6 = (List) next2;
                    a2 a2VarA4 = z1.a(j0.i.f35303a, iVar4, sVar, 0);
                    iHashCode6 = Long.hashCode(sVar.T);
                    q1 q1VarL7 = sVar.l();
                    r rVarC7 = z1.a.c(sVar, oVar);
                    k.J.getClass();
                    iVar3 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA4, sVar);
                    t.J(j.f56916e, q1VarL7, sVar);
                    hVar3 = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar3);
                    }
                    t.J(j.f56915d, rVarC7, sVar);
                    String str2 = (String) list6.get(0);
                    i17 = i18 & 14;
                    if (i17 == i19) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ3 = sVar.Q();
                    if (z13) {
                        gVar2 = gVar;
                    } else {
                        gVar2 = gVar;
                        if (objQ3 == gVar2) {
                            cVar3 = cVar;
                        }
                        k(str2, (fz.c) objQ3, sVar, i21);
                        List listSubList2 = list6.subList(1, list6.size());
                        List list7 = (List) listL.get(i12);
                        if (i17 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ4 = sVar.Q();
                        if (z14 || objQ4 == gVar2) {
                            objQ4 = new uu.b(cVar3, 10);
                            sVar.o0(objQ4);
                        }
                        l(listSubList2, list7, (fz.c) objQ4, sVar, 3078);
                        sVar.p(true);
                        i12 = i16;
                        gVar = gVar2;
                        i19 = 4;
                        i21 = 6;
                    }
                    cVar3 = cVar;
                    objQ3 = new uu.b(cVar3, 9);
                    sVar.o0(objQ3);
                    k(str2, (fz.c) objQ3, sVar, i21);
                    List listSubList3 = list6.subList(1, list6.size());
                    List list8 = (List) listL.get(i12);
                    if (i17 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ4 = sVar.Q();
                    if (z14) {
                        objQ4 = new uu.b(cVar3, 10);
                        sVar.o0(objQ4);
                    } else {
                        objQ4 = new uu.b(cVar3, 10);
                        sVar.o0(objQ4);
                    }
                    l(listSubList3, list8, (fz.c) objQ4, sVar, 3078);
                    sVar.p(true);
                    i12 = i16;
                    gVar = gVar2;
                    i19 = 4;
                    i21 = 6;
                }
            } else {
                list = list3;
            }
            defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar7);
            y2.h hVar9 = j.f56915d;
            t.J(hVar9, rVarC, sVar);
            q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_114), sVar, 0);
            q(ub.a.e0(sVar, R.string.pt_alp_new_section_content_115), sVar, 0);
            d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_116), sVar, 0);
            j0.c.g(sVar, e2.g(oVar, 8));
            j0.b bVar2 = j0.i.f35303a;
            a2 a2VarA5 = z1.a(bVar2, iVar4, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL8 = sVar.l();
            r rVarC8 = z1.a.c(sVar, oVar);
            sVar.h0();
            gVar = gVar3;
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            t.J(hVar5, a2VarA5, sVar);
            t.J(hVar6, q1VarL8, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar7);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar7);
            }
            t.J(hVar9, rVarC8, sVar);
            String strE11 = ub.a.e0(sVar, R.string.pt_alp_new_section_content_5);
            float f12 = 1;
            r rVarA4 = j0.c.A(oVar, f12);
            c2Var = c2.f35266a;
            float f13 = 42;
            m(0, strE11, sVar, e2.g(c2Var.a(rVarA4, 1.0f), f13));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f12, c2Var, 2.0f, f13));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_5), sVar, w4.c.q(oVar, f12, c2Var, 1.0f, f13));
            m(0, ub.a.e0(sVar, R.string.pt_alp_new_section_content_6), sVar, w4.c.q(oVar, f12, c2Var, 2.0f, f13));
            sVar.p(true);
            ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0));
            a2 a2VarA6 = z1.a(bVar2, iVar4, sVar, 0);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL9 = sVar.l();
            r rVarC9 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            t.J(hVar5, a2VarA6, sVar);
            t.J(hVar6, q1VarL9, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar7);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar7);
            }
            t.J(hVar9, rVarC9, sVar);
            listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
            r rVarA5 = c2Var.a(oVar, 1.0f);
            u uVarA4 = j0.t.a(dVar, hVar4, sVar, 0);
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL10 = sVar.l();
            r rVarC10 = z1.a.c(sVar, rVarA5);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar5);
            } else {
                sVar.r0();
            }
            t.J(hVar5, uVarA4, sVar);
            t.J(hVar6, q1VarL10, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar7);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar7);
            }
            itO = com.google.android.material.datepicker.d.o(sVar, rVarC10, hVar9, 1219187031, list2);
            i12 = 0;
            while (true) {
                th2 = null;
                if (itO.hasNext()) {
                    l1.g gVar5 = gVar;
                    cVar2 = cVar;
                    sVar.p(false);
                    sVar.p(true);
                    listL2 = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0));
                    r rVarA6 = c2Var.a(oVar, 1.0f);
                    u uVarA5 = j0.t.a(j0.i.f35305c, hVar4, sVar, 0);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL11 = sVar.l();
                    r rVarC11 = z1.a.c(sVar, rVarA6);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, uVarA5, sVar);
                    t.J(j.f56916e, q1VarL11, sVar);
                    hVar = j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                    } else {
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                    }
                    itO2 = com.google.android.material.datepicker.d.o(sVar, rVarC11, j.f56915d, 82154479, list);
                    i13 = 0;
                    while (itO2.hasNext()) {
                        next = itO2.next();
                        i14 = i13 + 1;
                        if (i13 >= 0) {
                            Throwable th5 = th2;
                            ns.o.V();
                            throw th5;
                        }
                        List list9 = (List) next;
                        a2 a2VarA7 = z1.a(j0.i.f35303a, iVar4, sVar, 0);
                        iHashCode5 = Long.hashCode(sVar.T);
                        q1 q1VarL12 = sVar.l();
                        r rVarC12 = z1.a.c(sVar, oVar);
                        k.J.getClass();
                        iVar2 = j.f56913b;
                        sVar.h0();
                        Throwable th6 = th2;
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, a2VarA7, sVar);
                        t.J(j.f56916e, q1VarL12, sVar);
                        hVar2 = j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar2);
                        } else {
                            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar2);
                        }
                        t.J(j.f56915d, rVarC12, sVar);
                        String str3 = (String) list9.get(0);
                        i15 = i18 & 14;
                        if (i15 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objQ = sVar.Q();
                        if (z11) {
                            objQ = new uu.b(cVar2, 11);
                            sVar.o0(objQ);
                        } else {
                            objQ = new uu.b(cVar2, 11);
                            sVar.o0(objQ);
                        }
                        k(str3, (fz.c) objQ, sVar, 6);
                        List listSubList4 = list9.subList(1, list9.size());
                        List list10 = (List) listL2.get(i13);
                        if (i15 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new uu.b(cVar2, 12);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new uu.b(cVar2, 12);
                            sVar.o0(objQ2);
                        }
                        l(listSubList4, list10, (fz.c) objQ2, sVar, 3078);
                        sVar.p(true);
                        i13 = i14;
                        th2 = th6;
                    }
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    d(ub.a.e0(sVar, R.string.pt_alp_new_section_content_117), sVar, 0);
                    sVar.p(true);
                    break;
                }
                next2 = itO.next();
                i16 = i12 + 1;
                if (i12 >= 0) {
                    ns.o.V();
                    throw null;
                }
                List list11 = (List) next2;
                a2 a2VarA8 = z1.a(j0.i.f35303a, iVar4, sVar, 0);
                iHashCode6 = Long.hashCode(sVar.T);
                q1 q1VarL13 = sVar.l();
                r rVarC13 = z1.a.c(sVar, oVar);
                k.J.getClass();
                iVar3 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA8, sVar);
                t.J(j.f56916e, q1VarL13, sVar);
                hVar3 = j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar3);
                } else {
                    defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar3);
                }
                t.J(j.f56915d, rVarC13, sVar);
                String str4 = (String) list11.get(0);
                i17 = i18 & 14;
                if (i17 == i19) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = sVar.Q();
                if (z13) {
                    gVar2 = gVar;
                    if (objQ3 == gVar2) {
                        cVar3 = cVar;
                    }
                    k(str4, (fz.c) objQ3, sVar, i21);
                    List listSubList5 = list11.subList(1, list11.size());
                    List list12 = (List) listL.get(i12);
                    if (i17 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ4 = sVar.Q();
                    if (z14) {
                        objQ4 = new uu.b(cVar3, 10);
                        sVar.o0(objQ4);
                    } else {
                        objQ4 = new uu.b(cVar3, 10);
                        sVar.o0(objQ4);
                    }
                    l(listSubList5, list12, (fz.c) objQ4, sVar, 3078);
                    sVar.p(true);
                    i12 = i16;
                    gVar = gVar2;
                    i19 = 4;
                    i21 = 6;
                } else {
                    gVar2 = gVar;
                }
                cVar3 = cVar;
                objQ3 = new uu.b(cVar3, 9);
                sVar.o0(objQ3);
                k(str4, (fz.c) objQ3, sVar, i21);
                List listSubList6 = list11.subList(1, list11.size());
                List list13 = (List) listL.get(i12);
                if (i17 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ4 = sVar.Q();
                if (z14) {
                    objQ4 = new uu.b(cVar3, 10);
                    sVar.o0(objQ4);
                } else {
                    objQ4 = new uu.b(cVar3, 10);
                    sVar.o0(objQ4);
                }
                l(listSubList6, list13, (fz.c) objQ4, sVar, 3078);
                sVar.p(true);
                i12 = i16;
                gVar = gVar2;
                i19 = 4;
                i21 = 6;
            }
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(cVar2, i11, 22);
        }
    }
}

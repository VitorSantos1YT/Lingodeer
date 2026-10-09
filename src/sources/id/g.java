package id;

import android.graphics.Path;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.stkouyu.util.CommandUtil;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34349a = b1.p.E("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:429:0x072f A[LOOP:1: B:427:0x0729->B:429:0x072f, LOOP_END] */
    public static fd.b a(jd.e eVar, wc.h hVar) {
        String strQ;
        byte b3;
        fd.b aVar;
        fd.b qVar;
        fd.b dVar;
        fd.b rVar;
        fd.w wVar;
        eVar.b();
        int iP = 2;
        while (true) {
            if (!eVar.f()) {
                strQ = null;
                break;
            }
            int iY = eVar.y(f34349a);
            if (iY == 0) {
                strQ = eVar.q();
                break;
            }
            if (iY != 1) {
                eVar.A();
                eVar.B();
            } else {
                iP = eVar.p();
            }
        }
        if (strQ == null) {
            return null;
        }
        boolean zH = false;
        switch (strQ.hashCode()) {
            case 3239:
                if (!strQ.equals("el")) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case 3270:
                if (!strQ.equals("fl")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case 3295:
                if (!strQ.equals("gf")) {
                    b3 = -1;
                } else {
                    b3 = 2;
                }
                break;
            case 3307:
                if (!strQ.equals("gr")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case 3308:
                if (!strQ.equals("gs")) {
                    b3 = -1;
                } else {
                    b3 = 4;
                }
                break;
            case 3488:
                if (!strQ.equals("mm")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case 3633:
                if (!strQ.equals("rc")) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case 3634:
                if (!strQ.equals("rd")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case 3646:
                if (!strQ.equals("rp")) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case 3669:
                if (!strQ.equals(CommandUtil.COMMAND_SH)) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            case 3679:
                if (!strQ.equals("sr")) {
                    b3 = -1;
                } else {
                    b3 = 10;
                }
                break;
            case 3681:
                if (!strQ.equals(DytezVyM.xUIJJjbs)) {
                    b3 = -1;
                } else {
                    b3 = 11;
                }
                break;
            case 3705:
                if (!strQ.equals("tm")) {
                    b3 = -1;
                } else {
                    b3 = 12;
                }
                break;
            case 3710:
                if (!strQ.equals("tr")) {
                    b3 = -1;
                } else {
                    b3 = 13;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                b1.p pVar = e.f34340a;
                boolean z11 = iP == 3;
                boolean zH2 = false;
                String strQ2 = null;
                ed.f fVarB = null;
                ed.a aVarZ = null;
                while (eVar.f()) {
                    int iY2 = eVar.y(e.f34340a);
                    if (iY2 == 0) {
                        strQ2 = eVar.q();
                    } else if (iY2 == 1) {
                        fVarB = a.b(eVar, hVar);
                    } else if (iY2 == 2) {
                        aVarZ = qx.p.z(eVar, hVar);
                    } else if (iY2 == 3) {
                        zH2 = eVar.h();
                    } else if (iY2 != 4) {
                        eVar.A();
                        eVar.B();
                    } else {
                        z11 = eVar.p() == 3;
                    }
                }
                aVar = new fd.a(strQ2, fVarB, aVarZ, z11, zH2);
                qVar = aVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 1:
                b1.p pVar2 = a0.f34328a;
                int iP2 = 1;
                boolean zH3 = false;
                boolean zH4 = false;
                ed.a aVar2 = null;
                String strQ3 = null;
                ed.a aVarV = null;
                while (eVar.f()) {
                    int iY3 = eVar.y(a0.f34328a);
                    if (iY3 == 0) {
                        strQ3 = eVar.q();
                    } else if (iY3 == 1) {
                        aVarV = qx.p.v(eVar, hVar);
                    } else if (iY3 == 2) {
                        aVar2 = qx.p.y(eVar, hVar);
                    } else if (iY3 == 3) {
                        zH3 = eVar.h();
                    } else if (iY3 == 4) {
                        iP2 = eVar.p();
                    } else if (iY3 != 5) {
                        eVar.A();
                        eVar.B();
                    } else {
                        zH4 = eVar.h();
                    }
                }
                if (aVar2 == null) {
                    aVar2 = new ed.a(2, Collections.singletonList(new ld.a(100)));
                }
                qVar = new fd.q(strQ3, zH3, iP2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarV, aVar2, zH4);
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 2:
                b1.p pVar3 = l.f34362a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zH5 = false;
                ed.a aVar3 = null;
                String strQ4 = null;
                fd.f fVar = null;
                ed.a aVarX = null;
                ed.a aVarZ2 = null;
                ed.a aVarZ3 = null;
                while (eVar.f()) {
                    switch (eVar.y(l.f34362a)) {
                        case 0:
                            strQ4 = eVar.q();
                            break;
                        case 1:
                            eVar.b();
                            int iP3 = -1;
                            while (eVar.f()) {
                                int iY4 = eVar.y(l.f34363b);
                                if (iY4 == 0) {
                                    iP3 = eVar.p();
                                } else if (iY4 != 1) {
                                    eVar.A();
                                    eVar.B();
                                } else {
                                    aVarX = qx.p.x(eVar, hVar, iP3);
                                }
                            }
                            eVar.d();
                            break;
                        case 2:
                            aVar3 = qx.p.y(eVar, hVar);
                            break;
                        case 3:
                            fVar = eVar.p() == 1 ? fd.f.LINEAR : fd.f.RADIAL;
                            break;
                        case 4:
                            aVarZ2 = qx.p.z(eVar, hVar);
                            break;
                        case 5:
                            aVarZ3 = qx.p.z(eVar, hVar);
                            break;
                        case 6:
                            fillType = eVar.p() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zH5 = eVar.h();
                            break;
                        default:
                            eVar.A();
                            eVar.B();
                            break;
                    }
                }
                if (aVar3 == null) {
                    aVar3 = new ed.a(2, Collections.singletonList(new ld.a(100)));
                }
                dVar = new fd.d(strQ4, fVar, fillType, aVarX, aVar3, aVarZ2, aVarZ3, zH5);
                qVar = dVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 3:
                b1.p pVar4 = b0.f34332a;
                ArrayList arrayList = new ArrayList();
                String strQ5 = null;
                while (eVar.f()) {
                    int iY5 = eVar.y(b0.f34332a);
                    if (iY5 == 0) {
                        strQ5 = eVar.q();
                    } else if (iY5 == 1) {
                        zH = eVar.h();
                    } else if (iY5 != 2) {
                        eVar.B();
                    } else {
                        eVar.a();
                        while (eVar.f()) {
                            fd.b bVarA = a(eVar, hVar);
                            if (bVarA != null) {
                                arrayList.add(bVarA);
                            }
                        }
                        eVar.c();
                    }
                }
                rVar = new fd.r(strQ5, arrayList, zH);
                qVar = rVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 4:
                b1.p pVar5 = m.f34364a;
                ArrayList arrayList2 = new ArrayList();
                boolean zH6 = false;
                float fI = 0.0f;
                ed.a aVar4 = null;
                String strQ6 = null;
                fd.f fVar2 = null;
                ed.a aVarX2 = null;
                ed.a aVarZ4 = null;
                ed.a aVarZ5 = null;
                ed.b bVarW = null;
                fd.t tVar = null;
                fd.u uVar = null;
                ed.b bVar = null;
                while (eVar.f()) {
                    switch (eVar.y(m.f34364a)) {
                        case 0:
                            strQ6 = eVar.q();
                            break;
                        case 1:
                            eVar.b();
                            int iP4 = -1;
                            while (eVar.f()) {
                                int iY6 = eVar.y(m.f34365b);
                                if (iY6 == 0) {
                                    iP4 = eVar.p();
                                } else if (iY6 != 1) {
                                    eVar.A();
                                    eVar.B();
                                } else {
                                    aVarX2 = qx.p.x(eVar, hVar, iP4);
                                }
                            }
                            eVar.d();
                            break;
                        case 2:
                            aVar4 = qx.p.y(eVar, hVar);
                            break;
                        case 3:
                            fVar2 = eVar.p() == 1 ? fd.f.LINEAR : fd.f.RADIAL;
                            break;
                        case 4:
                            aVarZ4 = qx.p.z(eVar, hVar);
                            break;
                        case 5:
                            aVarZ5 = qx.p.z(eVar, hVar);
                            break;
                        case 6:
                            bVarW = qx.p.w(eVar, hVar, true);
                            break;
                        case 7:
                            tVar = fd.t.values()[eVar.p() - 1];
                            break;
                        case 8:
                            uVar = fd.u.values()[eVar.p() - 1];
                            break;
                        case 9:
                            fI = (float) eVar.i();
                            break;
                        case 10:
                            zH6 = eVar.h();
                            break;
                        case 11:
                            eVar.a();
                            while (eVar.f()) {
                                eVar.b();
                                String strQ7 = null;
                                ed.b bVarW2 = null;
                                while (eVar.f()) {
                                    int iY7 = eVar.y(m.f34366c);
                                    if (iY7 == 0) {
                                        strQ7 = eVar.q();
                                    } else if (iY7 != 1) {
                                        eVar.A();
                                        eVar.B();
                                    } else {
                                        bVarW2 = qx.p.w(eVar, hVar, true);
                                    }
                                }
                                eVar.d();
                                if (strQ7.equals("o")) {
                                    bVar = bVarW2;
                                } else if (strQ7.equals("d") || strQ7.equals("g")) {
                                    hVar.f54970o = true;
                                    arrayList2.add(bVarW2);
                                }
                            }
                            eVar.c();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((ed.b) arrayList2.get(0));
                            }
                            break;
                        default:
                            eVar.A();
                            eVar.B();
                            break;
                    }
                }
                if (aVar4 == null) {
                    aVar4 = new ed.a(2, Collections.singletonList(new ld.a(100)));
                }
                dVar = new fd.e(strQ6, fVar2, aVarX2, aVar4, aVarZ4, aVarZ5, bVarW, tVar, uVar, fI, arrayList2, bVar, zH6);
                qVar = dVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 5:
                b1.p pVar6 = u.f34381a;
                fd.j jVar = null;
                String strQ8 = null;
                while (eVar.f()) {
                    int iY8 = eVar.y(u.f34381a);
                    if (iY8 == 0) {
                        strQ8 = eVar.q();
                    } else if (iY8 == 1) {
                        int iP5 = eVar.p();
                        if (iP5 == 1) {
                            jVar = fd.j.MERGE;
                        } else if (iP5 == 2) {
                            jVar = fd.j.ADD;
                        } else if (iP5 == 3) {
                            jVar = fd.j.SUBTRACT;
                        } else if (iP5 != 4) {
                            jVar = iP5 != 5 ? fd.j.MERGE : fd.j.EXCLUDE_INTERSECTIONS;
                        } else {
                            jVar = fd.j.INTERSECT;
                        }
                    } else if (iY8 != 2) {
                        eVar.A();
                        eVar.B();
                    } else {
                        zH = eVar.h();
                    }
                }
                fd.k kVar = new fd.k(strQ8, jVar, zH);
                hVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                qVar = kVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 6:
                b1.p pVar7 = w.f34383a;
                boolean zH7 = false;
                String strQ9 = null;
                ed.f fVarB2 = null;
                ed.a aVarZ6 = null;
                ed.b bVarW3 = null;
                while (eVar.f()) {
                    int iY9 = eVar.y(w.f34383a);
                    if (iY9 == 0) {
                        strQ9 = eVar.q();
                    } else if (iY9 == 1) {
                        fVarB2 = a.b(eVar, hVar);
                    } else if (iY9 == 2) {
                        aVarZ6 = qx.p.z(eVar, hVar);
                    } else if (iY9 == 3) {
                        bVarW3 = qx.p.w(eVar, hVar, true);
                    } else if (iY9 != 4) {
                        eVar.B();
                    } else {
                        zH7 = eVar.h();
                    }
                }
                aVar = new fd.n(strQ9, fVarB2, aVarZ6, bVarW3, zH7);
                qVar = aVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 7:
                b1.p pVar8 = y.f34385a;
                String strQ10 = null;
                ed.b bVarW4 = null;
                while (eVar.f()) {
                    int iY10 = eVar.y(y.f34385a);
                    if (iY10 == 0) {
                        strQ10 = eVar.q();
                    } else if (iY10 == 1) {
                        bVarW4 = qx.p.w(eVar, hVar, true);
                    } else if (iY10 != 2) {
                        eVar.B();
                    } else {
                        zH = eVar.h();
                    }
                }
                qVar = zH ? null : new fd.o(strQ10, bVarW4);
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 8:
                b1.p pVar9 = x.f34384a;
                boolean zH8 = false;
                String strQ11 = null;
                ed.b bVarW5 = null;
                ed.b bVarW6 = null;
                ed.e eVarA = null;
                while (eVar.f()) {
                    int iY11 = eVar.y(x.f34384a);
                    if (iY11 == 0) {
                        strQ11 = eVar.q();
                    } else if (iY11 == 1) {
                        bVarW5 = qx.p.w(eVar, hVar, false);
                    } else if (iY11 == 2) {
                        bVarW6 = qx.p.w(eVar, hVar, false);
                    } else if (iY11 == 3) {
                        eVarA = c.a(eVar, hVar);
                    } else if (iY11 != 4) {
                        eVar.B();
                    } else {
                        zH8 = eVar.h();
                    }
                }
                aVar = new fd.n(strQ11, bVarW5, bVarW6, eVarA, zH8);
                qVar = aVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 9:
                b1.p pVar10 = c0.f34335a;
                int iP6 = 0;
                boolean zH9 = false;
                ed.a aVar5 = null;
                String strQ12 = null;
                while (eVar.f()) {
                    int iY12 = eVar.y(c0.f34335a);
                    if (iY12 == 0) {
                        strQ12 = eVar.q();
                    } else if (iY12 == 1) {
                        iP6 = eVar.p();
                    } else if (iY12 == 2) {
                        aVar5 = new ed.a(5, q.a(eVar, hVar, kd.k.c(), z.f34386a, false));
                    } else if (iY12 != 3) {
                        eVar.B();
                    } else {
                        zH9 = eVar.h();
                    }
                }
                rVar = new fd.s(strQ12, iP6, aVar5, zH9);
                qVar = rVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 10:
                b1.p pVar11 = v.f34382a;
                boolean z12 = iP == 3;
                boolean zH10 = false;
                String strQ13 = null;
                fd.l lVarA = null;
                ed.b bVarW7 = null;
                ed.f fVarB3 = null;
                ed.b bVarW8 = null;
                ed.b bVarW9 = null;
                ed.b bVarW10 = null;
                ed.b bVarW11 = null;
                ed.b bVarW12 = null;
                while (eVar.f()) {
                    switch (eVar.y(v.f34382a)) {
                        case 0:
                            strQ13 = eVar.q();
                            break;
                        case 1:
                            lVarA = fd.l.a(eVar.p());
                            break;
                        case 2:
                            bVarW7 = qx.p.w(eVar, hVar, false);
                            break;
                        case 3:
                            fVarB3 = a.b(eVar, hVar);
                            break;
                        case 4:
                            bVarW8 = qx.p.w(eVar, hVar, false);
                            break;
                        case 5:
                            bVarW10 = qx.p.w(eVar, hVar, true);
                            break;
                        case 6:
                            bVarW12 = qx.p.w(eVar, hVar, false);
                            break;
                        case 7:
                            bVarW9 = qx.p.w(eVar, hVar, true);
                            break;
                        case 8:
                            bVarW11 = qx.p.w(eVar, hVar, false);
                            break;
                        case 9:
                            zH10 = eVar.h();
                            break;
                        case 10:
                            z12 = eVar.p() == 3;
                            break;
                        default:
                            eVar.A();
                            eVar.B();
                            break;
                    }
                }
                aVar = new fd.m(strQ13, lVarA, bVarW7, fVarB3, bVarW8, bVarW9, bVarW10, bVarW11, bVarW12, zH10, z12);
                qVar = aVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 11:
                b1.p pVar12 = d0.f34338a;
                ArrayList arrayList3 = new ArrayList();
                boolean zH11 = false;
                float fI2 = 0.0f;
                ed.a aVar6 = null;
                fd.t tVar2 = null;
                fd.u uVar2 = null;
                String strQ14 = null;
                ed.b bVar2 = null;
                ed.a aVarV2 = null;
                ed.b bVarW13 = null;
                while (eVar.f()) {
                    switch (eVar.y(d0.f34338a)) {
                        case 0:
                            strQ14 = eVar.q();
                            break;
                        case 1:
                            aVarV2 = qx.p.v(eVar, hVar);
                            break;
                        case 2:
                            bVarW13 = qx.p.w(eVar, hVar, true);
                            break;
                        case 3:
                            aVar6 = qx.p.y(eVar, hVar);
                            break;
                        case 4:
                            tVar2 = fd.t.values()[eVar.p() - 1];
                            break;
                        case 5:
                            uVar2 = fd.u.values()[eVar.p() - 1];
                            break;
                        case 6:
                            fI2 = (float) eVar.i();
                            break;
                        case 7:
                            zH11 = eVar.h();
                            break;
                        case 8:
                            eVar.a();
                            while (eVar.f()) {
                                eVar.b();
                                String strQ15 = null;
                                ed.b bVarW14 = null;
                                while (eVar.f()) {
                                    int iY13 = eVar.y(d0.f34339b);
                                    if (iY13 == 0) {
                                        strQ15 = eVar.q();
                                    } else if (iY13 != 1) {
                                        eVar.A();
                                        eVar.B();
                                    } else {
                                        bVarW14 = qx.p.w(eVar, hVar, true);
                                    }
                                }
                                eVar.d();
                                strQ15.getClass();
                                switch (strQ15) {
                                    case "d":
                                    case "g":
                                        hVar.f54970o = true;
                                        arrayList3.add(bVarW14);
                                        break;
                                    case "o":
                                        bVar2 = bVarW14;
                                        break;
                                }
                            }
                            eVar.c();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((ed.b) arrayList3.get(0));
                            }
                            break;
                        default:
                            eVar.B();
                            break;
                    }
                }
                if (aVar6 == null) {
                    aVar6 = new ed.a(2, Collections.singletonList(new ld.a(100)));
                }
                ed.a aVar7 = aVar6;
                if (tVar2 == null) {
                    tVar2 = fd.t.BUTT;
                }
                fd.t tVar3 = tVar2;
                if (uVar2 == null) {
                    uVar2 = fd.u.MITER;
                }
                qVar = new fd.v(strQ14, bVar2, arrayList3, aVarV2, aVar7, bVarW13, tVar3, uVar2, fI2, zH11);
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 12:
                b1.p pVar13 = e0.f34341a;
                boolean zH12 = false;
                String strQ16 = null;
                fd.w wVar2 = null;
                ed.b bVarW15 = null;
                ed.b bVarW16 = null;
                ed.b bVarW17 = null;
                while (eVar.f()) {
                    int iY14 = eVar.y(e0.f34341a);
                    if (iY14 == 0) {
                        bVarW15 = qx.p.w(eVar, hVar, false);
                    } else if (iY14 == 1) {
                        bVarW16 = qx.p.w(eVar, hVar, false);
                    } else if (iY14 == 2) {
                        bVarW17 = qx.p.w(eVar, hVar, false);
                    } else if (iY14 == 3) {
                        strQ16 = eVar.q();
                    } else if (iY14 == 4) {
                        int iP7 = eVar.p();
                        if (iP7 == 1) {
                            wVar = fd.w.SIMULTANEOUSLY;
                        } else {
                            if (iP7 != 2) {
                                throw new IllegalArgumentException(nv.p.j(iP7, "Unknown trim path type "));
                            }
                            wVar = fd.w.INDIVIDUALLY;
                        }
                        wVar2 = wVar;
                    } else if (iY14 != 5) {
                        eVar.B();
                    } else {
                        zH12 = eVar.h();
                    }
                }
                aVar = new fd.n(strQ16, wVar2, bVarW15, bVarW16, bVarW17, zH12);
                qVar = aVar;
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            case 13:
                qVar = c.a(eVar, hVar);
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
            default:
                kd.d.b("Unknown shape type ".concat(strQ));
                while (eVar.f()) {
                    eVar.B();
                }
                eVar.d();
                return qVar;
        }
    }
}

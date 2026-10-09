package n0;

import f0.h1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import l1.c3;
import l1.k1;
import l1.x1;
import l1.z1;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bq.h f42967a = new bq.h(13);

    public static final void a(fz.a aVar, z1.r rVar, l0 l0Var, c0 c0Var, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1055276397);
        int i12 = (sVar.h(aVar) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16) | (sVar.f(l0Var) ? 256 : 128) | (sVar.f(c0Var) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            c(t1.e.d(-933153643, new b0(l0Var, rVar, c0Var, l1.t.H(aVar, sVar)), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(aVar, rVar, l0Var, c0Var, i11);
        }
    }

    public static final void b(Object obj, int i11, i0 i0Var, t1.d dVar, l1.n nVar, int i12) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(872548579);
        if ((i12 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(i0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(dVar) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            boolean zF = sVar.f(obj) | sVar.f(i0Var);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new h0(obj, i0Var);
                sVar.o0(objQ);
            }
            h0 h0Var = (h0) objQ;
            h0Var.f42951c = i11;
            k1 k1Var = h0Var.f42955g;
            l1.d0 d0Var = w2.e1.f54482a;
            h0 h0Var2 = (h0) sVar.j(d0Var);
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                if (h0Var2 != ((h0) k1Var.getValue())) {
                    k1Var.setValue(h0Var2);
                    if (h0Var.f42952d > 0) {
                        h0 h0Var3 = h0Var.f42953e;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        h0Var.f42953e = h0Var2;
                    }
                }
                re.q.t(fVarN, fVarR, cVarE);
                boolean zF2 = sVar.f(h0Var);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new kp.j(h0Var, 18);
                    sVar.o0(objQ2);
                }
                l1.t.c(h0Var, (fz.c) objQ2, sVar);
                l1.t.a(d0Var.a(h0Var), dVar, sVar, ((i13 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th2;
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(obj, i11, i0Var, dVar, i12);
        }
    }

    public static final void c(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-709502251);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            c3 c3Var = w1.g.f54465a;
            w1.e eVar = (w1.e) sVar.j(c3Var);
            w1.c cVarF = w1.j.f(sVar);
            Object[] objArr = {eVar};
            byte b3 = 0;
            o2 o2Var = new o2(6, new mt.k(10, b3), new w0(b3, eVar, cVarF));
            boolean zH = sVar.h(eVar) | sVar.h(cVarF);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new z1(15, eVar, cVarF);
                sVar.o0(objQ);
            }
            x0 x0Var = (x0) w1.j.d(objArr, o2Var, (fz.a) objQ, sVar, 0);
            l1.t.a(c3Var.a(x0Var), t1.e.d(-412824043, new es.c(6, dVar, x0Var), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 10);
        }
    }

    public static final void d(a0 a0Var, Object obj, int i11, Object obj2, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1439843069);
        int i13 = (sVar.f(a0Var) ? 4 : 2) | i12 | (sVar.f(obj) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.f(obj2) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            ((w1.b) obj).c(obj2, t1.e.d(980966366, new z(i11, obj2, a0Var), sVar), sVar, 48);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(a0Var, obj, i11, obj2, i12);
        }
    }

    public static final int e(int i11, n1.e eVar) {
        int i12 = eVar.f43114c - 1;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = ((i12 - i13) / 2) + i13;
            Object[] objArr = eVar.f43112a;
            int i15 = ((h) objArr[i14]).f42946a;
            if (i15 != i11) {
                if (i15 < i11) {
                    i13 = i14 + 1;
                    if (i11 < ((h) objArr[i13]).f42946a) {
                    }
                } else {
                    i12 = i14 - 1;
                }
            }
            return i14;
        }
        return i13;
    }

    public static final List f(f0 f0Var, int i11, int i12, ArrayList arrayList, y.w wVar, int i13, int i14, int i15, fz.c cVar) {
        int i16;
        y.w wVar2;
        long j11;
        long j12;
        int i17;
        Object obj;
        int i18;
        if (f0Var == null || arrayList.isEmpty() || (i16 = wVar.f56783b) == 0) {
            return ry.r.f50854a;
        }
        int i19 = -1;
        if (i12 - i11 < 0 || i16 == 0) {
            wVar2 = y.l.f56733a;
        } else {
            lz.g gVarU = hz.b.U(0, i16);
            int i21 = gVarU.f40532a;
            int i22 = gVarU.f40533b;
            int iC = -1;
            if (i21 <= i22) {
                while (wVar.c(i21) <= i11) {
                    iC = wVar.c(i21);
                    if (i21 == i22) {
                        break;
                    }
                    i21++;
                }
            }
            if (iC == -1) {
                wVar2 = y.l.f56733a;
            } else {
                y.w wVar3 = y.l.f56733a;
                wVar2 = new y.w(1);
                wVar2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            Object obj2 = arrayList.get(i23);
            int index = ((e0) obj2).getIndex();
            int[] iArr = wVar.f56782a;
            int i24 = wVar.f56783b;
            for (int i25 = 0; i25 < i24; i25++) {
                if (iArr[i25] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = wVar2.f56782a;
        int i26 = wVar2.f56783b;
        int i27 = 0;
        while (i27 < i26) {
            int i28 = iArr2[i27];
            int size2 = arrayList.size();
            int i29 = 0;
            int i30 = 0;
            while (true) {
                if (i30 >= size2) {
                    i29 = i19;
                    break;
                }
                Object obj3 = arrayList.get(i30);
                i30++;
                if (((e0) obj3).getIndex() == i28) {
                    break;
                }
                i29++;
            }
            e0 e0Var = i29 == i19 ? (e0) cVar.invoke(Integer.valueOf(i28)) : (e0) arrayList.remove(i29);
            int iB = e0Var.b();
            if (i29 == i19) {
                j11 = 4294967295L;
                i17 = Integer.MIN_VALUE;
            } else {
                long jH = e0Var.h(0);
                if (e0Var.e()) {
                    j11 = 4294967295L;
                    j12 = jH & 4294967295L;
                } else {
                    j11 = 4294967295L;
                    j12 = jH >> 32;
                }
                i17 = (int) j12;
            }
            int size3 = arrayList3.size();
            int i31 = 0;
            while (true) {
                if (i31 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i31);
                if (((e0) obj).getIndex() != i28) {
                    break;
                }
                i31++;
            }
            e0 e0Var2 = (e0) obj;
            if (e0Var2 != null) {
                long jH2 = e0Var2.h(0);
                i18 = (int) (e0Var2.e() ? jH2 & j11 : jH2 >> 32);
            } else {
                i18 = Integer.MIN_VALUE;
            }
            int iMax = i17 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i17);
            if (i18 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i18 - iB);
            }
            e0Var.f();
            e0Var.g(iMax, i14, i15);
            arrayList2.add(e0Var);
            i27++;
            i19 = -1;
        }
        return arrayList2;
    }

    public static final List g(a0 a0Var, i0 i0Var, f0.a aVar) {
        lz.g gVar;
        n1.e eVar = aVar.f26179a;
        if (!(eVar.f43114c != 0) && i0Var.f42958a.isEmpty()) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        if (aVar.f26179a.f43114c != 0) {
            int i11 = eVar.f43114c;
            if (i11 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f43112a;
            int i12 = ((j) objArr[0]).f42959a;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = ((j) objArr[i13]).f42959a;
                if (i14 < i12) {
                    i12 = i14;
                }
            }
            if (i12 < 0) {
                i0.a.a("negative minIndex");
            }
            int i15 = eVar.f43114c;
            if (i15 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f43112a;
            int i16 = ((j) objArr2[0]).f42960b;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = ((j) objArr2[i17]).f42960b;
                if (i18 > i16) {
                    i16 = i18;
                }
            }
            gVar = new lz.g(i12, Math.min(i16, a0Var.getItemCount() - 1), 1);
        } else {
            gVar = lz.g.f40539d;
        }
        int size = i0Var.f42958a.size();
        for (int i19 = 0; i19 < size; i19++) {
            h0 h0Var = (h0) i0Var.get(i19);
            int i21 = i(h0Var.f42951c, h0Var.f42949a, a0Var);
            int i22 = gVar.f40532a;
            if ((i21 > gVar.f40533b || i22 > i21) && i21 >= 0 && i21 < a0Var.getItemCount()) {
                arrayList.add(Integer.valueOf(i21));
            }
        }
        int i23 = gVar.f40532a;
        int i24 = gVar.f40533b;
        if (i23 <= i24) {
            while (true) {
                arrayList.add(Integer.valueOf(i23));
                if (i23 == i24) {
                    break;
                }
                i23++;
            }
        }
        return arrayList;
    }

    public static l1.b1 h() {
        return new k1(qy.b0.f48488a, l1.g.f39300d);
    }

    public static final int i(int i11, Object obj, a0 a0Var) {
        int iD;
        return (obj == null || a0Var.getItemCount() == 0 || (i11 < a0Var.getItemCount() && obj.equals(a0Var.a(i11))) || (iD = a0Var.d(obj)) == -1) ? i11 : iD;
    }

    public static final z1.r m(q qVar, f0.a aVar, h1 h1Var) {
        return new k(qVar, aVar, h1Var);
    }

    public static final z1.r n(z1.r rVar, mz.g gVar, r0 r0Var, h1 h1Var, boolean z11) {
        return rVar.i(new s0(gVar, r0Var, h1Var, z11));
    }

    public static final List o(int i11, int i12, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return ry.r.f50854a;
        }
        ArrayList arrayListC1 = ry.m.c1(list);
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            e0 e0Var = (e0) arrayList.get(i13);
            int index = e0Var.getIndex();
            if (i11 <= index && index <= i12) {
                arrayListC1.add(e0Var);
            }
        }
        ry.p.Z(arrayListC1, f42967a);
        return arrayListC1;
    }

    public Object j(int i11) {
        h hVarH = k().h(i11);
        return hVarH.f42948c.getType().invoke(Integer.valueOf(i11 - hVarH.f42946a));
    }

    public abstract ij.d k();

    public Object l(int i11) {
        Object objInvoke;
        h hVarH = k().h(i11);
        int i12 = i11 - hVarH.f42946a;
        fz.c key = hVarH.f42948c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i12))) == null) ? new f(i11) : objInvoke;
    }
}

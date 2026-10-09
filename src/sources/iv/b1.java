package iv;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.e6;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.s1;
import h1.v1;
import j0.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l1.q1;
import l1.x1;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import ys.o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b1 {
    public static final void a(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1924254894);
        if (sVar.T(i11 & 1, i11 != 0)) {
            e(a.f34672l, sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 4);
        }
    }

    public static final void b(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1850991634);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e(t1.e.d(-2118445353, new e6(cVar, 3), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 6);
        }
    }

    public static final void c(fz.a onBackClick, fz.a onOpenAlphabetChart, mv.n nVar, l1.n nVar2, int i11) {
        mv.n nVar3;
        mv.n nVar4;
        int i12;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onOpenAlphabetChart, "onOpenAlphabetChart");
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(730425866);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onOpenAlphabetChart) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.n.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                nVar4 = (mv.n) viewModelA;
                i12 = i13 & (-897);
            } else {
                sVar.W();
                i12 = i13 & (-897);
                nVar4 = nVar;
            }
            sVar.q();
            boolean zH = sVar.h(nVar4);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            vy.d dVar = null;
            if (zH || objQ == gVar) {
                objQ = new k(nVar4, dVar, 1);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, qy.b0.f48488a, sVar);
            boolean zH2 = ((i12 & 112) == 32) | sVar.h(nVar4);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new gu.b(16, nVar4, onOpenAlphabetChart, dVar);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, nVar4, sVar);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean zH3 = sVar.h(nVar4) | sVar.h(lifecycleOwner);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                objQ3 = new com.google.accompanist.permissions.a(24, lifecycleOwner, nVar4);
                sVar.o0(objQ3);
            }
            l1.t.d(lifecycleOwner, nVar4, (fz.c) objQ3, sVar);
            mv.k kVar = (mv.k) l1.t.o(nVar4.H, sVar).getValue();
            if (kotlin.jvm.internal.m.a(kVar, mv.i.f42215a)) {
                sVar.d0(1859628217);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(kVar instanceof mv.j)) {
                    throw nv.p.x(sVar, 1859627054, false);
                }
                sVar.d0(1813980884);
                fb fbVar = ((mv.j) kVar).f42223a;
                if (fbVar instanceof db) {
                    sVar.d0(1859633947);
                    tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                    sVar.p(false);
                } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    sVar.d0(1859637209);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                        throw nv.p.x(sVar, 1859631254, false);
                    }
                    sVar.d0(1814268440);
                    Object objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new com.lingo.lingoskill.object.a(28);
                        sVar.o0(objQ4);
                    }
                    o3.a((fz.c) objQ4, null, t1.e.d(-789137683, new fu.n(17, onBackClick, nVar4), sVar), sVar, 390);
                    sVar.p(false);
                }
                sVar.p(false);
            }
            nVar3 = nVar4;
        } else {
            sVar.W();
            nVar3 = nVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(onBackClick, onOpenAlphabetChart, nVar3, i11, 1);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(fz.a onBackClick, fz.a onOpenAlphabetChart, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        fz.a aVar;
        z1.r rVar2;
        fz.c cVar2 = cVar;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onOpenAlphabetChart, "onOpenAlphabetChart");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-760593569);
        int i12 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onOpenAlphabetChart) ? 32 : 16) | (sVar.h(cVar2) ? 256 : 128) | 3072;
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            z1.o oVar2 = oVar;
            h1.e0.c(a.f34666f, null, t1.e.d(2032632277, new at.o(23, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar2, 10));
            z1.r rVarY = d0.n.y(d0.n.h(e2.e(oVar2, 1.0f), ((s1) sVar.j(v1.f31180a)).f31033p, g2.f0.f28556b), d0.n.u(sVar), true, 12);
            float f5 = j0.f34761a;
            z1.r rVarE = j0.c.E(rVarY, f5, j0.f34763c, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8);
            j0.u uVarA2 = j0.t.a(j0.i.g(j0.f34765e), hVar5, sVar, 6);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            int i13 = (i12 >> 6) & 14;
            cVar2 = cVar;
            b(cVar2, sVar, i13);
            z0.w(sVar, 0);
            h(cVar2, sVar, i13);
            z0.w(sVar, 0);
            f(cVar2, sVar, i13);
            z0.w(sVar, 0);
            g(cVar2, sVar, i13);
            z0.w(sVar, 0);
            i(cVar2, sVar, i13);
            z0.w(sVar, 0);
            a(sVar, 0);
            hh.p0.B(oVar2, 72, sVar, true, true);
            aVar = onOpenAlphabetChart;
            z0.a((i12 >> 3) & 14, aVar, sVar, j0.r.f35391a.a(oVar2, z1.c.H));
            sVar.p(true);
            rVar2 = oVar2;
        } else {
            aVar = onOpenAlphabetChart;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(onBackClick, aVar, cVar2, rVar2, i11);
        }
    }

    public static final void e(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1864224009);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            j0.d(null, t1.e.d(1620503172, new br.l(dVar, 5), sVar), sVar, 48, 1);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 6);
        }
    }

    public static final void f(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(655802420);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e(t1.e.d(955068139, new e6(cVar, 5), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 8);
        }
    }

    public static final void g(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(668776118);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e(t1.e.d(401322399, new e6(cVar, 4), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 7);
        }
    }

    public static final void h(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1499397933);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e(t1.e.d(937831548, new e6(cVar, 6), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 9);
        }
    }

    public static final void i(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(565974831);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e(t1.e.d(-361096936, new e6(cVar, 7), sVar), sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 5);
        }
    }

    public static final kv.g j(kv.g gVar, Map map, l1.s sVar) {
        LinkedHashMap linkedHashMapC0 = ry.x.c0(ry.x.Y(new qy.l("Japanese", ub.a.e0(sVar, R.string.jp_syllable_overview_intro_table_header_japanese)), new qy.l("Kana", ub.a.e0(sVar, R.string.jp_syllable_overview_intro_table_header_kana)), new qy.l("Romaji", ub.a.e0(sVar, R.string.romaji)), new qy.l("Meaning", ub.a.e0(sVar, R.string.jp_syllable_overview_intro_table_header_meaning))), map);
        List list = gVar.f38742a;
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<kv.f> list2 = ((kv.h) it.next()).f38745a;
            ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
            for (kv.f fVar : list2) {
                String str = (String) linkedHashMapC0.get(fVar.f38734a);
                if (str != null) {
                    fVar = new kv.f(fVar.f38736c, str, fVar.f38735b);
                }
                arrayList2.add(fVar);
            }
            arrayList.add(new kv.h(arrayList2));
        }
        return new kv.g(arrayList);
    }

    public static final void k(final int i11, final boolean z11, l1.n nVar, final int i12, final int i13) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1018911998);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12;
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            if (i15 != 0) {
                z11 = false;
            }
            z0.j(qx.b.C(ub.a.e0(sVar, i11)), z11, sVar, i14 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: iv.a1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i12 | 1);
                    b1.k(i11, z11, (l1.n) obj, iM, i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void l(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-455697509);
        if (sVar.T(i11 & 1, i11 != 0)) {
            z0.k(ub.a.e0(sVar, R.string.jp_syllable_for_example), sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 5);
        }
    }
}

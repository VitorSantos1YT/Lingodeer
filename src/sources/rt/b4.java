package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b4 extends ViewModel {
    public final vt.h H;
    public final fv.c K;
    public final av.n L;
    public final av.n M;
    public final s2 N;
    public final boolean O;
    public final List P;
    public final uz.i1 Q;
    public final uz.i1 R;
    public final uz.i1 S;
    public final uz.i1 T;
    public final uz.i1 U;
    public final uz.i1 V;
    public final uz.i1 W;
    public final uz.i1 X;
    public final uz.i1 Y;
    public final uz.i1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f49485a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LinkedHashSet f49486a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs.b f49487b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final bq.f f49488b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.b0 f49489c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final uz.r0 f49490c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f49491d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f49492d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.c f49493e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f49494e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt.e f49495f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public rz.z1 f49496f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final uz.i1 f49497g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final LinkedHashMap f49498h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final uz.i1 f49499i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final uz.r0 f49500j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final uz.r0 f49501k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final uz.r0 f49502l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final uz.r0 f49503m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final uz.r0 f49504n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final uz.r0 f49505o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final uz.r0 f49506p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vt.p0 f49507t;

    public b4(wt.m mVar, rs.b bVar, wt.b0 b0Var, vt.h1 h1Var, vt.n0 n0Var, vt.c cVar, vt.e eVar, vt.p0 p0Var, vt.h hVar, fv.c cVar2, av.n nVar, av.n nVar2, s2 s2Var, boolean z11) {
        ot.h2 h2Var;
        this.f49485a = mVar;
        this.f49487b = bVar;
        this.f49489c = b0Var;
        this.f49491d = n0Var;
        this.f49493e = cVar;
        this.f49495f = eVar;
        this.f49507t = p0Var;
        this.H = hVar;
        this.K = cVar2;
        this.L = nVar;
        this.M = nVar2;
        this.N = s2Var;
        this.O = z11;
        List formalStatuses = s2Var.f50370a;
        this.P = formalStatuses;
        uz.i1 i1VarC = uz.x0.c(eb.f49693a);
        this.Q = i1VarC;
        uz.i1 i1VarC2 = uz.x0.c(0);
        this.R = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(-1);
        this.S = i1VarC3;
        ry.t tVar = ry.t.f50856a;
        uz.i1 i1VarC4 = uz.x0.c(new pf(tVar, tVar, tVar));
        this.T = i1VarC4;
        uz.i1 i1VarC5 = uz.x0.c(ht.a.f33722e);
        this.U = i1VarC5;
        uz.i1 i1VarC6 = uz.x0.c(ry.r.f50854a);
        this.V = i1VarC6;
        Boolean bool = Boolean.FALSE;
        uz.i1 i1VarC7 = uz.x0.c(bool);
        this.W = i1VarC7;
        uz.i1 i1VarC8 = uz.x0.c(bool);
        this.X = i1VarC8;
        this.Y = uz.x0.c(-1);
        this.Z = uz.x0.c(tVar);
        this.f49486a0 = new LinkedHashSet();
        vy.d dVar = null;
        if (z11) {
            ns.d dVar2 = new ns.d(8);
            d0.m0 m0Var = new d0.m0(2, b0Var, wt.b0.class, "processUserRating", "processUserRating(Lcom/lingodeer/data/model/SRSStatus;Lcom/lingodeer/data/usecase/SRSUserRating;)Lcom/lingodeer/data/model/SRSStatus;", 0, 12);
            kotlin.jvm.internal.m.f(formalStatuses, "formalStatuses");
            h2Var = new ot.h2(formalStatuses, m0Var, dVar2, ((Number) dVar2.invoke()).longValue());
        } else {
            h2Var = null;
        }
        bq.f fVar = new bq.f(h2Var);
        this.f49488b0 = fVar;
        this.f49490c0 = (uz.r0) fVar.f4946d;
        uz.i1 i1VarC9 = uz.x0.c(ry.s.f50855a);
        this.f49497g0 = i1VarC9;
        this.f49498h0 = new LinkedHashMap();
        uz.i1 i1VarC10 = uz.x0.c(n.f50107a);
        this.f49499i0 = i1VarC10;
        this.f49500j0 = new uz.r0(i1VarC10);
        this.f49501k0 = new uz.r0(i1VarC5);
        no.g gVar = new no.g(i1VarC2, i1VarC3, new g3(3, null));
        uz.r0 r0VarA = uz.x0.A(new no.g(i1VarC6, i1VarC2, new rm.c(3, 1, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
        this.f49502l0 = r0VarA;
        uz.r0 r0VarA2 = uz.x0.A(new bh.r(uz.x0.A(new x3(r0VarA, 0), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null), this, 22), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
        this.f49503m0 = r0VarA2;
        uz.r0 r0VarA3 = uz.x0.A(uz.x0.B(r0VarA2, new v3(0, this, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
        this.f49504n0 = uz.x0.A(uz.x0.j(r0VarA2, r0VarA3, i1VarC9, new i3(4, 0, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ka(false, false));
        this.f49505o0 = uz.x0.A(uz.x0.B(r0VarA2, new v3(1, this, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new dc(false, BuildConfig.VERSION_NAME));
        this.f49506p0 = uz.x0.A(uz.x0.w(uz.x0.k(i1VarC6, i1VarC, gVar, i1VarC4, new no.g(new no.g(i1VarC8, ((fr.x4) h1Var).f27974g, new c(3, 1, null)), i1VarC7, new u3(3, null)), new z3(this, null)), rz.o0.f50940a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new p2(CropImageView.DEFAULT_ASPECT_RATIO));
        vy.d dVar3 = null;
        uz.x0.y(new n9.n1(new gp.t(uz.x0.j(r0VarA2, r0VarA3, i1VarC9, new i3(4, 1, dVar3)), 17), new nu.b(this, dVar3, 3), 5), ViewModelKt.getViewModelScope(this));
        rz.z1 z1Var = this.f49496f0;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f49496f0 = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n3(2, this, dVar3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b8 A[RETURN] */
    public static final int a(b4 b4Var) {
        fr.o0 o0Var = (fr.o0) b4Var.f49491d;
        if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(o0Var.f27733a.keyLanguage))) {
            int iT = o0Var.t();
            if (iT != 0 && iT != 1) {
                if (iT != 3 && iT != 4 && iT != 5) {
                    return iT != 6 ? -1 : 3;
                }
                return 2;
            }
            return 1;
        }
        if (ry.l.D(new Integer[]{13, 2}, Integer.valueOf(o0Var.f27733a.keyLanguage)) || ry.l.D(new Integer[]{11, 0}, Integer.valueOf(o0Var.f27733a.keyLanguage))) {
            int iT2 = o0Var.t();
            if (iT2 != 0 && iT2 != 1) {
                if (iT2 != 2) {
                    return -1;
                }
                return 2;
            }
            return 1;
        }
        if (!ry.l.D(new Integer[]{51, 55, 57, 61, 63}, Integer.valueOf(o0Var.f27733a.keyLanguage))) {
            return -1;
        }
        int iT3 = o0Var.t();
        if (iT3 != 0) {
            if (iT3 != 1) {
                return -1;
            }
            return 2;
        }
        return 1;
    }

    public static final void b(b4 b4Var, String str, boolean z11) {
        Object value;
        Map mapZ;
        uz.i1 i1Var = b4Var.f49497g0;
        do {
            value = i1Var.getValue();
            mapZ = (Map) value;
            if (kotlin.jvm.internal.m.a(mapZ.get(str), Boolean.valueOf(z11))) {
                mapZ = ry.x.Z(str, mapZ);
            }
        } while (!i1Var.j(value, mapZ));
    }

    public static final Object c(b4 b4Var, m0 m0Var, xy.i iVar) {
        Object objD;
        return (kotlin.jvm.internal.m.a(m0Var.f50043b, "course_w") && m0Var.f50046e == 0 && (objD = b4Var.f49489c.d(m0Var.f50047f, m0Var.f50045d, iVar)) == wy.a.COROUTINE_SUSPENDED) ? objD : qy.b0.f48488a;
    }

    public static final Object d(b4 b4Var, m0 m0Var, String str, xy.i iVar) {
        Object objC = ((vt.r) b4Var.H).c(str, ns.o.K(m0Var.f50042a), iVar);
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }

    public final void f(m0 target, String folderId) {
        b4 b4Var;
        uz.i1 i1Var;
        Object value;
        kotlin.jvm.internal.m.f(target, "target");
        kotlin.jvm.internal.m.f(folderId, "folderId");
        uz.i1 i1Var2 = this.Z;
        Set set = (Set) i1Var2.getValue();
        String str = target.f50042a;
        vy.d dVar = null;
        if (set.contains(str)) {
            rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(viewModelScope, yz.e.f58387a, null, new h3(this, target, folderId, dVar, 0), 2);
            return;
        }
        do {
            b4Var = this;
            i1Var = b4Var.f49497g0;
            value = i1Var.getValue();
        } while (!i1Var.j(value, ry.x.d0((Map) value, new qy.l(str, Boolean.TRUE))));
        while (true) {
            Object value2 = i1Var2.getValue();
            if (i1Var2.j(value2, qx.b.E((Set) value2, str))) {
                rz.b0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
                yz.f fVar2 = rz.o0.f50940a;
                rz.e0.B(viewModelScope2, yz.e.f58387a, null, new h3(b4Var, target, folderId, dVar, 1), 2);
                return;
            }
            b4Var = this;
        }
    }

    public final uz.g1 g(long j11, String bookmarkValue) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        m0 m0VarH = h(j11, -1L, bookmarkValue);
        if (m0VarH == null) {
            return uz.x0.c(new ka(false, false));
        }
        String str = m0VarH.f50042a;
        LinkedHashMap linkedHashMap = this.f49498h0;
        Object objA = linkedHashMap.get(str);
        if (objA == null) {
            objA = uz.x0.A(new no.g(new gp.r(((fr.r) this.f49495f).d(str), 6), this.f49497g0, new l3(m0VarH, null, 0)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ka(false, false));
            linkedHashMap.put(str, objA);
        }
        return (uz.g1) objA;
    }

    public final m0 h(long j11, long j12, String str) {
        int i11;
        String str2;
        if (j11 <= 0) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -368357057) {
            if (iHashCode != -368357041) {
                if (iHashCode != -368357037 || !str.equals("course_w")) {
                    return null;
                }
                i11 = 0;
            } else {
                if (!str.equals("course_s")) {
                    return null;
                }
                i11 = 1;
            }
        } else {
            if (!str.equals("course_c")) {
                return null;
            }
            i11 = 2;
        }
        int iHashCode2 = str.hashCode();
        if (iHashCode2 != -368357057) {
            if (iHashCode2 != -368357041) {
                if (iHashCode2 != -368357037 || !str.equals("course_w")) {
                    return null;
                }
                str2 = "w";
            } else {
                if (!str.equals("course_s")) {
                    return null;
                }
                str2 = "s";
            }
        } else {
            if (!str.equals("course_c")) {
                return null;
            }
            str2 = "c";
        }
        return new m0(w8.a(j11, xt.d.k(((fr.o0) this.f49491d).f27733a.keyLanguage), str), str, str2, j11, i11, j12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r3 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(xy.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof rt.m3
            if (r0 == 0) goto L13
            r0 = r9
            rt.m3 r0 = (rt.m3) r0
            int r1 = r0.f50055c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50055c = r1
            goto L18
        L13:
            rt.m3 r0 = new rt.m3
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f50053a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f50055c
            qy.b0 r3 = qy.b0.f48488a
            vt.c r4 = r8.f49493e
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L3d
            if (r2 == r7) goto L39
            if (r2 != r5) goto L31
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r9 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L2f
            goto L56
        L3d:
            com.bumptech.glide.e.F(r9)
            boolean r9 = r8.f49492d0
            if (r9 == 0) goto L68
            boolean r9 = r8.f49494e0
            if (r9 == 0) goto L49
            goto L68
        L49:
            r8.f49494e0 = r7
            r0.f50055c = r7     // Catch: java.lang.Throwable -> L2f
            r9 = r4
            vt.d r9 = (vt.d) r9     // Catch: java.lang.Throwable -> L2f
            r9.d(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 != r1) goto L56
            goto L5f
        L56:
            r0.f50055c = r5     // Catch: java.lang.Throwable -> L2f
            vt.d r4 = (vt.d) r4     // Catch: java.lang.Throwable -> L2f
            r4.j(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 != r1) goto L60
        L5f:
            return r1
        L60:
            r8.f49492d0 = r6     // Catch: java.lang.Throwable -> L2f
            r8.f49494e0 = r6
            return r3
        L65:
            r8.f49494e0 = r6
            throw r9
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.b4.i(xy.c):java.lang.Object");
    }

    public final void j(String str) {
        uz.i1 i1Var;
        Object value;
        ArrayList arrayList;
        av.n nVar = this.L;
        nVar.a();
        nVar.n();
        ht.a aVar = ht.a.f33722e;
        uz.i1 i1Var2 = this.U;
        i1Var2.getClass();
        i1Var2.l(null, aVar);
        uz.i1 i1Var3 = this.S;
        i1Var3.getClass();
        i1Var3.l(null, -1);
        uz.i1 i1Var4 = this.Y;
        i1Var4.getClass();
        i1Var4.l(null, -1);
        int iIntValue = ((Number) this.R.getValue()).intValue();
        do {
            i1Var = this.V;
            value = i1Var.getValue();
            arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : (List) value) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    ns.o.V();
                    throw null;
                }
                nf nfVar = (nf) obj;
                if (i11 < iIntValue || !kotlin.jvm.internal.m.a(nfVar.f50159a.f50109b.getId(), str)) {
                    arrayList.add(obj);
                }
                i11 = i12;
            }
        } while (!i1Var.j(value, arrayList));
    }

    public final void k(m0 m0Var) {
        ka kaVar;
        uz.i1 i1Var;
        Object value;
        Object value2;
        uz.i1 i1Var2 = this.Z;
        Set set = (Set) i1Var2.getValue();
        String str = m0Var.f50042a;
        if (set.contains(str)) {
            return;
        }
        uz.g1 g1Var = (uz.g1) this.f49498h0.get(str);
        vy.d dVar = null;
        if (g1Var != null) {
            kaVar = (ka) g1Var.getValue();
        } else {
            m0 m0Var2 = (m0) this.f49503m0.f53391a.getValue();
            if (!kotlin.jvm.internal.m.a(m0Var2 != null ? m0Var2.f50042a : null, str)) {
                return;
            } else {
                kaVar = (ka) this.f49504n0.f53391a.getValue();
            }
        }
        if (kaVar.f49981a) {
            boolean z11 = !kaVar.f49982b;
            do {
                i1Var = this.f49497g0;
                value = i1Var.getValue();
            } while (!i1Var.j(value, ry.x.d0((Map) value, new qy.l(str, Boolean.valueOf(z11)))));
            do {
                value2 = i1Var2.getValue();
            } while (!i1Var2.j(value2, qx.b.E((Set) value2, str)));
            rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(viewModelScope, yz.e.f58387a, null, new bh.j0(this, m0Var, z11, dVar, 9), 2);
        }
    }

    public final void l(nf nfVar) {
        uz.i1 i1Var;
        Object value;
        pf pfVarA;
        do {
            i1Var = this.T;
            value = i1Var.getValue();
            pf pfVar = (pf) value;
            String cardId = nfVar.f50159a.f50109b.getId();
            of origin = nfVar.f50160b;
            pfVar.getClass();
            kotlin.jvm.internal.m.f(cardId, "cardId");
            kotlin.jvm.internal.m.f(origin, "origin");
            pfVarA = pf.a(pfVar, qx.b.y(pfVar.f50254a, cardId), null, null, 6);
            if (origin == of.ORIGINAL) {
                pfVarA = pf.a(pfVarA, null, qx.b.y(pfVarA.f50255b, cardId), qx.b.E(pfVarA.f50256c, cardId), 1);
            }
        } while (!i1Var.j(value, pfVarA));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ia.e(this.K);
        super.onCleared();
        this.L.b();
    }
}

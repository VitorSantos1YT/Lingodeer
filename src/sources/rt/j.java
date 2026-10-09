package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends ViewModel {
    public final vt.p0 H;
    public final String K;
    public final String L;
    public final jr.i0 M;
    public final uz.i1 N;
    public final v8 O;
    public final uz.i1 P;
    public final uz.i1 Q;
    public final uz.i1 R;
    public final uz.i1 S;
    public final uz.i1 T;
    public final uz.i1 U;
    public final uz.i1 V;
    public final uz.i1 W;
    public final uz.i1 X;
    public volatile boolean Y;
    public volatile String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8 f49892a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String f49893a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49894b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final a9.i f49895b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f49896c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final uz.r0 f49897c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.k0 f49898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.n0 f49899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt.e f49900f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vt.h f49901t;

    public j(x8 x8Var, boolean z11, boolean z12, r6 r6Var, vt.c cVar, vt.h1 h1Var, vt.k0 k0Var, vt.n0 n0Var, wt.b0 b0Var, vt.e eVar, vt.h hVar, vt.p0 p0Var, String str, String str2, jr.i0 i0Var) {
        j jVar;
        this.f49892a = x8Var;
        this.f49894b = z11;
        this.f49896c = cVar;
        this.f49898d = k0Var;
        this.f49899e = n0Var;
        this.f49900f = eVar;
        this.f49901t = hVar;
        this.H = p0Var;
        this.K = str;
        this.L = str2;
        this.M = i0Var;
        uz.i1 i1VarC = uz.x0.c(u8.f50486b);
        this.N = i1VarC;
        v8 v8Var = new v8();
        this.O = v8Var;
        uz.i1 i1VarC2 = uz.x0.c(ry.r.f50854a);
        this.P = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(r8.COMPREHENSIVE);
        this.Q = i1VarC3;
        uz.i1 i1VarC4 = uz.x0.c(null);
        this.R = i1VarC4;
        uz.i1 i1VarC5 = uz.x0.c(j8.f49923a);
        this.S = i1VarC5;
        uz.i1 i1VarC6 = uz.x0.c(i0.f49858a);
        this.T = i1VarC6;
        uz.i1 i1VarC7 = uz.x0.c(0);
        ry.t tVar = ry.t.f50856a;
        uz.i1 i1VarC8 = uz.x0.c(tVar);
        this.U = i1VarC8;
        ry.s sVar = ry.s.f50855a;
        uz.i1 i1VarC9 = uz.x0.c(sVar);
        this.V = i1VarC9;
        uz.i1 i1VarC10 = uz.x0.c(tVar);
        this.W = i1VarC10;
        uz.i1 i1VarC11 = uz.x0.c(sVar);
        this.X = i1VarC11;
        uz.i accessFlow = ((fr.x4) h1Var).j();
        String strK = xt.d.k(((fr.o0) n0Var).f27733a.keyLanguage);
        this.f49893a0 = strK;
        bh.i0 i0VarE = ((vt.r) hVar).e(strK, str);
        kotlin.jvm.internal.m.f(accessFlow, "accessFlow");
        vy.d dVar = null;
        uz.m0 m0VarJ = uz.x0.j(r6Var, accessFlow, i1VarC7, new z7(z11, i1VarC, v8Var, n0Var, k0Var, x8Var, null));
        uz.i1 i1Var = ((vt.d) cVar).f54195e;
        int i11 = 3;
        uz.m0 m0VarK = uz.x0.k(m0VarJ, uz.x0.z(new ns.j(b0Var, dVar, 22), new no.g(i1VarC, new no.g(i1VarC7, i1Var, new ad.a0(3, 7, null)), new g.k(i11, dVar))), i1VarC2, i1VarC3, new no.g(accessFlow, i1Var, new c(i11, 0, dVar)), new y7(x8Var, null));
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar2 = yz.e.f58387a;
        uz.i baseUiStateFlow = uz.x0.w(m0VarK, eVar2);
        a aVar = new a(this, 0);
        a aVar2 = new a(this, 1);
        a aVar3 = new a(this, 2);
        ot.e2 e2Var = new ot.e2(this, 18);
        kotlin.jvm.internal.m.f(baseUiStateFlow, "baseUiStateFlow");
        int i12 = 18;
        uz.m0 m0VarK2 = uz.x0.k(baseUiStateFlow, new no.g(i1VarC8, i1VarC9, new fr.f4(i11, 10, dVar)), i1VarC10, uz.x0.j(i0VarE, i1VarC5, i1VarC6, new kr.u(4, i11, dVar)), i1VarC11, new c8(z11, z12, true, z11, e2Var, i1VarC, aVar3, i1VarC2, aVar, aVar2, null));
        rz.b0 scope = ViewModelKt.getViewModelScope(this);
        ro.e eVar3 = new ro.e(i11);
        t8 t8Var = new t8(2, null);
        kotlin.jvm.internal.m.f(scope, "scope");
        a9.i iVar = new a9.i();
        iVar.f517a = eVar3;
        iVar.f518b = t8Var;
        iVar.f519c = new LinkedHashMap();
        iVar.f520d = new Object();
        iVar.f521e = qx.p.b(-1, 6, null);
        rz.e0.B(scope, null, null, new bh.z(iVar, null), 3);
        this.f49895b0 = iVar;
        no.g gVar = new no.g(m0VarK2, i1VarC4, new fr.f4(i11, 5, dVar));
        rz.b0 scope2 = ViewModelKt.getViewModelScope(this);
        kotlin.jvm.internal.m.f(scope2, "scope");
        this.f49897c0 = uz.x0.A(gVar, scope2, uz.a1.a(2), e8.f49685a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), eVar2, null, new kr.w(29, eVar, this, str, dVar), 2);
        if (str2 == null) {
            jVar = this;
        } else {
            jVar = this;
            rz.e0.B(ViewModelKt.getViewModelScope(this), eVar2, null, new h(p0Var, this, str2, dVar, 0), 2);
        }
        rz.e0.B(ViewModelKt.getViewModelScope(jVar), null, null, new mv.f0(jVar, dVar, i12), 3);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da A[LOOP:0: B:50:0x00da->B:61:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (((vt.r) r13).c("__default_bookmark_folder__", r11, r1) == r2) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rt.j r11, com.lingodeer.data.model.uistate.WordSentenceCharacterType r12, xy.c r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.j.a(rt.j, com.lingodeer.data.model.uistate.WordSentenceCharacterType, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(j jVar, xy.c cVar) {
        f fVar;
        r8 r8VarA;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f49707c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f49707c = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jVar, cVar);
            }
        } else {
            fVar = new f(jVar, cVar);
        }
        Object objU = fVar.f49705a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f49707c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            gp.r rVarE = ((bh.a1) jVar.f49898d).e(((fr.o0) jVar.f49899e).f27733a.keyLanguage, false);
            fVar.f49707c = 1;
            objU = uz.x0.u(rVarE, fVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        LearnProgress learnProgress = (LearnProgress) objU;
        uz.i1 i1Var = jVar.Q;
        int i13 = b.f49471a[jVar.f49892a.ordinal()];
        if (i13 == 1) {
            q8 q8Var = r8.Companion;
            int reviewPracticeModelChar = learnProgress.getReviewPracticeModelChar();
            q8Var.getClass();
            r8VarA = q8.a(reviewPracticeModelChar);
        } else if (i13 == 2) {
            q8 q8Var2 = r8.Companion;
            int reviewPracticeModelWord = learnProgress.getReviewPracticeModelWord();
            q8Var2.getClass();
            r8VarA = q8.a(reviewPracticeModelWord);
        } else if (i13 == 3) {
            q8 q8Var3 = r8.Companion;
            int reviewPracticeModelSent = learnProgress.getReviewPracticeModelSent();
            q8Var3.getClass();
            r8VarA = q8.a(reviewPracticeModelSent);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            q8 q8Var4 = r8.Companion;
            int reviewPracticeModelWord2 = learnProgress.getReviewPracticeModelWord();
            q8Var4.getClass();
            r8VarA = q8.a(reviewPracticeModelWord2);
        }
        i1Var.k(r8VarA);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018f, code lost:
    
        if (((bh.a1) r2).i(r0, false, r3) == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(rt.j r44, rt.r8 r45, xy.c r46) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.j.c(rt.j, rt.r8, xy.c):java.lang.Object");
    }

    public final List d(List list) {
        String str = this.K;
        if (str == null) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = w8.a(w8.c((WordSentenceCharacterType) it.next()).longValue(), this.f49893a0, str);
            if (strA != null) {
                arrayList.add(strA);
            }
        }
        return ry.m.j0(arrayList);
    }

    public final void f(t7 t7Var) {
        Object value;
        n8 n8VarC;
        Object value2;
        n8 n8VarA;
        Object value3;
        n8 n8Var;
        int i11 = 2;
        if (t7Var instanceof i7) {
            uz.i1 selection = this.N;
            v8 selectionRestoreGuard = this.O;
            i7 i7Var = (i7) t7Var;
            y8 courseReviewUnit = i7Var.f49876a;
            boolean z11 = i7Var.f49877b;
            mt.c4 c4Var = new mt.c4(1, this, j.class, "persistSelectionIfNeeded", "persistSelectionIfNeeded(Lcom/lingodeer/course/viewmodels/CourseReviewSelection;)V", 0, 14);
            kotlin.jvm.internal.m.f(selection, "selection");
            kotlin.jvm.internal.m.f(selectionRestoreGuard, "selectionRestoreGuard");
            kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
            c4Var.invoke(selectionRestoreGuard.a(selection, new mt.x4(courseReviewUnit, z11, 2)));
            return;
        }
        if (t7Var instanceof h7) {
            uz.i1 selection2 = this.N;
            v8 selectionRestoreGuard2 = this.O;
            h7 h7Var = (h7) t7Var;
            String reviewId = h7Var.f49833a;
            long j11 = h7Var.f49834b;
            boolean z12 = h7Var.f49835c;
            mt.c4 c4Var2 = new mt.c4(1, this, j.class, "persistSelectionIfNeeded", "persistSelectionIfNeeded(Lcom/lingodeer/course/viewmodels/CourseReviewSelection;)V", 0, 15);
            kotlin.jvm.internal.m.f(selection2, "selection");
            kotlin.jvm.internal.m.f(selectionRestoreGuard2, "selectionRestoreGuard");
            kotlin.jvm.internal.m.f(reviewId, "reviewId");
            c4Var2.invoke(selectionRestoreGuard2.a(selection2, new d1.f(reviewId, j11, z12)));
            return;
        }
        int i12 = 3;
        vy.d dVar = null;
        if (t7Var instanceof j7) {
            rz.b0 scope = ViewModelKt.getViewModelScope(this);
            uz.i1 expandedUnits = this.P;
            y8 y8VarA = y8.a(((j7) t7Var).f49922a, 0, 0, false, false, false, null, 927);
            yz.f fVar = rz.o0.f50940a;
            yz.e dispatcher = yz.e.f58387a;
            kotlin.jvm.internal.m.f(scope, "scope");
            kotlin.jvm.internal.m.f(dispatcher, "dispatcher");
            kotlin.jvm.internal.m.f(expandedUnits, "expandedUnits");
            rz.e0.B(scope, null, null, new h(dispatcher, expandedUnits, y8VarA, dVar, 7), 3);
            return;
        }
        int i13 = 4;
        if (t7Var instanceof g7) {
            this.Q.k(((g7) t7Var).f49785a);
            this.f49895b0.z(s8.PRACTICE_MODEL, new dv.b(4, this, t7Var, null));
            return;
        }
        if (t7Var instanceof l7) {
            uz.i1 i1Var = this.R;
            l7 l7Var = (l7) t7Var;
            List list = l7Var.f50018a;
            n8 n8VarC2 = d8.c(new n8(list, l7Var.f50019b, (r8) this.Q.getValue(), p8.ALL, ew.a.E(list, 20, null, 12), ew.a.E(list, 40, null, 12)));
            i1Var.getClass();
            i1Var.l(null, n8VarC2);
            return;
        }
        if (t7Var instanceof q7) {
            uz.i1 i1Var2 = this.R;
            do {
                value3 = i1Var2.getValue();
                n8Var = (n8) value3;
            } while (!i1Var2.j(value3, n8Var != null ? d8.c(n8.a(n8Var, null, ((q7) t7Var).f50291a, null, null, 55)) : null));
            return;
        }
        if (t7Var instanceof r7) {
            uz.i1 i1Var3 = this.R;
            do {
                value2 = i1Var3.getValue();
                n8VarA = (n8) value2;
                if (n8VarA == null) {
                    n8VarA = null;
                } else {
                    o8 o8VarB = d8.b(n8VarA);
                    r7 r7Var = (r7) t7Var;
                    r8 practiceModel = r7Var.f50342a;
                    kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
                    if (o8VarB.f50203f.contains(practiceModel)) {
                        n8VarA = n8.a(n8VarA, r7Var.f50342a, null, null, null, 59);
                    }
                }
            } while (!i1Var3.j(value2, n8VarA));
            return;
        }
        if (t7Var.equals(m7.f50066a)) {
            uz.i1 i1Var4 = this.R;
            do {
                value = i1Var4.getValue();
                n8 n8Var2 = (n8) value;
                if (n8Var2 != null) {
                    List list2 = n8Var2.f50135a;
                    List list3 = n8Var2.f50139e;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((k6) it.next()).f49972c.getId());
                    }
                    List listE = ew.a.E(list2, 20, linkedHashSet, 8);
                    List list4 = n8Var2.f50135a;
                    List list5 = n8Var2.f50140f;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet2.add(((k6) it2.next()).f49972c.getId());
                    }
                    n8VarC = d8.c(n8.a(n8Var2, null, null, listE, ew.a.E(list4, 40, linkedHashSet2, 8), 15));
                } else {
                    n8VarC = null;
                }
            } while (!i1Var4.j(value, n8VarC));
            return;
        }
        int i14 = 27;
        if (t7Var.equals(o7.f50197a)) {
            g8 g8Var = (g8) this.f49897c0.f53391a.getValue();
            if (g8Var instanceof f8) {
                u8 u8VarJ = ef.e.j(((f8) g8Var).f49746e);
                v8 v8Var = this.O;
                uz.i1 selection3 = this.N;
                v8Var.getClass();
                kotlin.jvm.internal.m.f(selection3, "selection");
                g(v8Var.a(selection3, new ot.e2(u8VarJ, i14)));
                return;
            }
            return;
        }
        if (t7Var.equals(e7.f49684a)) {
            v8 v8Var2 = this.O;
            uz.i1 selection4 = this.N;
            u8 value4 = u8.f50486b;
            v8Var2.getClass();
            kotlin.jvm.internal.m.f(selection4, "selection");
            kotlin.jvm.internal.m.f(value4, "value");
            g(v8Var2.a(selection4, new ot.e2(value4, i14)));
            return;
        }
        if (!(t7Var instanceof p7)) {
            if (t7Var instanceof d7) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new d(this, t7Var, dVar, i13), 3);
                return;
            }
            if (t7Var instanceof f7) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new d(t7Var, this, null), 3);
                return;
            }
            if (t7Var.equals(c7.f49568a)) {
                uz.i1 i1Var5 = this.T;
                i0 i0Var = i0.f49858a;
                i1Var5.getClass();
                i1Var5.l(null, i0Var);
                return;
            }
            if (t7Var instanceof k7) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new d(this, t7Var, dVar, 1), 3);
                return;
            } else if (t7Var instanceof s7) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new d(this, t7Var, dVar, i11), 3);
                return;
            } else {
                if (!(t7Var instanceof n7)) {
                    throw new NoWhenBranchMatchedException();
                }
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new d(this, t7Var, dVar, i12), 3);
                return;
            }
        }
        u8 u8Var = u8.f50486b;
        g(u8Var);
        this.N.k(u8Var);
        uz.i1 i1Var6 = this.W;
        ry.t tVar = ry.t.f50856a;
        i1Var6.getClass();
        i1Var6.l(null, tVar);
        this.Z = null;
        this.Y = false;
        uz.i1 i1Var7 = this.P;
        ry.r rVar = ry.r.f50854a;
        i1Var7.getClass();
        i1Var7.l(null, rVar);
        p7 p7Var = (p7) t7Var;
        if (kotlin.jvm.internal.m.a(p7Var.f50242a, "__default_bookmark_folder__")) {
            uz.i1 i1Var8 = this.S;
            i8 i8Var = i8.f49878a;
            i1Var8.getClass();
            i1Var8.l(null, i8Var);
            return;
        }
        uz.i1 i1Var9 = this.S;
        h8 h8Var = new h8(p7Var.f50242a);
        i1Var9.getClass();
        i1Var9.l(null, h8Var);
    }

    public final void g(u8 u8Var) {
        if (this.S.getValue() instanceof j8) {
            this.f49895b0.z(s8.SELECTION, new dv.b(5, this, u8Var, null));
        }
    }

    public final Object h(long j11, boolean z11, xy.c cVar) {
        String str;
        vt.e eVar = this.f49900f;
        if (eVar != null && (str = this.K) != null) {
            String strK = xt.d.k(((fr.o0) this.f49899e).f27733a.keyLanguage);
            Object objA = ((fr.r) eVar).a(strK, w8.a(j11, strK, str), z11, str, cVar);
            if (objA == wy.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return qy.b0.f48488a;
    }
}

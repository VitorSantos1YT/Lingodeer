package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y9 extends ViewModel {
    public int K;
    public final uz.i1 L;
    public final uz.i1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public int Q;
    public boolean R;
    public final uz.i1 S;
    public final uz.r0 T;
    public final qy.q U;
    public final uz.i1 V;
    public final uz.i1 W;
    public final uz.i1 X;
    public final uz.i1 Y;
    public final uz.i1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f50701a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final uz.r0 f50702a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f50703b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final uz.r0 f50704b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.e f50705c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final uz.i1 f50706c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.p0 f50707d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ot.j1 f50708d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.h f50709e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final uz.i1 f50710e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.b0 f50711f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final uz.i1 f50712f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final LinkedHashMap f50713g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final LinkedHashMap f50714h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final uz.i1 f50715i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final uz.r0 f50716j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final uz.r0 f50717k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final uz.r0 f50718l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final uz.r0 f50719m0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f50720t = new LinkedHashMap();
    public LinkedHashMap H = new LinkedHashMap();

    public y9(vt.n0 n0Var, vt.c cVar, vt.e eVar, vt.p0 p0Var, vt.h hVar, wt.b0 b0Var) {
        this.f50701a = n0Var;
        this.f50703b = cVar;
        this.f50705c = eVar;
        this.f50707d = p0Var;
        this.f50709e = hVar;
        this.f50711f = b0Var;
        uz.i1 i1VarC = uz.x0.c(0);
        this.L = i1VarC;
        this.M = uz.x0.c(0);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        uz.i1 i1VarC2 = uz.x0.c(0L);
        this.S = i1VarC2;
        this.T = new uz.r0(i1VarC2);
        this.U = com.bumptech.glide.d.v(new m9(0));
        uz.i1 i1VarC3 = uz.x0.c(ry.r.f50854a);
        this.V = i1VarC3;
        uz.i1 i1VarC4 = uz.x0.c(0);
        this.W = i1VarC4;
        uz.i1 i1VarC5 = uz.x0.c(0);
        this.X = i1VarC5;
        uz.i1 i1VarC6 = uz.x0.c(0);
        this.Y = i1VarC6;
        ry.t tVar = ry.t.f50856a;
        uz.i1 i1VarC7 = uz.x0.c(tVar);
        this.Z = i1VarC7;
        this.f50702a0 = new uz.r0(i1VarC6);
        this.f50704b0 = new uz.r0(i1VarC7);
        this.f50706c0 = uz.x0.c(eb.f49693a);
        this.f50710e0 = uz.x0.c(tVar);
        uz.i1 i1VarC8 = uz.x0.c(ry.s.f50855a);
        this.f50712f0 = i1VarC8;
        this.f50713g0 = new LinkedHashMap();
        this.f50714h0 = new LinkedHashMap();
        uz.i1 i1VarC9 = uz.x0.c(n.f50107a);
        this.f50715i0 = i1VarC9;
        this.f50716j0 = new uz.r0(i1VarC9);
        vy.d dVar = null;
        uz.r0 r0VarA = uz.x0.A(new bh.r(uz.x0.A(new no.g(i1VarC4, i1VarC3, new rm.c(3, 2, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null), this, 24), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
        this.f50717k0 = r0VarA;
        uz.r0 r0VarA2 = uz.x0.A(uz.x0.B(r0VarA, new w9(0, this, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
        int i11 = 4;
        this.f50718l0 = uz.x0.A(uz.x0.j(r0VarA, r0VarA2, i1VarC8, new n9(i11, 1, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ka(false, false));
        uz.x0.A(uz.x0.B(r0VarA, new w9(1, this, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new dc(false, BuildConfig.VERSION_NAME));
        uz.x0.y(new n9.n1(new gp.t(uz.x0.j(r0VarA, r0VarA2, i1VarC8, new n9(i11, 0, dVar)), 17), new nu.b(this, dVar, 6), 5), ViewModelKt.getViewModelScope(this));
        this.f50719m0 = uz.x0.A(uz.x0.w(uz.x0.j(i1VarC5, i1VarC3, i1VarC, new v9(this, null)), yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), ec.f49694a);
    }

    public static final Object a(y9 y9Var, ja jaVar, xy.i iVar) {
        Object objD;
        wt.b0 b0Var = y9Var.f50711f;
        return (b0Var != null && jaVar.f49928b.equals("course_w") && jaVar.f49931e == 0 && (objD = b0Var.d(jaVar.f49932f, jaVar.f49930d, iVar)) == wy.a.COROUTINE_SUSPENDED) ? objD : qy.b0.f48488a;
    }

    public static final Object b(y9 y9Var, ja jaVar, String str, xy.i iVar) {
        vt.h hVar = y9Var.f50709e;
        if (hVar != null) {
            Object objC = ((vt.r) hVar).c(str, ns.o.K(jaVar.f49927a), iVar);
            if (objC == wy.a.COROUTINE_SUSPENDED) {
                return objC;
            }
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ja k(y9 y9Var, String str, long j11, long j12, boolean z11, int i11) {
        char c11;
        String str2;
        int i12;
        long j13 = (i11 & 4) != 0 ? -1L : j12;
        boolean z12 = (i11 & 8) != 0 ? true : z11;
        vt.n0 n0Var = y9Var.f50701a;
        if (j11 <= 0) {
            return null;
        }
        String strQ = kotlin.jvm.internal.m.a(str, "course_c") ? y9Var.q() : str;
        switch (strQ.hashCode()) {
            case -368357057:
                if (!strQ.equals("course_c")) {
                    return null;
                }
                break;
            case -368357041:
                if (!strQ.equals("course_s")) {
                    return null;
                }
                break;
            case -368357037:
                if (!strQ.equals("course_w")) {
                    return null;
                }
                break;
            case 101815575:
                if (!strQ.equals("kanji")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        int iHashCode = strQ.hashCode();
        if (iHashCode != -368357057) {
            if (iHashCode != -368357041) {
                if (iHashCode != -368357037 || !strQ.equals("course_w")) {
                    return null;
                }
                c11 = 0;
            } else {
                if (!strQ.equals("course_s")) {
                    return null;
                }
                c11 = 1;
            }
        } else {
            if (!strQ.equals("course_c")) {
                return null;
            }
            c11 = 2;
        }
        int iHashCode2 = strQ.hashCode();
        if (iHashCode2 != -368357057) {
            if (iHashCode2 != -368357041) {
                if (iHashCode2 != -368357037 || !strQ.equals("course_w")) {
                    return null;
                }
                str2 = "w";
            } else {
                if (!strQ.equals("course_s")) {
                    return null;
                }
                str2 = "s";
            }
        } else {
            if (!strQ.equals("course_c")) {
                return null;
            }
            str2 = "c";
        }
        fr.o0 o0Var = (fr.o0) n0Var;
        return new ja(w8.a(j11, xt.d.k(o0Var.f27733a.keyLanguage), strQ), strQ, str2, j11, c11, j13, z12 && !(strQ.equals("course_c") && ((i12 = o0Var.f27733a.keyLanguage) == 51 || i12 == 55 || i12 == 57 || i12 == 61 || i12 == 63)));
    }

    public abstract Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar);

    public Object C(ot.j1 j1Var, t9 t9Var) {
        return qy.b0.f48488a;
    }

    public final void D(ja jaVar, String str) {
        vt.p0 p0Var;
        if (jaVar.f49933g && (p0Var = this.f50707d) != null) {
            rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(viewModelScope, yz.e.f58387a, null, new jr.i0(p0Var, this, jaVar, str, null, 24), 2);
        }
    }

    public final void E(long j11, String bookmarkValue, String note) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        kotlin.jvm.internal.m.f(note, "note");
        ja jaVarK = k(this, bookmarkValue, j11, 0L, false, 12);
        if (jaVarK == null) {
            return;
        }
        D(jaVarK, note);
    }

    public final void F(ht.o params, String note) {
        kotlin.jvm.internal.m.f(params, "params");
        kotlin.jvm.internal.m.f(note, "note");
        ja jaVarJ = j(params);
        if (jaVarJ == null) {
            return;
        }
        D(jaVarJ, note);
    }

    public final void G(ja jaVar) {
        boolean z11;
        uz.i1 i1Var;
        Object value;
        Object value2;
        boolean z12 = jaVar.f49933g;
        String str = jaVar.f49927a;
        if (z12) {
            uz.i1 i1Var2 = this.f50710e0;
            if (((Set) i1Var2.getValue()).contains(str)) {
                return;
            }
            uz.g1 g1Var = (uz.g1) this.f50713g0.get(str);
            vy.d dVar = null;
            if (g1Var != null) {
                z11 = ((ka) g1Var.getValue()).f49982b;
            } else {
                ja jaVar2 = (ja) this.f50717k0.f53391a.getValue();
                z11 = kotlin.jvm.internal.m.a(jaVar2 != null ? jaVar2.f49927a : null, str) ? ((ka) this.f50718l0.f53391a.getValue()).f49982b : false;
            }
            boolean z13 = !z11;
            do {
                i1Var = this.f50712f0;
                value = i1Var.getValue();
            } while (!i1Var.j(value, ry.x.d0((Map) value, new qy.l(str, Boolean.valueOf(z13)))));
            do {
                value2 = i1Var2.getValue();
            } while (!i1Var2.j(value2, qx.b.E((Set) value2, str)));
            rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(viewModelScope, yz.e.f58387a, null, new bh.j0(this, jaVar, z13, dVar, 10), 2);
        }
    }

    public final void H(long j11, long j12, String bookmarkValue) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        ja jaVarK = k(this, bookmarkValue, j11, j12, false, 8);
        if (jaVarK == null) {
            return;
        }
        G(jaVarK);
    }

    public final void c(ja target, String folderId) {
        y9 y9Var;
        uz.i1 i1Var;
        Object value;
        kotlin.jvm.internal.m.f(target, "target");
        kotlin.jvm.internal.m.f(folderId, "folderId");
        uz.i1 i1Var2 = this.f50710e0;
        Set set = (Set) i1Var2.getValue();
        String str = target.f49927a;
        vy.d dVar = null;
        if (set.contains(str)) {
            rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(viewModelScope, yz.e.f58387a, null, new o9(this, target, folderId, dVar, 0), 2);
            return;
        }
        do {
            y9Var = this;
            i1Var = y9Var.f50712f0;
            value = i1Var.getValue();
        } while (!i1Var.j(value, ry.x.d0((Map) value, new qy.l(str, Boolean.TRUE))));
        while (true) {
            Object value2 = i1Var2.getValue();
            if (i1Var2.j(value2, qx.b.E((Set) value2, str))) {
                rz.b0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
                yz.f fVar2 = rz.o0.f50940a;
                rz.e0.B(viewModelScope2, yz.e.f58387a, null, new o9(y9Var, target, folderId, dVar, 1), 2);
                return;
            }
            y9Var = this;
        }
    }

    public final void d(long j11) {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0.z1(1, j11, this, null), 3);
    }

    public final ja f(long j11, long j12, String bookmarkValue) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        ja jaVarK = k(this, bookmarkValue, j11, j12, false, 8);
        if (jaVarK == null || !jaVarK.f49933g) {
            return null;
        }
        return jaVarK;
    }

    public final ja g(ht.o params) {
        kotlin.jvm.internal.m.f(params, "params");
        ja jaVarJ = j(params);
        if (jaVarJ == null || !jaVarJ.f49933g) {
            return null;
        }
        return jaVarJ;
    }

    public final uz.g1 h(long j11, String bookmarkValue) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        ja jaVarK = k(this, bookmarkValue, j11, 0L, false, 12);
        if (jaVarK == null) {
            return uz.x0.c(new ka(false, false));
        }
        String str = jaVarK.f49927a;
        LinkedHashMap linkedHashMap = this.f50713g0;
        Object objM = linkedHashMap.get(str);
        if (objM == null) {
            objM = m(jaVarK);
            linkedHashMap.put(str, objM);
        }
        return (uz.g1) objM;
    }

    public final uz.g1 i(ht.o params) {
        kotlin.jvm.internal.m.f(params, "params");
        ja jaVarJ = j(params);
        if (jaVarJ == null) {
            return uz.x0.c(new ka(false, false));
        }
        String str = jaVarJ.f49927a;
        LinkedHashMap linkedHashMap = this.f50713g0;
        Object objM = linkedHashMap.get(str);
        if (objM == null) {
            objM = m(jaVarJ);
            linkedHashMap.put(str, objM);
        }
        return (uz.g1) objM;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001f  */
    public final ja j(ht.o oVar) {
        String strQ;
        String str;
        if (oVar != null) {
            int i11 = oVar.f33753a;
            if (i11 == 0) {
                strQ = "course_w";
            } else if (i11 != 1) {
                if (i11 != 2) {
                    str = null;
                } else {
                    strQ = q();
                }
                if (str != null) {
                    return k(this, str, oVar.f33754b, 0L, oVar.f33765n, 4);
                }
            } else {
                strQ = "course_s";
            }
            str = strQ;
            if (str != null) {
                return k(this, str, oVar.f33754b, 0L, oVar.f33765n, 4);
            }
        }
        return null;
    }

    public final void l() {
        uz.i1 i1Var = this.f50715i0;
        i1Var.getClass();
        i1Var.l(null, n.f50107a);
    }

    public final uz.g1 m(ja jaVar) {
        if (!jaVar.f49933g) {
            return uz.x0.c(new ka(false, false));
        }
        return uz.x0.A(new no.g(((fr.r) this.f50705c).d(jaVar.f49927a), this.f50712f0, new mv.x(jaVar, null, 5)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ka(true, false));
    }

    public final void n(ja target, String name) {
        kotlin.jvm.internal.m.f(target, "target");
        kotlin.jvm.internal.m.f(name, "name");
        rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
        yz.f fVar = rz.o0.f50940a;
        rz.e0.B(viewModelScope, yz.e.f58387a, null, new o9(this, target, name, null, 2), 2);
    }

    public final uz.g1 o(ja jaVar) {
        if (!jaVar.f49933g) {
            return uz.x0.c(new dc(false, BuildConfig.VERSION_NAME));
        }
        vt.p0 p0Var = this.f50707d;
        if (p0Var == null) {
            return uz.x0.c(new dc(false, BuildConfig.VERSION_NAME));
        }
        return uz.x0.A(new s3(((fr.x0) p0Var).c(com.bumptech.glide.g.h(jaVar.f49930d, xt.d.k(((fr.o0) this.f50701a).f27733a.keyLanguage), jaVar.f49929c)), 1), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new dc(true, BuildConfig.VERSION_NAME));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        qy.q qVar = this.U;
        if (qVar.a()) {
            ia.e((fv.c) qVar.getValue());
        }
        super.onCleared();
    }

    public final String p() {
        ht.o oVarA;
        ot.j1 j1Var = this.f50708d0;
        if (j1Var == null || (oVarA = j1Var.a()) == null) {
            return null;
        }
        return oVarA.f33753a + ";" + oVarA.f33754b + ";" + oVarA.f33755c;
    }

    public String q() {
        return "course_c";
    }

    public final fv.c r() {
        return (fv.c) this.U.getValue();
    }

    public boolean s() {
        return false;
    }

    public final void t(cc ccVar) {
        vy.d dVar = null;
        if (ccVar instanceof wb) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new q9(this, ccVar, dVar, 0), 3);
            return;
        }
        if (ccVar.equals(xb.f50655a)) {
            uz.i1 i1Var = this.W;
            i1Var.l(null, Integer.valueOf(((Number) i1Var.getValue()).intValue() + 1));
            return;
        }
        if (ccVar.equals(yb.f50724a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new r9(0, this, dVar), 3);
            return;
        }
        if (ccVar.equals(zb.f50802a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new r9(1, this, dVar), 3);
            return;
        }
        if (!(ccVar instanceof ac)) {
            if (!(ccVar instanceof bc)) {
                throw new NoWhenBranchMatchedException();
            }
            ot.j1 j1Var = this.f50708d0;
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new s9(this, j1Var != null ? j1Var.a() : null, ccVar, dVar, 1), 3);
            if (((bc) ccVar).f49545c) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new q9(this, ccVar, dVar, 2), 3);
                return;
            }
            return;
        }
        uz.i1 i1Var2 = this.L;
        i1Var2.l(null, Integer.valueOf(((Number) i1Var2.getValue()).intValue() + 1));
        this.Q = 0;
        ot.j1 j1Var2 = this.f50708d0;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new s9(this, j1Var2 != null ? j1Var2.a() : null, ccVar, dVar, 0), 3);
        if (((ac) ccVar).f49458c) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new q9(this, ccVar, dVar, 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (C(r6, r4) == r5) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [uz.i1] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [ot.j1] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(boolean r25, boolean r26, xy.c r27) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.y9.u(boolean, boolean, xy.c):java.lang.Object");
    }

    public final uz.g1 v(long j11, String bookmarkValue) {
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        ja jaVarK = k(this, bookmarkValue, j11, 0L, false, 12);
        if (jaVarK == null) {
            return uz.x0.c(new dc(false, BuildConfig.VERSION_NAME));
        }
        String str = jaVarK.f49927a;
        LinkedHashMap linkedHashMap = this.f50714h0;
        Object objO = linkedHashMap.get(str);
        if (objO == null) {
            objO = o(jaVarK);
            linkedHashMap.put(str, objO);
        }
        return (uz.g1) objO;
    }

    public final uz.g1 w(ht.o params) {
        kotlin.jvm.internal.m.f(params, "params");
        ja jaVarJ = j(params);
        if (jaVarJ == null) {
            return uz.x0.c(new dc(false, BuildConfig.VERSION_NAME));
        }
        String str = jaVarJ.f49927a;
        LinkedHashMap linkedHashMap = this.f50714h0;
        Object objO = linkedHashMap.get(str);
        if (objO == null) {
            objO = o(jaVarJ);
            linkedHashMap.put(str, objO);
        }
        return (uz.g1) objO;
    }

    public final void x() {
        uz.i1 i1Var = this.X;
        i1Var.l(null, Integer.valueOf(((Number) i1Var.getValue()).intValue() + 1));
        String strP = p();
        if (strP != null) {
            ArrayList arrayList = this.P;
            if (arrayList.contains(strP)) {
                return;
            }
            arrayList.add(strP);
        }
    }

    public final uz.g1 y(ja jaVar) {
        String str = jaVar.f49928b;
        ry.r rVar = ry.r.f50854a;
        vt.h hVar = this.f50709e;
        if (hVar == null) {
            return uz.x0.c(rVar);
        }
        fr.o0 o0Var = (fr.o0) this.f50701a;
        return uz.x0.A(new no.g(((vt.r) hVar).e(xt.d.k(o0Var.f27733a.keyLanguage), str), ((fr.r) this.f50705c).b(xt.d.k(o0Var.f27733a.keyLanguage), str), new t3(3, 1, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), rVar);
    }

    public Object z(t9 t9Var) {
        return qy.b0.f48488a;
    }

    public void B(int i11, long j11, boolean z11) {
    }
}

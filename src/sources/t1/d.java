package t1;

import b0.e2;
import b0.t1;
import java.util.ArrayList;
import kotlin.jvm.internal.c0;
import l1.n;
import l1.s;
import l1.x1;
import l1.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f51982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1 f51983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f51984e;

    public d(Object obj, boolean z11, int i11) {
        this.f51980a = i11;
        this.f51981b = z11;
        this.f51982c = obj;
    }

    public final Object a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = sVar.f(this) ? e.a(2, 5) : e.a(1, 5);
        Object obj = this.f51982c;
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(7, obj);
        Object objInvoke = ((fz.j) obj).invoke(num, num2, num3, num4, num5, sVar, Integer.valueOf(i11 | iA));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(this, num, num2, num3, num4, num5, i11, 10);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = sVar.f(this) ? e.a(2, 4) : e.a(1, 4);
        Object obj5 = this.f51982c;
        kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(6, obj5);
        Object objG = ((fz.i) obj5).g(obj, obj2, obj3, obj4, sVar, Integer.valueOf(iA | i11));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e2(this, obj, obj2, obj3, obj4, i11);
        }
        return objG;
    }

    public final Object d(Object obj, Object obj2, Object obj3, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = sVar.f(this) ? e.a(2, 3) : e.a(1, 3);
        Object obj4 = this.f51982c;
        kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(5, obj4);
        Object objI = ((fz.h) obj4).i(obj, obj2, obj3, sVar, Integer.valueOf(iA | i11));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(this, obj, obj2, obj3, i11, 16);
        }
        return objI;
    }

    public final Object e(Object obj, Object obj2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = sVar.f(this) ? e.a(2, 2) : e.a(1, 2);
        Object obj3 = this.f51982c;
        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(4, obj3);
        Object objF = ((fz.g) obj3).f(obj, obj2, sVar, Integer.valueOf(iA | i11));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(this, obj, obj2, i11, 2);
        }
        return objF;
    }

    @Override // fz.g
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (n) obj3, ((Number) obj4).intValue());
    }

    @Override // fz.i
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return c(obj, obj2, obj3, obj4, (n) obj5, ((Number) obj6).intValue());
    }

    public final Object h(Object obj, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = sVar.f(this) ? e.a(2, 1) : e.a(1, 1);
        Object obj2 = this.f51982c;
        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(3, obj2);
        Object objInvoke = ((fz.f) obj2).invoke(obj, sVar, Integer.valueOf(iA | i11));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, 23, obj);
        }
        return objInvoke;
    }

    @Override // fz.h
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d(obj, obj2, obj3, (n) obj4, ((Number) obj5).intValue());
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return j((n) obj, ((Number) obj2).intValue());
    }

    public final Object j(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(this.f51980a);
        k(sVar);
        int iA = i11 | (sVar.f(this) ? e.a(2, 0) : e.a(1, 0));
        Object obj = this.f51982c;
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        c0.d(2, obj);
        Object objInvoke = ((fz.e) obj).invoke(sVar, Integer.valueOf(iA));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0.x1(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 5);
        }
        return objInvoke;
    }

    public final void k(n nVar) {
        s sVar;
        x1 x1VarB;
        if (!this.f51981b || (x1VarB = (sVar = (s) nVar).B()) == null) {
            return;
        }
        sVar.getClass();
        x1VarB.f39500b |= 1;
        if (e.e(this.f51983d, x1VarB)) {
            this.f51983d = x1VarB;
            return;
        }
        ArrayList arrayList = this.f51984e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f51984e = arrayList2;
            arrayList2.add(x1VarB);
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (e.e((x1) arrayList.get(i11), x1VarB)) {
                arrayList.set(i11, x1VarB);
                return;
            }
        }
        arrayList.add(x1VarB);
    }

    public final void l(qy.e eVar) {
        if (kotlin.jvm.internal.m.a(this.f51982c, eVar)) {
            return;
        }
        boolean z11 = this.f51982c == null;
        this.f51982c = eVar;
        if (z11 || !this.f51981b) {
            return;
        }
        x1 x1Var = this.f51983d;
        if (x1Var != null) {
            z zVar = x1Var.f39499a;
            if (zVar != null) {
                zVar.r(x1Var, null);
            }
            this.f51983d = null;
        }
        ArrayList arrayList = this.f51984e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                x1 x1Var2 = (x1) arrayList.get(i11);
                z zVar2 = x1Var2.f39499a;
                if (zVar2 != null) {
                    zVar2.r(x1Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // fz.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return h(obj, (n) obj2, ((Number) obj3).intValue());
    }

    @Override // fz.j
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return a((Integer) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (n) obj6, ((Number) obj7).intValue());
    }
}

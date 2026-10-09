package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class td extends xy.i implements fz.f {
    public final /* synthetic */ xt.u H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.w f50450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.w f50451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f50453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ List f50454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt.k0 f50455f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f50456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(vt.k0 k0Var, vt.n0 n0Var, xt.u uVar, vy.d dVar) {
        super(3, dVar);
        this.f50455f = k0Var;
        this.f50456t = n0Var;
        this.H = uVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        vt.n0 n0Var = this.f50456t;
        xt.u uVar = this.H;
        td tdVar = new td(this.f50455f, n0Var, uVar, (vy.d) obj3);
        tdVar.f50453d = zBooleanValue;
        tdVar.f50454e = (List) obj2;
        return tdVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0301  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.w wVar;
        Object objU;
        kotlin.jvm.internal.w wVar2;
        int i11;
        boolean z11;
        boolean z12 = this.f50453d;
        List list = this.f50454e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f50452c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            wVar = new kotlin.jvm.internal.w();
            kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
            gp.r rVar = new gp.r(new bh.c0(0, (bh.a1) this.f50455f, null));
            this.f50454e = list;
            this.f50450a = wVar;
            this.f50451b = wVar3;
            this.f50453d = z12;
            this.f50452c = 1;
            objU = uz.x0.u(rVar, this);
            if (objU == aVar) {
                return aVar;
            }
            wVar2 = wVar3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.w wVar4 = this.f50451b;
            wVar = this.f50450a;
            com.bumptech.glide.e.F(obj);
            objU = obj;
            wVar2 = wVar4;
        }
        kotlin.jvm.internal.w wVar5 = wVar;
        long jLongValue = ((Number) objU).longValue();
        Iterator it = list.iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                ns.o.V();
                throw null;
            }
            CourseUnit courseUnit = (CourseUnit) next;
            if (courseUnit.getUnitId() == jLongValue) {
                i14 = i13;
            }
            Iterator it2 = it;
            if (ry.l.D(new UnitState[]{UnitState.StateOpen, UnitState.StateRedo}, courseUnit.getUnitState())) {
                wVar5.f38359a++;
            }
            wVar2.f38359a++;
            it = it2;
            i13 = i15;
        }
        Env env = ((fr.o0) this.f50456t).f27733a;
        int i16 = env.keyLanguage;
        int i17 = env.locateLanguage;
        List listL = ns.o.L(0, 1, 2, 7, 11, 12, 13);
        kotlin.jvm.internal.w wVar6 = wVar2;
        List listL2 = ns.o.L(4, 5, 6, 14, 15, 16, 10, 22, 20, 40, 47, 48, 53, 54, 8, 17, 51, 55, 57, 21, 61, 65, 18, 69, 19, 63);
        Map mapY = ry.x.Y(new qy.l(ns.o.L(5, 15), ns.o.L(9, 6, 2, 1)), new qy.l(ns.o.L(53, 54, 47, 48), ns.o.L(6, 5, 9, 51)), new qy.l(ns.o.L(4, 14), ns.o.L(2, 9, 0, 6, 1)), new qy.l(ns.o.L(6, 16), ns.o.L(9, 2, 21)), new qy.l(ns.o.L(10, 22), ns.o.L(9, 21, 6)), new qy.l(ns.o.K(8), ns.o.L(9, 1)), new qy.l(ns.o.L(51, 55), ns.o.K(9)), new qy.l(ns.o.K(57), ns.o.K(9)), new qy.l(ns.o.K(3), ns.o.L(1, 2, 9, 10, 8, 7, 4, 57, 0, 6, 19, 57, 21, 61, 65, 18, 69, 63, 51)));
        if (listL.contains(Integer.valueOf(i16))) {
            z11 = true;
        } else {
            if (listL2.contains(Integer.valueOf(i16))) {
                i11 = i17;
                if (i11 == 3) {
                    z11 = true;
                }
            } else {
                i11 = i17;
            }
            if (!mapY.isEmpty()) {
                Iterator it3 = mapY.entrySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        List list2 = (List) entry.getKey();
                        List list3 = (List) entry.getValue();
                        if (list2.contains(Integer.valueOf(i16)) && list3.contains(Integer.valueOf(i11))) {
                            z11 = true;
                        }
                    }
                }
            }
            z11 = false;
        }
        return new CourseUiState.Success(list, z11, this.H.a("new_alphabet_".concat(xt.d.l(r29.keyLanguage))), i14, z12, ry.l.D(new Integer[]{0, 1, 2, 4, 5, 6, 8, 10, 20, 47, 53, 51}, Integer.valueOf(env.keyLanguage)), wVar5.f38359a == wVar6.f38359a);
    }
}

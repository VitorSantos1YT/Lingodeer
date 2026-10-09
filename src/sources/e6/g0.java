package e6;

import android.os.Bundle;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.SyllableWriteLesson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f24910a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24910a) {
            case 0:
                g0 g0Var = new g0((Bundle) this.f24913d, (vy.d) obj3, 0);
                g0Var.f24912c = (l) obj2;
                return g0Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                g0 g0Var2 = new g0((String) this.f24913d, (vy.d) obj3, 1);
                g0Var2.f24912c = (l) obj2;
                return g0Var2.invokeSuspend(qy.b0.f48488a);
            case 2:
                return new g0((i1.v) this.f24912c, (a0.e0) this.f24913d, (vy.d) obj3).invokeSuspend(qy.b0.f48488a);
            case 3:
                long j11 = ((f2.b) obj2).f26570a;
                g0 g0Var3 = new g0((l1.b1) this.f24913d, (vy.d) obj3, 3);
                g0Var3.f24912c = (f0.l1) obj;
                return g0Var3.invokeSuspend(qy.b0.f48488a);
            case 4:
                g0 g0Var4 = new g0(3, 4, (vy.d) obj3);
                g0Var4.f24912c = (uz.j) obj;
                g0Var4.f24913d = (Object[]) obj2;
                return g0Var4.invokeSuspend(qy.b0.f48488a);
            case 5:
                g0 g0Var5 = new g0(3, 5, (vy.d) obj3);
                g0Var5.f24912c = (n9.z) obj;
                g0Var5.f24913d = (n9.z) obj2;
                return g0Var5.invokeSuspend(qy.b0.f48488a);
            case 6:
                g0 g0Var6 = new g0(3, 6, (vy.d) obj3);
                g0Var6.f24912c = (SyllableWriteLesson) obj;
                g0Var6.f24913d = (String) obj2;
                return g0Var6.invokeSuspend(qy.b0.f48488a);
            case 7:
                g0 g0Var7 = new g0(3, 7, (vy.d) obj3);
                g0Var7.f24912c = (uz.j) obj;
                g0Var7.f24913d = obj2;
                return g0Var7.invokeSuspend(qy.b0.f48488a);
            case 8:
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var8 = new g0((vs.d) this.f24913d, (vy.d) obj3, 8);
                g0Var8.f24912c = (Map) obj;
                g0Var8.f24911b = iIntValue;
                return g0Var8.invokeSuspend(qy.b0.f48488a);
            default:
                g0 g0Var9 = new g0((wt.m) this.f24913d, (vy.d) obj3, 9);
                g0Var9.f24912c = (List) obj2;
                return g0Var9.invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        kb.c cVar;
        int i11 = this.f24910a;
        int i12 = 0;
        kb.c cVar2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24911b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                l lVar = (l) this.f24912c;
                Bundle bundle = (Bundle) this.f24913d;
                this.f24911b = 1;
                lVar.getClass();
                Object objE = lVar.e(new e(bundle), this);
                if (objE != aVar) {
                    objE = b0Var;
                }
                return objE == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f24911b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                l lVar2 = (l) this.f24912c;
                String str = (String) this.f24913d;
                this.f24911b = 1;
                lVar2.getClass();
                Object objE2 = lVar2.e(new d(str), this);
                if (objE2 != aVar2) {
                    objE2 = b0Var;
                }
                return objE2 == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f24911b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                f0.j jVar = ((i1.v) this.f24912c).f34082a;
                a0.e0 e0Var = (a0.e0) this.f24913d;
                this.f24911b = 1;
                return e0Var.invoke(jVar, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                l1.b1 b1Var = (l1.b1) this.f24913d;
                f0.l1 l1Var = (f0.l1) this.f24912c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f24911b;
                try {
                    if (i16 == 0) {
                        com.bumptech.glide.e.F(obj);
                        b1Var.setValue(Boolean.TRUE);
                        this.f24912c = null;
                        this.f24911b = 1;
                        if (l1Var.a(this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    b1Var.setValue(Boolean.FALSE);
                    return b0Var;
                } catch (Throwable th2) {
                    b1Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f24911b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar2 = (uz.j) this.f24912c;
                kb.c[] cVarArr = (kb.c[]) ((Object[]) this.f24913d);
                int length = cVarArr.length;
                while (true) {
                    cVar = kb.a.f38028a;
                    if (i12 < length) {
                        kb.c cVar3 = cVarArr[i12];
                        if (kotlin.jvm.internal.m.a(cVar3, cVar)) {
                            i12++;
                        } else {
                            cVar2 = cVar3;
                        }
                    }
                }
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                this.f24911b = 1;
                return jVar2.emit(cVar, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f24911b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n9.z zVar = (n9.z) this.f24912c;
                    com.bumptech.glide.e.F(obj);
                    return zVar;
                }
                com.bumptech.glide.e.F(obj);
                n9.z zVar2 = (n9.z) this.f24912c;
                n9.z zVar3 = (n9.z) this.f24913d;
                this.f24912c = zVar3;
                this.f24911b = 1;
                ((z1) zVar2.f43742b.f520d).cancel(null);
                return b0Var == aVar6 ? aVar6 : zVar3;
            case 6:
                SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) this.f24912c;
                String str2 = (String) this.f24913d;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f24911b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVar = new gp.r(new rt.h(16, syllableWriteLesson, str2, objArr == true ? 1 : 0));
                this.f24912c = null;
                this.f24913d = null;
                this.f24911b = 1;
                Object objU = uz.x0.u(rVar, this);
                return objU == aVar7 ? aVar7 : objU;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f24911b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar3 = (uz.j) this.f24912c;
                String smartTips = ((CourseUnit) this.f24913d).getDescription();
                kotlin.jvm.internal.m.f(smartTips, "smartTips");
                gp.r rVar2 = new gp.r(new vs.e(smartTips, objArr2 == true ? 1 : 0, i12));
                yz.f fVar = rz.o0.f50940a;
                uz.i iVarW = uz.x0.w(rVar2, yz.e.f58387a);
                this.f24912c = null;
                this.f24913d = null;
                this.f24911b = 1;
                return uz.x0.q(jVar3, iVarW, this) == aVar8 ? aVar8 : b0Var;
            case 8:
                Map map = (Map) this.f24912c;
                int i22 = this.f24911b;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Objects.toString(map);
                if (i22 != -1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Iterable<vs.m> iterable = (Iterable) entry.getValue();
                        vs.d dVar = (vs.d) this.f24913d;
                        ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                        for (vs.m mVar : iterable) {
                            mVar.getClass();
                            arrayList.add(mVar.a() == i22 ? vs.d.a(dVar, mVar, true) : vs.d.a(dVar, mVar, false));
                        }
                        linkedHashMap.put(key, arrayList);
                    }
                    map = linkedHashMap;
                }
                return new vs.b(map);
            default:
                List list = (List) this.f24912c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f24911b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                wt.m mVar2 = (wt.m) this.f24913d;
                this.f24912c = null;
                this.f24911b = 1;
                yz.f fVar2 = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new rt.h(mVar2.f55311c, list, mVar2, (vy.d) null, 26), this);
                return objM == aVar10 ? aVar10 : objM;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i1.v vVar, a0.e0 e0Var, vy.d dVar) {
        super(3, dVar);
        this.f24910a = 2;
        this.f24912c = vVar;
        this.f24913d = e0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f24910a = i11;
        this.f24913d = obj;
    }
}

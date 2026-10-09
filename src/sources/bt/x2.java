package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i11, Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, boolean z11) {
        super(2, dVar);
        this.f6178a = i11;
        this.f6180c = obj;
        this.f6179b = z11;
        this.f6181d = obj2;
        this.f6182e = obj3;
        this.f6183f = obj4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6178a) {
            case 0:
                return new x2(this.f6179b, (l1.b1) this.f6180c, (ht.o) this.f6181d, (fz.e) this.f6182e, (CourseSentence) this.f6183f, dVar, 0);
            case 1:
                return new x2(this.f6179b, (ns.z) this.f6181d, (ur.a) this.f6182e, (l1.b1) this.f6180c, (ys.v) this.f6183f, dVar);
            case 2:
                return new x2(2, (rz.b0) this.f6180c, (jt.v) this.f6181d, (List) this.f6182e, (l1.a1) this.f6183f, dVar, this.f6179b);
            case 3:
                return new x2(this.f6179b, (mv.g0) this.f6181d, (j9.v) this.f6182e, (mv.d0) this.f6183f, (l1.b1) this.f6180c, dVar);
            case 4:
                return new x2(4, (l1.b1) this.f6180c, (x1.p) this.f6181d, (jt.i2) this.f6182e, (fz.c) this.f6183f, dVar, this.f6179b);
            default:
                return new x2(this.f6179b, (l1.b1) this.f6180c, (l1.b1) this.f6181d, (l1.a1) this.f6182e, (fz.a) this.f6183f, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6178a) {
            case 0:
                x2 x2Var = (x2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                x2Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                x2 x2Var2 = (x2) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                x2Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                x2 x2Var3 = (x2) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                x2Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                x2 x2Var4 = (x2) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                x2Var4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                x2 x2Var5 = (x2) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                x2Var5.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                x2 x2Var6 = (x2) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                x2Var6.invokeSuspend(b0Var7);
                return b0Var7;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Long l9;
        int i11 = this.f6178a;
        jt.h2 h2VarA = null;
        boolean z11 = this.f6179b;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f6183f;
        Object obj3 = this.f6180c;
        Object obj4 = this.f6181d;
        Object obj5 = this.f6182e;
        switch (i11) {
            case 0:
                CourseSentence courseSentence = (CourseSentence) obj2;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && kotlin.jvm.internal.m.a(((l1.b1) obj3).getValue(), ht.a.f33722e) && !((ht.o) obj4).f33762j) {
                    ((fz.e) obj5).invoke(jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                }
                break;
            case 1:
                l1.b1 b1Var = (l1.b1) obj3;
                ns.z zVar = (ns.z) obj4;
                long j11 = zVar.f44038a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && ((l9 = (Long) b1Var.getValue()) == null || l9.longValue() != j11)) {
                    ((ur.a) obj5).c("jxz_main_emm_load_success", new dt.m0((ys.v) obj2, zVar, 2));
                    b1Var.setValue(new Long(j11));
                }
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.e0.B((rz.b0) obj3, null, null, new et.c0(this.f6179b, (jt.v) obj4, (List) obj5, (l1.a1) obj2, (vy.d) null), 3);
                break;
            case 3:
                j9.v vVar = (j9.v) obj5;
                mv.g0 g0Var = (mv.g0) obj4;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var2 = (l1.b1) obj3;
                boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
                mv.z zVar2 = mv.z.f42297a;
                if (!zBooleanValue && z11) {
                    b1Var2.setValue(Boolean.TRUE);
                    g0Var.a(zVar2);
                    j9.v.b(vVar, "syllable_intro_overview");
                } else if (!((Boolean) b1Var2.getValue()).booleanValue() && ((mv.d0) obj2).f42195a) {
                    b1Var2.setValue(Boolean.TRUE);
                    g0Var.a(zVar2);
                    j9.v.b(vVar, "syllable_intro_first");
                }
                break;
            case 4:
                jt.i2 i2Var = (jt.i2) obj5;
                x1.p pVar = (x1.p) obj4;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var3 = (l1.b1) obj3;
                if (b1Var3.getValue() == null) {
                    pVar.getClass();
                    ((fz.c) obj2).invoke(x1.q.e(pVar).f55734c);
                    i2Var.f36976a.setValue(null);
                } else {
                    jt.h2 h2Var = (jt.h2) b1Var3.getValue();
                    CourseWord courseWord = h2Var != null ? h2Var.f36962a : null;
                    if (z11 && courseWord != null && !pVar.contains(courseWord)) {
                        pVar.add(courseWord);
                    }
                    l1.k1 k1Var = i2Var.f36976a;
                    jt.h2 h2Var2 = (jt.h2) b1Var3.getValue();
                    if (h2Var2 != null) {
                        jt.h2 h2Var3 = (jt.h2) b1Var3.getValue();
                        h2VarA = jt.h2.a(h2Var2, 0L, h2Var3 != null ? h2Var3.f36964c : 0L, 11);
                    }
                    k1Var.setValue(h2VarA);
                }
                break;
            default:
                l1.a1 a1Var = (l1.a1) obj5;
                l1.b1 b1Var4 = (l1.b1) obj4;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var5 = (l1.b1) obj3;
                if (((Boolean) b1Var5.getValue()).booleanValue() && z11 && ((List) b1Var4.getValue()) != null && ((l1.h1) a1Var).l() == 0) {
                    b1Var5.setValue(Boolean.FALSE);
                    ys.a.b((fz.a) obj2, b1Var4, a1Var);
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(boolean z11, l1.b1 b1Var, Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6178a = i11;
        this.f6179b = z11;
        this.f6180c = b1Var;
        this.f6181d = obj;
        this.f6182e = obj2;
        this.f6183f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(boolean z11, mv.g0 g0Var, j9.v vVar, mv.d0 d0Var, l1.b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f6178a = 3;
        this.f6179b = z11;
        this.f6181d = g0Var;
        this.f6182e = vVar;
        this.f6183f = d0Var;
        this.f6180c = b1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(boolean z11, ns.z zVar, ur.a aVar, l1.b1 b1Var, ys.v vVar, vy.d dVar) {
        super(2, dVar);
        this.f6178a = 1;
        this.f6179b = z11;
        this.f6181d = zVar;
        this.f6182e = aVar;
        this.f6180c = b1Var;
        this.f6183f = vVar;
    }
}

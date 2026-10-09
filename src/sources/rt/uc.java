package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.TestModel;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class uc extends xy.i implements fz.f {
    public uz.j H;
    public List K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f50496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd f50498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f50499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoursePracticeType f50500f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f50501t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(vy.d dVar, dd ddVar, String str, CoursePracticeType coursePracticeType, vt.n0 n0Var) {
        super(3, dVar);
        this.f50498d = ddVar;
        this.f50499e = str;
        this.f50500f = coursePracticeType;
        this.f50501t = n0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uc ucVar = new uc((vy.d) obj3, this.f50498d, this.f50499e, this.f50500f, this.f50501t);
        ucVar.f50496b = (uz.j) obj;
        ucVar.f50497c = obj2;
        return ucVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        uz.j jVar;
        r8 r8VarA;
        dd ddVar = this.f50498d;
        r8 r8VarA2 = ddVar.A0;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f50495a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.j jVar2 = this.f50496b;
            list = (List) this.f50497c;
            wt.o0 o0Var = ddVar.f49639p0;
            o0Var.getClass();
            gp.r rVar = new gp.r(new sr.d(o0Var, dVar, 26));
            this.f50496b = null;
            this.f50497c = null;
            this.H = jVar2;
            this.K = list;
            this.f50495a = 1;
            Object objU = uz.x0.u(rVar, this);
            if (objU != aVar) {
                jVar = jVar2;
                obj = objU;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        list = this.K;
        uz.j jVar3 = this.H;
        com.bumptech.glide.e.F(obj);
        jVar = jVar3;
        LearnProgress learnProgress = (LearnProgress) obj;
        if (r8VarA2 == null) {
            q8 q8Var = r8.Companion;
            int reviewPracticeModelWord = learnProgress.getReviewPracticeModelWord();
            q8Var.getClass();
            r8VarA = q8.a(reviewPracticeModelWord);
        } else {
            r8VarA = r8VarA2;
        }
        if (r8VarA2 == null) {
            q8 q8Var2 = r8.Companion;
            int reviewPracticeModelSent = learnProgress.getReviewPracticeModelSent();
            q8Var2.getClass();
            r8VarA2 = q8.a(reviewPracticeModelSent);
        }
        r8 r8Var = r8VarA2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Objects.toString((TestModel) it.next());
        }
        gp.r rVarE = ddVar.f49641r0.e(list);
        this.f50496b = null;
        this.f50497c = null;
        this.H = null;
        this.K = null;
        this.f50495a = 2;
        uz.x0.s(jVar);
        Object objCollect = rVarE.collect(new wc(jVar, this.f50500f, r8VarA, r8Var, this.f50501t), this);
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        if (objCollect != aVar2) {
            objCollect = b0Var;
        }
        if (objCollect != aVar2) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? aVar : b0Var;
    }
}

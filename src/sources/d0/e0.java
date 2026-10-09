package d0;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22669a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f22671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, vy.d dVar) {
        super(3, dVar);
        this.f22673e = f0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f22669a) {
            case 0:
                long j11 = ((f2.b) obj2).f26570a;
                e0 e0Var = new e0((f0) this.f22673e, (vy.d) obj3);
                e0Var.f22672d = (f0.l1) obj;
                e0Var.f22671c = j11;
                return e0Var.invokeSuspend(qy.b0.f48488a);
            default:
                e0 e0Var2 = new e0((lf.x0) this.f22673e, this.f22671c, (vy.d) obj3);
                e0Var2.f22672d = (uz.j) obj;
                return e0Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        switch (this.f22669a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f22670b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f0.l1 l1Var = (f0.l1) this.f22672d;
                    long j11 = this.f22671c;
                    f0 f0Var = (f0) this.f22673e;
                    if (f0Var.X) {
                        this.f22670b = 1;
                        h0.i iVar = f0Var.S;
                        if (iVar == null || (objL = rz.e0.l(new b(l1Var, j11, iVar, f0Var, null), this)) != aVar) {
                            objL = b0Var;
                        }
                        if (objL == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                uz.j jVar = (uz.j) this.f22672d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f22670b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarB = ((bh.t) ((vt.i0) ((lf.x0) this.f22673e).f40130b)).b(this.f22671c);
                this.f22672d = jVar;
                this.f22670b = 1;
                obj = uz.x0.v(rVarB, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                CourseSentence courseSentence = (CourseSentence) obj;
                if (courseSentence != null) {
                    List<CourseWord> courseWords = courseSentence.getCourseWords();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : courseWords) {
                        CourseWord courseWord = (CourseWord) obj2;
                        if (courseWord.getWordType() != 1 && !oz.x.s0(courseWord.getTranslation(), "P:", false)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() > 1 && !oz.q.K0(courseSentence.getSentence())) {
                        ot.n nVar = new ot.n(courseSentence, ns.o.S(arrayList), ns.o.K(arrayList));
                        this.f22672d = null;
                        this.f22670b = 2;
                        if (jVar.emit(nVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lf.x0 x0Var, long j11, vy.d dVar) {
        super(3, dVar);
        this.f22673e = x0Var;
        this.f22671c = j11;
    }
}

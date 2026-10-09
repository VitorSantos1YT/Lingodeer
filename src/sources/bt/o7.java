package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o7 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.o f5813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.i1 f5816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f5817f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(CourseWord courseWord, ht.o oVar, boolean z11, l1.b1 b1Var, l1.i1 i1Var, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f5812a = courseWord;
        this.f5813b = oVar;
        this.f5814c = z11;
        this.f5815d = b1Var;
        this.f5816e = i1Var;
        this.f5817f = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new o7(this.f5812a, this.f5813b, this.f5814c, this.f5815d, this.f5816e, this.f5817f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        o7 o7Var = (o7) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        o7Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        CourseWord courseWord = this.f5812a;
        if (courseWord.getSoundChangePronunciation().length() == 0) {
            ht.o oVar = this.f5813b;
            if (!oVar.f33762j && ((oVar.f33753a == 2 || oVar.f33755c == 5 || this.f5814c) && kotlin.jvm.internal.m.a(this.f5815d.getValue(), ht.a.f33722e))) {
                b.c0(oVar, this.f5816e, this.f5817f, b7.e0.l(courseWord, "toString(...)"), new ht.c(courseWord.getVisemedMap()));
            }
        }
        return qy.b0.f48488a;
    }
}

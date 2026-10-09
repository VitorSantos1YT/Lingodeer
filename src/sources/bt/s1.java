package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f5959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(boolean z11, l1.b1 b1Var, fz.e eVar, CourseSentence courseSentence, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5956a = i11;
        this.f5957b = z11;
        this.f5958c = b1Var;
        this.f5959d = eVar;
        this.f5960e = courseSentence;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5956a) {
            case 0:
                return new s1(this.f5957b, this.f5958c, this.f5959d, this.f5960e, dVar, 0);
            case 1:
                return new s1(this.f5957b, this.f5958c, this.f5959d, this.f5960e, dVar, 1);
            case 2:
                return new s1(this.f5957b, this.f5958c, this.f5959d, this.f5960e, dVar, 2);
            default:
                return new s1(this.f5957b, this.f5958c, this.f5959d, this.f5960e, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5956a) {
            case 0:
                s1 s1Var = (s1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                s1Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                s1 s1Var2 = (s1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                s1Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                s1 s1Var3 = (s1) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                s1Var3.invokeSuspend(b0Var4);
                return b0Var4;
            default:
                s1 s1Var4 = (s1) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                s1Var4.invokeSuspend(b0Var5);
                return b0Var5;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5956a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.e eVar = this.f5959d;
        l1.b1 b1Var = this.f5958c;
        boolean z11 = this.f5957b;
        CourseSentence courseSentence = this.f5960e;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && kotlin.jvm.internal.m.a(b1Var.getValue(), ht.a.f33722e)) {
                    eVar.invoke(jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                }
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && kotlin.jvm.internal.m.a(b1Var.getValue(), ht.a.f33722e)) {
                    eVar.invoke(jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                }
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && kotlin.jvm.internal.m.a(b1Var.getValue(), ht.a.f33722e)) {
                    eVar.invoke(jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                }
                break;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11 && kotlin.jvm.internal.m.a(b1Var.getValue(), ht.a.f33722e)) {
                    String string = courseSentence.getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    eVar.invoke(string, new ht.f(courseSentence.getVisemedMap()));
                }
                break;
        }
        return b0Var;
    }
}

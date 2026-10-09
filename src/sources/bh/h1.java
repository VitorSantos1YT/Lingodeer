package bh;

import com.lingo.lingoskill.object.SentenceDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(s1 s1Var, vy.d dVar) {
        super(2, dVar);
        this.f4226b = s1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        h1 h1Var = new h1(this.f4226b, dVar);
        h1Var.f4225a = obj;
        return h1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((List) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f4225a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        k10.g gVarQueryBuilder = this.f4226b.f4361b.queryBuilder();
        gVarQueryBuilder.f(SentenceDao.Properties.SentenceId.c(list), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }
}

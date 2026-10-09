package bh;

import com.lingo.lingoskill.object.WordDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, vy.d dVar) {
        super(2, dVar);
        this.f4342b = s1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        q1 q1Var = new q1(this.f4342b, dVar);
        q1Var.f4341a = obj;
        return q1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((List) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f4341a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        k10.g gVarQueryBuilder = this.f4342b.f4360a.queryBuilder();
        gVarQueryBuilder.f(WordDao.Properties.WordId.c(list), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }
}

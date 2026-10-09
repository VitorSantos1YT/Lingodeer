package zz;

import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59644a = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        i iVar = (i) obj2;
        long j11 = bVar.f59645a;
        b0 b0Var = b0.f48488a;
        if (j11 <= 0) {
            ((h) iVar).f59664e = b0Var;
            return b0Var;
        }
        pb.b bVar2 = new pb.b(25, iVar, bVar);
        m.d(iVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        h hVar = (h) iVar;
        vy.i iVar2 = hVar.f59660a;
        hVar.f59662c = e0.q(iVar2).b(j11, bVar2, iVar2);
        return b0Var;
    }
}

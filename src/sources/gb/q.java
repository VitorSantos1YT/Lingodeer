package gb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.j implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f28963a = new q(6, r.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p4 = (Context) obj;
        fb.c p11 = (fb.c) obj2;
        qb.a p12 = (qb.a) obj3;
        WorkDatabase p13 = (WorkDatabase) obj4;
        mb.i p14 = (mb.i) obj5;
        d dVar = (d) obj6;
        kotlin.jvm.internal.m.f(p4, "p0");
        kotlin.jvm.internal.m.f(p11, "p1");
        kotlin.jvm.internal.m.f(p12, "p2");
        kotlin.jvm.internal.m.f(p13, "p3");
        kotlin.jvm.internal.m.f(p14, "p4");
        int i11 = h.f28934a;
        jb.d dVar2 = new jb.d(p4, p13, p11);
        pb.h.a(p4, SystemJobService.class, true);
        fb.l.b().getClass();
        return ns.o.L(dVar2, new hb.c(p4, p11, p14, dVar, new b1.p(dVar, p12), p12));
    }
}

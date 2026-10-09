package bh;

import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.LearnProgress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements vt.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.t0 f4147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au.f1 f4148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f4149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final au.u0 f4150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LearnProgress f4151e;

    public a1(au.t0 t0Var, au.f1 f1Var, vt.n0 n0Var, au.u0 u0Var) {
        this.f4147a = t0Var;
        this.f4148b = f1Var;
        this.f4149c = n0Var;
        this.f4150d = u0Var;
    }

    public static final Object c(a1 a1Var, CourseLessonFinishStatus courseLessonFinishStatus, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new b1.c(4, a1Var, courseLessonFinishStatus, (vy.d) null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public static final Object d(a1 a1Var, CourseUnitFinishStatus courseUnitFinishStatus, xy.c cVar) {
        a1Var.getClass();
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new b1.c(5, a1Var, courseUnitFinishStatus, (vy.d) null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final gp.r e(int i11, boolean z11) {
        return new gp.r(new x(z11, this, i11, null));
    }

    public final gp.r f(int i11, long j11) {
        return new gp.r(new z(i11, j11, this, (vy.d) null));
    }

    public final gp.r g(List units) {
        kotlin.jvm.internal.m.f(units, "units");
        return new gp.r(new a0(this, units, null, 1));
    }

    public final gp.r h(int i11, long j11) {
        return new gp.r(new b0(i11, 0, j11, this, null));
    }

    public final Object i(LearnProgress learnProgress, boolean z11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(z11, this, learnProgress, (vy.d) null, 0), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object j(String str, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new y0(this, str, null, 0), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object k(int i11, int i12, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new z0(this, i11, i12, (vy.d) null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }
}

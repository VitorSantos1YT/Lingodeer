package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class pd extends xy.i implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ kd f50248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f50249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f50250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ ye f50251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd f50252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(qd qdVar, vy.d dVar) {
        super(5, dVar);
        this.f50252e = qdVar;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        pd pdVar = new pd(this.f50252e, (vy.d) obj5);
        pdVar.f50248a = (kd) obj;
        pdVar.f50249b = zBooleanValue;
        pdVar.f50250c = iIntValue;
        pdVar.f50251d = (ye) obj4;
        return pdVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        kd kdVar = this.f50248a;
        boolean z11 = this.f50249b;
        int i11 = this.f50250c;
        ye yeVar = this.f50251d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        CourseUnit courseUnit = kdVar.f49992a;
        String description = courseUnit.getDescription();
        int sortIndex = courseUnit.getSortIndex();
        qd qdVar = this.f50252e;
        Env env = ((fr.o0) qdVar.f50309b).f27733a;
        md mdVar = new md(description, sortIndex, env.themeValue, i11, (qdVar.f50313f || fb.g0.g(env.keyLanguage, courseUnit.getSortIndex(), z11)) ? false : true, yeVar);
        courseUnit.getSortIndex();
        return mdVar;
    }
}

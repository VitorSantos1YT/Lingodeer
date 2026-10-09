package bh;

import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.LessonDao;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar, vy.d dVar) {
        super(2, dVar);
        this.f4210b = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        g gVar = new g(this.f4210b, dVar);
        gVar.f4209a = obj;
        return gVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((List) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f4209a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        k10.g gVarQueryBuilder = this.f4210b.f4367c.queryBuilder();
        int i11 = 0;
        gVarQueryBuilder.f(LessonDao.Properties.LessonId.c(list), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        ArrayList arrayListO0 = ry.m.o0(listD);
        ArrayList arrayList = new ArrayList(ry.n.W(arrayListO0, 10));
        int size = arrayListO0.size();
        while (i11 < size) {
            Object obj2 = arrayListO0.get(i11);
            i11++;
            arrayList.add(ConvertUtilsKt.toCourseLesson((Lesson) obj2));
        }
        return arrayList;
    }
}

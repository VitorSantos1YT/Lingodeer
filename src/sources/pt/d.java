package pt;

import com.lingodeer.data.model.CourseLesson;
import jr.i0;
import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.o0;
import vt.k0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f47144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f47145b;

    public d(k0 courseUserDataRepository, n0 envRepository) {
        m.f(envRepository, "envRepository");
        m.f(courseUserDataRepository, "courseUserDataRepository");
        this.f47144a = envRepository;
        this.f47145b = courseUserDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(CourseLesson courseLesson, String str, ur.a aVar, fz.e eVar, vy.d dVar) {
        a aVar2;
        CourseLesson courseLesson2;
        String str2;
        fz.e eVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i11 = aVar2.f47140f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f47140f = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, dVar);
            }
        } else {
            aVar2 = new a(this, dVar);
        }
        Object obj = aVar2.f47138d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = aVar2.f47140f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = o0.f50940a;
            yz.e eVar3 = yz.e.f58387a;
            i0 i0Var = new i0(str, this, aVar, courseLesson, null, 18);
            aVar2.f47135a = courseLesson;
            aVar2.f47136b = str;
            aVar2.f47137c = eVar;
            aVar2.f47140f = 1;
            if (e0.M(eVar3, i0Var, aVar2) == aVar3) {
                return aVar3;
            }
            courseLesson2 = courseLesson;
            str2 = str;
            eVar2 = eVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = aVar2.f47137c;
            str2 = aVar2.f47136b;
            courseLesson2 = aVar2.f47135a;
            com.bumptech.glide.e.F(obj);
        }
        eVar2.invoke(courseLesson2, str2);
        return b0.f48488a;
    }
}

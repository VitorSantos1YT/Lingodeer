package bh;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseUnitLessonKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f4203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j11, vy.d dVar) {
        super(3, dVar);
        this.f4204c = j11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f fVar = new f(this.f4204c, (vy.d) obj3);
        fVar.f4203b = (uz.j) obj;
        return fVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        uz.j jVar = this.f4203b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f4202a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            CourseLesson courseLessonFallbackCourseLesson = CourseUnitLessonKt.fallbackCourseLesson(this.f4204c);
            this.f4203b = null;
            this.f4202a = 1;
            if (jVar.emit(courseLessonFallbackCourseLesson, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}

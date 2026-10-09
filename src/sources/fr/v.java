package fr;

import com.lingodeer.data.model.CourseQuestionPreferenceKt;
import com.lingodeer.data.model.CourseQuestionPreferencePayload;
import com.lingodeer.data.model.CourseQuestionPreferencePayloadKt;
import com.lingodeer.database.model.SubLearnProgressEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f27905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i11, long j11, x xVar, vy.d dVar) {
        super(1, dVar);
        this.f27903b = i11;
        this.f27904c = j11;
        this.f27905d = xVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new v(this.f27903b, this.f27904c, this.f27905d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((v) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27902a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            CourseQuestionPreferencePayload.Companion companion = CourseQuestionPreferencePayload.Companion;
            long j11 = this.f27904c;
            int i12 = this.f27903b;
            CourseQuestionPreferencePayload courseQuestionPreferencePayloadFromPreferences = companion.fromPreferences(CourseQuestionPreferenceKt.buildDefaultCourseQuestionPreferences(i12, j11));
            au.e1 e1Var = this.f27905d.f27958a;
            SubLearnProgressEntity subLearnProgressEntity = new SubLearnProgressEntity(CourseQuestionPreferencePayloadKt.buildCourseQuestionPreferenceProgressId(i12), courseQuestionPreferencePayloadFromPreferences.toProgressString(), courseQuestionPreferencePayloadFromPreferences.maxUpdatedAt());
            this.f27902a = 1;
            if (e1Var.a(subLearnProgressEntity, this) == aVar) {
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

package ch;

import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestIndexActivity f7026b;

    public /* synthetic */ e0(CourseTestIndexActivity courseTestIndexActivity, int i11) {
        this.f7025a = i11;
        this.f7026b = courseTestIndexActivity;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7025a;
        qy.b0 b0Var = qy.b0.f48488a;
        CourseTestIndexActivity courseTestIndexActivity = this.f7026b;
        switch (i11) {
            case 0:
                int i12 = CourseTestIndexActivity.N;
                int[] iArr = bq.r.f4959a;
                bq.m.C(courseTestIndexActivity, "course_lesson");
                return b0Var;
            case 1:
                int i13 = CourseTestIndexActivity.N;
                return new pt.d((vt.k0) courseTestIndexActivity.f21619t.getValue(), courseTestIndexActivity.l());
            case 2:
                int i14 = CourseTestIndexActivity.N;
                return Long.valueOf(courseTestIndexActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, 0L));
            case 3:
                int i15 = CourseTestIndexActivity.N;
                return Integer.valueOf(courseTestIndexActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 0));
            case 4:
                int i16 = CourseTestIndexActivity.N;
                courseTestIndexActivity.finish();
                return b0Var;
            default:
                int i17 = CourseTestIndexActivity.N;
                int[] iArr2 = bq.r.f4959a;
                bq.m.C(courseTestIndexActivity, "course_lesson");
                return b0Var;
        }
    }
}

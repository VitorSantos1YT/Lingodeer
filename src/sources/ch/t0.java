package ch;

import com.lingo.course.ui.CourseTipsActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTipsActivity f7103b;

    public /* synthetic */ t0(CourseTipsActivity courseTipsActivity, int i11) {
        this.f7102a = i11;
        this.f7103b = courseTipsActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7102a;
        qy.b0 b0Var = qy.b0.f48488a;
        CourseTipsActivity courseTipsActivity = this.f7103b;
        switch (i11) {
            case 0:
                int i12 = CourseTipsActivity.K;
                return Long.valueOf(courseTipsActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L));
            case 1:
                int i13 = CourseTipsActivity.K;
                return Boolean.valueOf(courseTipsActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
            case 2:
                int i14 = CourseTipsActivity.K;
                courseTipsActivity.finish();
                return b0Var;
            default:
                int i15 = CourseTipsActivity.K;
                int[] iArr = bq.r.f4959a;
                bq.m.C(courseTipsActivity, "lesson_tips");
                return b0Var;
        }
    }
}

package ch;

import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.course.ui.CourseTestActivity;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestActivity f7094b;

    public /* synthetic */ r(CourseTestActivity courseTestActivity, int i11) {
        this.f7093a = i11;
        this.f7094b = courseTestActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7093a;
        qy.b0 b0Var = qy.b0.f48488a;
        CourseTestActivity courseTestActivity = this.f7094b;
        switch (i11) {
            case 0:
                int i12 = CourseTestActivity.R;
                courseTestActivity.finish();
                return b0Var;
            case 1:
                CourseTestActivity.p(courseTestActivity);
                return b0Var;
            case 2:
                int i13 = CourseTestActivity.R;
                return Long.valueOf(courseTestActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L));
            case 3:
                int i14 = CourseTestActivity.R;
                return Long.valueOf(courseTestActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG_2, -1L));
            case 4:
                int i15 = CourseTestActivity.R;
                return Integer.valueOf(courseTestActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 1));
            case 5:
                int i16 = CourseTestActivity.R;
                return Integer.valueOf(courseTestActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT_2, 1));
            case 6:
                int i17 = CourseTestActivity.R;
                return Boolean.valueOf(courseTestActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
            case 7:
                int i18 = CourseTestActivity.R;
                return Boolean.valueOf(courseTestActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN_2, false));
            case 8:
                int i19 = CourseTestActivity.R;
                String stringExtra = courseTestActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            case 9:
                int i21 = CourseTestActivity.R;
                return CoursePracticeType.valueOf((String) courseTestActivity.O.getValue());
            default:
                int i22 = CourseTestActivity.R;
                return rz.e0.f(LifecycleOwnerKt.getLifecycleScope(courseTestActivity), null, rz.d0.LAZY, new av.p(courseTestActivity, null, 11), 1);
        }
    }
}

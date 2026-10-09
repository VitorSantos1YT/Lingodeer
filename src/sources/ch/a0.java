package ch;

import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import com.lingo.course.ui.CourseTestExamActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestExamActivity f7006b;

    public /* synthetic */ a0(CourseTestExamActivity courseTestExamActivity, int i11) {
        this.f7005a = i11;
        this.f7006b = courseTestExamActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7005a;
        qy.b0 b0Var = qy.b0.f48488a;
        CourseTestExamActivity courseTestExamActivity = this.f7006b;
        switch (i11) {
            case 0:
                int i12 = CourseTestExamActivity.H;
                return Boolean.valueOf(courseTestExamActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
            case 1:
                int i13 = CourseTestExamActivity.H;
                courseTestExamActivity.finish();
                return b0Var;
            default:
                int i14 = CourseTestExamActivity.H;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestExamActivity), null, null, new a1(courseTestExamActivity, null, 14), 3);
                courseTestExamActivity.finish();
                return b0Var;
        }
    }
}

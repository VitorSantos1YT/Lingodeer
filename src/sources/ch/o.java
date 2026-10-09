package ch;

import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import java.util.ArrayList;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseReviewTestActivity f7079b;

    public /* synthetic */ o(CourseReviewTestActivity courseReviewTestActivity, int i11) {
        this.f7078a = i11;
        this.f7079b = courseReviewTestActivity;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // fz.a
    public final Object invoke() {
        CoursePracticeType coursePracticeType;
        int i11 = this.f7078a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj = null;
        CourseReviewTestActivity courseReviewTestActivity = this.f7079b;
        switch (i11) {
            case 0:
                int i12 = CourseReviewTestActivity.M;
                return Integer.valueOf(courseReviewTestActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, -1));
            case 1:
                int i13 = CourseReviewTestActivity.M;
                ArrayList parcelableArrayListExtra = courseReviewTestActivity.getIntent().getParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST);
                return parcelableArrayListExtra != null ? parcelableArrayListExtra : ry.r.f50854a;
            case 2:
                int i14 = CourseReviewTestActivity.M;
                String stringExtra = courseReviewTestActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                for (Object obj2 : CoursePracticeType.getEntries()) {
                    if (kotlin.jvm.internal.m.a(((CoursePracticeType) obj2).getValue(), stringExtra)) {
                        obj = obj2;
                        coursePracticeType = (CoursePracticeType) obj;
                        if (coursePracticeType == null) {
                            return CoursePracticeType.COURSE_REVIEW_WORD_SENT;
                        }
                        return coursePracticeType;
                    }
                }
                coursePracticeType = (CoursePracticeType) obj;
                if (coursePracticeType == null) {
                    return CoursePracticeType.COURSE_REVIEW_WORD_SENT;
                }
                return coursePracticeType;
            case 3:
                int i15 = CourseReviewTestActivity.M;
                int intExtra = courseReviewTestActivity.getIntent().getIntExtra("course_review_practice_model", -1);
                for (Object obj3 : r8.a()) {
                    if (((r8) obj3).b() == intExtra) {
                        obj = obj3;
                        return (r8) obj;
                    }
                }
                return (r8) obj;
            case 4:
                int i16 = CourseReviewTestActivity.M;
                courseReviewTestActivity.finish();
                return b0Var;
            default:
                int i17 = CourseReviewTestActivity.M;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseReviewTestActivity), null, null, new a1(courseReviewTestActivity, null, 11), 3);
                courseReviewTestActivity.finish();
                return b0Var;
        }
    }
}

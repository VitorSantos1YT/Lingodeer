package ch;

import android.content.Intent;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingodeer.data.model.INTENTS;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseReviewListActivity f7067b;

    public /* synthetic */ m(CourseReviewListActivity courseReviewListActivity, int i11) {
        this.f7066a = i11;
        this.f7067b = courseReviewListActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean booleanExtra;
        int i11 = this.f7066a;
        qy.b0 b0Var = qy.b0.f48488a;
        CourseReviewListActivity courseReviewListActivity = this.f7067b;
        switch (i11) {
            case 0:
                int i12 = CourseReviewListActivity.L;
                Intent intent = courseReviewListActivity.getIntent();
                x8 x8Var = x8.WORD;
                int intExtra = intent.getIntExtra(INTENTS.EXTRA_INT, x8Var.a());
                if (intExtra == x8Var.a()) {
                    return x8Var;
                }
                x8 x8Var2 = x8.SENTENCE;
                if (intExtra != x8Var2.a()) {
                    x8Var2 = x8.CHARACTER;
                    if (intExtra != x8Var2.a()) {
                        x8Var2 = x8.EXTENT_WORD;
                        if (intExtra != x8Var2.a()) {
                            return x8Var;
                        }
                    }
                }
                return x8Var2;
            case 1:
                int i13 = CourseReviewListActivity.L;
                booleanExtra = courseReviewListActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false);
                break;
            case 2:
                int i14 = CourseReviewListActivity.L;
                booleanExtra = courseReviewListActivity.getIntent().getBooleanExtra(scNRoQgKSYX.HetgOTuuDU, false);
                break;
            case 3:
                int i15 = CourseReviewListActivity.L;
                return new a20.a(2, ry.l.l0(new Object[]{(x8) courseReviewListActivity.f21614t.getValue(), Boolean.valueOf(courseReviewListActivity.p()), Boolean.valueOf(courseReviewListActivity.q())}));
            case 4:
                int i16 = CourseReviewListActivity.L;
                courseReviewListActivity.finish();
                return b0Var;
            default:
                int i17 = CourseReviewListActivity.L;
                int[] iArr = bq.r.f4959a;
                bq.m.C(courseReviewListActivity, "course_review");
                return b0Var;
        }
        return Boolean.valueOf(booleanExtra);
    }
}

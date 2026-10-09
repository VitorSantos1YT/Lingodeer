package ch;

import androidx.lifecycle.LifecycleOwnerKt;
import b0.x0;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.CoursePracticeType;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import rt.ob;
import rt.pb;
import rt.qb;
import rt.rb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7017a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestIndexActivity f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f7019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f7020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f7021e;

    public /* synthetic */ d0(CourseTestIndexActivity courseTestIndexActivity, rz.b0 b0Var, b1 b1Var, b1 b1Var2) {
        this.f7018b = courseTestIndexActivity;
        this.f7019c = b0Var;
        this.f7020d = b1Var;
        this.f7021e = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7017a;
        qy.b0 b0Var = qy.b0.f48488a;
        rz.b0 b0Var2 = this.f7019c;
        switch (i11) {
            case 0:
                int i12 = CourseTestIndexActivity.N;
                rz.e0.B(b0Var2, null, null, new x0(this.f7018b, this.f7020d, this.f7021e, (vy.d) null, 2), 3);
                return b0Var;
            default:
                int i13 = CourseTestIndexActivity.N;
                b1 b1Var = this.f7020d;
                rb rbVar = (rb) b1Var.getValue();
                boolean z11 = rbVar instanceof ob;
                vy.d dVar = null;
                CourseTestIndexActivity courseTestIndexActivity = this.f7018b;
                if (z11) {
                    rb rbVar2 = (rb) b1Var.getValue();
                    kotlin.jvm.internal.m.d(rbVar2, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseTestIndexClickedLesson.ClickedCourseLesson");
                    CourseLesson courseLesson = ((ob) rbVar2).f50211a;
                    rb rbVar3 = (rb) b1Var.getValue();
                    kotlin.jvm.internal.m.d(rbVar3, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseTestIndexClickedLesson.ClickedCourseLesson");
                    CourseLessonPracticeType courseLessonPracticeType = ((ob) rbVar3).f50212b;
                    b0.k0 k0Var = new b0.k0(courseLesson, courseLessonPracticeType, b1Var, this.f7021e, 8);
                    CoursePracticeType coursePracticeTypeC = a.c(courseLessonPracticeType);
                    if (coursePracticeTypeC != null) {
                        rz.e0.B(b0Var2, null, null, new x0(courseTestIndexActivity, courseLesson, coursePracticeTypeC, k0Var, courseLessonPracticeType, (vy.d) null, 3), 3);
                    } else {
                        courseTestIndexActivity.q(courseLesson, courseLessonPracticeType);
                    }
                } else if (rbVar instanceof pb) {
                    rb rbVar4 = (rb) b1Var.getValue();
                    kotlin.jvm.internal.m.d(rbVar4, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseTestIndexClickedLesson.ClickedStoryLesson");
                    courseTestIndexActivity.r(((pb) rbVar4).f50246a);
                } else if (rbVar instanceof qb) {
                    rb rbVar5 = (rb) b1Var.getValue();
                    kotlin.jvm.internal.m.d(rbVar5, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseTestIndexClickedLesson.ClickedTipsLesson");
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestIndexActivity), null, null, new bh.j0((Object) courseTestIndexActivity, (Object) ((qb) rbVar5).f50300a, true, dVar, 3), 3);
                } else if (rbVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                b1Var.setValue(null);
                return b0Var;
        }
    }

    public /* synthetic */ d0(rz.b0 b0Var, CourseTestIndexActivity courseTestIndexActivity, b1 b1Var, b1 b1Var2) {
        this.f7019c = b0Var;
        this.f7018b = courseTestIndexActivity;
        this.f7020d = b1Var;
        this.f7021e = b1Var2;
    }
}

package ys;

import android.content.Context;
import android.widget.Toast;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.CourseQuestionPreferenceKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qs.b f58245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f58246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f58247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qs.b bVar, fz.c cVar, Context context, l1.b1 b1Var) {
        super(0, kotlin.jvm.internal.l.class, "resetCurrentQuestionPreference", "CourseTestSettingsScreen$resetCurrentQuestionPreference(Lcom/lingodeer/course/preferences/ResolvedCourseQuestionPreference;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f58245a = bVar;
        this.f58246b = cVar;
        this.f58247c = context;
        this.f58248d = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        qs.b bVar = this.f58245a;
        if (bVar != null) {
            CourseQuestionPreferenceContext courseQuestionPreferenceContext = bVar.f48312a;
            l1.b1 b1Var = this.f58248d;
            CourseQuestionPreference courseQuestionPreference = (CourseQuestionPreference) b1Var.getValue();
            b1Var.setValue(CourseQuestionPreferenceKt.buildDefaultCourseQuestionPreference(courseQuestionPreferenceContext, courseQuestionPreference != null ? courseQuestionPreference.getUpdatedAt() : 0L));
            this.f58246b.invoke(courseQuestionPreferenceContext);
            Toast.makeText(this.f58247c, R.string.success, 0).show();
        }
        return qy.b0.f48488a;
    }
}

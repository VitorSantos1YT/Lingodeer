package ys;

import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import rt.c9;
import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l9 f58028b;

    public /* synthetic */ g2(l9 l9Var, int i11) {
        this.f58027a = i11;
        this.f58028b = l9Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        CourseQuestionPreferenceContext context = (CourseQuestionPreferenceContext) obj;
        CourseQuestionPreference preference = (CourseQuestionPreference) obj2;
        switch (this.f58027a) {
            case 0:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(preference, "preference");
                this.f58028b.a(new c9(context, preference));
                break;
            default:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(preference, "preference");
                this.f58028b.a(new c9(context, preference));
                break;
        }
        return qy.b0.f48488a;
    }
}

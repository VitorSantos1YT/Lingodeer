package fs;

import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import kotlin.jvm.internal.m;
import qy.b0;
import rt.a9;
import rt.b9;
import rt.l9;
import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l9 f28009b;

    public /* synthetic */ b(l9 l9Var, int i11) {
        this.f28008a = i11;
        this.f28009b = l9Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f28008a) {
            case 0:
                z8 it = (z8) obj;
                m.f(it, "it");
                this.f28009b.a(new b9(it));
                break;
            case 1:
                z8 it2 = (z8) obj;
                m.f(it2, "it");
                this.f28009b.a(new b9(it2));
                break;
            case 2:
                z8 it3 = (z8) obj;
                m.f(it3, "it");
                this.f28009b.a(new b9(it3));
                break;
            case 3:
                CourseQuestionPreferenceContext context = (CourseQuestionPreferenceContext) obj;
                m.f(context, "context");
                this.f28009b.a(new a9(context));
                break;
            case 4:
                z8 it4 = (z8) obj;
                m.f(it4, "it");
                this.f28009b.a(new b9(it4));
                break;
            case 5:
                z8 it5 = (z8) obj;
                m.f(it5, "it");
                this.f28009b.a(new b9(it5));
                break;
            case 6:
                CourseQuestionPreferenceContext context2 = (CourseQuestionPreferenceContext) obj;
                m.f(context2, "context");
                this.f28009b.a(new a9(context2));
                break;
            case 7:
                z8 it6 = (z8) obj;
                m.f(it6, "it");
                this.f28009b.a(new b9(it6));
                break;
            default:
                CourseQuestionPreferenceContext context3 = (CourseQuestionPreferenceContext) obj;
                m.f(context3, "context");
                this.f28009b.a(new a9(context3));
                break;
        }
        return b0.f48488a;
    }
}

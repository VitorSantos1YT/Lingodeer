package xu;

import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import rt.uf;
import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f56484b;

    public /* synthetic */ n1(fz.c cVar, int i11) {
        this.f56483a = i11;
        this.f56484b = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f56483a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f56484b.invoke(bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f56484b.invoke(bool2);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f56484b.invoke(bool3);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f56484b.invoke(bool4);
                break;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                this.f56484b.invoke(num);
                break;
            case 5:
                this.f56484b.invoke(Float.valueOf(hz.b.k(((Float) obj).floatValue(), 0.1f, 1.0f)));
                break;
            case 6:
                Integer num2 = (Integer) obj;
                num2.intValue();
                this.f56484b.invoke(num2);
                break;
            case 7:
                uf tipsLesson = (uf) obj;
                kotlin.jvm.internal.m.f(tipsLesson, "tipsLesson");
                this.f56484b.invoke(tipsLesson);
                break;
            case 8:
                z8 it = (z8) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f56484b.invoke(it);
                break;
            case 9:
                CourseQuestionPreferenceContext context = (CourseQuestionPreferenceContext) obj;
                kotlin.jvm.internal.m.f(context, "context");
                this.f56484b.invoke(context);
                break;
            case 10:
                z8 it2 = (z8) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f56484b.invoke(it2);
                break;
            default:
                CourseQuestionPreferenceContext context2 = (CourseQuestionPreferenceContext) obj;
                kotlin.jvm.internal.m.f(context2, "context");
                this.f56484b.invoke(context2);
                break;
        }
        return qy.b0.f48488a;
    }
}

package ys;

import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qs.b f57975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f57976c;

    public /* synthetic */ d2(qs.b bVar, fz.e eVar, int i11) {
        this.f57974a = i11;
        this.f57975b = bVar;
        this.f57976c = eVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        CourseQuestionPreferenceContext courseQuestionPreferenceContext;
        CourseQuestionPreferenceContext courseQuestionPreferenceContext2;
        CourseQuestionPreference preference = (CourseQuestionPreference) obj;
        switch (this.f57974a) {
            case 0:
                kotlin.jvm.internal.m.f(preference, "preference");
                qs.b bVar = this.f57975b;
                if (bVar != null && (courseQuestionPreferenceContext = bVar.f48312a) != null) {
                    this.f57976c.invoke(courseQuestionPreferenceContext, preference);
                }
                break;
            default:
                kotlin.jvm.internal.m.f(preference, "preference");
                qs.b bVar2 = this.f57975b;
                if (bVar2 != null && (courseQuestionPreferenceContext2 = bVar2.f48312a) != null) {
                    this.f57976c.invoke(courseQuestionPreferenceContext2, preference);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}

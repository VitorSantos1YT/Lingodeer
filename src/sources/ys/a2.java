package ys;

import android.content.Context;
import com.lingodeer.data.model.CourseLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements fz.c {
    public final /* synthetic */ Context H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseLesson f57911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f57912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57915f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f57916t;

    public /* synthetic */ a2(CourseLesson courseLesson, fz.e eVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, fz.a aVar, Context context, int i11) {
        this.f57910a = i11;
        this.f57911b = courseLesson;
        this.f57912c = eVar;
        this.f57913d = b1Var;
        this.f57914e = b1Var2;
        this.f57915f = b1Var3;
        this.f57916t = aVar;
        this.H = context;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f57910a) {
            case 0:
                kotlin.jvm.internal.m.f((CourseLesson) obj, "<unused var>");
                Context context = this.H;
                CourseLesson courseLesson = this.f57911b;
                se.p.T(courseLesson, this.f57912c, this.f57913d, this.f57914e, this.f57915f, new z1(courseLesson, this.f57916t, context, 0));
                break;
            default:
                CourseLesson it = (CourseLesson) obj;
                kotlin.jvm.internal.m.f(it, "it");
                Context context2 = this.H;
                CourseLesson courseLesson2 = this.f57911b;
                se.p.T(courseLesson2, this.f57912c, this.f57913d, this.f57914e, this.f57915f, new z1(courseLesson2, this.f57916t, context2, 1));
                break;
        }
        return qy.b0.f48488a;
    }
}

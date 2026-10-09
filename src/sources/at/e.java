package at;

import com.lingodeer.data.model.CourseLesson;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f2869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseLesson f2870c;

    public /* synthetic */ e(fz.c cVar, CourseLesson courseLesson, int i11) {
        this.f2868a = i11;
        this.f2869b = cVar;
        this.f2870c = courseLesson;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f2868a) {
            case 0:
                this.f2869b.invoke(this.f2870c);
                break;
            default:
                this.f2869b.invoke(this.f2870c);
                break;
        }
        return b0.f48488a;
    }
}

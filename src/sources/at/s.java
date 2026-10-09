package at;

import com.lingodeer.data.model.CourseUnit;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f2928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseUnit f2929c;

    public /* synthetic */ s(fz.c cVar, CourseUnit courseUnit, int i11) {
        this.f2927a = i11;
        this.f2928b = cVar;
        this.f2929c = courseUnit;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f2927a) {
            case 0:
                this.f2928b.invoke(this.f2929c);
                break;
            case 1:
                this.f2928b.invoke(this.f2929c);
                break;
            case 2:
                this.f2928b.invoke(this.f2929c);
                break;
            default:
                this.f2928b.invoke(this.f2929c);
                break;
        }
        return b0.f48488a;
    }
}

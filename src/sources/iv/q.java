package iv;

import com.lingodeer.data.model.CourseCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseCharacter f34812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f34814d;

    public /* synthetic */ q(CourseCharacter courseCharacter, boolean z11, fz.a aVar, int i11, int i12) {
        this.f34811a = i12;
        this.f34812b = courseCharacter;
        this.f34813c = z11;
        this.f34814d = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34811a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.i(this.f34812b, this.f34813c, this.f34814d, nVar, l1.t.M(1));
                break;
            default:
                a.G(this.f34812b, this.f34813c, this.f34814d, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }
}

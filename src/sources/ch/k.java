package ch;

import com.lingodeer.data.model.CourseUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.e {
    public final /* synthetic */ fz.a H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseUiState f7055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f7056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f7057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f7058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f7059f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f7060t;

    public /* synthetic */ k(CourseUiState courseUiState, fz.c cVar, fz.a aVar, fz.a aVar2, fz.c cVar2, fz.c cVar3, fz.a aVar3, int i11, int i12) {
        this.f7054a = i12;
        this.f7055b = courseUiState;
        this.f7056c = cVar;
        this.f7057d = aVar;
        this.f7058e = aVar2;
        this.f7059f = cVar2;
        this.f7060t = cVar3;
        this.H = aVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7054a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                l.b(this.f7055b, this.f7056c, this.f7057d, this.f7058e, this.f7059f, this.f7060t, this.H, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                l.a(this.f7055b, this.f7056c, this.f7057d, this.f7058e, this.f7059f, this.f7060t, this.H, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}

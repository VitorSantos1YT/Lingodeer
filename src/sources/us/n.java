package us;

import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageExampleType f53122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f53123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f53124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f53125e;

    public /* synthetic */ n(ImageExampleType imageExampleType, fz.c cVar, fz.a aVar, fz.c cVar2, int i11, int i12) {
        this.f53121a = i12;
        this.f53122b = imageExampleType;
        this.f53123c = cVar;
        this.f53124d = aVar;
        this.f53125e = cVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53121a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = t.M(3457);
                b.f(this.f53122b, this.f53123c, this.f53124d, this.f53125e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = t.M(3457);
                b.e(this.f53122b, this.f53123c, this.f53124d, this.f53125e, (l1.n) obj, iM2);
                break;
        }
        return b0.f48488a;
    }
}

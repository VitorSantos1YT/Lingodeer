package us;

import com.lingodeer.course.smarttips.data.model.Hint;
import l1.s;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53077a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hint f53078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f53079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f53080d;

    public /* synthetic */ c(Hint hint, float f5, fz.c cVar) {
        this.f53078b = hint;
        this.f53079c = f5;
        this.f53080d = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f53077a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b.n(this.f53078b, this.f53079c, this.f53080d, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                num.getClass();
                b.n(this.f53078b, this.f53079c, this.f53080d, nVar, t.M(1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ c(Hint hint, float f5, fz.c cVar, int i11) {
        this.f53078b = hint;
        this.f53079c = f5;
        this.f53080d = cVar;
    }
}

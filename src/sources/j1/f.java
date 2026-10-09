package j1;

import com.yalantis.ucrop.view.CropImageView;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f35474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, boolean z11) {
        super(3);
        this.f35474a = qVar;
        this.f35475b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j0.q qVar = (j0.q) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).f(qVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                c.f35461a.a(this.f35474a, this.f35475b, qVar.a(z1.o.f58481a, z1.c.f58464b), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, nVar, 1572864);
            }
        } else {
            c.f35461a.a(this.f35474a, this.f35475b, qVar.a(z1.o.f58481a, z1.c.f58464b), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, nVar, 1572864);
        }
        return b0.f48488a;
    }
}

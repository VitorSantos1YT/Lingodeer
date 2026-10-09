package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ba extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(int i11) {
        super(3);
        this.f30053a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        l1.n nVar = (l1.n) obj2;
        ((Number) obj3).intValue();
        int size = list.size();
        int i11 = this.f30053a;
        if (i11 < size) {
            aa.f30000a.a(CropImageView.DEFAULT_ASPECT_RATIO, 3072, 0L, nVar, z1.a.a(z1.o.f58481a, new a0.f((y9) list.get(i11), 3)));
        }
        return qy.b0.f48488a;
    }
}

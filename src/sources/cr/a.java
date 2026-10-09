package cr;

import at.o;
import bp.h1;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import l1.s;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f22426a = new t1.d(new at.a(26), false, 2078943553);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f22427b = new t1.d(new h1(26), false, 1106160073);

    public static final void a(fz.a onDismissRequest, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        s sVar = (s) nVar;
        sVar.f0(-764955335);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            b(onDismissRequest, sVar, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(i11, 6, onDismissRequest);
        }
    }

    public static final void b(fz.a onDismissRequest, l1.n nVar, int i11) {
        s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        s sVar2 = (s) nVar;
        sVar2.f0(-600775940);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(-592345788, new o(7, onDismissRequest), sVar2), null, null, null, f22427b, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1572918, 16316);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(i11, 8, onDismissRequest);
        }
    }
}

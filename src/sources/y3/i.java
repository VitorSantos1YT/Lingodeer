package y3;

import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.LifecycleOwner;
import kotlin.NoWhenBranchMatchedException;
import qy.b0;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements fz.e {
    public static final i H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f57069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f57070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f57071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f57072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f57073f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f57074t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57075a;

    static {
        int i11 = 2;
        f57069b = new i(i11, 0);
        f57070c = new i(i11, 1);
        f57071d = new i(i11, 2);
        f57072e = new i(i11, 3);
        f57073f = new i(i11, 4);
        f57074t = new i(i11, 5);
        H = new i(i11, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i11, int i12) {
        super(i11);
        this.f57075a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57075a) {
            case 0:
                h.e((i0) obj).setUpdateBlock((fz.c) obj2);
                return b0.f48488a;
            case 1:
                h.e((i0) obj).setReleaseBlock((fz.c) obj2);
                return b0.f48488a;
            case 2:
                h.e((i0) obj).setModifier((z1.r) obj2);
                return b0.f48488a;
            case 3:
                h.e((i0) obj).setDensity((v3.c) obj2);
                return b0.f48488a;
            case 4:
                h.e((i0) obj).setLifecycleOwner((LifecycleOwner) obj2);
                return b0.f48488a;
            case 5:
                h.e((i0) obj).setSavedStateRegistryOwner((da.g) obj2);
                return b0.f48488a;
            default:
                ViewFactoryHolder viewFactoryHolderE = h.e((i0) obj);
                int i11 = k.f57082a[((v3.m) obj2).ordinal()];
                int i12 = 1;
                if (i11 == 1) {
                    i12 = 0;
                } else if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolderE.setLayoutDirection(i12);
                return b0.f48488a;
        }
    }
}

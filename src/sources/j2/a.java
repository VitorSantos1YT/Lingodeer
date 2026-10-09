package j2;

import com.yalantis.ucrop.view.CropImageView;
import g2.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35538c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35539a;

    static {
        int i11 = 1;
        f35537b = new a(i11, 0);
        f35538c = new a(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f35539a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f35539a) {
            case 0:
                break;
            default:
                i2.d.U((i2.d) obj, x.f28621h, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 126);
                break;
        }
        return b0.f48488a;
    }
}

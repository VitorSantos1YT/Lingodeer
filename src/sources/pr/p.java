package pr;

import com.yalantis.ucrop.view.CropImageView;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.t f47081b;

    public /* synthetic */ p(g2.t tVar, int i11) {
        this.f47080a = i11;
        this.f47081b = tVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f47080a) {
            case 0:
                k0 onDrawWithContent = (k0) obj;
                kotlin.jvm.internal.m.f(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.a();
                i2.d.p0(onDrawWithContent, this.f47081b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 62);
                return qy.b0.f48488a;
            default:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.b(new p(this.f47081b, 0));
        }
    }
}

package l0;

import com.yalantis.ucrop.view.CropImageView;
import l1.h1;
import n0.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f39181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f39182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f39185f;

    public r(int i11, int i12, int i13) {
        this.f39180a = i13;
        switch (i13) {
            case 1:
                this.f39181b = new h1(i11);
                this.f39182c = new h1(i12);
                this.f39185f = new g0(i11, 90, 200);
                break;
            default:
                this.f39181b = new h1(i11);
                this.f39182c = new h1(i12);
                this.f39185f = new g0(i11, 30, 100);
                break;
        }
    }

    public final void a(int i11, int i12) {
        switch (this.f39180a) {
            case 0:
                if (i11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    i0.a.a("Index should be non-negative (" + i11 + ')');
                }
                this.f39181b.m(i11);
                this.f39185f.b(i11);
                this.f39182c.m(i12);
                break;
            default:
                if (i11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    i0.a.a("Index should be non-negative");
                }
                this.f39181b.m(i11);
                this.f39185f.b(i11);
                this.f39182c.m(i12);
                break;
        }
    }
}

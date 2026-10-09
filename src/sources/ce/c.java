package ce;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements vd.b0, vd.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6842a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6844c;

    public c(Bitmap bitmap, wd.a aVar) {
        pe.f.c(bitmap, "Bitmap must not be null");
        this.f6843b = bitmap;
        pe.f.c(aVar, "BitmapPool must not be null");
        this.f6844c = aVar;
    }

    public static c e(Bitmap bitmap, wd.a aVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, aVar);
    }

    @Override // vd.y
    public final void a() {
        switch (this.f6842a) {
            case 0:
                ((Bitmap) this.f6843b).prepareToDraw();
                break;
            default:
                vd.b0 b0Var = (vd.b0) this.f6844c;
                if (b0Var instanceof vd.y) {
                    ((vd.y) b0Var).a();
                }
                break;
        }
    }

    @Override // vd.b0
    public final void b() {
        switch (this.f6842a) {
            case 0:
                ((wd.a) this.f6844c).d((Bitmap) this.f6843b);
                break;
            default:
                ((vd.b0) this.f6844c).b();
                break;
        }
    }

    @Override // vd.b0
    public final int c() {
        switch (this.f6842a) {
            case 0:
                return pe.m.c((Bitmap) this.f6843b);
            default:
                return ((vd.b0) this.f6844c).c();
        }
    }

    @Override // vd.b0
    public final Class d() {
        switch (this.f6842a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // vd.b0
    public final Object get() {
        switch (this.f6842a) {
            case 0:
                return (Bitmap) this.f6843b;
            default:
                return new BitmapDrawable((Resources) this.f6843b, (Bitmap) ((vd.b0) this.f6844c).get());
        }
    }

    public c(Resources resources, vd.b0 b0Var) {
        pe.f.c(resources, "Argument must not be null");
        this.f6843b = resources;
        pe.f.c(b0Var, "Argument must not be null");
        this.f6844c = b0Var;
    }
}

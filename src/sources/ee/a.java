package ee;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import pe.m;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f25483a;

    public a(AnimatedImageDrawable animatedImageDrawable) {
        this.f25483a = animatedImageDrawable;
    }

    @Override // vd.b0
    public final void b() {
        this.f25483a.stop();
        this.f25483a.clearAnimationCallbacks();
    }

    @Override // vd.b0
    public final int c() {
        return m.d(Bitmap.Config.ARGB_8888) * this.f25483a.getIntrinsicHeight() * this.f25483a.getIntrinsicWidth() * 2;
    }

    @Override // vd.b0
    public final Class d() {
        return Drawable.class;
    }

    @Override // vd.b0
    public final Object get() {
        return this.f25483a;
    }
}

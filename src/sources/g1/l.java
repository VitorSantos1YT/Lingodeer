package g1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f28534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f28535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28536d;

    public l(boolean z11) {
        super(ColorStateList.valueOf(-16777216), null, z11 ? new ColorDrawable(-1) : null);
        this.f28533a = z11;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f28533a) {
            this.f28536d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f28536d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f28536d;
    }
}

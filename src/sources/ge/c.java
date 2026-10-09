package ge;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29139b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f29138a = i11;
        this.f29139b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f29138a) {
            case 1:
                return ((Drawable.ConstantState) this.f29139b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f29138a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f29139b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f29138a) {
            case 0:
                return new d(this);
            default:
                ra.g gVar = new ra.g(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f29139b).newDrawable();
                gVar.f49000a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f48999f);
                return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f29138a) {
            case 0:
                return new d(this);
            default:
                ra.g gVar = new ra.g(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f29139b).newDrawable(resources);
                gVar.f49000a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f48999f);
                return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f29138a) {
            case 1:
                ra.g gVar = new ra.g(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f29139b).newDrawable(resources, theme);
                gVar.f49000a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f48999f);
                return gVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}

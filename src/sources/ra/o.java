package ra;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f49041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f49042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f49043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f49045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f49046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f49047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f49050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f49051l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f49040a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}

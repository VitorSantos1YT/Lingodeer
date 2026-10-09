package ge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements g, Animatable {
    public boolean H;
    public Paint K;
    public Rect L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f29140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29143d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29145f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29144e = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f29146t = -1;

    public d(c cVar) {
        this.f29140a = cVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f29143d) {
            return;
        }
        if (this.H) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.L == null) {
                this.L = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.L);
            this.H = false;
        }
        i iVar = (i) this.f29140a.f29139b;
        f fVar = iVar.f29162i;
        Bitmap bitmap = fVar != null ? fVar.f29151t : iVar.f29165l;
        if (this.L == null) {
            this.L = new Rect();
        }
        Rect rect = this.L;
        if (this.K == null) {
            this.K = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.K);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f29140a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((i) this.f29140a.f29139b).f29168p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((i) this.f29140a.f29139b).f29167o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f29141b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.H = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.K == null) {
            this.K = new Paint(2);
        }
        this.K.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K == null) {
            this.K = new Paint(2);
        }
        this.K.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        pe.f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f29143d);
        this.f29144e = z11;
        if (!z11) {
            this.f29141b = false;
            i iVar = (i) this.f29140a.f29139b;
            ArrayList arrayList = iVar.f29156c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                iVar.f29159f = false;
            }
        } else if (this.f29142c) {
            a();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f29142c = true;
        this.f29145f = 0;
        if (this.f29144e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f29142c = false;
        this.f29141b = false;
        i iVar = (i) this.f29140a.f29139b;
        ArrayList arrayList = iVar.f29156c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            iVar.f29159f = false;
        }
    }

    public final void a() {
        pe.f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f29143d);
        i iVar = (i) this.f29140a.f29139b;
        if (iVar.f29154a.f51570l.f51546c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f29141b) {
            return;
        }
        this.f29141b = true;
        ArrayList arrayList = iVar.f29156c;
        if (iVar.f29163j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException(anrPHlQ.rYcOEMqikIcXzm);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !iVar.f29159f) {
            iVar.f29159f = true;
            iVar.f29163j = false;
            iVar.a();
        }
        invalidateSelf();
    }
}

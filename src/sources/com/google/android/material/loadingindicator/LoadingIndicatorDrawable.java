package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.yalantis.ucrop.view.CropImageView;
import ew.a;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ns.o;
import q6.n;
import qy.l;
import ra.q;
import sy.c;
import u5.f;
import u5.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingIndicatorDrawable extends Drawable implements Drawable.Callback {
    public q H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoadingIndicatorSpec f14770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LoadingIndicatorDrawingDelegate f14771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LoadingIndicatorAnimatorDelegate f14772e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14774t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnimatorDurationScaleProvider f14768a = new AnimatorDurationScaleProvider();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f14773f = new Paint();

    public LoadingIndicatorDrawable(Context context, LoadingIndicatorSpec loadingIndicatorSpec, LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate, LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        this.f14769b = context;
        this.f14770c = loadingIndicatorSpec;
        this.f14771d = loadingIndicatorDrawingDelegate;
        this.f14772e = loadingIndicatorAnimatorDelegate;
        loadingIndicatorAnimatorDelegate.f14765g = this;
        setAlpha(255);
    }

    public final boolean a(boolean z11, boolean z12, boolean z13) {
        boolean visible = super.setVisible(z11, z12);
        final LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate = this.f14772e;
        ObjectAnimator objectAnimator = loadingIndicatorAnimatorDelegate.f14762d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        f fVar = loadingIndicatorAnimatorDelegate.f14763e;
        if (fVar != null) {
            fVar.d();
        }
        if (!z11 || !z13 || (this.f14768a != null && AnimatorDurationScaleProvider.a(this.f14769b.getContentResolver()) == CropImageView.DEFAULT_ASPECT_RATIO)) {
            return visible;
        }
        if (loadingIndicatorAnimatorDelegate.f14763e == null) {
            f fVar2 = new f(loadingIndicatorAnimatorDelegate, LoadingIndicatorAnimatorDelegate.f14758j);
            g gVar = new g();
            gVar.b(200.0f);
            gVar.a(0.6f);
            fVar2.m = gVar;
            fVar2.f52797j = 0.01f;
            loadingIndicatorAnimatorDelegate.f14763e = fVar2;
        }
        if (loadingIndicatorAnimatorDelegate.f14762d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(loadingIndicatorAnimatorDelegate, (Property<LoadingIndicatorAnimatorDelegate, Float>) LoadingIndicatorAnimatorDelegate.f14757i, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            loadingIndicatorAnimatorDelegate.f14762d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            loadingIndicatorAnimatorDelegate.f14762d.setInterpolator(null);
            loadingIndicatorAnimatorDelegate.f14762d.setRepeatCount(-1);
            loadingIndicatorAnimatorDelegate.f14762d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.1
                public AnonymousClass1() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate2 = LoadingIndicatorAnimatorDelegate.this;
                    f fVar3 = loadingIndicatorAnimatorDelegate2.f14763e;
                    int i11 = loadingIndicatorAnimatorDelegate2.f14759a + 1;
                    loadingIndicatorAnimatorDelegate2.f14759a = i11;
                    fVar3.a(i11);
                }
            });
        }
        loadingIndicatorAnimatorDelegate.f14759a = 1;
        loadingIndicatorAnimatorDelegate.a(CropImageView.DEFAULT_ASPECT_RATIO);
        loadingIndicatorAnimatorDelegate.f14766h.f14780a = loadingIndicatorAnimatorDelegate.f14764f.f14786d[0];
        loadingIndicatorAnimatorDelegate.f14763e.a(loadingIndicatorAnimatorDelegate.f14759a);
        loadingIndicatorAnimatorDelegate.f14762d.start();
        return visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i11;
        q qVar;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f14768a;
            int i12 = 0;
            LoadingIndicatorSpec loadingIndicatorSpec = this.f14770c;
            if (animatorDurationScaleProvider != null && AnimatorDurationScaleProvider.a(this.f14769b.getContentResolver()) == CropImageView.DEFAULT_ASPECT_RATIO && (qVar = this.H) != null) {
                qVar.setBounds(bounds);
                this.H.setTint(loadingIndicatorSpec.f14786d[0]);
                this.H.draw(canvas);
                return;
            }
            canvas.save();
            LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate = this.f14771d;
            loadingIndicatorDrawingDelegate.getClass();
            LoadingIndicatorSpec loadingIndicatorSpec2 = loadingIndicatorDrawingDelegate.f14777a;
            canvas.translate(bounds.centerX(), bounds.centerY());
            loadingIndicatorSpec2.getClass();
            float f5 = 2.0f;
            canvas.clipRect((-Math.max(loadingIndicatorSpec2.f14785c, loadingIndicatorSpec2.f14783a)) / 2.0f, (-Math.max(loadingIndicatorSpec2.f14784b, loadingIndicatorSpec2.f14783a)) / 2.0f, Math.max(loadingIndicatorSpec2.f14785c, loadingIndicatorSpec2.f14783a) / 2.0f, Math.max(loadingIndicatorSpec2.f14784b, loadingIndicatorSpec2.f14783a) / 2.0f);
            canvas.rotate(-90.0f);
            int i13 = loadingIndicatorSpec.f14787e;
            int i14 = this.f14774t;
            float fMin = Math.min(loadingIndicatorSpec2.f14784b, loadingIndicatorSpec2.f14785c) / 2.0f;
            int iA = MaterialColors.a(i13, i14);
            Paint paint = this.f14773f;
            paint.setColor(iA);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            int i15 = loadingIndicatorSpec2.f14784b;
            int i16 = loadingIndicatorSpec2.f14785c;
            canvas.drawRoundRect(new RectF((-i15) / 2.0f, (-i16) / 2.0f, i15 / 2.0f, i16 / 2.0f), fMin, fMin, paint);
            LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = this.f14772e.f14766h;
            int i17 = this.f14774t;
            Matrix matrix = loadingIndicatorDrawingDelegate.f14779c;
            paint.setColor(MaterialColors.a(indicatorState.f14780a, i17));
            paint.setStyle(style);
            canvas.save();
            canvas.rotate(indicatorState.f14782c);
            Path path = loadingIndicatorDrawingDelegate.f14778b;
            path.rewind();
            int iFloor = (int) Math.floor(indicatorState.f14781b);
            a10.f[] fVarArr = LoadingIndicatorDrawingDelegate.f14776e;
            int length = fVarArr.length;
            int i18 = iFloor / length;
            if ((iFloor ^ length) < 0 && i18 * length != iFloor) {
                i18--;
            }
            float f11 = indicatorState.f14781b - iFloor;
            a10.f fVar = fVarArr[iFloor - (i18 * length)];
            m.f(fVar, "<this>");
            c cVarO = o.o();
            ArrayList arrayList = fVar.f291a;
            int size = arrayList.size();
            q6.c cVar = null;
            int i19 = 0;
            q6.c cVar2 = null;
            while (i19 < size) {
                int i21 = i12;
                float[] fArr = new float[8];
                float f12 = f5;
                int i22 = i21;
                for (int i23 = 8; i22 < i23; i23 = 8) {
                    fArr[i22] = n.c(((q6.c) ((l) arrayList.get(i19)).f48495a).f47478a[i22], ((q6.c) ((l) arrayList.get(i19)).f48496b).f47478a[i22], f11);
                    i22++;
                }
                q6.c cVar3 = new q6.c(fArr);
                if (cVar2 == null) {
                    cVar2 = cVar3;
                }
                if (cVar != null) {
                    cVarO.add(cVar);
                }
                i19++;
                cVar = cVar3;
                i12 = i21;
                f5 = f12;
            }
            int i24 = i12;
            float f13 = f5;
            if (cVar != null && cVar2 != null) {
                float[] fArr2 = cVar.f47478a;
                float f14 = fArr2[i24];
                float f15 = fArr2[1];
                float f16 = fArr2[2];
                float f17 = fArr2[3];
                float f18 = fArr2[4];
                float f19 = fArr2[5];
                float[] fArr3 = cVar2.f47478a;
                cVarO.add(a.b(f14, f15, f16, f17, f18, f19, fArr3[i24], fArr3[1]));
            }
            c cVarE = o.e(cVarO);
            path.rewind();
            int iB = cVarE.b();
            int i25 = 1;
            int i26 = i24;
            while (i26 < iB) {
                q6.c cVar4 = (q6.c) cVarE.get(i26);
                if (i25 != 0) {
                    float[] fArr4 = cVar4.f47478a;
                    path.moveTo(fArr4[i24], fArr4[1]);
                    i11 = i24;
                } else {
                    i11 = i25;
                }
                float[] fArr5 = cVar4.f47478a;
                path.cubicTo(fArr5[2], fArr5[3], fArr5[4], fArr5[5], cVar4.a(), cVar4.b());
                i26++;
                i25 = i11;
            }
            path.close();
            float f21 = loadingIndicatorSpec2.f14783a / f13;
            matrix.setScale(f21, f21);
            path.transform(matrix);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14774t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14771d.f14777a;
        return Math.max(loadingIndicatorSpec.f14784b, loadingIndicatorSpec.f14783a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f14771d.f14777a;
        return Math.max(loadingIndicatorSpec.f14785c, loadingIndicatorSpec.f14783a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f14774t != i11) {
            this.f14774t = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14773f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        return a(z11, z12, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}

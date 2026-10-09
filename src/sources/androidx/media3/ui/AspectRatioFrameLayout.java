package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yalantis.ucrop.view.CropImageView;
import h9.a;
import h9.b;
import h9.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2154d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2157c;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f2157c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        float f5;
        float f11;
        super.onMeasure(i11, i12);
        if (this.f2156b <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f2156b / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        b bVar = this.f2155a;
        if (fAbs <= 0.01f) {
            if (bVar.f32006b) {
                return;
            }
            bVar.f32006b = true;
            ((AspectRatioFrameLayout) bVar.f32007c).post(bVar);
            return;
        }
        int i13 = this.f2157c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f5 = this.f2156b;
                } else if (i13 == 4) {
                    if (f14 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = this.f2156b;
                    } else {
                        f11 = this.f2156b;
                    }
                }
                measuredWidth = (int) (f13 * f5);
            } else {
                f11 = this.f2156b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = this.f2156b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f5 = this.f2156b;
            measuredWidth = (int) (f13 * f5);
        }
        if (!bVar.f32006b) {
            bVar.f32006b = true;
            ((AspectRatioFrameLayout) bVar.f32007c).post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f5) {
        if (this.f2156b != f5) {
            this.f2156b = f5;
            requestLayout();
        }
    }

    public void setResizeMode(int i11) {
        if (this.f2157c != i11) {
            this.f2157c = i11;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2157c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c0.f32016a, 0, 0);
            try {
                this.f2157c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f2155a = new b(this);
    }

    public void setAspectRatioListener(a aVar) {
    }
}

package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.yalantis.ucrop.view.CropImageView;
import i4.d;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {
    public RectF H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Path f1320f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewOutlineProvider f1321t;

    public MotionButton(Context context) {
        super(context);
        this.f1318d = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1319e = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36035j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.f1319e;
    }

    public float getRoundPercent() {
        return this.f1318d;
    }

    public void setRound(float f5) {
        if (Float.isNaN(f5)) {
            this.f1319e = f5;
            float f11 = this.f1318d;
            this.f1318d = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z11 = this.f1319e != f5;
        this.f1319e = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.f1320f == null) {
                this.f1320f = new Path();
            }
            if (this.H == null) {
                this.H = new RectF();
            }
            if (this.f1321t == null) {
                d dVar = new d(this, 1);
                this.f1321t = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            this.H.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getWidth(), getHeight());
            this.f1320f.reset();
            Path path = this.f1320f;
            RectF rectF = this.H;
            float f12 = this.f1319e;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f5) {
        boolean z11 = this.f1318d != f5;
        this.f1318d = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.f1320f == null) {
                this.f1320f = new Path();
            }
            if (this.H == null) {
                this.H = new RectF();
            }
            if (this.f1321t == null) {
                d dVar = new d(this, 0);
                this.f1321t = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1318d) / 2.0f;
            this.H.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width, height);
            this.f1320f.reset();
            this.f1320f.addRoundRect(this.H, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1318d = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1319e = Float.NaN;
        a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1318d = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1319e = Float.NaN;
        a(context, attributeSet);
    }
}

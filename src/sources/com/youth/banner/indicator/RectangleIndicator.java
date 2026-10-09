package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RectangleIndicator extends BaseIndicator {
    RectF rectF;

    public RectangleIndicator(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        int i11 = 0;
        float indicatorSpace = 0.0f;
        while (i11 < indicatorSize) {
            this.mPaint.setColor(this.config.getCurrentPosition() == i11 ? this.config.getSelectedColor() : this.config.getNormalColor());
            int selectedWidth = this.config.getCurrentPosition() == i11 ? this.config.getSelectedWidth() : this.config.getNormalWidth();
            this.rectF.set(indicatorSpace, CropImageView.DEFAULT_ASPECT_RATIO, selectedWidth + indicatorSpace, this.config.getHeight());
            indicatorSpace += this.config.getIndicatorSpace() + selectedWidth;
            canvas.drawRoundRect(this.rectF, this.config.getRadius(), this.config.getRadius(), this.mPaint);
            i11++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        int i13 = indicatorSize - 1;
        setMeasuredDimension(this.config.getSelectedWidth() + (this.config.getNormalWidth() * i13) + (this.config.getIndicatorSpace() * i13), this.config.getHeight());
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.rectF = new RectF();
    }
}

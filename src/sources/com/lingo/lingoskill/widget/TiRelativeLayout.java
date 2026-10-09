package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TiRelativeLayout extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22168a;

    public TiRelativeLayout(Context context) {
        super(context);
        this.f22168a = 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(1);
        paint.setColor(this.f22168a);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight());
        path.lineTo(getMeasuredWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
        path.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight());
        path.close();
        canvas.drawPath(path, paint);
    }

    public void setColor(int i11) {
        this.f22168a = i11;
        invalidate();
    }

    public TiRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22168a = 0;
    }

    public TiRelativeLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22168a = 0;
    }
}

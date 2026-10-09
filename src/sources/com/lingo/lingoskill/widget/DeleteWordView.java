package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeleteWordView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f22096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f22097c;

    public DeleteWordView(Context context) {
        super(context);
        this.f22095a = new Paint(1);
        this.f22096b = new Paint(1);
        this.f22097c = new RectF();
        a();
    }

    public final void a() {
        this.f22095a.setColor(Color.parseColor("#33000000"));
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = j3.Z(2, context);
        Paint paint = this.f22096b;
        paint.setStrokeWidth(fZ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#FF2828"));
    }

    public final RectF getRect() {
        return this.f22097c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f22097c;
        rectF.left = CropImageView.DEFAULT_ASPECT_RATIO;
        rectF.top = CropImageView.DEFAULT_ASPECT_RATIO;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        Context context = getContext();
        m.e(context, "getContext(...)");
        float fZ = j3.Z(4, context);
        Context context2 = getContext();
        m.e(context2, "getContext(...)");
        canvas.drawRoundRect(rectF, fZ, j3.Z(4, context2), this.f22095a);
        Context context3 = getContext();
        m.e(context3, "getContext(...)");
        float fZ2 = j3.Z(4, context3);
        float f5 = fZ2 + CropImageView.DEFAULT_ASPECT_RATIO;
        canvas.drawLine(f5, f5, getWidth() - fZ2, getHeight() - fZ2, this.f22096b);
    }

    public DeleteWordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22095a = new Paint(1);
        this.f22096b = new Paint(1);
        this.f22097c = new RectF();
        a();
    }
}

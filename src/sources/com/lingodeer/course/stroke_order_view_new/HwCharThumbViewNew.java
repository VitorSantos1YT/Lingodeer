package com.lingodeer.course.stroke_order_view_new;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import qp.r;
import ws.c;
import ws.d;
import ws.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HwCharThumbViewNew extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f22258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f22259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f22260d;

    public HwCharThumbViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22258b = new r(7);
        this.f22259c = null;
        this.f22260d = 1.0d;
        Paint paint = new Paint(1);
        this.f22257a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setColor(-16777216);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f22259c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    public void setAHanzi(String str) {
        int i11 = getLayoutParams().width;
        int i12 = getLayoutParams().height;
        if (i11 != i12) {
            throw new IllegalArgumentException();
        }
        this.f22260d = ((double) i11) / 800.0d;
        e eVar = new e();
        ArrayList arrayList = new ArrayList();
        eVar.f55212a = str;
        eVar.f55213b = 0;
        while (true) {
            c cVarA = eVar.a();
            if (cVarA == null) {
                break;
            } else {
                arrayList.add(cVarA);
            }
        }
        Bitmap bitmap = this.f22259c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22259c = null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ArrayList arrayList2 = ((c) obj).f55208c;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                d dVar = (d) obj2;
                double d5 = dVar.f55209a;
                double d11 = this.f22260d;
                dVar.f55209a = (float) (d5 * d11);
                dVar.f55210b = (float) (((double) dVar.f55210b) * d11);
            }
        }
        this.f22259c = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f22259c);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f22257a;
        paint.setStyle(style);
        canvas.drawPath(this.f22258b.b(arrayList), paint);
        invalidate();
    }
}

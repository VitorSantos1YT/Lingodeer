package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Iterator;
import py.b;
import vq.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BrainWaveView extends View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22083e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f22086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f22087d;

    public BrainWaveView(Context context) {
        super(context);
        this.f22084a = 2000L;
        this.f22085b = new ArrayList();
        new b(this, 9);
        new LinearInterpolator();
        this.f22087d = new Paint(1);
        this.f22086c = BitmapFactory.decodeResource(getResources(), R.drawable.pic_danao_outter);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList = this.f22085b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            long jCurrentTimeMillis = System.currentTimeMillis();
            aVar.getClass();
            if (jCurrentTimeMillis < this.f22084a) {
                System.currentTimeMillis();
                throw null;
            }
            it.remove();
        }
        if (arrayList.size() > 0) {
            postInvalidateDelayed(10L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        new Rect(0, 0, i11, i12);
        new Rect((i11 - this.f22086c.getWidth()) / 2, (i12 - this.f22086c.getHeight()) / 2, (this.f22086c.getWidth() / 2) + (i11 / 2), (this.f22086c.getHeight() / 2) + (i12 / 2)).toString();
    }

    public void setColor(int i11) {
        this.f22087d.setColor(i11);
    }

    public void setDuration(long j11) {
        this.f22084a = j11;
    }

    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            new LinearInterpolator();
        }
    }

    public BrainWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22084a = 2000L;
        this.f22085b = new ArrayList();
        new b(this, 9);
        new LinearInterpolator();
        this.f22087d = new Paint(1);
        this.f22086c = BitmapFactory.decodeResource(getResources(), R.drawable.pic_danao_outter);
    }

    public void setSpeed(int i11) {
    }
}

package com.lingodeer.course.stroke_order_view_new;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ju.a;
import kotlin.jvm.internal.m;
import qp.r;
import ws.b;
import ws.c;
import ws.d;
import ws.e;
import ws.f;
import ws.g;
import ws.h;
import ws.i;
import ws.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HwViewNew extends FrameLayout {
    public final ArrayList H;
    public final ArrayList K;
    public final ArrayList L;
    public Bitmap M;
    public b N;
    public j O;
    public double P;
    public i Q;
    public boolean R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f22266f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f22267t;

    public HwViewNew(Context context) {
        super(context);
        this.f22263c = -65536;
        this.f22264d = 600;
        this.f22265e = true;
        this.f22267t = new r(7);
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 1.0d;
        this.R = false;
        this.f22261a = a.f37321k1;
        this.f22262b = a.f37324l1;
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f22266f = paint;
        paint.setStyle(Paint.Style.STROKE);
        m.f(context, "context");
        paint.setStrokeWidth((int) ((1.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
    }

    public final void a(Canvas canvas) {
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f22266f;
        paint.setStyle(style);
        paint.setColor(this.f22262b);
        canvas.drawPath(this.f22267t.b(this.L), paint);
    }

    public final void b() {
        j jVar = this.O;
        if (jVar != null) {
            jVar.d();
        }
        j jVar2 = this.O;
        if ((jVar2 == null || !(jVar2 instanceof g)) && this.M != null) {
            double d5 = this.P;
            g gVar = new g();
            gVar.f55216a = null;
            gVar.f55220e = false;
            gVar.H = new d();
            gVar.K = CropImageView.DEFAULT_ASPECT_RATIO;
            gVar.L = new float[2];
            gVar.M = new ArrayList();
            gVar.N = new ArrayList();
            gVar.O = false;
            gVar.T = 0;
            gVar.U = false;
            gVar.V = null;
            gVar.W = new ArrayList();
            gVar.X = new float[2];
            gVar.Y = new float[2];
            gVar.f55218c = this;
            gVar.f55222t = (int) (d5 * 100.0d);
            gVar.f55221f = new PathMeasure();
            gVar.f55219d = 0;
            gVar.f55216a = new Canvas(this.M);
            this.O = gVar;
            setOnTouchListener(gVar);
            this.O.e(this.Q);
        }
        d();
        j jVar3 = this.O;
        if (jVar3 != null) {
            jVar3.c();
        }
    }

    public final void c(String str, ArrayList arrayList, ArrayList arrayList2) {
        e eVar;
        ArrayList arrayList3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMin = Math.min(measuredWidth, measuredHeight);
        if (iMin > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = iMin;
            layoutParams.height = iMin;
            setLayoutParams(layoutParams);
            requestLayout();
        }
        this.P = ((double) measuredWidth) / 800.0d;
        d();
        e eVar2 = new e();
        ArrayList arrayList4 = this.L;
        arrayList4.clear();
        eVar2.f55212a = str;
        int i11 = 0;
        eVar2.f55213b = 0;
        while (true) {
            c cVarA = eVar2.a();
            if (cVarA == null) {
                break;
            } else {
                arrayList4.add(cVarA);
            }
        }
        if (measuredWidth == 0) {
            return;
        }
        Bitmap bitmap = this.M;
        if (bitmap == null) {
            this.M = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        } else {
            bitmap.eraseColor(0);
        }
        int size = arrayList4.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList4.get(i12);
            i12++;
            ArrayList arrayList5 = ((c) obj).f55208c;
            int size2 = arrayList5.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList5.get(i13);
                i13++;
                d dVar = (d) obj2;
                double d5 = dVar.f55209a;
                double d11 = this.P;
                dVar.f55209a = (float) (d5 * d11);
                dVar.f55210b = (float) (((double) dVar.f55210b) * d11);
            }
        }
        ArrayList arrayList6 = this.H;
        arrayList6.clear();
        ArrayList arrayList7 = this.K;
        arrayList7.clear();
        int i14 = 0;
        while (i14 < arrayList.size()) {
            String str2 = (String) arrayList.get(i14);
            ArrayList arrayList8 = new ArrayList();
            eVar2.f55212a = str2;
            eVar2.f55213b = i11;
            while (true) {
                c cVarA2 = eVar2.a();
                if (cVarA2 == null) {
                    break;
                } else {
                    arrayList8.add(cVarA2);
                }
            }
            int size3 = arrayList8.size();
            int i15 = i11;
            while (i15 < size3) {
                Object obj3 = arrayList8.get(i15);
                i15++;
                ArrayList arrayList9 = ((c) obj3).f55208c;
                int size4 = arrayList9.size();
                int i16 = i11;
                while (i16 < size4) {
                    Object obj4 = arrayList9.get(i16);
                    i16++;
                    d dVar2 = (d) obj4;
                    double d12 = dVar2.f55209a;
                    double d13 = this.P;
                    dVar2.f55209a = (float) (d12 * d13);
                    dVar2.f55210b = (float) (((double) dVar2.f55210b) * d13);
                    size3 = size3;
                    i11 = 0;
                }
            }
            f fVar = new f();
            Path path = new Path();
            fVar.f55214a = path;
            r rVar = this.f22267t;
            path.set(rVar.b(arrayList8));
            getContext();
            double d14 = this.P;
            PathMeasure pathMeasure = new PathMeasure();
            pathMeasure.setPath(fVar.f55214a, false);
            float[] fArr = new float[2];
            pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
            float f5 = fArr[0];
            float f11 = fArr[1];
            pathMeasure.getPosTan(pathMeasure.getLength() - ((int) (d14 * 20.0d)), fArr, null);
            double d15 = fArr[0] - f5;
            double d16 = fArr[1] - f11;
            double dCos = (Math.cos(0.5235987755982988d) * d15) - (Math.sin(0.5235987755982988d) * d16);
            double d17 = f5;
            double d18 = f11;
            double dSin = (Math.sin(0.5235987755982988d) * d15) + (Math.cos(0.5235987755982988d) * d16) + d18;
            double dCos2 = ((Math.cos(5.759586531581287d) * d15) - (Math.sin(5.759586531581287d) * d16)) + d17;
            ArrayList arrayList10 = arrayList7;
            e eVar3 = eVar2;
            double dSin2 = (Math.sin(5.759586531581287d) * d15) + (Math.cos(5.759586531581287d) * d16) + d18;
            Path path2 = new Path();
            fVar.f55215b = path2;
            path2.moveTo((float) dCos2, (float) dSin2);
            fVar.f55215b.lineTo(f5, f11);
            fVar.f55215b.lineTo((float) (dCos + d17), (float) dSin);
            arrayList6.add(fVar);
            String str3 = (String) arrayList2.get(i14);
            double d19 = this.P;
            Path path3 = new Path();
            char cCharAt = str3.charAt(0);
            if (cCharAt < '0' || cCharAt > '9') {
                eVar = eVar3;
                eVar.f55212a = str3;
                eVar.f55213b = 0;
                ArrayList arrayList11 = new ArrayList();
                while (true) {
                    c cVarA3 = eVar.a();
                    if (cVarA3 == null) {
                        break;
                    } else {
                        arrayList11.add(cVarA3);
                    }
                }
                int size5 = arrayList11.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj5 = arrayList11.get(i17);
                    i17++;
                    ArrayList arrayList12 = ((c) obj5).f55208c;
                    int size6 = arrayList12.size();
                    int i18 = 0;
                    while (i18 < size6) {
                        Object obj6 = arrayList12.get(i18);
                        i18++;
                        d dVar3 = (d) obj6;
                        dVar3.f55209a = (float) (((double) dVar3.f55209a) * d19);
                        dVar3.f55210b = (float) (((double) dVar3.f55210b) * d19);
                        arrayList6 = arrayList6;
                    }
                }
                arrayList3 = arrayList6;
                path3.set(rVar.b(arrayList11));
            } else {
                String[] strArrSplit = str3.split("[ ]+");
                ArrayList arrayList13 = new ArrayList();
                for (String str4 : strArrSplit) {
                    String strTrim = str4.trim();
                    if (!strTrim.equals(BuildConfig.VERSION_NAME)) {
                        arrayList13.add(strTrim);
                    }
                }
                for (int i19 = 0; i19 < arrayList13.size(); i19++) {
                    String[] strArrSplit2 = ((String) arrayList13.get(i19)).split(",");
                    float f12 = (float) (((double) Float.parseFloat(strArrSplit2[0].trim())) * d19);
                    float f13 = (float) (((double) Float.parseFloat(strArrSplit2[1].trim())) * d19);
                    if (i19 == 0) {
                        path3.moveTo(f12, f13);
                    } else {
                        path3.lineTo(f12, f13);
                    }
                }
                path3.close();
                arrayList3 = arrayList6;
                eVar = eVar3;
            }
            arrayList10.add(path3);
            i14++;
            arrayList7 = arrayList10;
            eVar2 = eVar;
            arrayList6 = arrayList3;
            i11 = 0;
        }
        invalidate();
        j jVar = this.O;
        if (jVar == null) {
            h hVar = new h();
            hVar.f55223a = null;
            hVar.f55228f = false;
            hVar.f55229t = new d();
            hVar.H = new float[2];
            hVar.K = new ArrayList();
            hVar.L = new ArrayList();
            hVar.M = new float[2];
            hVar.N = new float[2];
            hVar.O = new ArrayList();
            hVar.f55225c = this;
            hVar.f55226d = new PathMeasure();
            hVar.f55227e = 0;
            hVar.f55223a = new Canvas(this.M);
            new Canvas(this.M);
            this.O = hVar;
        } else {
            jVar.reset();
        }
        setOnTouchListener(this.O);
        this.O.e(this.Q);
        b bVar = this.N;
        if (bVar == null) {
            double d20 = this.P;
            b bVar2 = new b();
            bVar2.f55197a = null;
            bVar2.f55198b = null;
            bVar2.f55199c = null;
            bVar2.f55200d = false;
            bVar2.f55201e = 0;
            bVar2.f55202f = new ArrayList();
            bVar2.f55203g = this;
            bVar2.f55204h = (int) (d20 * 50.0d);
            bVar2.f55197a = new Canvas(this.M);
            this.N = bVar2;
            bVar2.f55205i = this.f22264d;
        } else {
            bVar.b();
        }
        this.N.getClass();
    }

    public final void d() {
        b bVar = this.N;
        if (bVar != null) {
            bVar.f55201e = 0;
            bVar.f55200d = false;
            bVar.f55202f.clear();
            ValueAnimator valueAnimator = bVar.f55199c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.N.b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22265e) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f22266f;
            paint.setStyle(style);
            paint.setColor(this.f22261a);
            canvas.drawPath(this.f22267t.b(this.L), paint);
        }
        b bVar = this.N;
        if (bVar != null) {
            int i11 = bVar.f55201e;
            HwViewNew hwViewNew = bVar.f55203g;
            if (i11 != hwViewNew.K.size() && bVar.f55200d && bVar.f55201e < hwViewNew.K.size()) {
                canvas.drawBitmap(hwViewNew.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
            }
        }
        j jVar = this.O;
        if (jVar != null) {
            jVar.b(canvas);
        }
        b bVar2 = this.N;
        boolean z11 = bVar2 != null && bVar2.f55200d;
        j jVar2 = this.O;
        if (jVar2 != null && jVar2.a()) {
            z11 = true;
        }
        j jVar3 = this.O;
        if ((jVar3 != null && (jVar3 instanceof g) && ((g) jVar3).O) ? true : z11) {
            return;
        }
        a(canvas);
    }

    public void setBgHanziPartVisibility(boolean z11) {
        invalidate();
    }

    public void setBgHanziVisibility(boolean z11) {
        this.f22265e = z11;
        invalidate();
    }

    public void setShowBijiWhenWriting(boolean z11) {
        invalidate();
    }

    public void setShowBijiWhenWriting2(boolean z11) {
        this.R = z11;
        invalidate();
    }

    public void setTimeGap(int i11) {
        this.f22264d = i11;
        b bVar = this.N;
        if (bVar != null) {
            bVar.f55205i = i11;
        }
    }

    public void setWritingListener(i iVar) {
        this.Q = iVar;
        j jVar = this.O;
        if (jVar != null) {
            jVar.e(iVar);
        }
    }

    public HwViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22263c = -65536;
        this.f22264d = 600;
        this.f22265e = true;
        this.f22267t = new r(7);
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 1.0d;
        this.R = false;
        this.f22261a = a.f37321k1;
        this.f22262b = a.f37324l1;
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f22266f = paint;
        paint.setStyle(Paint.Style.STROKE);
        m.f(context, "context");
        paint.setStrokeWidth((int) ((1.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setAnimListener(ws.a aVar) {
    }
}

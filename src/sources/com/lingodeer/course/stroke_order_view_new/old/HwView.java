package com.lingodeer.course.stroke_order_view_new.old;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import xs.a;
import xs.b;
import xs.c;
import xs.d;
import xs.e;
import xs.f;
import xs.h;
import xs.i;
import xs.j;
import xs.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HwView extends FrameLayout {
    public final ArrayList H;
    public final ArrayList K;
    public final ArrayList L;
    public Bitmap M;
    public b N;
    public k O;
    public double P;
    public j Q;
    public a R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f22277f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qp.b f22278t;

    public HwView(Context context) {
        super(context);
        this.f22274c = -65536;
        this.f22275d = 50;
        this.f22276e = true;
        this.f22278t = new qp.b();
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 1.0d;
        this.S = false;
        this.T = false;
        this.f22272a = ju.a.f37321k1;
        this.f22273b = ju.a.f37324l1;
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f22277f = paint;
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        m.f(context2, "context");
        paint.setStrokeWidth((int) ((1.0f * context2.getResources().getDisplayMetrics().density) + 0.5f));
    }

    public final void a() {
        Bitmap bitmap = this.M;
        if (bitmap != null) {
            bitmap.recycle();
            this.M = null;
        }
        b bVar = this.N;
        if (bVar != null) {
            bVar.a();
        }
        k kVar = this.O;
        if (kVar != null) {
            kVar.reset();
        }
    }

    public final void b(Canvas canvas) {
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f22277f;
        paint.setStyle(style);
        paint.setColor(this.f22273b);
        canvas.drawPath(this.f22278t.a(this.L), paint);
    }

    public final void c() {
        k kVar = this.O;
        if (kVar != null) {
            kVar.d();
        }
        k kVar2 = this.O;
        if ((kVar2 == null || !(kVar2 instanceof i)) && this.M != null) {
            i iVar = new i(this, this.P);
            this.O = iVar;
            setOnTouchListener(iVar);
            this.O.g(this.Q);
        }
        g();
        k kVar3 = this.O;
        if (kVar3 != null) {
            kVar3.c();
        }
    }

    public final void d() {
        k kVar = this.O;
        if (kVar != null) {
            kVar.d();
        }
        k kVar2 = this.O;
        if ((kVar2 == null || !(kVar2 instanceof h)) && this.M != null) {
            double d5 = this.P;
            h hVar = new h();
            hVar.f56238a = null;
            hVar.f56244e = false;
            hVar.H = new d();
            hVar.K = CropImageView.DEFAULT_ASPECT_RATIO;
            hVar.L = new float[2];
            hVar.M = new ArrayList();
            hVar.N = false;
            hVar.T = 0;
            hVar.U = 0;
            hVar.X = false;
            hVar.Y = null;
            hVar.Z = new float[2];
            hVar.f56239a0 = new float[2];
            hVar.f56241b0 = false;
            hVar.f56242c = this;
            hVar.f56246t = (int) (d5 * 100.0d);
            hVar.f56245f = new PathMeasure();
            hVar.f56243d = 0;
            hVar.f56238a = new Canvas(this.M);
            this.O = hVar;
            setOnTouchListener(hVar);
            this.O.g(this.Q);
        }
        g();
        k kVar3 = this.O;
        if (kVar3 != null) {
            kVar3.c();
        }
    }

    public final void e(String str, List list, List list2) {
        e eVar;
        ArrayList arrayList;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth != measuredHeight) {
            throw new IllegalArgumentException();
        }
        this.P = ((double) measuredWidth) / 800.0d;
        g();
        e eVar2 = new e();
        ArrayList arrayList2 = this.L;
        arrayList2.clear();
        eVar2.f56231a = str;
        int i11 = 0;
        eVar2.f56232b = 0;
        while (true) {
            c cVarA = eVar2.a();
            if (cVarA == null) {
                break;
            } else {
                arrayList2.add(cVarA);
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
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ArrayList arrayList3 = ((c) obj).f56227c;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                d dVar = (d) obj2;
                double d5 = dVar.f56228a;
                double d11 = this.P;
                dVar.f56228a = (float) (d5 * d11);
                dVar.f56229b = (float) (((double) dVar.f56229b) * d11);
            }
        }
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        ArrayList arrayList5 = this.K;
        arrayList5.clear();
        int i14 = 0;
        while (i14 < list.size()) {
            String str2 = (String) list.get(i14);
            ArrayList arrayList6 = new ArrayList();
            eVar2.f56231a = str2;
            eVar2.f56232b = i11;
            while (true) {
                c cVarA2 = eVar2.a();
                if (cVarA2 == null) {
                    break;
                } else {
                    arrayList6.add(cVarA2);
                }
            }
            int size3 = arrayList6.size();
            int i15 = i11;
            while (i15 < size3) {
                Object obj3 = arrayList6.get(i15);
                i15++;
                ArrayList arrayList7 = ((c) obj3).f56227c;
                int size4 = arrayList7.size();
                int i16 = i11;
                while (i16 < size4) {
                    Object obj4 = arrayList7.get(i16);
                    i16++;
                    d dVar2 = (d) obj4;
                    double d12 = dVar2.f56228a;
                    double d13 = this.P;
                    dVar2.f56228a = (float) (d12 * d13);
                    dVar2.f56229b = (float) (((double) dVar2.f56229b) * d13);
                    size3 = size3;
                    arrayList6 = arrayList6;
                    i11 = 0;
                }
            }
            f fVar = new f();
            Path path = new Path();
            fVar.f56233a = path;
            qp.b bVar = this.f22278t;
            path.set(bVar.a(arrayList6));
            getContext();
            double d14 = this.P;
            PathMeasure pathMeasure = new PathMeasure();
            pathMeasure.setPath(fVar.f56233a, false);
            float[] fArr = new float[2];
            pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
            float f5 = fArr[0];
            float f11 = fArr[1];
            pathMeasure.getPosTan(pathMeasure.getLength() - ((int) (d14 * 20.0d)), fArr, null);
            double d15 = fArr[0] - f5;
            double d16 = fArr[1] - f11;
            double d17 = f5;
            double dCos = ((Math.cos(0.5235987755982988d) * d15) - (Math.sin(0.5235987755982988d) * d16)) + d17;
            double d18 = f11;
            double dSin = (Math.sin(0.5235987755982988d) * d15) + (Math.cos(0.5235987755982988d) * d16) + d18;
            double dCos2 = ((Math.cos(5.759586531581287d) * d15) - (Math.sin(5.759586531581287d) * d16)) + d17;
            ArrayList arrayList8 = arrayList5;
            e eVar3 = eVar2;
            double dSin2 = (Math.sin(5.759586531581287d) * d15) + (Math.cos(5.759586531581287d) * d16) + d18;
            Path path2 = new Path();
            fVar.f56234b = path2;
            path2.moveTo((float) dCos2, (float) dSin2);
            fVar.f56234b.lineTo(f5, f11);
            fVar.f56234b.lineTo((float) dCos, (float) dSin);
            arrayList4.add(fVar);
            String str3 = (String) list2.get(i14);
            double d19 = this.P;
            Path path3 = new Path();
            char cCharAt = str3.charAt(0);
            if (cCharAt < '0' || cCharAt > '9') {
                eVar = eVar3;
                eVar.f56231a = str3;
                eVar.f56232b = 0;
                ArrayList arrayList9 = new ArrayList();
                while (true) {
                    c cVarA3 = eVar.a();
                    if (cVarA3 == null) {
                        break;
                    } else {
                        arrayList9.add(cVarA3);
                    }
                }
                int size5 = arrayList9.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj5 = arrayList9.get(i17);
                    i17++;
                    ArrayList arrayList10 = ((c) obj5).f56227c;
                    int size6 = arrayList10.size();
                    int i18 = 0;
                    while (i18 < size6) {
                        Object obj6 = arrayList10.get(i18);
                        i18++;
                        d dVar3 = (d) obj6;
                        dVar3.f56228a = (float) (((double) dVar3.f56228a) * d19);
                        dVar3.f56229b = (float) (((double) dVar3.f56229b) * d19);
                        arrayList4 = arrayList4;
                    }
                }
                arrayList = arrayList4;
                path3.set(bVar.a(arrayList9));
            } else {
                String[] strArrSplit = str3.split("[ ]+");
                ArrayList arrayList11 = new ArrayList();
                for (String str4 : strArrSplit) {
                    String strTrim = str4.trim();
                    if (!strTrim.equals(BuildConfig.VERSION_NAME)) {
                        arrayList11.add(strTrim);
                    }
                }
                for (int i19 = 0; i19 < arrayList11.size(); i19++) {
                    String[] strArrSplit2 = ((String) arrayList11.get(i19)).split(",");
                    float f12 = (float) (((double) Float.parseFloat(strArrSplit2[0].trim())) * d19);
                    float f13 = (float) (((double) Float.parseFloat(strArrSplit2[1].trim())) * d19);
                    if (i19 == 0) {
                        path3.moveTo(f12, f13);
                    } else {
                        path3.lineTo(f12, f13);
                    }
                }
                path3.close();
                arrayList = arrayList4;
                eVar = eVar3;
            }
            arrayList8.add(path3);
            i14++;
            arrayList5 = arrayList8;
            eVar2 = eVar;
            arrayList4 = arrayList;
            i11 = 0;
        }
        invalidate();
        k kVar = this.O;
        if (kVar == null) {
            this.O = new i(this, this.P);
        } else {
            kVar.reset();
        }
        setOnTouchListener(this.O);
        this.O.g(this.Q);
        b bVar2 = this.N;
        if (bVar2 == null) {
            double d20 = this.P;
            b bVar3 = new b();
            bVar3.f56215a = null;
            bVar3.f56216b = null;
            bVar3.f56217c = null;
            bVar3.f56218d = null;
            bVar3.f56219e = false;
            bVar3.f56220f = 0;
            bVar3.f56221g = new ArrayList();
            bVar3.f56222h = this;
            bVar3.f56223i = (int) (d20 * 50.0d);
            bVar3.f56215a = new Canvas(this.M);
            this.N = bVar3;
            bVar3.f56224j = this.f22275d;
        } else {
            bVar2.a();
        }
        this.N.f56216b = this.R;
    }

    public final void f() {
        k kVar = this.O;
        if (kVar != null) {
            kVar.d();
        }
        b bVar = this.N;
        if (bVar != null) {
            bVar.f56221g.clear();
            bVar.f56220f = 0;
            bVar.f56219e = true;
            bVar.f56222h.M.eraseColor(0);
            bVar.b();
            bVar.f56218d.start();
        }
    }

    public final void g() {
        b bVar = this.N;
        if (bVar != null) {
            bVar.f56220f = 0;
            bVar.f56219e = false;
            bVar.f56221g.clear();
            ValueAnimator valueAnimator = bVar.f56218d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.N.a();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22276e) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f22277f;
            paint.setStyle(style);
            paint.setColor(this.f22272a);
            canvas.drawPath(this.f22278t.a(this.L), paint);
        }
        b bVar = this.N;
        if (bVar != null) {
            int i11 = bVar.f56220f;
            HwView hwView = bVar.f56222h;
            ArrayList arrayList = hwView.K;
            ArrayList arrayList2 = hwView.H;
            Paint paint2 = hwView.f22277f;
            if (i11 != arrayList.size() && bVar.f56219e && bVar.f56220f < hwView.K.size()) {
                if (hwView.T) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setColor(hwView.f22274c);
                    Context context = hwView.getContext();
                    m.f(context, "context");
                    paint2.setStrokeWidth((int) ((1.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    canvas.drawPath(((f) arrayList2.get(bVar.f56220f)).f56233a, paint2);
                    canvas.drawPath(((f) arrayList2.get(bVar.f56220f)).f56234b, paint2);
                }
                canvas.drawBitmap(hwView.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
            }
        }
        k kVar = this.O;
        if (kVar != null) {
            kVar.b(canvas);
        }
        b bVar2 = this.N;
        boolean z11 = bVar2 != null && bVar2.f56219e;
        k kVar2 = this.O;
        if (kVar2 != null && kVar2.a()) {
            z11 = true;
        }
        k kVar3 = this.O;
        if ((kVar3 != null && (kVar3 instanceof h) && ((h) kVar3).N) ? true : z11) {
            return;
        }
        b(canvas);
    }

    public void setAnimListener(a aVar) {
        this.R = aVar;
        b bVar = this.N;
        if (bVar != null) {
            bVar.f56216b = aVar;
        }
    }

    public void setBgHanziVisibility(boolean z11) {
        this.f22276e = z11;
        invalidate();
    }

    public void setShowBijiWhenWriting(boolean z11) {
        this.T = z11;
        invalidate();
    }

    public void setShowBijiWhenWriting2(boolean z11) {
        this.S = z11;
        invalidate();
    }

    public void setWritingListener(j jVar) {
        this.Q = jVar;
        k kVar = this.O;
        if (kVar != null) {
            kVar.g(jVar);
        }
    }

    public HwView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22274c = -65536;
        this.f22275d = 50;
        this.f22276e = true;
        this.f22278t = new qp.b();
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 1.0d;
        this.S = false;
        this.T = false;
        this.f22272a = ju.a.f37321k1;
        this.f22273b = ju.a.f37324l1;
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f22277f = paint;
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        m.f(context2, "context");
        paint.setStrokeWidth((int) ((1.0f * context2.getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setTimeGap(int i11) {
    }
}

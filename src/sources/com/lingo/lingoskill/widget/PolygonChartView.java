package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PolygonChartView extends View {
    public int H;
    public int K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public int O;
    public DashPathEffect P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f22113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f22114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f22115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f22116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22117f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonChartView(Context mContext, AttributeSet attributeSet) {
        super(mContext, attributeSet);
        m.f(mContext, "mContext");
        this.f22112a = 100;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.T = -1;
        this.U = 20;
        a();
    }

    public final void a() {
        this.H = h.l(1.0f);
        this.K = h.l(1.0f);
        this.O = h.l(1.0f);
        Paint paint = new Paint(1);
        this.f22115d = paint;
        paint.setColor(Color.parseColor("#FFFFFF"));
        Paint paint2 = this.f22115d;
        if (paint2 == null) {
            m.n("mWhiteDotPaint");
            throw null;
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f22114c = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.f22114c;
        if (paint4 == null) {
            m.n("mPaint");
            throw null;
        }
        paint4.setStrokeWidth(this.O);
        Paint paint5 = this.f22114c;
        if (paint5 == null) {
            m.n("mPaint");
            throw null;
        }
        paint5.setColor(this.T);
        h.l(4.0f);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{h.l(3.0f), h.l(3.0f)}, CropImageView.DEFAULT_ASPECT_RATIO);
        this.P = dashPathEffect;
        Paint paint6 = this.f22114c;
        if (paint6 == null) {
            m.n("mPaint");
            throw null;
        }
        paint6.setPathEffect(dashPathEffect);
        this.f22117f = h.N(10.0f);
        this.f22118t = h.N(10.0f);
        this.Q = h.l(2.0f);
        this.R = h.l(5.0f);
        this.S = h.l(20.0f);
        this.f22116e = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.graphics.PathEffect] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        Throwable th2;
        m.f(canvas, "canvas");
        List list = this.f22113b;
        if (list == null || list.isEmpty()) {
            return;
        }
        a();
        int height = getHeight();
        int width = getWidth();
        float paddingTop = (height - getPaddingTop()) - getPaddingBottom();
        ArrayList arrayList = this.N;
        float fHeight = ((paddingTop - (((Rect) arrayList.get(0)).height() / 2.0f)) - (((Rect) arrayList.get(5)).height() / 2.0f)) - this.S;
        float paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList2 = this.M;
        float fWidth = (paddingLeft - (((Rect) arrayList2.get(0)).width() / 2.0f)) - this.S;
        float f5 = fHeight / 5.0f;
        float fWidth2 = (((Rect) arrayList2.get(0)).width() / 2.0f) + getPaddingLeft() + this.R;
        float fHeight2 = (((Rect) arrayList.get(0)).height() / 2.0f) + getPaddingTop() + this.Q;
        float f11 = fWidth + fWidth2;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            if (i11 == arrayList.size() - 1) {
                Paint paint = this.f22114c;
                if (paint == null) {
                    m.n("mPaint");
                    throw null;
                }
                paint.setPathEffect(null);
                th2 = null;
            } else {
                Paint paint2 = this.f22114c;
                th2 = null;
                if (paint2 == null) {
                    m.n("mPaint");
                    throw null;
                }
                paint2.setPathEffect(this.P);
            }
            Path path = this.f22116e;
            if (path == null) {
                m.n("mPath");
                throw th2;
            }
            path.reset();
            ArrayList arrayList3 = this.L;
            Object obj = arrayList3.get(i11);
            int i12 = this.U;
            float f12 = f5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            if (m.a(obj, sb2.toString())) {
                Paint paint3 = this.f22114c;
                if (paint3 == null) {
                    m.n("mPaint");
                    throw th2;
                }
                Context context = getContext();
                m.e(context, "getContext(...)");
                paint3.setColor(context.getColor(R.color.colorAccent));
            } else {
                Paint paint4 = this.f22114c;
                if (paint4 == null) {
                    m.n("mPaint");
                    throw th2;
                }
                paint4.setColor(this.T);
            }
            float f13 = this.R;
            float f14 = fWidth2 - f13;
            float f15 = f13 + f11;
            Path path2 = this.f22116e;
            if (path2 == null) {
                m.n("mPath");
                throw th2;
            }
            path2.moveTo(f14, fHeight2);
            Path path3 = this.f22116e;
            if (path3 == null) {
                m.n("mPath");
                throw th2;
            }
            path3.lineTo(f15, fHeight2);
            Paint paint5 = this.f22114c;
            if (paint5 == null) {
                m.n("mPaint");
                throw th2;
            }
            paint5.setStyle(Paint.Style.STROKE);
            Path path4 = this.f22116e;
            if (path4 == null) {
                m.n("mPath");
                throw th2;
            }
            Paint paint6 = this.f22114c;
            if (paint6 == null) {
                m.n("mPaint");
                throw th2;
            }
            canvas.drawPath(path4, paint6);
            ?? r11 = this.f22114c;
            if (r11 == 0) {
                m.n("mPaint");
                throw th2;
            }
            r11.setPathEffect(th2);
            Paint paint7 = this.f22114c;
            if (paint7 == null) {
                m.n("mPaint");
                throw null;
            }
            paint7.setTextSize(this.f22117f);
            Paint paint8 = this.f22114c;
            if (paint8 == null) {
                m.n("mPaint");
                throw null;
            }
            paint8.setStyle(Paint.Style.FILL);
            Object obj2 = arrayList3.get(i11);
            int i13 = this.U;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i13);
            if (m.a(obj2, sb3.toString())) {
                Paint paint9 = this.f22114c;
                if (paint9 == null) {
                    m.n("mPaint");
                    throw null;
                }
                Context context2 = getContext();
                m.e(context2, "getContext(...)");
                paint9.setColor(context2.getColor(R.color.colorAccent));
            } else {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().showSkinNewYear) {
                    Paint paint10 = this.f22114c;
                    if (paint10 == null) {
                        m.n("mPaint");
                        throw null;
                    }
                    Context context3 = getContext();
                    m.e(context3, "getContext(...)");
                    paint10.setColor(context3.getColor(R.color.color_939393));
                } else {
                    Paint paint11 = this.f22114c;
                    if (paint11 == null) {
                        m.n("mPaint");
                        throw null;
                    }
                    Context context4 = getContext();
                    m.e(context4, "getContext(...)");
                    paint11.setColor(context4.getColor(R.color.color_main_unit_active));
                }
            }
            String str = (String) arrayList3.get(i11);
            float fWidth3 = f15 - ((Rect) arrayList.get(i11)).width();
            float f16 = fHeight2 - this.Q;
            Paint paint12 = this.f22114c;
            if (paint12 == null) {
                m.n("mPaint");
                throw null;
            }
            canvas.drawText(str, fWidth3, f16, paint12);
            fHeight2 += f12;
            i11++;
            f5 = f12;
        }
        Path path5 = this.f22116e;
        if (path5 == null) {
            m.n("mPath");
            throw null;
        }
        path5.reset();
        Paint paint13 = this.f22114c;
        if (paint13 == null) {
            m.n("mPaint");
            throw null;
        }
        paint13.setStrokeWidth(this.H);
        Paint paint14 = this.f22114c;
        if (paint14 == null) {
            m.n("mPaint");
            throw null;
        }
        Context context5 = getContext();
        m.e(context5, "getContext(...)");
        paint14.setColor(context5.getColor(R.color.color_FF9A60));
        Paint paint15 = this.f22114c;
        if (paint15 == null) {
            m.n("mPaint");
            throw null;
        }
        Paint.Style style = Paint.Style.FILL;
        paint15.setStyle(style);
        List list2 = this.f22113b;
        m.c(list2);
        if (list2.size() > 0) {
            List list3 = this.f22113b;
            m.c(list3);
            list3.get(0).getClass();
            throw new ClassCastException();
        }
        Paint paint16 = this.f22114c;
        if (paint16 == null) {
            m.n("mPaint");
            throw null;
        }
        paint16.setStyle(Paint.Style.STROKE);
        Path path6 = this.f22116e;
        if (path6 == null) {
            m.n("mPath");
            throw null;
        }
        Paint paint17 = this.f22114c;
        if (paint17 == null) {
            m.n("mPaint");
            throw null;
        }
        canvas.drawPath(path6, paint17);
        Paint paint18 = this.f22114c;
        if (paint18 == null) {
            m.n("mPaint");
            throw null;
        }
        paint18.setStyle(style);
        Paint paint19 = this.f22114c;
        if (paint19 == null) {
            m.n("mPaint");
            throw null;
        }
        Context context6 = getContext();
        m.e(context6, "getContext(...)");
        paint19.setColor(context6.getColor(R.color.colorAccent));
        List list4 = this.f22113b;
        m.c(list4);
        if (list4.size() > 0) {
            List list5 = this.f22113b;
            m.c(list5);
            list5.get(0).getClass();
            throw new ClassCastException();
        }
        Paint paint20 = this.f22114c;
        if (paint20 == null) {
            m.n("mPaint");
            throw null;
        }
        paint20.setStrokeWidth(this.K);
        Paint paint21 = this.f22114c;
        if (paint21 == null) {
            m.n("mPaint");
            throw null;
        }
        paint21.setPathEffect(null);
        Paint paint22 = this.f22114c;
        if (paint22 == null) {
            m.n("mPaint");
            throw null;
        }
        paint22.setTextSize(this.f22118t);
        Paint paint23 = this.f22114c;
        if (paint23 == null) {
            m.n("mPaint");
            throw null;
        }
        paint23.setStyle(style);
        if (arrayList2.size() <= 0) {
            return;
        }
        List list6 = this.f22113b;
        m.c(list6);
        list6.get(0).getClass();
        throw new ClassCastException();
    }

    public final void setChartElem(List<Object> elems) {
        m.f(elems, "elems");
        if (elems.size() != 7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f22112a = Integer.MIN_VALUE;
        Iterator<Object> it = elems.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        int i11 = this.f22112a;
        int i12 = i11 % 50;
        if (i12 != 0) {
            this.f22112a = (50 - i12) + i11;
        }
        if (this.f22112a < 50) {
            this.f22112a = 50;
        }
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i13 = this.f22112a / 5;
        for (int i14 = 0; i14 < 6; i14++) {
            int i15 = this.f22112a - (i13 * i14);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i15);
            arrayList.add(sb2.toString());
        }
        this.M.clear();
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        this.f22113b = elems;
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            m.e(obj, "next(...)");
            String str = (String) obj;
            float f5 = this.f22117f;
            Rect rect = new Rect();
            Paint paint = this.f22114c;
            if (paint == null) {
                m.n("mPaint");
                throw null;
            }
            paint.setTextSize(f5);
            Paint paint2 = this.f22114c;
            if (paint2 == null) {
                m.n("mPaint");
                throw null;
            }
            paint2.getTextBounds(str, 0, str.length(), rect);
            arrayList2.add(rect);
        }
        List list = this.f22113b;
        m.c(list);
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        invalidate();
    }

    public final void setColor(int i11) {
        this.T = i11;
        invalidate();
    }

    public final void setKeyGoal(int i11) {
        this.U = i11;
        invalidate();
    }
}

package ra;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h {
    public static final PorterDuff.Mode L = PorterDuff.Mode.SRC_IN;
    public final Matrix H;
    public final Rect K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f49053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f49054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f49055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49057f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f49058t;

    public q() {
        this.f49057f = true;
        this.f49058t = new float[9];
        this.H = new Matrix();
        this.K = new Rect();
        o oVar = new o();
        oVar.f49042c = null;
        oVar.f49043d = L;
        oVar.f49041b = new n();
        this.f49053b = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f49000a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.K;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f49055d;
        if (colorFilter == null) {
            colorFilter = this.f49054c;
        }
        Matrix matrix = this.H;
        canvas.getMatrix(matrix);
        float[] fArr = this.f49058t;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != CropImageView.DEFAULT_ASPECT_RATIO || fAbs4 != CropImageView.DEFAULT_ASPECT_RATIO) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), CropImageView.DEFAULT_ASPECT_RATIO);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f49053b;
        Bitmap bitmap = oVar.f49045f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f49045f.getHeight()) {
            oVar.f49045f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f49050k = true;
        }
        if (this.f49057f) {
            o oVar2 = this.f49053b;
            if (oVar2.f49050k || oVar2.f49046g != oVar2.f49042c || oVar2.f49047h != oVar2.f49043d || oVar2.f49049j != oVar2.f49044e || oVar2.f49048i != oVar2.f49041b.getRootAlpha()) {
                o oVar3 = this.f49053b;
                oVar3.f49045f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f49045f);
                n nVar = oVar3.f49041b;
                nVar.a(nVar.f49032g, n.f49025p, canvas2, iMin, iMin2);
                o oVar4 = this.f49053b;
                oVar4.f49046g = oVar4.f49042c;
                oVar4.f49047h = oVar4.f49043d;
                oVar4.f49048i = oVar4.f49041b.getRootAlpha();
                oVar4.f49049j = oVar4.f49044e;
                oVar4.f49050k = false;
            }
        } else {
            o oVar5 = this.f49053b;
            oVar5.f49045f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f49045f);
            n nVar2 = oVar5.f49041b;
            nVar2.a(nVar2.f49032g, n.f49025p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f49053b;
        if (oVar6.f49041b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f49051l == null) {
                Paint paint2 = new Paint();
                oVar6.f49051l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f49051l.setAlpha(oVar6.f49041b.getRootAlpha());
            oVar6.f49051l.setColorFilter(colorFilter);
            paint = oVar6.f49051l;
        }
        canvas.drawBitmap(oVar6.f49045f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getAlpha() : this.f49053b.f49041b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f49053b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getColorFilter() : this.f49055d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f49000a != null) {
            return new p(this.f49000a.getConstantState());
        }
        this.f49053b.f49040a = getChangingConfigurations();
        return this.f49053b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f49053b.f49041b.f49034i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f49053b.f49041b.f49033h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.isAutoMirrored() : this.f49053b.f49044e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f49053b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f49041b;
        if (nVar.f49038n == null) {
            nVar.f49038n = Boolean.valueOf(nVar.f49032g.a());
        }
        if (nVar.f49038n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f49053b.f49042c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f49056e && super.mutate() == this) {
            o oVar = this.f49053b;
            o oVar2 = new o();
            oVar2.f49042c = null;
            oVar2.f49043d = L;
            if (oVar != null) {
                oVar2.f49040a = oVar.f49040a;
                n nVar = new n(oVar.f49041b);
                oVar2.f49041b = nVar;
                if (oVar.f49041b.f49030e != null) {
                    nVar.f49030e = new Paint(oVar.f49041b.f49030e);
                }
                if (oVar.f49041b.f49029d != null) {
                    oVar2.f49041b.f49029d = new Paint(oVar.f49041b.f49029d);
                }
                oVar2.f49042c = oVar.f49042c;
                oVar2.f49043d = oVar.f49043d;
                oVar2.f49044e = oVar.f49044e;
            }
            this.f49053b = oVar2;
            this.f49056e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f49053b;
        ColorStateList colorStateList = oVar.f49042c;
        if (colorStateList == null || (mode = oVar.f49043d) == null) {
            z11 = false;
        } else {
            this.f49054c = a(colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        n nVar = oVar.f49041b;
        if (nVar.f49038n == null) {
            nVar.f49038n = Boolean.valueOf(nVar.f49032g.a());
        }
        if (nVar.f49038n.booleanValue()) {
            boolean zB = oVar.f49041b.f49032g.b(iArr);
            oVar.f49050k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f49053b.f49041b.getRootAlpha() != i11) {
            this.f49053b.f49041b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f49053b.f49044e = z11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f49055d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            ub.a.b0(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f49053b;
        if (oVar.f49042c != colorStateList) {
            oVar.f49042c = colorStateList;
            this.f49054c = a(colorStateList, oVar.f49043d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f49053b;
        if (oVar.f49043d != mode) {
            oVar.f49043d = mode;
            this.f49054c = a(oVar.f49042c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.setVisible(z11, z12) : super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f49053b;
        oVar.f49041b = new n();
        TypedArray typedArrayH = q4.a.h(resources, theme, attributeSet, a.f48982a);
        o oVar2 = this.f49053b;
        n nVar = oVar2.f49041b;
        int i15 = !q4.a.e(xmlPullParser, "tintMode") ? -1 : typedArrayH.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i16 = 3;
        if (i15 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i15 != 5) {
            if (i15 != 9) {
                switch (i15) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f49043d = mode;
        ColorStateList colorStateListC = q4.a.c(typedArrayH, xmlPullParser, theme);
        if (colorStateListC != null) {
            oVar2.f49042c = colorStateListC;
        }
        boolean z11 = oVar2.f49044e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z11 = typedArrayH.getBoolean(5, z11);
        }
        oVar2.f49044e = z11;
        float f5 = nVar.f49035j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f5 = typedArrayH.getFloat(7, f5);
        }
        nVar.f49035j = f5;
        float f11 = nVar.f49036k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayH.getFloat(8, f11);
        }
        nVar.f49036k = f11;
        if (nVar.f49035j <= CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            nVar.f49033h = typedArrayH.getDimension(3, nVar.f49033h);
            int i17 = 2;
            float dimension = typedArrayH.getDimension(2, nVar.f49034i);
            nVar.f49034i = dimension;
            if (nVar.f49033h <= CropImageView.DEFAULT_ASPECT_RATIO) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > CropImageView.DEFAULT_ASPECT_RATIO) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar.m = string;
                    nVar.f49039o.put(string, nVar);
                }
                typedArrayH.recycle();
                oVar.f49040a = getChangingConfigurations();
                int i18 = 1;
                oVar.f49050k = true;
                o oVar3 = this.f49053b;
                n nVar2 = oVar3.f49041b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.f49032g;
                y.e eVar = nVar2.f49039o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i18 && (xmlPullParser.getDepth() >= depth || eventType != i16)) {
                    if (eventType == i17) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        if (kVar2 != null) {
                            ArrayList arrayList = kVar2.f49012b;
                            i11 = depth;
                            if ("path".equals(name)) {
                                j jVar = new j();
                                jVar.f49002e = CropImageView.DEFAULT_ASPECT_RATIO;
                                jVar.f49004g = 1.0f;
                                jVar.f49005h = 1.0f;
                                jVar.f49006i = CropImageView.DEFAULT_ASPECT_RATIO;
                                jVar.f49007j = 1.0f;
                                jVar.f49008k = CropImageView.DEFAULT_ASPECT_RATIO;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                jVar.f49009l = cap2;
                                Paint.Join join2 = Paint.Join.MITER;
                                jVar.m = join2;
                                jVar.f49010n = 4.0f;
                                TypedArray typedArrayH2 = q4.a.h(resources, theme, attributeSet, a.f48984c);
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    String string2 = typedArrayH2.getString(0);
                                    if (string2 != null) {
                                        jVar.f49023b = string2;
                                    }
                                    String string3 = typedArrayH2.getString(2);
                                    if (string3 != null) {
                                        jVar.f49022a = j3.m(string3);
                                    }
                                    jVar.f49003f = q4.a.d(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                    float f12 = jVar.f49005h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                        f12 = typedArrayH2.getFloat(12, f12);
                                    }
                                    jVar.f49005h = f12;
                                    int i19 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH2.getInt(8, -1) : -1;
                                    Paint.Cap cap3 = jVar.f49009l;
                                    if (i19 == 0) {
                                        cap = cap2;
                                    } else if (i19 != 1) {
                                        cap = i19 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                    jVar.f49009l = cap;
                                    int i21 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH2.getInt(9, -1) : -1;
                                    Paint.Join join3 = jVar.m;
                                    if (i21 == 0) {
                                        join = join2;
                                    } else if (i21 != 1) {
                                        join = i21 != 2 ? join3 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                    jVar.m = join;
                                    float f13 = jVar.f49010n;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                        f13 = typedArrayH2.getFloat(10, f13);
                                    }
                                    jVar.f49010n = f13;
                                    jVar.f49001d = q4.a.d(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                    float f14 = jVar.f49004g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                        f14 = typedArrayH2.getFloat(11, f14);
                                    }
                                    jVar.f49004g = f14;
                                    float f15 = jVar.f49002e;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                        f15 = typedArrayH2.getFloat(4, f15);
                                    }
                                    jVar.f49002e = f15;
                                    float f16 = jVar.f49007j;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                        f16 = typedArrayH2.getFloat(6, f16);
                                    }
                                    jVar.f49007j = f16;
                                    float f17 = jVar.f49008k;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                        f17 = typedArrayH2.getFloat(7, f17);
                                    }
                                    jVar.f49008k = f17;
                                    float f18 = jVar.f49006i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                        f18 = typedArrayH2.getFloat(5, f18);
                                    }
                                    jVar.f49006i = f18;
                                    int i22 = jVar.f49024c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                        i22 = typedArrayH2.getInt(13, i22);
                                    }
                                    jVar.f49024c = i22;
                                }
                                typedArrayH2.recycle();
                                arrayList.add(jVar);
                                if (jVar.getPathName() != null) {
                                    eVar.put(jVar.getPathName(), jVar);
                                }
                                oVar3.f49040a = oVar3.f49040a;
                                i14 = 1;
                                z12 = false;
                            } else {
                                if ("clip-path".equals(name)) {
                                    i iVar = new i();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray typedArrayH3 = q4.a.h(resources, theme, attributeSet, a.f48985d);
                                        String string4 = typedArrayH3.getString(0);
                                        if (string4 != null) {
                                            iVar.f49023b = string4;
                                        }
                                        String string5 = typedArrayH3.getString(1);
                                        if (string5 != null) {
                                            iVar.f49022a = j3.m(string5);
                                        }
                                        iVar.f49024c = !q4.a.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                        typedArrayH3.recycle();
                                    }
                                    arrayList.add(iVar);
                                    if (iVar.getPathName() != null) {
                                        eVar.put(iVar.getPathName(), iVar);
                                    }
                                    oVar3.f49040a = oVar3.f49040a;
                                } else if ("group".equals(name)) {
                                    k kVar3 = new k();
                                    TypedArray typedArrayH4 = q4.a.h(resources, theme, attributeSet, a.f48983b);
                                    float f19 = kVar3.f49013c;
                                    if (q4.a.e(xmlPullParser, "rotation")) {
                                        f19 = typedArrayH4.getFloat(5, f19);
                                    }
                                    kVar3.f49013c = f19;
                                    i14 = 1;
                                    kVar3.f49014d = typedArrayH4.getFloat(1, kVar3.f49014d);
                                    kVar3.f49015e = typedArrayH4.getFloat(2, kVar3.f49015e);
                                    float f21 = kVar3.f49016f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f21 = typedArrayH4.getFloat(3, f21);
                                    }
                                    kVar3.f49016f = f21;
                                    float f22 = kVar3.f49017g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f22 = typedArrayH4.getFloat(4, f22);
                                    }
                                    kVar3.f49017g = f22;
                                    float f23 = kVar3.f49018h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f23 = typedArrayH4.getFloat(6, f23);
                                    }
                                    kVar3.f49018h = f23;
                                    float f24 = kVar3.f49019i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f24 = typedArrayH4.getFloat(7, f24);
                                    }
                                    kVar3.f49019i = f24;
                                    String string6 = typedArrayH4.getString(0);
                                    if (string6 != null) {
                                        kVar3.f49021k = string6;
                                    }
                                    kVar3.c();
                                    typedArrayH4.recycle();
                                    arrayList.add(kVar3);
                                    arrayDeque.push(kVar3);
                                    if (kVar3.getGroupName() != null) {
                                        eVar.put(kVar3.getGroupName(), kVar3);
                                    }
                                    oVar3.f49040a = oVar3.f49040a;
                                }
                                i14 = 1;
                            }
                        } else {
                            i11 = depth;
                            i14 = 1;
                        }
                        i13 = i14;
                        i12 = 3;
                    } else {
                        i11 = depth;
                        i12 = i16;
                        i13 = 1;
                        if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i16 = i12;
                    i18 = i13;
                    depth = i11;
                    i17 = 2;
                }
                if (!z12) {
                    this.f49054c = a(oVar.f49042c, oVar.f49043d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f49057f = true;
        this.f49058t = new float[9];
        this.H = new Matrix();
        this.K = new Rect();
        this.f49053b = oVar;
        this.f49054c = a(oVar.f49042c, oVar.f49043d);
    }
}

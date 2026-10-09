package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import h4.b;
import i4.e;
import j4.t;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements b {
    public ViewOutlineProvider H;
    public RectF K;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public String Q;
    public boolean R;
    public final Rect S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1322a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f1323a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f1324b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1325b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1326c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1327c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1328d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1329d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1330e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f1331e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1332f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f1333f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f1334g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f1335h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Matrix f1336i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bitmap f1337j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public BitmapShader f1338k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Matrix f1339l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f1340m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f1341n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f1342o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f1343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f1344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1345r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Rect f1346s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1347t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Paint f1348t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f1349u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f1350v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f1351w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f1352x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f1353y0;

    public MotionLabel(Context context) {
        super(context);
        this.f1322a = new TextPaint();
        this.f1324b = new Path();
        this.f1326c = 65535;
        this.f1328d = 65535;
        this.f1330e = false;
        this.f1332f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1347t = Float.NaN;
        this.L = 48.0f;
        this.M = Float.NaN;
        this.P = CropImageView.DEFAULT_ASPECT_RATIO;
        this.Q = "Hello World";
        this.R = true;
        this.S = new Rect();
        this.T = 1;
        this.U = 1;
        this.V = 1;
        this.W = 1;
        this.f1325b0 = 8388659;
        this.f1327c0 = 0;
        this.f1329d0 = false;
        this.f1340m0 = Float.NaN;
        this.f1341n0 = Float.NaN;
        this.f1342o0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1343p0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1344q0 = new Paint();
        this.f1345r0 = 0;
        this.f1350v0 = Float.NaN;
        this.f1351w0 = Float.NaN;
        this.f1352x0 = Float.NaN;
        this.f1353y0 = Float.NaN;
        b(context, null);
    }

    private float getHorizontalOffset() {
        float f5 = Float.isNaN(this.M) ? 1.0f : this.L / this.M;
        String str = this.Q;
        return ((this.f1342o0 + 1.0f) * ((((Float.isNaN(this.f1333f0) ? getMeasuredWidth() : this.f1333f0) - getPaddingLeft()) - getPaddingRight()) - (this.f1322a.measureText(str, 0, str.length()) * f5))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f5 = Float.isNaN(this.M) ? 1.0f : this.L / this.M;
        Paint.FontMetrics fontMetrics = this.f1322a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f1334g0) ? getMeasuredHeight() : this.f1334g0) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.f1343p0) * (measuredHeight - ((f11 - f12) * f5))) / 2.0f) - (f5 * f12);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i11 = typedValue.data;
        this.f1326c = i11;
        this.f1322a.setColor(i11);
    }

    public final void a(float f5) {
        if (this.f1330e || f5 != 1.0f) {
            this.f1324b.reset();
            String str = this.Q;
            int length = str.length();
            TextPaint textPaint = this.f1322a;
            Rect rect = this.S;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this.f1324b);
            if (f5 != 1.0f) {
                g0.q();
                Matrix matrix = new Matrix();
                matrix.postScale(f5, f5);
                this.f1324b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.R = false;
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36045u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 5) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.f1323a0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.M);
                } else if (index == 0) {
                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.L);
                } else if (index == 2) {
                    this.N = typedArrayObtainStyledAttributes.getInt(index, this.N);
                } else if (index == 1) {
                    this.O = typedArrayObtainStyledAttributes.getInt(index, this.O);
                } else if (index == 3) {
                    this.f1326c = typedArrayObtainStyledAttributes.getColor(index, this.f1326c);
                } else if (index == 9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f1347t);
                    this.f1347t = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f5 = typedArrayObtainStyledAttributes.getFloat(index, this.f1332f);
                    this.f1332f = f5;
                    setRoundPercent(f5);
                } else if (index == 4) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.f1327c0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.f1328d = typedArrayObtainStyledAttributes.getInt(index, this.f1328d);
                    this.f1330e = true;
                } else if (index == 18) {
                    this.P = typedArrayObtainStyledAttributes.getDimension(index, this.P);
                    this.f1330e = true;
                } else if (index == 12) {
                    this.f1335h0 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f1330e = true;
                } else if (index == 13) {
                    this.f1350v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1350v0);
                } else if (index == 14) {
                    this.f1351w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1351w0);
                } else if (index == 19) {
                    this.f1342o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1342o0);
                } else if (index == 20) {
                    this.f1343p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1343p0);
                } else if (index == 15) {
                    this.f1353y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1353y0);
                } else if (index == 16) {
                    this.f1352x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1352x0);
                } else if (index == 23) {
                    this.f1340m0 = typedArrayObtainStyledAttributes.getDimension(index, this.f1340m0);
                } else if (index == 24) {
                    this.f1341n0 = typedArrayObtainStyledAttributes.getDimension(index, this.f1341n0);
                } else if (index == 22) {
                    this.f1345r0 = typedArrayObtainStyledAttributes.getInt(index, this.f1345r0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f1335h0 != null) {
            this.f1339l0 = new Matrix();
            int intrinsicWidth = this.f1335h0.getIntrinsicWidth();
            int intrinsicHeight = this.f1335h0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f1341n0) ? 128 : (int) this.f1341n0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f1340m0) ? 128 : (int) this.f1340m0;
            }
            if (this.f1345r0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f1337j0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f1337j0);
            this.f1335h0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f1335h0.setFilterBitmap(true);
            this.f1335h0.draw(canvas);
            if (this.f1345r0 != 0) {
                Bitmap bitmap = this.f1337j0;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i12 = 0; i12 < 4 && width >= 32 && height >= 32; i12++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.f1337j0 = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.f1337j0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f1338k0 = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.T = getPaddingLeft();
        this.U = getPaddingRight();
        this.V = getPaddingTop();
        this.W = getPaddingBottom();
        String str = this.f1323a0;
        int i13 = this.O;
        int i14 = this.N;
        TextPaint textPaint = this.f1322a;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i14);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f1326c);
            textPaint.setStrokeWidth(this.P);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.L);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i13 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i13 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i13 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (i14 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i14) : Typeface.create(typefaceCreate, i14);
            setTypeface(typefaceDefaultFromStyle);
            int i15 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i14;
            textPaint.setFakeBoldText((i15 & 1) != 0);
            if ((i15 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint.setTextSkewX(f11);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(CropImageView.DEFAULT_ASPECT_RATIO);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f1326c);
        textPaint.setStrokeWidth(this.P);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.L);
        textPaint.setAntiAlias(true);
    }

    public final void c(float f5, float f11, float f12, float f13) {
        int i11 = (int) (f5 + 0.5f);
        this.f1331e0 = f5 - i11;
        int i12 = (int) (f12 + 0.5f);
        int i13 = i12 - i11;
        int i14 = (int) (f13 + 0.5f);
        int i15 = (int) (0.5f + f11);
        int i16 = i14 - i15;
        float f14 = f12 - f5;
        this.f1333f0 = f14;
        float f15 = f13 - f11;
        this.f1334g0 = f15;
        if (this.f1339l0 != null) {
            this.f1333f0 = f14;
            this.f1334g0 = f15;
            d();
        }
        if (getMeasuredHeight() == i16 && getMeasuredWidth() == i13) {
            super.layout(i11, i15, i12, i14);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
            super.layout(i11, i15, i12, i14);
        }
        if (this.f1329d0) {
            Rect rect = this.f1346s0;
            TextPaint textPaint = this.f1322a;
            if (rect == null) {
                this.f1348t0 = new Paint();
                this.f1346s0 = new Rect();
                this.f1348t0.set(textPaint);
                this.f1349u0 = this.f1348t0.getTextSize();
            }
            this.f1333f0 = f14;
            this.f1334g0 = f15;
            Paint paint = this.f1348t0;
            String str = this.Q;
            paint.getTextBounds(str, 0, str.length(), this.f1346s0);
            int iWidth = this.f1346s0.width();
            float fHeight = this.f1346s0.height() * 1.3f;
            float f16 = (f14 - this.U) - this.T;
            float f17 = (f15 - this.W) - this.V;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                textPaint.setTextSize((this.f1349u0 * f16) / f18);
            } else {
                textPaint.setTextSize((this.f1349u0 * f17) / fHeight);
            }
            if (this.f1330e || !Float.isNaN(this.M)) {
                a(Float.isNaN(this.M) ? 1.0f : this.L / this.M);
            }
        }
    }

    public final void d() {
        boolean zIsNaN = Float.isNaN(this.f1350v0);
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = zIsNaN ? 0.0f : this.f1350v0;
        float f12 = Float.isNaN(this.f1351w0) ? 0.0f : this.f1351w0;
        float f13 = Float.isNaN(this.f1352x0) ? 1.0f : this.f1352x0;
        if (!Float.isNaN(this.f1353y0)) {
            f5 = this.f1353y0;
        }
        this.f1339l0.reset();
        float width = this.f1337j0.getWidth();
        float height = this.f1337j0.getHeight();
        float f14 = Float.isNaN(this.f1341n0) ? this.f1333f0 : this.f1341n0;
        float f15 = Float.isNaN(this.f1340m0) ? this.f1334g0 : this.f1340m0;
        float f16 = f13 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.f1339l0.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f21 = f15 - f19;
        if (!Float.isNaN(this.f1340m0)) {
            f21 = this.f1340m0 / 2.0f;
        }
        if (!Float.isNaN(this.f1341n0)) {
            f18 = this.f1341n0 / 2.0f;
        }
        this.f1339l0.postTranslate((((f11 * f18) + f14) - f17) * 0.5f, (((f12 * f21) + f15) - f19) * 0.5f);
        this.f1339l0.postRotate(f5, f14 / 2.0f, f15 / 2.0f);
        this.f1338k0.setLocalMatrix(this.f1339l0);
    }

    public float getRound() {
        return this.f1347t;
    }

    public float getRoundPercent() {
        return this.f1332f;
    }

    public float getScaleFromTextSize() {
        return this.M;
    }

    public float getTextBackgroundPanX() {
        return this.f1350v0;
    }

    public float getTextBackgroundPanY() {
        return this.f1351w0;
    }

    public float getTextBackgroundRotate() {
        return this.f1353y0;
    }

    public float getTextBackgroundZoom() {
        return this.f1352x0;
    }

    public int getTextOutlineColor() {
        return this.f1328d;
    }

    public float getTextPanX() {
        return this.f1342o0;
    }

    public float getTextPanY() {
        return this.f1343p0;
    }

    public float getTextureHeight() {
        return this.f1340m0;
    }

    public float getTextureWidth() {
        return this.f1341n0;
    }

    public Typeface getTypeface() {
        return this.f1322a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        boolean zIsNaN = Float.isNaN(this.M);
        float f5 = zIsNaN ? 1.0f : this.L / this.M;
        this.f1333f0 = i13 - i11;
        this.f1334g0 = i14 - i12;
        if (this.f1329d0) {
            Rect rect = this.f1346s0;
            TextPaint textPaint = this.f1322a;
            if (rect == null) {
                this.f1348t0 = new Paint();
                this.f1346s0 = new Rect();
                this.f1348t0.set(textPaint);
                this.f1349u0 = this.f1348t0.getTextSize();
            }
            Paint paint = this.f1348t0;
            String str = this.Q;
            paint.getTextBounds(str, 0, str.length(), this.f1346s0);
            int iWidth = this.f1346s0.width();
            int iHeight = (int) (this.f1346s0.height() * 1.3f);
            float f11 = (this.f1333f0 - this.U) - this.T;
            float f12 = (this.f1334g0 - this.W) - this.V;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    textPaint.setTextSize((this.f1349u0 * f11) / f13);
                } else {
                    textPaint.setTextSize((this.f1349u0 * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f5 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f1330e || !zIsNaN) {
            float f17 = i11;
            float f18 = i12;
            float f19 = i13;
            float f21 = i14;
            if (this.f1339l0 != null) {
                this.f1333f0 = f19 - f17;
                this.f1334g0 = f21 - f18;
                d();
            }
            a(f5);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f5 = Float.isNaN(this.M) ? 1.0f : this.L / this.M;
        super.onDraw(canvas);
        boolean z11 = this.f1330e;
        TextPaint textPaint = this.f1322a;
        if (!z11 && f5 == 1.0f) {
            canvas.drawText(this.Q, this.f1331e0 + this.T + getHorizontalOffset(), this.V + getVerticalOffset(), textPaint);
            return;
        }
        if (this.R) {
            a(f5);
        }
        if (this.f1336i0 == null) {
            this.f1336i0 = new Matrix();
        }
        if (!this.f1330e) {
            float horizontalOffset = this.T + getHorizontalOffset();
            float verticalOffset = this.V + getVerticalOffset();
            this.f1336i0.reset();
            this.f1336i0.preTranslate(horizontalOffset, verticalOffset);
            this.f1324b.transform(this.f1336i0);
            textPaint.setColor(this.f1326c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.P);
            canvas.drawPath(this.f1324b, textPaint);
            this.f1336i0.reset();
            this.f1336i0.preTranslate(-horizontalOffset, -verticalOffset);
            this.f1324b.transform(this.f1336i0);
            return;
        }
        Paint paint = this.f1344q0;
        paint.set(textPaint);
        this.f1336i0.reset();
        float horizontalOffset2 = this.T + getHorizontalOffset();
        float verticalOffset2 = this.V + getVerticalOffset();
        this.f1336i0.postTranslate(horizontalOffset2, verticalOffset2);
        this.f1336i0.preScale(f5, f5);
        this.f1324b.transform(this.f1336i0);
        if (this.f1338k0 != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.f1338k0);
        } else {
            textPaint.setColor(this.f1326c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.P);
        canvas.drawPath(this.f1324b, textPaint);
        if (this.f1338k0 != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f1328d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.P);
        canvas.drawPath(this.f1324b, textPaint);
        this.f1336i0.reset();
        this.f1336i0.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f1324b.transform(this.f1336i0);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        this.f1329d0 = false;
        this.T = getPaddingLeft();
        this.U = getPaddingRight();
        this.V = getPaddingTop();
        this.W = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.Q;
            int length = str.length();
            TextPaint textPaint = this.f1322a;
            Rect rect = this.S;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.T + this.U;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.V + this.W + fontMetricsInt;
            }
        } else if (this.f1327c0 != 0) {
            this.f1329d0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i11) {
        if ((i11 & 8388615) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        if (i11 != this.f1325b0) {
            invalidate();
        }
        this.f1325b0 = i11;
        int i12 = i11 & 112;
        if (i12 == 48) {
            this.f1343p0 = -1.0f;
        } else if (i12 != 80) {
            this.f1343p0 = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            this.f1343p0 = 1.0f;
        }
        int i13 = i11 & 8388615;
        if (i13 != 3) {
            if (i13 != 5) {
                if (i13 != 8388611) {
                    if (i13 != 8388613) {
                        this.f1342o0 = CropImageView.DEFAULT_ASPECT_RATIO;
                        return;
                    }
                }
            }
            this.f1342o0 = 1.0f;
            return;
        }
        this.f1342o0 = -1.0f;
    }

    public void setRound(float f5) {
        if (Float.isNaN(f5)) {
            this.f1347t = f5;
            float f11 = this.f1332f;
            this.f1332f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z11 = this.f1347t != f5;
        this.f1347t = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.f1324b == null) {
                this.f1324b = new Path();
            }
            if (this.K == null) {
                this.K = new RectF();
            }
            if (this.H == null) {
                e eVar = new e(this, 1);
                this.H = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            this.K.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getWidth(), getHeight());
            this.f1324b.reset();
            Path path = this.f1324b;
            RectF rectF = this.K;
            float f12 = this.f1347t;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f5) {
        boolean z11 = this.f1332f != f5;
        this.f1332f = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.f1324b == null) {
                this.f1324b = new Path();
            }
            if (this.K == null) {
                this.K = new RectF();
            }
            if (this.H == null) {
                e eVar = new e(this, 0);
                this.H = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1332f) / 2.0f;
            this.K.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width, height);
            this.f1324b.reset();
            this.f1324b.addRoundRect(this.K, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f5) {
        this.M = f5;
    }

    public void setText(CharSequence charSequence) {
        this.Q = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f5) {
        this.f1350v0 = f5;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f5) {
        this.f1351w0 = f5;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f5) {
        this.f1353y0 = f5;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f5) {
        this.f1352x0 = f5;
        d();
        invalidate();
    }

    public void setTextFillColor(int i11) {
        this.f1326c = i11;
        invalidate();
    }

    public void setTextOutlineColor(int i11) {
        this.f1328d = i11;
        this.f1330e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f5) {
        this.P = f5;
        this.f1330e = true;
        if (Float.isNaN(f5)) {
            this.P = 1.0f;
            this.f1330e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f5) {
        this.f1342o0 = f5;
        invalidate();
    }

    public void setTextPanY(float f5) {
        this.f1343p0 = f5;
        invalidate();
    }

    public void setTextSize(float f5) {
        this.L = f5;
        if (!Float.isNaN(this.M)) {
            f5 = this.M;
        }
        this.f1322a.setTextSize(f5);
        a(Float.isNaN(this.M) ? 1.0f : this.L / this.M);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f5) {
        this.f1340m0 = f5;
        d();
        invalidate();
    }

    public void setTextureWidth(float f5) {
        this.f1341n0 = f5;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1322a;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1322a = new TextPaint();
        this.f1324b = new Path();
        this.f1326c = 65535;
        this.f1328d = 65535;
        this.f1330e = false;
        this.f1332f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1347t = Float.NaN;
        this.L = 48.0f;
        this.M = Float.NaN;
        this.P = CropImageView.DEFAULT_ASPECT_RATIO;
        this.Q = "Hello World";
        this.R = true;
        this.S = new Rect();
        this.T = 1;
        this.U = 1;
        this.V = 1;
        this.W = 1;
        this.f1325b0 = 8388659;
        this.f1327c0 = 0;
        this.f1329d0 = false;
        this.f1340m0 = Float.NaN;
        this.f1341n0 = Float.NaN;
        this.f1342o0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1343p0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1344q0 = new Paint();
        this.f1345r0 = 0;
        this.f1350v0 = Float.NaN;
        this.f1351w0 = Float.NaN;
        this.f1352x0 = Float.NaN;
        this.f1353y0 = Float.NaN;
        b(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1322a = new TextPaint();
        this.f1324b = new Path();
        this.f1326c = 65535;
        this.f1328d = 65535;
        this.f1330e = false;
        this.f1332f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1347t = Float.NaN;
        this.L = 48.0f;
        this.M = Float.NaN;
        this.P = CropImageView.DEFAULT_ASPECT_RATIO;
        this.Q = "Hello World";
        this.R = true;
        this.S = new Rect();
        this.T = 1;
        this.U = 1;
        this.V = 1;
        this.W = 1;
        this.f1325b0 = 8388659;
        this.f1327c0 = 0;
        this.f1329d0 = false;
        this.f1340m0 = Float.NaN;
        this.f1341n0 = Float.NaN;
        this.f1342o0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1343p0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1344q0 = new Paint();
        this.f1345r0 = 0;
        this.f1350v0 = Float.NaN;
        this.f1351w0 = Float.NaN;
        this.f1352x0 = Float.NaN;
        this.f1353y0 = Float.NaN;
        b(context, attributeSet);
    }
}

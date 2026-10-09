package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final float[][] E = {new float[]{0.5f, CropImageView.DEFAULT_ASPECT_RATIO}, new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{CropImageView.DEFAULT_ASPECT_RATIO, -1.0f}, new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f}, new float[]{-1.0f, CropImageView.DEFAULT_ASPECT_RATIO}, new float[]{1.0f, CropImageView.DEFAULT_ASPECT_RATIO}, new float[]{-1.0f, CropImageView.DEFAULT_ASPECT_RATIO}, new float[]{1.0f, CropImageView.DEFAULT_ASPECT_RATIO}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f31625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31627l;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f31628n = new float[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f31629o = new int[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f31631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f31632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f31633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f31634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f31635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f31636v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f31637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f31638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f31639y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f31640z;

    public f0(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f31616a = 0;
        this.f31617b = 0;
        this.f31618c = 0;
        this.f31619d = -1;
        this.f31620e = -1;
        this.f31621f = -1;
        this.f31622g = 0.5f;
        this.f31623h = 0.5f;
        this.f31624i = -1;
        this.f31625j = false;
        this.f31626k = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f31627l = 1.0f;
        this.f31633s = 4.0f;
        this.f31634t = 1.2f;
        this.f31635u = true;
        this.f31636v = 1.0f;
        this.f31637w = 0;
        this.f31638x = 10.0f;
        this.f31639y = 10.0f;
        this.f31640z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f31632r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.f36050z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 16) {
                this.f31619d = typedArrayObtainStyledAttributes.getResourceId(index, this.f31619d);
            } else if (index == 17) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f31616a);
                this.f31616a = i12;
                float[] fArr = E[i12];
                this.f31623h = fArr[0];
                this.f31622g = fArr[1];
            } else if (index == 1) {
                int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f31617b);
                this.f31617b = i13;
                if (i13 < 6) {
                    float[] fArr2 = F[i13];
                    this.f31626k = fArr2[0];
                    this.f31627l = fArr2[1];
                } else {
                    this.f31627l = Float.NaN;
                    this.f31626k = Float.NaN;
                    this.f31625j = true;
                }
            } else if (index == 6) {
                this.f31633s = typedArrayObtainStyledAttributes.getFloat(index, this.f31633s);
            } else if (index == 5) {
                this.f31634t = typedArrayObtainStyledAttributes.getFloat(index, this.f31634t);
            } else if (index == 7) {
                this.f31635u = typedArrayObtainStyledAttributes.getBoolean(index, this.f31635u);
            } else if (index == 2) {
                this.f31636v = typedArrayObtainStyledAttributes.getFloat(index, this.f31636v);
            } else if (index == 3) {
                this.f31638x = typedArrayObtainStyledAttributes.getFloat(index, this.f31638x);
            } else if (index == 18) {
                this.f31620e = typedArrayObtainStyledAttributes.getResourceId(index, this.f31620e);
            } else if (index == 9) {
                this.f31618c = typedArrayObtainStyledAttributes.getInt(index, this.f31618c);
            } else if (index == 8) {
                this.f31637w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f31621f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f31624i = typedArrayObtainStyledAttributes.getResourceId(index, this.f31624i);
            } else if (index == 12) {
                this.f31639y = typedArrayObtainStyledAttributes.getFloat(index, this.f31639y);
            } else if (index == 13) {
                this.f31640z = typedArrayObtainStyledAttributes.getFloat(index, this.f31640z);
            } else if (index == 14) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f31621f;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f31620e;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z11) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z11) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f31616a];
        this.f31623h = fArr3[0];
        this.f31622g = fArr3[1];
        int i11 = this.f31617b;
        if (i11 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i11];
        this.f31626k = fArr4[0];
        this.f31627l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f31626k)) {
            return "rotation";
        }
        return this.f31626k + " , " + this.f31627l;
    }
}

package e5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnTouchListener {
    public static final int T = ViewConfiguration.getTapTimeout();
    public final int H;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final ListView S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f24848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f24849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public aj.i f24850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f24851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f24852f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24853t;

    public f(ListView listView) {
        a aVar = new a();
        aVar.f24840e = Long.MIN_VALUE;
        aVar.f24842g = -1L;
        aVar.f24841f = 0L;
        this.f24847a = aVar;
        this.f24848b = new AccelerateInterpolator();
        float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.f24851e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f24852f = fArr2;
        float[] fArr3 = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.K = fArr3;
        float[] fArr4 = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.L = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.M = fArr5;
        this.f24849c = listView;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f5) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f5 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f24853t = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.H = T;
        aVar.f24836a = 500;
        aVar.f24837b = 500;
        this.S = listView;
    }

    public static float h(float f5, float f11, float f12) {
        if (f5 > f12) {
            return f12;
        }
        return f5 < f11 ? f11 : f5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float f(float f5, float f11, float f12, int i11) {
        float fH;
        float interpolation;
        float fH2 = h(this.f24851e[i11] * f11, CropImageView.DEFAULT_ASPECT_RATIO, this.f24852f[i11]);
        float fI = i(f11 - f5, fH2) - i(f5, fH2);
        AccelerateInterpolator accelerateInterpolator = this.f24848b;
        if (fI >= CropImageView.DEFAULT_ASPECT_RATIO) {
            if (fI > CropImageView.DEFAULT_ASPECT_RATIO) {
                interpolation = accelerateInterpolator.getInterpolation(fI);
            } else {
                fH = 0.0f;
            }
            if (fH == CropImageView.DEFAULT_ASPECT_RATIO) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float f13 = this.K[i11];
            float f14 = this.L[i11];
            float f15 = this.M[i11];
            float f16 = f13 * f12;
            return fH > CropImageView.DEFAULT_ASPECT_RATIO ? h(fH * f16, f14, f15) : -h((-fH) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fI);
        fH = h(interpolation, -1.0f, 1.0f);
        if (fH == CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f17 = this.K[i11];
        float f18 = this.L[i11];
        float f19 = this.M[i11];
        float f110 = f17 * f12;
        if (fH > CropImageView.DEFAULT_ASPECT_RATIO) {
        }
    }

    public final float i(float f5, float f11) {
        if (f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
            int i11 = this.f24853t;
            if (i11 == 0 || i11 == 1) {
                if (f5 < f11) {
                    if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        return 1.0f - (f5 / f11);
                    }
                    if (this.Q && i11 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i11 == 2 && f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                return f5 / (-f11);
            }
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void j() {
        int i11 = 0;
        if (this.O) {
            this.Q = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f24847a;
        int i12 = (int) (jCurrentAnimationTimeMillis - aVar.f24840e);
        int i13 = aVar.f24837b;
        if (i12 > i13) {
            i11 = i13;
        } else if (i12 >= 0) {
            i11 = i12;
        }
        aVar.f24844i = i11;
        aVar.f24843h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f24842g = jCurrentAnimationTimeMillis;
    }

    public final boolean k() {
        ListView listView;
        int count;
        a aVar = this.f24847a;
        float f5 = aVar.f24839d;
        int iAbs = (int) (f5 / Math.abs(f5));
        Math.abs(aVar.f24838c);
        if (iAbs != 0 && (count = (listView = this.S).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i11 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.R
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            r4 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L17
            goto L7c
        L17:
            r8.j()
            return r1
        L1b:
            r8.P = r3
            r8.N = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f24849c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.f(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.f(r10, r9, r4, r3)
            e5.a r10 = r8.f24847a
            r10.f24838c = r0
            r10.f24839d = r9
            boolean r9 = r8.Q
            if (r9 != 0) goto L7c
            boolean r9 = r8.k()
            if (r9 == 0) goto L7c
            aj.i r9 = r8.f24850d
            if (r9 != 0) goto L60
            aj.i r9 = new aj.i
            r9.<init>(r8, r2)
            r8.f24850d = r9
        L60:
            r8.Q = r3
            r8.O = r3
            boolean r9 = r8.N
            if (r9 != 0) goto L75
            int r9 = r8.H
            if (r9 <= 0) goto L75
            aj.i r10 = r8.f24850d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = z4.s0.f58893a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            aj.i r9 = r8.f24850d
            r9.run()
        L7a:
            r8.N = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

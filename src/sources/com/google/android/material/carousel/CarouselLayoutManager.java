package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a2;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.u1;
import com.google.android.material.animation.AnimationUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import nv.p;
import r4.c;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends m1 implements Carousel, a2 {
    public int H;
    public HashMap K;
    public CarouselOrientationHelper L;
    public final View.OnLayoutChangeListener M;
    public int N;
    public int O;
    public final int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DebugItemDecoration f14138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MultiBrowseCarouselStrategy f14139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public KeylineStateList f14140f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public KeylineState f14141t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ChildCalculations {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f14143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f14144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f14145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final KeylineRange f14146d;

        public ChildCalculations(View view, float f5, float f11, KeylineRange keylineRange) {
            this.f14143a = view;
            this.f14144b = f5;
            this.f14145c = f11;
            this.f14146d = keylineRange;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DebugItemDecoration extends j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f14147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f14148b;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.f14147a = paint;
            this.f14148b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.j1
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, c2 c2Var) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, c2Var);
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.f14147a;
            paint.setStrokeWidth(dimension);
            for (KeylineState.Keyline keyline : this.f14148b) {
                paint.setColor(c.b(-65281, keyline.f14177c, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).B()) {
                    canvas2 = canvas;
                    canvas2.drawLine(keyline.f14176b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).L.g(), keyline.f14176b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).L.c(), paint);
                } else {
                    float fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).L.d();
                    float f5 = keyline.f14176b;
                    float fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).L.e();
                    float f11 = keyline.f14176b;
                    canvas2 = canvas;
                    canvas2.drawLine(fD, f5, fE, f11, paint);
                }
                canvas = canvas2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class KeylineRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeylineState.Keyline f14149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KeylineState.Keyline f14150b;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            if (keyline.f14175a > keyline2.f14175a) {
                throw new IllegalArgumentException();
            }
            this.f14149a = keyline;
            this.f14150b = keyline2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutDirection {
        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager() {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        this.f14138d = new DebugItemDecoration();
        this.H = 0;
        this.M = new a(this, 0);
        this.O = -1;
        this.P = 0;
        this.f14139e = multiBrowseCarouselStrategy;
        G();
        setOrientation(0);
    }

    public static KeylineRange A(List list, float f5, boolean z11) {
        float f11 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < list.size(); i15++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list.get(i15);
            float f15 = z11 ? keyline.f14176b : keyline.f14175a;
            float fAbs = Math.abs(f15 - f5);
            if (f15 <= f5 && fAbs <= f11) {
                i11 = i15;
                f11 = fAbs;
            }
            if (f15 > f5 && fAbs <= f13) {
                i13 = i15;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i12 = i15;
                f14 = f15;
            }
            if (f15 > f12) {
                i14 = i15;
                f12 = f15;
            }
        }
        if (i11 == -1) {
            i11 = i12;
        }
        if (i13 == -1) {
            i13 = i14;
        }
        return new KeylineRange((KeylineState.Keyline) list.get(i11), (KeylineState.Keyline) list.get(i13));
    }

    public final boolean B() {
        return this.L.f14151a == 0;
    }

    public final boolean C() {
        return B() && getLayoutDirection() == 1;
    }

    public final boolean D(float f5, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14149a;
        float f11 = keyline.f14178d;
        KeylineState.Keyline keyline2 = keylineRange.f14150b;
        float fB = AnimationUtils.b(f11, keyline2.f14178d, keyline.f14176b, keyline2.f14176b, f5) / 2.0f;
        float f12 = C() ? f5 + fB : f5 - fB;
        if (C()) {
            return f12 < CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return f12 > ((float) v());
    }

    public final boolean E(float f5, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14149a;
        float f11 = keyline.f14178d;
        KeylineState.Keyline keyline2 = keylineRange.f14150b;
        float fO = o(f5, AnimationUtils.b(f11, keyline2.f14178d, keyline.f14176b, keyline2.f14176b, f5) / 2.0f);
        if (C()) {
            return fO > ((float) v());
        }
        return fO < CropImageView.DEFAULT_ASPECT_RATIO;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x044b A[PHI: r25
      0x044b: PHI (r25v1 float) = (r25v5 float), (r25v6 float) binds: [B:126:0x0449, B:123:0x0443] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x044f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0465  */
    /* JADX WARN: Code duplicated, block: B:163:0x057d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0588 A[LOOP:5: B:162:0x057b->B:166:0x0588, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0592  */
    /* JADX WARN: Code duplicated, block: B:172:0x0599  */
    /* JADX WARN: Code duplicated, block: B:175:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:178:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:180:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:183:0x05d9 A[LOOP:6: B:179:0x05cc->B:183:0x05d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:189:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:191:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:192:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x060a  */
    /* JADX WARN: Code duplicated, block: B:197:0x062e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0633  */
    /* JADX WARN: Code duplicated, block: B:201:0x0659  */
    /* JADX WARN: Code duplicated, block: B:203:0x0667  */
    /* JADX WARN: Code duplicated, block: B:206:0x067a A[LOOP:8: B:202:0x0665->B:206:0x067a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0688  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:215:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:232:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x058c A[EDGE_INSN: B:233:0x058c->B:168:0x058c BREAK  A[LOOP:5: B:162:0x057b->B:166:0x0588], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x05de A[EDGE_INSN: B:235:0x05de->B:185:0x05de BREAK  A[LOOP:6: B:179:0x05cc->B:183:0x05d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x067f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0677 A[EDGE_INSN: B:240:0x0677->B:205:0x0677 BREAK  A[LOOP:8: B:202:0x0665->B:206:0x067a], SYNTHETIC] */
    public final void F(u1 u1Var) {
        KeylineState keylineStateD;
        int i11;
        int i12;
        int i13;
        int i14;
        float f5;
        int i15;
        int i16;
        CarouselStrategy.StrategyType strategyType;
        ArrayList arrayList;
        int size;
        int height;
        int i17;
        int height2;
        int i18;
        float f11;
        float f12;
        int i19;
        KeylineState keylineState;
        int i21;
        int i22;
        List list;
        int i23;
        KeylineState keylineStateF;
        int i24;
        KeylineState keylineStateG;
        float f13;
        int i25;
        KeylineState.Keyline keylineC;
        int size2;
        KeylineState.Keyline keyline;
        KeylineState keylineStateG2;
        int i26;
        float f14;
        CarouselStrategy.StrategyType strategyType2;
        KeylineState.Keyline keyline2;
        int i27;
        int i28;
        float f15;
        View viewD = u1Var.d(0);
        measureChildWithMargins(viewD, 0, 0);
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f14139e;
        multiBrowseCarouselStrategy.getClass();
        int height3 = getHeight();
        if (B()) {
            height3 = getWidth();
        }
        n1 n1Var = (n1) viewD.getLayoutParams();
        float f16 = ((ViewGroup.MarginLayoutParams) n1Var).topMargin + ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin;
        float measuredHeight = viewD.getMeasuredHeight();
        if (B()) {
            f16 = ((ViewGroup.MarginLayoutParams) n1Var).leftMargin + ((ViewGroup.MarginLayoutParams) n1Var).rightMargin;
            measuredHeight = viewD.getMeasuredWidth();
        }
        float f17 = multiBrowseCarouselStrategy.f14158a + f16;
        float fMax = Math.max(multiBrowseCarouselStrategy.f14159b + f16, f17);
        float f18 = height3;
        float fMin = Math.min(measuredHeight + f16, f18);
        float fM = f.m((measuredHeight / 3.0f) + f16, f17 + f16, fMax + f16);
        float f19 = (fMin + fM) / 2.0f;
        float f21 = f17 * 2.0f;
        int[] iArrA = f18 <= f21 ? new int[]{0} : MultiBrowseCarouselStrategy.f14198d;
        int i29 = this.P;
        int[] iArrA2 = MultiBrowseCarouselStrategy.f14199e;
        if (i29 == 1) {
            iArrA = CarouselStrategy.a(iArrA);
            iArrA2 = CarouselStrategy.a(iArrA2);
        }
        int iMax = (int) Math.max(1.0d, Math.floor(((f18 - (CarouselStrategyHelper.c(iArrA2) * f19)) - (CarouselStrategyHelper.c(iArrA) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f18 / fMin);
        int i30 = (iCeil - iMax) + 1;
        int[] iArr = new int[i30];
        for (int i31 = 0; i31 < i30; i31++) {
            iArr[i31] = iCeil - i31;
        }
        Arrangement arrangementA = Arrangement.a(f18, fM, f17, fMax, iArrA, f19, iArrA2, fMin, iArr);
        int i32 = arrangementA.f14129c;
        int i33 = arrangementA.f14133g;
        multiBrowseCarouselStrategy.f14200c = i32 + arrangementA.f14130d + i33;
        int itemCount = getItemCount();
        int i34 = arrangementA.f14129c;
        int i35 = arrangementA.f14130d;
        int i36 = ((i34 + i35) + i33) - itemCount;
        boolean z11 = i36 > 0 && (i34 > 0 || i35 > 1);
        while (i36 > 0) {
            int i37 = arrangementA.f14129c;
            if (i37 > 0) {
                arrangementA.f14129c = i37 - 1;
            } else {
                int i38 = arrangementA.f14130d;
                if (i38 > 1) {
                    arrangementA.f14130d = i38 - 1;
                }
            }
            i36--;
        }
        int i39 = arrangementA.f14130d;
        if (i39 == 0 && arrangementA.f14129c == 0 && f18 > f21) {
            arrangementA.f14129c = 1;
            z11 = true;
        }
        if (z11) {
            arrangementA = Arrangement.a(f18, fM, f17, fMax, new int[]{arrangementA.f14129c}, f19, new int[]{i39}, fMin, new int[]{i33});
        }
        Context context = viewD.getContext();
        if (this.P == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f16, arrangementA.f14132f);
            float f22 = fMin2 / 2.0f;
            float f23 = CropImageView.DEFAULT_ASPECT_RATIO - f22;
            float fB = CarouselStrategyHelper.b(CropImageView.DEFAULT_ASPECT_RATIO, arrangementA.f14128b, arrangementA.f14129c);
            float fD = CarouselStrategyHelper.d(CropImageView.DEFAULT_ASPECT_RATIO, CarouselStrategyHelper.a(fB, arrangementA.f14128b, (int) Math.floor(arrangementA.f14129c / 2.0f)), arrangementA.f14128b, arrangementA.f14129c);
            float fB2 = CarouselStrategyHelper.b(fD, arrangementA.f14131e, arrangementA.f14130d);
            float fD2 = CarouselStrategyHelper.d(fD, CarouselStrategyHelper.a(fB2, arrangementA.f14131e, (int) Math.floor(arrangementA.f14130d / 2.0f)), arrangementA.f14131e, arrangementA.f14130d);
            float f24 = arrangementA.f14132f;
            int i40 = arrangementA.f14133g;
            float fB3 = CarouselStrategyHelper.b(fD2, f24, i40);
            float fD3 = CarouselStrategyHelper.d(fD2, CarouselStrategyHelper.a(fB3, arrangementA.f14132f, i40), arrangementA.f14132f, i40);
            float fB4 = CarouselStrategyHelper.b(fD3, arrangementA.f14131e, arrangementA.f14130d);
            float fB5 = CarouselStrategyHelper.b(CarouselStrategyHelper.d(fD3, CarouselStrategyHelper.a(fB4, arrangementA.f14131e, (int) Math.ceil(arrangementA.f14130d / 2.0f)), arrangementA.f14131e, arrangementA.f14130d), arrangementA.f14128b, arrangementA.f14129c);
            float f25 = height3 + f22;
            float fB6 = CarouselStrategy.b(fMin2, arrangementA.f14132f, f16);
            float fB7 = CarouselStrategy.b(arrangementA.f14128b, arrangementA.f14132f, f16);
            float fB8 = CarouselStrategy.b(arrangementA.f14131e, arrangementA.f14132f, f16);
            KeylineState.Builder builder = new KeylineState.Builder(height3, arrangementA.f14132f);
            builder.a(f23, fB6, fMin2, false, true);
            int i41 = arrangementA.f14129c;
            if (i41 > 0) {
                f15 = fB7;
                builder.c(fB, f15, arrangementA.f14128b, (int) Math.floor(i41 / 2.0f), false);
            } else {
                f15 = fB7;
            }
            int i42 = arrangementA.f14130d;
            if (i42 > 0) {
                builder.c(fB2, fB8, arrangementA.f14131e, (int) Math.floor(i42 / 2.0f), false);
            }
            builder.c(fB3, CropImageView.DEFAULT_ASPECT_RATIO, arrangementA.f14132f, arrangementA.f14133g, true);
            int i43 = arrangementA.f14130d;
            if (i43 > 0) {
                builder.c(fB4, fB8, arrangementA.f14131e, (int) Math.ceil(i43 / 2.0f), false);
            }
            int i44 = arrangementA.f14129c;
            if (i44 > 0) {
                builder.c(fB5, f15, arrangementA.f14128b, (int) Math.ceil(i44 / 2.0f), false);
            }
            builder.a(f25, fB6, fMin2, false, true);
            keylineStateD = builder.d();
        } else {
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f16, arrangementA.f14132f);
            float f26 = fMin3 / 2.0f;
            float f27 = CropImageView.DEFAULT_ASPECT_RATIO - f26;
            float f28 = arrangementA.f14132f;
            int i45 = arrangementA.f14133g;
            float fB9 = CarouselStrategyHelper.b(CropImageView.DEFAULT_ASPECT_RATIO, f28, i45);
            float fD4 = CarouselStrategyHelper.d(CropImageView.DEFAULT_ASPECT_RATIO, CarouselStrategyHelper.a(fB9, arrangementA.f14132f, i45), arrangementA.f14132f, i45);
            float fB10 = CarouselStrategyHelper.b(fD4, arrangementA.f14131e, arrangementA.f14130d);
            float fB11 = CarouselStrategyHelper.b(CarouselStrategyHelper.d(fD4, fB10, arrangementA.f14131e, arrangementA.f14130d), arrangementA.f14128b, arrangementA.f14129c);
            float f29 = height3 + f26;
            float fB12 = CarouselStrategy.b(fMin3, arrangementA.f14132f, f16);
            float fB13 = CarouselStrategy.b(arrangementA.f14128b, arrangementA.f14132f, f16);
            float fB14 = CarouselStrategy.b(arrangementA.f14131e, arrangementA.f14132f, f16);
            KeylineState.Builder builder2 = new KeylineState.Builder(height3, arrangementA.f14132f);
            builder2.a(f27, fB12, fMin3, false, true);
            builder2.c(fB9, CropImageView.DEFAULT_ASPECT_RATIO, arrangementA.f14132f, arrangementA.f14133g, true);
            if (arrangementA.f14130d > 0) {
                builder2.a(fB10, fB14, arrangementA.f14131e, false, false);
            }
            int i46 = arrangementA.f14129c;
            if (i46 > 0) {
                builder2.c(fB11, fB13, arrangementA.f14128b, i46, false);
            }
            builder2.a(f29, fB12, fMin3, false, true);
            keylineStateD = builder2.d();
        }
        if (C()) {
            int iV = v();
            KeylineState.Builder builder3 = new KeylineState.Builder(iV, keylineStateD.f14160a);
            float f30 = (iV - keylineStateD.d().f14176b) - (keylineStateD.d().f14178d / 2.0f);
            List list2 = keylineStateD.f14162c;
            int size3 = list2.size() - 1;
            while (size3 >= 0) {
                KeylineState.Keyline keyline3 = (KeylineState.Keyline) list2.get(size3);
                float f31 = keyline3.f14178d;
                builder3.a((f31 / 2.0f) + f30, keyline3.f14177c, f31, size3 >= keylineStateD.f14163d && size3 <= keylineStateD.f14164e, keyline3.f14179e);
                f30 += keyline3.f14178d;
                size3--;
            }
            keylineStateD = builder3.d();
        }
        KeylineState keylineState2 = keylineStateD;
        List list3 = keylineState2.f14162c;
        if (getChildCount() > 0) {
            i11 = 0;
            n1 n1Var2 = (n1) getChildAt(0).getLayoutParams();
            if (this.L.f14151a == 0) {
                i27 = ((ViewGroup.MarginLayoutParams) n1Var2).leftMargin;
                i28 = ((ViewGroup.MarginLayoutParams) n1Var2).rightMargin;
            } else {
                i27 = ((ViewGroup.MarginLayoutParams) n1Var2).topMargin;
                i28 = ((ViewGroup.MarginLayoutParams) n1Var2).bottomMargin;
            }
            i12 = i27 + i28;
        } else {
            i11 = 0;
            i12 = 0;
        }
        float f32 = i12;
        float paddingTop = getClipToPadding() ? i11 : this.L.f14151a == 1 ? getPaddingTop() : getPaddingLeft();
        float paddingBottom = getClipToPadding() ? i11 : this.L.f14151a == 1 ? getPaddingBottom() : getPaddingRight();
        this.f14139e.getClass();
        CarouselStrategy.StrategyType strategyType3 = CarouselStrategy.StrategyType.CONTAINED;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(keylineState2);
        int i47 = i11;
        while (true) {
            i13 = keylineState2.f14164e;
            i14 = keylineState2.f14163d;
            if (i47 >= list3.size()) {
                i47 = -1;
                break;
            } else if (!((KeylineState.Keyline) list3.get(i47)).f14179e) {
                break;
            } else {
                i47++;
            }
        }
        int width = B() ? getWidth() : getHeight();
        if (keylineState2.a().f14176b - (keylineState2.a().f14178d / 2.0f) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            KeylineState.Keyline keylineA = keylineState2.a();
            f5 = 0.0f;
            int i48 = 0;
            while (true) {
                if (i48 >= list3.size()) {
                    keyline2 = null;
                    break;
                }
                keyline2 = (KeylineState.Keyline) list3.get(i48);
                if (!keyline2.f14179e) {
                    break;
                } else {
                    i48++;
                }
            }
            i15 = -1;
            if (keylineA == keyline2) {
                if (paddingTop > f5) {
                    i16 = i14;
                    strategyType = strategyType3;
                    arrayList2.add(KeylineStateList.g(keylineState2, paddingTop, width, true, f32, strategyType3));
                    strategyType3 = strategyType;
                } else {
                    i16 = i14;
                    paddingBottom = paddingBottom;
                }
            }
            arrayList = new ArrayList();
            arrayList.add(keylineState2);
            size = list3.size() - 1;
            while (true) {
                if (size >= 0) {
                    size = -1;
                    break;
                } else if (!((KeylineState.Keyline) list3.get(size)).f14179e) {
                    break;
                } else {
                    size--;
                }
            }
            if (B()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            i17 = height;
            height2 = getHeight();
            if (B()) {
                height2 = getWidth();
            }
            if ((keylineState2.c().f14178d / 2.0f) + keylineState2.c().f14176b <= height2) {
                keylineC = keylineState2.c();
                size2 = list3.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        keyline = null;
                        break;
                    }
                    keyline = (KeylineState.Keyline) list3.get(size2);
                    if (!keyline.f14179e) {
                        break;
                    } else {
                        size2--;
                    }
                }
                if (keylineC == keyline) {
                    if (paddingBottom > f5) {
                        arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
                    }
                } else if (size == -1) {
                    i18 = size - i13;
                    f11 = keylineState2.b().f14176b - (keylineState2.b().f14178d / 2.0f);
                    if (i18 <= 0 || keylineState2.c().f14180f <= f5) {
                        f12 = f5;
                        i19 = 0;
                        while (i19 < i18) {
                            keylineState = (KeylineState) p.f(1, arrayList);
                            i21 = i18;
                            int i49 = size - i19;
                            float f33 = ((KeylineState.Keyline) list3.get(i49)).f14180f + f12;
                            i22 = i49 + 1;
                            if (i22 < list3.size()) {
                                f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                                i25 = keylineState.f14163d - 1;
                                while (true) {
                                    if (i25 < 0) {
                                        list = list3;
                                        i25 = 0;
                                        break;
                                    } else {
                                        list = list3;
                                        if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                            break;
                                        }
                                        i25--;
                                        list3 = list;
                                    }
                                }
                                i23 = i25 + 1;
                            } else {
                                list = list3;
                                i23 = 0;
                            }
                            int i50 = size;
                            keylineStateF = KeylineStateList.f(keylineState, i50, i23, f11 - f33, i16 + i19 + 1, i13 + i19 + 1, i17);
                            if (i19 == i21 - 1 || paddingBottom <= f5) {
                                i24 = i19;
                                keylineStateG = keylineStateF;
                            } else {
                                float f34 = f32;
                                i24 = i19;
                                keylineStateG = KeylineStateList.g(keylineStateF, paddingBottom, i17, false, f34, strategyType3);
                                f32 = f34;
                            }
                            arrayList.add(keylineStateG);
                            i19 = i24 + 1;
                            i18 = i21;
                            size = i50;
                            f12 = f33;
                            list3 = list;
                        }
                    } else {
                        arrayList.add(KeylineStateList.f(keylineState2, 0, 0, (f11 - keylineState2.c().f14180f) - paddingBottom, keylineState2.f14163d, keylineState2.f14164e, i17));
                    }
                } else if (paddingBottom > f5) {
                    arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
                }
            } else if (size == -1) {
                i18 = size - i13;
                f11 = keylineState2.b().f14176b - (keylineState2.b().f14178d / 2.0f);
                if (i18 <= 0) {
                    f12 = f5;
                    i19 = 0;
                    while (i19 < i18) {
                        keylineState = (KeylineState) p.f(1, arrayList);
                        i21 = i18;
                        int i410 = size - i19;
                        float f35 = ((KeylineState.Keyline) list3.get(i410)).f14180f + f12;
                        i22 = i410 + 1;
                        if (i22 < list3.size()) {
                            f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                            i25 = keylineState.f14163d - 1;
                            while (true) {
                                if (i25 < 0) {
                                    list = list3;
                                    i25 = 0;
                                    break;
                                }
                                list = list3;
                                if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                    break;
                                    break;
                                } else {
                                    i25--;
                                    list3 = list;
                                }
                            }
                            i23 = i25 + 1;
                        } else {
                            list = list3;
                            i23 = 0;
                        }
                        int i51 = size;
                        keylineStateF = KeylineStateList.f(keylineState, i51, i23, f11 - f35, i16 + i19 + 1, i13 + i19 + 1, i17);
                        if (i19 == i21 - 1) {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        } else {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        }
                        arrayList.add(keylineStateG);
                        i19 = i24 + 1;
                        i18 = i21;
                        size = i51;
                        f12 = f35;
                        list3 = list;
                    }
                } else {
                    f12 = f5;
                    i19 = 0;
                    while (i19 < i18) {
                        keylineState = (KeylineState) p.f(1, arrayList);
                        i21 = i18;
                        int i411 = size - i19;
                        float f36 = ((KeylineState.Keyline) list3.get(i411)).f14180f + f12;
                        i22 = i411 + 1;
                        if (i22 < list3.size()) {
                            f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                            i25 = keylineState.f14163d - 1;
                            while (true) {
                                if (i25 < 0) {
                                    list = list3;
                                    i25 = 0;
                                    break;
                                }
                                list = list3;
                                if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                    break;
                                    break;
                                } else {
                                    i25--;
                                    list3 = list;
                                }
                            }
                            i23 = i25 + 1;
                        } else {
                            list = list3;
                            i23 = 0;
                        }
                        int i52 = size;
                        keylineStateF = KeylineStateList.f(keylineState, i52, i23, f11 - f36, i16 + i19 + 1, i13 + i19 + 1, i17);
                        if (i19 == i21 - 1) {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        } else {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        }
                        arrayList.add(keylineStateG);
                        i19 = i24 + 1;
                        i18 = i21;
                        size = i52;
                        f12 = f36;
                        list3 = list;
                    }
                }
            } else if (paddingBottom > f5) {
                arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
            }
            this.f14140f = new KeylineStateList(keylineState2, arrayList2, arrayList);
        }
        f5 = 0.0f;
        i15 = -1;
        if (i47 != i15) {
            i16 = i14;
            float f37 = f32;
            strategyType = strategyType3;
            int i53 = width;
            int i54 = i16 - i47;
            float f38 = keylineState2.b().f14176b - (keylineState2.b().f14178d / 2.0f);
            if (i54 > 0 || keylineState2.a().f14180f <= f5) {
                float f39 = f5;
                int i55 = 0;
                while (i55 < i54) {
                    KeylineState keylineState3 = (KeylineState) p.f(1, arrayList2);
                    int i56 = i47 + i55;
                    int size4 = list3.size() - 1;
                    float f40 = ((KeylineState.Keyline) list3.get(i56)).f14180f + f39;
                    int i57 = i56 - 1;
                    if (i57 >= 0) {
                        float f41 = ((KeylineState.Keyline) list3.get(i57)).f14177c;
                        int i58 = keylineState3.f14164e;
                        List list4 = keylineState3.f14162c;
                        int size5 = i58;
                        while (true) {
                            if (size5 >= list4.size()) {
                                size5 = list4.size() - 1;
                                break;
                            } else if (f41 == ((KeylineState.Keyline) list4.get(size5)).f14177c) {
                                break;
                            } else {
                                size5++;
                            }
                        }
                        size4 = size5 - 1;
                    }
                    KeylineState keylineStateF2 = KeylineStateList.f(keylineState3, i47, size4, f38 + f40, (i16 - i55) - 1, (i13 - i55) - 1, i53);
                    if (i55 != i54 - 1 || paddingTop <= f5) {
                        keylineStateG2 = keylineStateF2;
                        i26 = i53;
                        f14 = f37;
                        strategyType2 = strategyType;
                    } else {
                        float f42 = paddingTop;
                        int i59 = i53;
                        float f43 = f37;
                        strategyType2 = strategyType;
                        keylineStateG2 = KeylineStateList.g(keylineStateF2, f42, i59, true, f43, strategyType2);
                        paddingTop = f42;
                        i26 = i59;
                        f14 = f43;
                    }
                    arrayList2.add(keylineStateG2);
                    i55++;
                    i54 = i54;
                    f37 = f14;
                    strategyType = strategyType2;
                    i47 = i47;
                    i53 = i26;
                    f39 = f40;
                    paddingBottom = paddingBottom;
                }
                f32 = f37;
                strategyType3 = strategyType;
                paddingBottom = paddingBottom;
            } else {
                arrayList2.add(KeylineStateList.f(keylineState2, 0, 0, f38 + keylineState2.a().f14180f + paddingTop, keylineState2.f14163d, keylineState2.f14164e, i53));
                f32 = f37;
                strategyType3 = strategyType;
            }
        } else if (paddingTop > f5) {
            i16 = i14;
            strategyType = strategyType3;
            arrayList2.add(KeylineStateList.g(keylineState2, paddingTop, width, true, f32, strategyType3));
            strategyType3 = strategyType;
        } else {
            i16 = i14;
            paddingBottom = paddingBottom;
        }
        arrayList = new ArrayList();
        arrayList.add(keylineState2);
        size = list3.size() - 1;
        while (true) {
            if (size >= 0) {
                size = -1;
                break;
            } else {
                if (!((KeylineState.Keyline) list3.get(size)).f14179e) {
                    break;
                    break;
                }
                size--;
            }
        }
        if (B()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        i17 = height;
        height2 = getHeight();
        if (B()) {
            height2 = getWidth();
        }
        if ((keylineState2.c().f14178d / 2.0f) + keylineState2.c().f14176b <= height2) {
            keylineC = keylineState2.c();
            size2 = list3.size() - 1;
            while (true) {
                if (size2 >= 0) {
                    keyline = null;
                    break;
                }
                keyline = (KeylineState.Keyline) list3.get(size2);
                if (!keyline.f14179e) {
                    break;
                    break;
                }
                size2--;
            }
            if (keylineC == keyline) {
                if (paddingBottom > f5) {
                    arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
                }
            } else if (size == -1) {
                i18 = size - i13;
                f11 = keylineState2.b().f14176b - (keylineState2.b().f14178d / 2.0f);
                if (i18 <= 0) {
                    f12 = f5;
                    i19 = 0;
                    while (i19 < i18) {
                        keylineState = (KeylineState) p.f(1, arrayList);
                        i21 = i18;
                        int i412 = size - i19;
                        float f310 = ((KeylineState.Keyline) list3.get(i412)).f14180f + f12;
                        i22 = i412 + 1;
                        if (i22 < list3.size()) {
                            f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                            i25 = keylineState.f14163d - 1;
                            while (true) {
                                if (i25 < 0) {
                                    list = list3;
                                    i25 = 0;
                                    break;
                                }
                                list = list3;
                                if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                    break;
                                    break;
                                } else {
                                    i25--;
                                    list3 = list;
                                }
                            }
                            i23 = i25 + 1;
                        } else {
                            list = list3;
                            i23 = 0;
                        }
                        int i510 = size;
                        keylineStateF = KeylineStateList.f(keylineState, i510, i23, f11 - f310, i16 + i19 + 1, i13 + i19 + 1, i17);
                        if (i19 == i21 - 1) {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        } else {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        }
                        arrayList.add(keylineStateG);
                        i19 = i24 + 1;
                        i18 = i21;
                        size = i510;
                        f12 = f310;
                        list3 = list;
                    }
                } else {
                    f12 = f5;
                    i19 = 0;
                    while (i19 < i18) {
                        keylineState = (KeylineState) p.f(1, arrayList);
                        i21 = i18;
                        int i413 = size - i19;
                        float f311 = ((KeylineState.Keyline) list3.get(i413)).f14180f + f12;
                        i22 = i413 + 1;
                        if (i22 < list3.size()) {
                            f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                            i25 = keylineState.f14163d - 1;
                            while (true) {
                                if (i25 < 0) {
                                    list = list3;
                                    i25 = 0;
                                    break;
                                }
                                list = list3;
                                if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                    break;
                                    break;
                                } else {
                                    i25--;
                                    list3 = list;
                                }
                            }
                            i23 = i25 + 1;
                        } else {
                            list = list3;
                            i23 = 0;
                        }
                        int i511 = size;
                        keylineStateF = KeylineStateList.f(keylineState, i511, i23, f11 - f311, i16 + i19 + 1, i13 + i19 + 1, i17);
                        if (i19 == i21 - 1) {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        } else {
                            i24 = i19;
                            keylineStateG = keylineStateF;
                        }
                        arrayList.add(keylineStateG);
                        i19 = i24 + 1;
                        i18 = i21;
                        size = i511;
                        f12 = f311;
                        list3 = list;
                    }
                }
            } else if (paddingBottom > f5) {
                arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
            }
        } else if (size == -1) {
            i18 = size - i13;
            f11 = keylineState2.b().f14176b - (keylineState2.b().f14178d / 2.0f);
            if (i18 <= 0) {
                f12 = f5;
                i19 = 0;
                while (i19 < i18) {
                    keylineState = (KeylineState) p.f(1, arrayList);
                    i21 = i18;
                    int i414 = size - i19;
                    float f312 = ((KeylineState.Keyline) list3.get(i414)).f14180f + f12;
                    i22 = i414 + 1;
                    if (i22 < list3.size()) {
                        f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                        i25 = keylineState.f14163d - 1;
                        while (true) {
                            if (i25 < 0) {
                                list = list3;
                                i25 = 0;
                                break;
                            }
                            list = list3;
                            if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                break;
                                break;
                            } else {
                                i25--;
                                list3 = list;
                            }
                        }
                        i23 = i25 + 1;
                    } else {
                        list = list3;
                        i23 = 0;
                    }
                    int i512 = size;
                    keylineStateF = KeylineStateList.f(keylineState, i512, i23, f11 - f312, i16 + i19 + 1, i13 + i19 + 1, i17);
                    if (i19 == i21 - 1) {
                        i24 = i19;
                        keylineStateG = keylineStateF;
                    } else {
                        i24 = i19;
                        keylineStateG = keylineStateF;
                    }
                    arrayList.add(keylineStateG);
                    i19 = i24 + 1;
                    i18 = i21;
                    size = i512;
                    f12 = f312;
                    list3 = list;
                }
            } else {
                f12 = f5;
                i19 = 0;
                while (i19 < i18) {
                    keylineState = (KeylineState) p.f(1, arrayList);
                    i21 = i18;
                    int i415 = size - i19;
                    float f313 = ((KeylineState.Keyline) list3.get(i415)).f14180f + f12;
                    i22 = i415 + 1;
                    if (i22 < list3.size()) {
                        f13 = ((KeylineState.Keyline) list3.get(i22)).f14177c;
                        i25 = keylineState.f14163d - 1;
                        while (true) {
                            if (i25 < 0) {
                                list = list3;
                                i25 = 0;
                                break;
                            }
                            list = list3;
                            if (f13 == ((KeylineState.Keyline) keylineState.f14162c.get(i25)).f14177c) {
                                break;
                                break;
                            } else {
                                i25--;
                                list3 = list;
                            }
                        }
                        i23 = i25 + 1;
                    } else {
                        list = list3;
                        i23 = 0;
                    }
                    int i513 = size;
                    keylineStateF = KeylineStateList.f(keylineState, i513, i23, f11 - f313, i16 + i19 + 1, i13 + i19 + 1, i17);
                    if (i19 == i21 - 1) {
                        i24 = i19;
                        keylineStateG = keylineStateF;
                    } else {
                        i24 = i19;
                        keylineStateG = keylineStateF;
                    }
                    arrayList.add(keylineStateG);
                    i19 = i24 + 1;
                    i18 = i21;
                    size = i513;
                    f12 = f313;
                    list3 = list;
                }
            }
        } else if (paddingBottom > f5) {
            arrayList.add(KeylineStateList.g(keylineState2, paddingBottom, i17, false, f32, strategyType3));
        }
        this.f14140f = new KeylineStateList(keylineState2, arrayList2, arrayList);
    }

    public final void G() {
        this.f14140f = null;
        requestLayout();
    }

    public final int H(int i11, u1 u1Var, c2 c2Var) {
        if (getChildCount() != 0 && i11 != 0) {
            if (this.f14140f == null) {
                F(u1Var);
            }
            int itemCount = getItemCount();
            KeylineStateList keylineStateList = this.f14140f;
            if (itemCount > (C() ? keylineStateList.a() : keylineStateList.c()).f14161b) {
                int i12 = this.f14135a;
                int i13 = this.f14136b;
                int i14 = this.f14137c;
                int i15 = i12 + i11;
                if (i15 < i13) {
                    i11 = i13 - i12;
                } else if (i15 > i14) {
                    i11 = i14 - i12;
                }
                this.f14135a = i12 + i11;
                J(this.f14140f);
                float f5 = this.f14141t.f14160a / 2.0f;
                float fT = t(getPosition(getChildAt(0)));
                Rect rect = new Rect();
                float f11 = C() ? this.f14141t.c().f14176b : this.f14141t.a().f14176b;
                float f12 = Float.MAX_VALUE;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    float fO = o(fT, f5);
                    KeylineRange keylineRangeA = A(this.f14141t.f14162c, fO, false);
                    float fS = s(fO, keylineRangeA);
                    super.getDecoratedBoundsWithMargins(childAt, rect);
                    I(childAt, fO, keylineRangeA);
                    this.L.j(childAt, rect, f5, fS);
                    float fAbs = Math.abs(f11 - fS);
                    if (fAbs < f12) {
                        this.O = getPosition(childAt);
                        f12 = fAbs;
                    }
                    fT = o(fT, this.f14141t.f14160a);
                }
                u(u1Var, c2Var);
                return i11;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(View view, float f5, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.f14149a;
            float f11 = keyline.f14177c;
            KeylineState.Keyline keyline2 = keylineRange.f14150b;
            float fB = AnimationUtils.b(f11, keyline2.f14177c, keyline.f14175a, keyline2.f14175a, f5);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.L.b(height, width, AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, height / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, fB), AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, width / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, fB));
            float fS = s(f5, keylineRange);
            RectF rectF = new RectF(fS - (rectFB.width() / 2.0f), fS - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fS, (rectFB.height() / 2.0f) + fS);
            RectF rectF2 = new RectF(this.L.d(), this.L.g(), this.L.e(), this.L.c());
            this.f14139e.getClass();
            this.L.a(rectFB, rectF, rectF2);
            this.L.i(rectFB, rectF, rectF2);
            ((Maskable) view).setMaskRectF(rectFB);
        }
    }

    public final void J(KeylineStateList keylineStateList) {
        int i11 = this.f14137c;
        int i12 = this.f14136b;
        if (i11 <= i12) {
            this.f14141t = C() ? keylineStateList.a() : keylineStateList.c();
        } else {
            this.f14141t = keylineStateList.b(this.f14135a, i12, i11, false);
        }
        List list = this.f14141t.f14162c;
        DebugItemDecoration debugItemDecoration = this.f14138d;
        debugItemDecoration.getClass();
        debugItemDecoration.f14148b = Collections.unmodifiableList(list);
    }

    public final void K() {
        int itemCount = getItemCount();
        int i11 = this.N;
        if (itemCount == i11 || this.f14140f == null) {
            return;
        }
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f14139e;
        if ((i11 < multiBrowseCarouselStrategy.f14200c && getItemCount() >= multiBrowseCarouselStrategy.f14200c) || (i11 >= multiBrowseCarouselStrategy.f14200c && getItemCount() < multiBrowseCarouselStrategy.f14200c)) {
            G();
        }
        this.N = itemCount;
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollHorizontally() {
        return B();
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollVertically() {
        return !B();
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollExtent(c2 c2Var) {
        if (getChildCount() == 0 || this.f14140f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f14140f.f14183a.f14160a / computeHorizontalScrollRange(c2Var)));
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollOffset(c2 c2Var) {
        return this.f14135a;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollRange(c2 c2Var) {
        return this.f14137c - this.f14136b;
    }

    @Override // androidx.recyclerview.widget.a2
    public final PointF computeScrollVectorForPosition(int i11) {
        if (this.f14140f == null) {
            return null;
        }
        int iY = y(i11, w(i11)) - this.f14135a;
        return B() ? new PointF(iY, CropImageView.DEFAULT_ASPECT_RATIO) : new PointF(CropImageView.DEFAULT_ASPECT_RATIO, iY);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollExtent(c2 c2Var) {
        if (getChildCount() == 0 || this.f14140f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f14140f.f14183a.f14160a / computeVerticalScrollRange(c2Var)));
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollOffset(c2 c2Var) {
        return this.f14135a;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollRange(c2 c2Var) {
        return this.f14137c - this.f14136b;
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateDefaultLayoutParams() {
        return new n1(-2, -2);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (B()) {
            fCenterY = rect.centerX();
        }
        KeylineRange keylineRangeA = A(this.f14141t.f14162c, fCenterY, true);
        KeylineState.Keyline keyline = keylineRangeA.f14149a;
        float f5 = keyline.f14178d;
        KeylineState.Keyline keyline2 = keylineRangeA.f14150b;
        float fB = AnimationUtils.b(f5, keyline2.f14178d, keyline.f14176b, keyline2.f14176b, fCenterY);
        boolean zB = B();
        float fHeight = CropImageView.DEFAULT_ASPECT_RATIO;
        float fWidth = zB ? (rect.width() - fB) / 2.0f : 0.0f;
        if (!B()) {
            fHeight = (rect.height() - fB) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void measureChildWithMargins(View view, int i11, int i12) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        n1 n1Var = (n1) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i13 = rect.left + rect.right + i11;
        int i14 = rect.top + rect.bottom + i12;
        KeylineStateList keylineStateList = this.f14140f;
        view.measure(m1.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) n1Var).leftMargin + ((ViewGroup.MarginLayoutParams) n1Var).rightMargin + i13, (int) ((keylineStateList == null || this.L.f14151a != 0) ? ((ViewGroup.MarginLayoutParams) n1Var).width : keylineStateList.f14183a.f14160a), B()), m1.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) n1Var).topMargin + ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin + i14, (int) ((keylineStateList == null || this.L.f14151a != 1) ? ((ViewGroup.MarginLayoutParams) n1Var).height : keylineStateList.f14183a.f14160a), canScrollVertically()));
    }

    public final void n(View view, int i11, ChildCalculations childCalculations) {
        float f5 = this.f14141t.f14160a / 2.0f;
        addView(view, i11);
        measureChildWithMargins(view, 0, 0);
        float f11 = childCalculations.f14145c;
        this.L.h(view, (int) (f11 - f5), (int) (f11 + f5));
        I(view, childCalculations.f14144b, childCalculations.f14146d);
    }

    public final float o(float f5, float f11) {
        return C() ? f5 - f11 : f5 + f11;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f14139e;
        float dimension = multiBrowseCarouselStrategy.f14158a;
        if (dimension <= CropImageView.DEFAULT_ASPECT_RATIO) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        multiBrowseCarouselStrategy.f14158a = dimension;
        float dimension2 = multiBrowseCarouselStrategy.f14159b;
        if (dimension2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        multiBrowseCarouselStrategy.f14159b = dimension2;
        G();
        recyclerView.addOnLayoutChangeListener(this.M);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onDetachedFromWindow(RecyclerView recyclerView, u1 u1Var) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.M);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    @Override // androidx.recyclerview.widget.m1
    public final View onFocusSearchFailed(View view, int i11, u1 u1Var, c2 c2Var) {
        byte b3;
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = this.L.f14151a;
        if (i11 == 1) {
            b3 = -1;
        } else if (i11 == 2) {
            b3 = 1;
        } else if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130 && i12 == 1) {
                        b3 = 1;
                    } else {
                        b3 = -2147483648;
                    }
                } else if (i12 != 0) {
                    b3 = -2147483648;
                } else if (C()) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
            } else if (i12 == 1) {
                b3 = -1;
            } else {
                b3 = -2147483648;
            }
        } else if (i12 != 0) {
            b3 = -2147483648;
        } else if (C()) {
            b3 = 1;
        } else {
            b3 = -1;
        }
        if (b3 == -2147483648) {
            return null;
        }
        if (b3 == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            p(u1Var, getPosition(getChildAt(0)) - 1, 0);
            return getChildAt(C() ? getChildCount() - 1 : 0);
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        p(u1Var, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildAt(C() ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        K();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        K();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        K();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutChildren(u1 u1Var, c2 c2Var) {
        if (c2Var.b() <= 0 || v() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            removeAndRecycleAllViews(u1Var);
            this.H = 0;
            return;
        }
        boolean zC = C();
        KeylineStateList keylineStateList = this.f14140f;
        int i11 = 1;
        boolean z11 = keylineStateList == null;
        if (z11 || keylineStateList.f14183a.f14165f != v()) {
            F(u1Var);
        }
        KeylineStateList keylineStateList2 = this.f14140f;
        boolean zC2 = C();
        KeylineState keylineStateA = zC2 ? keylineStateList2.a() : keylineStateList2.c();
        float f5 = (zC2 ? keylineStateA.c() : keylineStateA.a()).f14175a;
        float f11 = keylineStateA.f14160a / 2.0f;
        int iF = (int) (this.L.f() - (C() ? f5 + f11 : f5 - f11));
        KeylineStateList keylineStateList3 = this.f14140f;
        boolean zC3 = C();
        KeylineState keylineStateC = zC3 ? keylineStateList3.c() : keylineStateList3.a();
        KeylineState.Keyline keylineA = zC3 ? keylineStateC.a() : keylineStateC.c();
        int iB = (int) ((((zC3 ? -1 : 1) * keylineA.f14178d) / 2.0f) + ((((c2Var.b() - 1) * keylineStateC.f14160a) * (zC3 ? -1.0f : 1.0f)) - (keylineA.f14175a - this.L.f())));
        int iMin = zC3 ? Math.min(0, iB) : Math.max(0, iB);
        this.f14136b = zC ? iMin : iF;
        if (zC) {
            iMin = iF;
        }
        this.f14137c = iMin;
        if (z11) {
            this.f14135a = iF;
            KeylineStateList keylineStateList4 = this.f14140f;
            int itemCount = getItemCount();
            int i12 = this.f14136b;
            int i13 = this.f14137c;
            boolean zC4 = C();
            List list = keylineStateList4.f14184b;
            List list2 = keylineStateList4.f14185c;
            float f12 = keylineStateList4.f14183a.f14160a;
            HashMap map = new HashMap();
            int i14 = 0;
            int i15 = 0;
            while (i14 < itemCount) {
                int i16 = zC4 ? (itemCount - i14) - i11 : i14;
                int i17 = i11;
                if (i16 * f12 * (zC4 ? -1 : i17) > i13 - keylineStateList4.f14189g || i14 >= itemCount - list2.size()) {
                    map.put(Integer.valueOf(i16), (KeylineState) list2.get(f.n(i15, 0, list2.size() - 1)));
                    i15++;
                }
                i14++;
                i11 = i17;
            }
            int i18 = i11;
            int i19 = 0;
            for (int i21 = itemCount - 1; i21 >= 0; i21--) {
                int i22 = zC4 ? (itemCount - i21) - 1 : i21;
                if (i22 * f12 * (zC4 ? -1 : i18) < i12 + keylineStateList4.f14188f || i21 < list.size()) {
                    map.put(Integer.valueOf(i22), (KeylineState) list.get(f.n(i19, 0, list.size() - 1)));
                    i19++;
                }
            }
            this.K = map;
            int i23 = this.O;
            if (i23 != -1) {
                this.f14135a = y(i23, w(i23));
            }
        }
        int i24 = this.f14135a;
        int i25 = this.f14136b;
        int i26 = this.f14137c;
        this.f14135a = (i24 < i25 ? i25 - i24 : i24 > i26 ? i26 - i24 : 0) + i24;
        this.H = f.n(this.H, 0, c2Var.b());
        J(this.f14140f);
        detachAndScrapAttachedViews(u1Var);
        u(u1Var, c2Var);
        this.N = getItemCount();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutCompleted(c2 c2Var) {
        if (getChildCount() == 0) {
            this.H = 0;
        } else {
            this.H = getPosition(getChildAt(0));
        }
    }

    public final void p(u1 u1Var, int i11, int i12) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        float fT = t(i11);
        View viewD = u1Var.d(i11);
        measureChildWithMargins(viewD, 0, 0);
        float fO = o(fT, this.f14141t.f14160a / 2.0f);
        KeylineRange keylineRangeA = A(this.f14141t.f14162c, fO, false);
        n(viewD, i12, new ChildCalculations(viewD, fO, s(fO, keylineRangeA), keylineRangeA));
    }

    public final void q(int i11, u1 u1Var, c2 c2Var) {
        float fT = t(i11);
        while (i11 < c2Var.b()) {
            float fO = o(fT, this.f14141t.f14160a / 2.0f);
            KeylineRange keylineRangeA = A(this.f14141t.f14162c, fO, false);
            float fS = s(fO, keylineRangeA);
            if (D(fS, keylineRangeA)) {
                return;
            }
            fT = o(fT, this.f14141t.f14160a);
            if (!E(fS, keylineRangeA)) {
                View viewD = u1Var.d(i11);
                n(viewD, -1, new ChildCalculations(viewD, fO, fS, keylineRangeA));
            }
            i11++;
        }
    }

    public final void r(int i11, u1 u1Var) {
        float fT = t(i11);
        while (i11 >= 0) {
            float fO = o(fT, this.f14141t.f14160a / 2.0f);
            KeylineRange keylineRangeA = A(this.f14141t.f14162c, fO, false);
            float fS = s(fO, keylineRangeA);
            if (E(fS, keylineRangeA)) {
                return;
            }
            float f5 = this.f14141t.f14160a;
            fT = C() ? fT + f5 : fT - f5;
            if (!D(fS, keylineRangeA)) {
                View viewD = u1Var.d(i11);
                n(viewD, 0, new ChildCalculations(viewD, fO, fS, keylineRangeA));
            }
            i11--;
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
        int iZ;
        if (this.f14140f == null || (iZ = z(getPosition(view), w(getPosition(view)))) == 0) {
            return false;
        }
        int i11 = this.f14135a;
        int i12 = this.f14136b;
        int i13 = this.f14137c;
        int i14 = i11 + iZ;
        if (i14 < i12) {
            iZ = i12 - i11;
        } else if (i14 > i13) {
            iZ = i13 - i11;
        }
        int iZ2 = z(getPosition(view), this.f14140f.b(i11 + iZ, i12, i13, false));
        if (B()) {
            recyclerView.scrollBy(iZ2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iZ2);
        return true;
    }

    public final float s(float f5, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14149a;
        float f11 = keyline.f14176b;
        KeylineState.Keyline keyline2 = keylineRange.f14150b;
        float f12 = keyline2.f14176b;
        float f13 = keyline.f14175a;
        float f14 = keyline2.f14175a;
        float fB = AnimationUtils.b(f11, f12, f13, f14, f5);
        if (keyline2 != this.f14141t.b() && keyline != this.f14141t.d()) {
            return fB;
        }
        return p0.a(1.0f, keyline2.f14177c, f5 - f14, fB);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (B()) {
            return H(i11, u1Var, c2Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void scrollToPosition(int i11) {
        this.O = i11;
        if (this.f14140f == null) {
            return;
        }
        this.f14135a = y(i11, w(i11));
        this.H = f.n(i11, 0, Math.max(0, getItemCount() - 1));
        J(this.f14140f);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (canScrollVertically()) {
            return H(i11, u1Var, c2Var);
        }
        return 0;
    }

    public final void setOrientation(int i11) {
        CarouselOrientationHelper carouselOrientationHelper;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException(p.j(i11, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper2 = this.L;
        if (carouselOrientationHelper2 == null || i11 != carouselOrientationHelper2.f14151a) {
            if (i11 == 0) {
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
                    {
                        super(0);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f5 = rectF2.left;
                        float f11 = rectF3.left;
                        if (f5 < f11 && rectF2.right > f11) {
                            float f12 = f11 - f5;
                            rectF.left += f12;
                            rectF2.left += f12;
                        }
                        float f13 = rectF2.right;
                        float f14 = rectF3.right;
                        if (f13 <= f14 || rectF2.left >= f14) {
                            return;
                        }
                        float f15 = f13 - f14;
                        rectF.right = Math.max(rectF.right - f15, rectF.left);
                        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF b(float f5, float f11, float f12, float f13) {
                        return new RectF(f13, CropImageView.DEFAULT_ASPECT_RATIO, f11 - f13, f5);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int c() {
                        CarouselLayoutManager carouselLayoutManager = this.f14153b;
                        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        return this.f14153b.getWidth();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        CarouselLayoutManager carouselLayoutManager = this.f14153b;
                        if (carouselLayoutManager.C()) {
                            return carouselLayoutManager.getWidth();
                        }
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        return this.f14153b.getPaddingTop();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void h(View view, int i12, int i13) {
                        CarouselLayoutManager carouselLayoutManager = this.f14153b;
                        int paddingTop = carouselLayoutManager.getPaddingTop();
                        n1 n1Var = (n1) view.getLayoutParams();
                        this.f14153b.layoutDecoratedWithMargins(view, i12, paddingTop, i13, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) n1Var).topMargin + ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin + paddingTop);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.right <= rectF3.left) {
                            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                            rectF.right = fFloor;
                            rectF.left = Math.min(rectF.left, fFloor);
                        }
                        if (rectF2.left >= rectF3.right) {
                            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                            rectF.left = fCeil;
                            rectF.right = Math.max(fCeil, rectF.right);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(View view, Rect rect, float f5, float f11) {
                        view.offsetLeftAndRight((int) (f11 - (rect.left + f5)));
                    }
                };
            } else {
                if (i11 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
                    {
                        super(1);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f5 = rectF2.top;
                        float f11 = rectF3.top;
                        if (f5 < f11 && rectF2.bottom > f11) {
                            float f12 = f11 - f5;
                            rectF.top += f12;
                            rectF3.top += f12;
                        }
                        float f13 = rectF2.bottom;
                        float f14 = rectF3.bottom;
                        if (f13 <= f14 || rectF2.top >= f14) {
                            return;
                        }
                        float f15 = f13 - f14;
                        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
                        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF b(float f5, float f11, float f12, float f13) {
                        return new RectF(CropImageView.DEFAULT_ASPECT_RATIO, f12, f11, f5 - f12);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int c() {
                        return this.f14152b.getHeight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        return this.f14152b.getPaddingLeft();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        CarouselLayoutManager carouselLayoutManager = this.f14152b;
                        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void h(View view, int i12, int i13) {
                        CarouselLayoutManager carouselLayoutManager = this.f14152b;
                        int paddingLeft = carouselLayoutManager.getPaddingLeft();
                        n1 n1Var = (n1) view.getLayoutParams();
                        this.f14152b.layoutDecoratedWithMargins(view, paddingLeft, i12, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) n1Var).leftMargin + ((ViewGroup.MarginLayoutParams) n1Var).rightMargin + paddingLeft, i13);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.bottom <= rectF3.top) {
                            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                            rectF.bottom = fFloor;
                            rectF.top = Math.min(rectF.top, fFloor);
                        }
                        if (rectF2.top >= rectF3.bottom) {
                            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                            rectF.top = fCeil;
                            rectF.bottom = Math.max(fCeil, rectF.bottom);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(View view, Rect rect, float f5, float f11) {
                        view.offsetTopAndBottom((int) (f11 - (rect.top + f5)));
                    }
                };
            }
            this.L = carouselOrientationHelper;
            G();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void smoothScrollToPosition(RecyclerView recyclerView, c2 c2Var, int i11) {
        r0 r0Var = new r0(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.r0
            public final int calculateDxToMakeVisible(View view, int i12) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.f14140f == null || !carouselLayoutManager.B()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.f14135a - carouselLayoutManager.y(position, carouselLayoutManager.w(position)));
            }

            @Override // androidx.recyclerview.widget.r0
            public final int calculateDyToMakeVisible(View view, int i12) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.f14140f == null || carouselLayoutManager.B()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.f14135a - carouselLayoutManager.y(position, carouselLayoutManager.w(position)));
            }

            @Override // androidx.recyclerview.widget.b2
            public final PointF computeScrollVectorForPosition(int i12) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i12);
            }
        };
        r0Var.setTargetPosition(i11);
        startSmoothScroll(r0Var);
    }

    public final float t(int i11) {
        return o(this.L.f() - this.f14135a, this.f14141t.f14160a * i11);
    }

    public final void u(u1 u1Var, c2 c2Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float fCenterX = B() ? rect.centerX() : rect.centerY();
            if (!E(fCenterX, A(this.f14141t.f14162c, fCenterX, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, u1Var);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float fCenterX2 = B() ? rect2.centerX() : rect2.centerY();
            if (!D(fCenterX2, A(this.f14141t.f14162c, fCenterX2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, u1Var);
            }
        }
        if (getChildCount() == 0) {
            r(this.H - 1, u1Var);
            q(this.H, u1Var, c2Var);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            r(position - 1, u1Var);
            q(position2 + 1, u1Var, c2Var);
        }
    }

    public final int v() {
        return B() ? getWidth() : getHeight();
    }

    public final KeylineState w(int i11) {
        KeylineState keylineState;
        HashMap map = this.K;
        return (map == null || (keylineState = (KeylineState) map.get(Integer.valueOf(f.n(i11, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f14140f.f14183a : keylineState;
    }

    public final int x(int i11, boolean z11) {
        int iY = y(i11, this.f14140f.b(this.f14135a, this.f14136b, this.f14137c, true)) - this.f14135a;
        int iY2 = this.K != null ? y(i11, w(i11)) - this.f14135a : iY;
        return (!z11 || Math.abs(iY2) >= Math.abs(iY)) ? iY : iY2;
    }

    public final int y(int i11, KeylineState keylineState) {
        if (!C()) {
            return (int) ((keylineState.f14160a / 2.0f) + ((i11 * keylineState.f14160a) - keylineState.a().f14175a));
        }
        float fV = v() - keylineState.c().f14175a;
        float f5 = keylineState.f14160a;
        return (int) ((fV - (i11 * f5)) - (f5 / 2.0f));
    }

    public final int z(int i11, KeylineState keylineState) {
        int i12 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.f14162c.subList(keylineState.f14163d, keylineState.f14164e + 1)) {
            float f5 = keylineState.f14160a;
            float f11 = (f5 / 2.0f) + (i11 * f5);
            int iV = (C() ? (int) ((v() - keyline.f14175a) - f11) : (int) (f11 - keyline.f14175a)) - this.f14135a;
            if (Math.abs(i12) > Math.abs(iV)) {
                i12 = iV;
            }
        }
        return i12;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f14138d = new DebugItemDecoration();
        this.H = 0;
        this.M = new a(this, 0);
        this.O = -1;
        this.P = 0;
        this.f14139e = new MultiBrowseCarouselStrategy();
        G();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13743h);
            this.P = typedArrayObtainStyledAttributes.getInt(0, 0);
            G();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KeylineStateList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeylineState f14183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f14186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f14187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14189g;

    /* JADX INFO: renamed from: com.google.android.material.carousel.KeylineStateList$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14190a;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            f14190a = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public KeylineStateList(KeylineState keylineState, ArrayList arrayList, ArrayList arrayList2) {
        this.f14183a = keylineState;
        this.f14184b = Collections.unmodifiableList(arrayList);
        this.f14185c = Collections.unmodifiableList(arrayList2);
        float f5 = ((KeylineState) p.f(1, arrayList)).b().f14175a - keylineState.b().f14175a;
        this.f14188f = f5;
        float f11 = keylineState.d().f14175a - ((KeylineState) p.f(1, arrayList2)).d().f14175a;
        this.f14189g = f11;
        this.f14186d = d(f5, arrayList, true);
        this.f14187e = d(f11, arrayList2, false);
    }

    public static float[] d(float f5, ArrayList arrayList, boolean z11) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 - 1;
            KeylineState keylineState = (KeylineState) arrayList.get(i12);
            KeylineState keylineState2 = (KeylineState) arrayList.get(i11);
            fArr[i11] = i11 == size + (-1) ? 1.0f : fArr[i12] + ((z11 ? keylineState2.b().f14175a - keylineState.b().f14175a : keylineState.d().f14175a - keylineState2.d().f14175a) / f5);
            i11++;
        }
        return fArr;
    }

    public static float[] e(List list, float f5, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i11 = 1;
        while (i11 < size) {
            float f12 = fArr[i11];
            if (f5 <= f12) {
                return new float[]{AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f11, f12, f5), i11 - 1, i11};
            }
            i11++;
            f11 = f12;
        }
        return new float[]{CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
    }

    public static KeylineState f(KeylineState keylineState, int i11, int i12, float f5, int i13, int i14, int i15) {
        ArrayList arrayList = new ArrayList(keylineState.f14162c);
        arrayList.add(i12, (KeylineState.Keyline) arrayList.remove(i11));
        KeylineState.Builder builder = new KeylineState.Builder(i15, keylineState.f14160a);
        float f11 = f5;
        int i16 = 0;
        while (i16 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i16);
            float f12 = keyline.f14178d;
            builder.b((f12 / 2.0f) + f11, keyline.f14177c, f12, i16 >= i13 && i16 <= i14, keyline.f14179e, keyline.f14180f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            f11 += keyline.f14178d;
            i16++;
        }
        return builder.d();
    }

    public static KeylineState g(KeylineState keylineState, float f5, int i11, boolean z11, float f11, CarouselStrategy.StrategyType strategyType) {
        int i12 = keylineState.f14164e;
        int i13 = keylineState.f14163d;
        float f12 = keylineState.f14160a;
        List list = keylineState.f14162c;
        if (AnonymousClass1.f14190a[strategyType.ordinal()] != 1) {
            ArrayList arrayList = new ArrayList(list);
            KeylineState.Builder builder = new KeylineState.Builder(i11, f12);
            int size = z11 ? 0 : arrayList.size() - 1;
            int i14 = 0;
            while (i14 < arrayList.size()) {
                KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i14);
                boolean z12 = keyline.f14179e;
                float f13 = keyline.f14176b;
                if (z12 && i14 == size) {
                    builder.b(f13, keyline.f14177c, keyline.f14178d, false, true, keyline.f14180f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                } else {
                    float f14 = z11 ? f13 + f5 : f13 - f5;
                    float f15 = z11 ? f5 : 0.0f;
                    float f16 = z11 ? 0.0f : f5;
                    boolean z13 = i14 >= i13 && i14 <= i12;
                    float f17 = f14;
                    float f18 = keyline.f14177c;
                    float f19 = keyline.f14178d;
                    builder.b(f17, f18, f19, z13, z12, Math.abs(z11 ? Math.max(CropImageView.DEFAULT_ASPECT_RATIO, ((f19 / 2.0f) + f17) - i11) : Math.min(CropImageView.DEFAULT_ASPECT_RATIO, f17 - (f19 / 2.0f))), f15, f16);
                }
                i14++;
            }
            return builder.d();
        }
        ArrayList arrayList2 = new ArrayList(list);
        KeylineState.Builder builder2 = new KeylineState.Builder(i11, f12);
        Iterator it = list.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (((KeylineState.Keyline) it.next()).f14179e) {
                i15++;
            }
        }
        float size2 = f5 / (list.size() - i15);
        float f21 = z11 ? f5 : 0.0f;
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            KeylineState.Keyline keyline2 = (KeylineState.Keyline) arrayList2.get(i16);
            if (keyline2.f14179e) {
                builder2.b(keyline2.f14176b, keyline2.f14177c, keyline2.f14178d, false, true, keyline2.f14180f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                boolean z14 = i16 >= i13 && i16 <= i12;
                float f22 = keyline2.f14178d - size2;
                float fB = CarouselStrategy.b(f22, f12, f11);
                float f23 = (f22 / 2.0f) + f21;
                float fAbs = Math.abs(f23 - keyline2.f14176b);
                builder2.b(f23, fB, f22, z14, false, keyline2.f14180f, z11 ? fAbs : CropImageView.DEFAULT_ASPECT_RATIO, z11 ? CropImageView.DEFAULT_ASPECT_RATIO : fAbs);
                f21 += f22;
            }
            i16++;
        }
        return builder2.d();
    }

    public final KeylineState a() {
        return (KeylineState) p.g(1, this.f14185c);
    }

    public final KeylineState b(float f5, float f11, float f12, boolean z11) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f14188f;
        float f14 = f11 + f13;
        float f15 = this.f14189g;
        float f16 = f12 - f15;
        float f17 = c().a().f14181g;
        float f18 = a().a().f14182h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f5 < f14) {
            fB = AnimationUtils.b(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, f11, f14, f5);
            list = this.f14184b;
            fArr = this.f14186d;
        } else {
            if (f5 <= f16) {
                return this.f14183a;
            }
            fB = AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f16, f12, f5);
            list = this.f14185c;
            fArr = this.f14187e;
        }
        if (z11) {
            float[] fArrE = e(list, fB, fArr);
            return fArrE[0] >= 0.5f ? (KeylineState) list.get((int) fArrE[2]) : (KeylineState) list.get((int) fArrE[1]);
        }
        float[] fArrE2 = e(list, fB, fArr);
        KeylineState keylineState = (KeylineState) list.get((int) fArrE2[1]);
        KeylineState keylineState2 = (KeylineState) list.get((int) fArrE2[2]);
        float f19 = fArrE2[0];
        float f21 = keylineState.f14160a;
        List list2 = keylineState.f14162c;
        if (f21 != keylineState2.f14160a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list3 = keylineState2.f14162c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list2.get(i11);
            KeylineState.Keyline keyline2 = (KeylineState.Keyline) list3.get(i11);
            arrayList.add(new KeylineState.Keyline(AnimationUtils.a(keyline.f14175a, keyline2.f14175a, f19), AnimationUtils.a(keyline.f14176b, keyline2.f14176b, f19), AnimationUtils.a(keyline.f14177c, keyline2.f14177c, f19), AnimationUtils.a(keyline.f14178d, keyline2.f14178d, f19), false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        }
        return new KeylineState(keylineState.f14160a, arrayList, AnimationUtils.c(keylineState.f14163d, f19, keylineState2.f14163d), AnimationUtils.c(keylineState.f14164e, f19, keylineState2.f14164e), keylineState.f14165f);
    }

    public final KeylineState c() {
        return (KeylineState) p.g(1, this.f14184b);
    }
}

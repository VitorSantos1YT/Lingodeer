package com.google.android.material.carousel;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class KeylineState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14165f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f14166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14167b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Keyline f14169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Keyline f14170e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f14168c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14171f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14172g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f14173h = CropImageView.DEFAULT_ASPECT_RATIO;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14174i = -1;

        public Builder(int i11, float f5) {
            this.f14166a = f5;
            this.f14167b = i11;
        }

        public final void a(float f5, float f11, float f12, boolean z11, boolean z12) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f5 - f13;
            float f15 = f13 + f5;
            float f16 = this.f14167b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = CropImageView.DEFAULT_ASPECT_RATIO;
                if (f14 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, CropImageView.DEFAULT_ASPECT_RATIO));
                }
            }
            b(f5, f11, f12, z11, z12, fAbs, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        }

        public final void b(float f5, float f11, float f12, boolean z11, boolean z12, float f13, float f14, float f15) {
            if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            ArrayList arrayList = this.f14168c;
            if (z12) {
                if (z11) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i11 = this.f14174i;
                if (i11 != -1 && i11 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f14174i = arrayList.size();
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f5, f11, f12, z12, f13, f14, f15);
            if (z11) {
                if (this.f14169d == null) {
                    this.f14169d = keyline;
                    this.f14171f = arrayList.size();
                }
                if (this.f14172g != -1 && arrayList.size() - this.f14172g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f14169d.f14178d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f14170e = keyline;
                this.f14172g = arrayList.size();
            } else {
                if (this.f14169d == null && f12 < this.f14173h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f14170e != null && f12 > this.f14173h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f14173h = f12;
            arrayList.add(keyline);
        }

        public final void c(float f5, float f11, float f12, int i11, boolean z11) {
            if (i11 <= 0 || f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                a((i12 * f12) + f5, f11, f12, z11, false);
            }
        }

        public final KeylineState d() {
            if (this.f14169d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.f14168c;
                if (i11 >= arrayList2.size()) {
                    return new KeylineState(this.f14166a, arrayList, this.f14171f, this.f14172g, this.f14167b);
                }
                Keyline keyline = (Keyline) arrayList2.get(i11);
                float f5 = this.f14169d.f14176b;
                float f11 = this.f14171f;
                float f12 = this.f14166a;
                arrayList.add(new Keyline((i11 * f12) + (f5 - (f11 * f12)), keyline.f14176b, keyline.f14177c, keyline.f14178d, keyline.f14179e, keyline.f14180f, keyline.f14181g, keyline.f14182h));
                i11++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Keyline {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f14175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f14176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f14177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f14178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f14180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f14181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f14182h;

        public Keyline(float f5, float f11, float f12, float f13, boolean z11, float f14, float f15, float f16) {
            this.f14175a = f5;
            this.f14176b = f11;
            this.f14177c = f12;
            this.f14178d = f13;
            this.f14179e = z11;
            this.f14180f = f14;
            this.f14181g = f15;
            this.f14182h = f16;
        }
    }

    public KeylineState(float f5, ArrayList arrayList, int i11, int i12, int i13) {
        this.f14160a = f5;
        this.f14162c = Collections.unmodifiableList(arrayList);
        this.f14163d = i11;
        this.f14164e = i12;
        while (i11 <= i12) {
            if (((Keyline) arrayList.get(i11)).f14180f == CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f14161b++;
            }
            i11++;
        }
        this.f14165f = i13;
    }

    public final Keyline a() {
        return (Keyline) this.f14162c.get(this.f14163d);
    }

    public final Keyline b() {
        return (Keyline) this.f14162c.get(0);
    }

    public final Keyline c() {
        return (Keyline) this.f14162c.get(this.f14164e);
    }

    public final Keyline d() {
        return (Keyline) p.g(1, this.f14162c);
    }
}

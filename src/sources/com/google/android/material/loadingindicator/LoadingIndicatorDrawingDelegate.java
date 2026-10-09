package com.google.android.material.loadingindicator;

import a10.f;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.MaterialShapes;
import q6.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class LoadingIndicatorDrawingDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m[] f14775d = {MaterialShapes.d(MaterialShapes.f15238g, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15237f, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15234c, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15233b, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15235d, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15236e, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.d(MaterialShapes.f15232a, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f[] f14776e = new f[7];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingIndicatorSpec f14777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f14778b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f14779c = new Matrix();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class IndicatorState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14782c;
    }

    static {
        int i11 = 0;
        while (true) {
            m[] mVarArr = f14775d;
            if (i11 >= mVarArr.length) {
                return;
            }
            int i12 = i11 + 1;
            f14776e[i11] = new f(mVarArr[i11], mVarArr[i12 % mVarArr.length]);
            i11 = i12;
        }
    }

    public LoadingIndicatorDrawingDelegate(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f14777a = loadingIndicatorSpec;
    }
}

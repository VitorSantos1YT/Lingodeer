package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import gb.r;
import java.util.ArrayList;
import java.util.Arrays;
import jh.h;
import md.a;
import q6.b;
import q6.m;
import q6.n;
import sy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialShapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f15232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f15233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f15234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f15235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f15236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f15237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f15238g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class VertexAndRounding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointF f15239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f15240b;

        public VertexAndRounding(PointF pointF) {
            this(pointF, b.f47475c);
        }

        public VertexAndRounding(PointF pointF, b bVar) {
            this.f15239a = pointF;
            this.f15240b = bVar;
        }
    }

    static {
        b bVar = new b(0.15f, CropImageView.DEFAULT_ASPECT_RATIO);
        b bVar2 = new b(0.2f, CropImageView.DEFAULT_ASPECT_RATIO);
        b bVar3 = new b(0.3f, CropImageView.DEFAULT_ASPECT_RATIO);
        b bVar4 = new b(0.5f, CropImageView.DEFAULT_ASPECT_RATIO);
        b bVar5 = new b(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        c(h.e(14));
        c(h.s(1.0f, bVar3, null));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.97f), new b(0.189f, 0.811f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.021f, 0.967f), new b(0.187f, 0.057f)));
        c(b(2, arrayList, false));
        b bVar6 = b.f47475c;
        c(a.z(hz.b.d(4, 1.0f, bVar6, Arrays.asList(bVar5, bVar5, bVar2, bVar2)), a(-135.0f)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new VertexAndRounding(new PointF(1.0f, 1.0f), new b(0.148f, 0.417f)));
        arrayList2.add(new VertexAndRounding(new PointF(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new b(0.151f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList2.add(new VertexAndRounding(new PointF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO), new b(0.148f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList2.add(new VertexAndRounding(new PointF(0.978f, 0.02f), new b(0.803f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(1, arrayList2, false));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new VertexAndRounding(new PointF(0.5f, 0.892f), new b(0.313f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList3.add(new VertexAndRounding(new PointF(-0.216f, 1.05f), new b(0.207f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList3.add(new VertexAndRounding(new PointF(0.499f, -0.16f), new b(0.215f, 1.0f)));
        arrayList3.add(new VertexAndRounding(new PointF(1.225f, 1.06f), new b(0.211f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(1, arrayList3, false));
        c(h.s(1.6f, bVar6, Arrays.asList(bVar2, bVar2, bVar5, bVar5)));
        m mVarE = h.e(15);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, 0.64f);
        f15232a = c(a.z(a.z(mVarE, matrix), a(-45.0f)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new VertexAndRounding(new PointF(0.961f, 0.039f), new b(0.426f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList4.add(new VertexAndRounding(new PointF(1.001f, 0.428f)));
        arrayList4.add(new VertexAndRounding(new PointF(1.0f, 0.609f), bVar5));
        f15233b = c(b(2, arrayList4, true));
        c(a.z(hz.b.d(3, 1.0f, bVar2, null), a(-90.0f)));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new VertexAndRounding(new PointF(0.5f, 1.096f), new b(0.151f, 0.524f)));
        arrayList5.add(new VertexAndRounding(new PointF(0.04f, 0.5f), new b(0.159f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(2, arrayList5, false));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new VertexAndRounding(new PointF(0.171f, 0.841f), new b(0.159f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList6.add(new VertexAndRounding(new PointF(-0.02f, 0.5f), new b(0.14f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList6.add(new VertexAndRounding(new PointF(0.17f, 0.159f), new b(0.159f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(2, arrayList6, false));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new VertexAndRounding(new PointF(0.5f, -0.009f), new b(0.172f, CropImageView.DEFAULT_ASPECT_RATIO)));
        f15234c = c(b(5, arrayList7, false));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new VertexAndRounding(new PointF(0.499f, 1.023f), new b(0.241f, 0.778f)));
        arrayList8.add(new VertexAndRounding(new PointF(-0.005f, 0.792f), new b(0.208f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList8.add(new VertexAndRounding(new PointF(0.073f, 0.258f), new b(0.228f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList8.add(new VertexAndRounding(new PointF(0.433f, -0.0f), new b(0.491f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(a.z(b(1, arrayList8, true), a(-90.0f)));
        f15235d = c(h.v(8, 0.8f, bVar));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new VertexAndRounding(new PointF(0.5f, 1.08f), new b(0.085f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList9.add(new VertexAndRounding(new PointF(0.358f, 0.843f), new b(0.085f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(8, arrayList9, false));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new VertexAndRounding(new PointF(1.237f, 1.236f), new b(0.258f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList10.add(new VertexAndRounding(new PointF(0.5f, 0.918f), new b(0.233f, CropImageView.DEFAULT_ASPECT_RATIO)));
        f15236e = c(b(4, arrayList10, false));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new VertexAndRounding(new PointF(0.723f, 0.884f), new b(0.394f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList11.add(new VertexAndRounding(new PointF(0.5f, 1.099f), new b(0.398f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(6, arrayList11, false));
        c(a.z(h.v(7, 0.75f, bVar4), a(-90.0f)));
        f15237f = c(a.z(h.v(9, 0.8f, bVar4), a(-90.0f)));
        c(a.z(h.v(12, 0.8f, bVar4), a(-90.0f)));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new VertexAndRounding(new PointF(0.5f, CropImageView.DEFAULT_ASPECT_RATIO), bVar5));
        arrayList12.add(new VertexAndRounding(new PointF(1.0f, CropImageView.DEFAULT_ASPECT_RATIO), bVar5));
        arrayList12.add(new VertexAndRounding(new PointF(1.0f, 1.14f), new b(0.254f, 0.106f)));
        arrayList12.add(new VertexAndRounding(new PointF(0.575f, 0.906f), new b(0.253f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(1, arrayList12, true));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new VertexAndRounding(new PointF(0.5f, 0.074f)));
        arrayList13.add(new VertexAndRounding(new PointF(0.725f, -0.099f), new b(0.476f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(4, arrayList13, true));
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add(new VertexAndRounding(new PointF(0.5f, 0.036f)));
        arrayList14.add(new VertexAndRounding(new PointF(0.758f, -0.101f), new b(0.209f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(8, arrayList14, false));
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add(new VertexAndRounding(new PointF(0.5f, -0.006f), new b(0.006f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList15.add(new VertexAndRounding(new PointF(0.592f, 0.158f), new b(0.006f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(12, arrayList15, false));
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add(new VertexAndRounding(new PointF(0.193f, 0.277f), new b(0.053f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList16.add(new VertexAndRounding(new PointF(0.176f, 0.055f), new b(0.053f, CropImageView.DEFAULT_ASPECT_RATIO)));
        f15238g = c(b(10, arrayList16, false));
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add(new VertexAndRounding(new PointF(0.457f, 0.296f), new b(0.007f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList17.add(new VertexAndRounding(new PointF(0.5f, -0.051f), new b(0.007f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(15, arrayList17, false));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add(new VertexAndRounding(new PointF(0.733f, 0.454f)));
        arrayList18.add(new VertexAndRounding(new PointF(0.839f, 0.437f), new b(0.532f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList18.add(new VertexAndRounding(new PointF(0.949f, 0.449f), new b(0.439f, 1.0f)));
        arrayList18.add(new VertexAndRounding(new PointF(0.998f, 0.478f), new b(0.174f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(16, arrayList18, true));
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add(new VertexAndRounding(new PointF(0.37f, 0.187f)));
        arrayList19.add(new VertexAndRounding(new PointF(0.416f, 0.049f), new b(0.381f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList19.add(new VertexAndRounding(new PointF(0.479f, CropImageView.DEFAULT_ASPECT_RATIO), new b(0.095f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(8, arrayList19, true));
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add(new VertexAndRounding(new PointF(0.5f, 0.053f)));
        arrayList20.add(new VertexAndRounding(new PointF(0.545f, -0.04f), new b(0.405f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.67f, -0.035f), new b(0.426f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.717f, 0.066f), new b(0.574f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.722f, 0.128f)));
        arrayList20.add(new VertexAndRounding(new PointF(0.777f, 0.002f), new b(0.36f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.914f, 0.149f), new b(0.66f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.926f, 0.289f), new b(0.66f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(0.881f, 0.346f)));
        arrayList20.add(new VertexAndRounding(new PointF(0.94f, 0.344f), new b(0.126f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList20.add(new VertexAndRounding(new PointF(1.003f, 0.437f), new b(0.255f, CropImageView.DEFAULT_ASPECT_RATIO)));
        m mVarB = b(2, arrayList20, true);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(1.0f, 0.742f);
        c(a.z(mVarB, matrix2));
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add(new VertexAndRounding(new PointF(0.87f, 0.13f), new b(0.146f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList21.add(new VertexAndRounding(new PointF(0.818f, 0.357f)));
        arrayList21.add(new VertexAndRounding(new PointF(1.0f, 0.332f), new b(0.853f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(4, arrayList21, true));
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(new VertexAndRounding(new PointF(0.5f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList22.add(new VertexAndRounding(new PointF(0.704f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList22.add(new VertexAndRounding(new PointF(0.704f, 0.065f)));
        arrayList22.add(new VertexAndRounding(new PointF(0.843f, 0.065f)));
        arrayList22.add(new VertexAndRounding(new PointF(0.843f, 0.148f)));
        arrayList22.add(new VertexAndRounding(new PointF(0.926f, 0.148f)));
        arrayList22.add(new VertexAndRounding(new PointF(0.926f, 0.296f)));
        arrayList22.add(new VertexAndRounding(new PointF(1.0f, 0.296f)));
        c(b(2, arrayList22, true));
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add(new VertexAndRounding(new PointF(0.11f, 0.5f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.113f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList23.add(new VertexAndRounding(new PointF(0.287f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList23.add(new VertexAndRounding(new PointF(0.287f, 0.087f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.421f, 0.087f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.421f, 0.17f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.56f, 0.17f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.56f, 0.265f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.674f, 0.265f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.675f, 0.344f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.789f, 0.344f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.789f, 0.439f)));
        arrayList23.add(new VertexAndRounding(new PointF(0.888f, 0.439f)));
        c(b(1, arrayList23, true));
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add(new VertexAndRounding(new PointF(0.796f, 0.5f)));
        arrayList24.add(new VertexAndRounding(new PointF(0.853f, 0.518f), bVar5));
        arrayList24.add(new VertexAndRounding(new PointF(0.992f, 0.631f), bVar5));
        arrayList24.add(new VertexAndRounding(new PointF(0.968f, 1.0f), bVar5));
        c(b(2, arrayList24, true));
        ArrayList arrayList25 = new ArrayList();
        arrayList25.add(new VertexAndRounding(new PointF(0.5f, 0.268f), new b(0.016f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList25.add(new VertexAndRounding(new PointF(0.792f, -0.066f), new b(0.958f, CropImageView.DEFAULT_ASPECT_RATIO)));
        arrayList25.add(new VertexAndRounding(new PointF(1.064f, 0.276f), bVar5));
        arrayList25.add(new VertexAndRounding(new PointF(0.501f, 0.946f), new b(0.129f, CropImageView.DEFAULT_ASPECT_RATIO)));
        c(b(1, arrayList25, true));
    }

    private MaterialShapes() {
    }

    public static Matrix a(float f5) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f5);
        return matrix;
    }

    public static m b(int i11, ArrayList arrayList, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            PointF pointF = ((VertexAndRounding) obj).f15239a;
            pointF.offset(-0.5f, -0.5f);
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            float fHypot = (float) Math.hypot(pointF.x, pointF.y);
            pointF.x = fAtan2;
            pointF.y = fHypot;
        }
        float f5 = (float) (6.283185307179586d / ((double) i11));
        if (z11) {
            int i13 = i11 * 2;
            float f11 = f5 / 2.0f;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    boolean z12 = i14 % 2 != 0;
                    int size2 = z12 ? (arrayList.size() - 1) - i15 : i15;
                    VertexAndRounding vertexAndRounding = (VertexAndRounding) arrayList.get(size2);
                    if (size2 > 0 || !z12) {
                        arrayList2.add(new VertexAndRounding(new PointF((i14 * f11) + (z12 ? (((VertexAndRounding) arrayList.get(0)).f15239a.x * 2.0f) + (f11 - vertexAndRounding.f15239a.x) : vertexAndRounding.f15239a.x), vertexAndRounding.f15239a.y), vertexAndRounding.f15240b));
                    }
                }
            }
        } else {
            for (int i16 = 0; i16 < i11; i16++) {
                int size3 = arrayList.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    VertexAndRounding vertexAndRounding2 = (VertexAndRounding) obj2;
                    arrayList2.add(new VertexAndRounding(new PointF((i16 * f5) + vertexAndRounding2.f15239a.x, vertexAndRounding2.f15239a.y), vertexAndRounding2.f15240b));
                }
            }
        }
        int size4 = arrayList2.size();
        int i18 = 0;
        while (i18 < size4) {
            Object obj3 = arrayList2.get(i18);
            i18++;
            PointF pointF2 = ((VertexAndRounding) obj3).f15239a;
            double d5 = 0.5f;
            float fCos = (float) ((Math.cos(pointF2.x) * ((double) pointF2.y)) + d5);
            float fSin = (float) ((Math.sin(pointF2.x) * ((double) pointF2.y)) + d5);
            pointF2.x = fCos;
            pointF2.y = fSin;
        }
        float[] fArr = new float[arrayList2.size() * 2];
        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
            int i21 = i19 * 2;
            fArr[i21] = ((VertexAndRounding) arrayList2.get(i19)).f15239a.x;
            fArr[i21 + 1] = ((VertexAndRounding) arrayList2.get(i19)).f15239a.y;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
            arrayList3.add(((VertexAndRounding) arrayList2.get(i22)).f15240b);
        }
        return hz.b.e(fArr, b.f47475c, arrayList3, 0.5f, 0.5f);
    }

    public static m c(m mVar) {
        return d(mVar, new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f));
    }

    public static m d(m mVar, RectF rectF) {
        float[] fArr = new float[4];
        c cVar = mVar.f47507d;
        float f5 = mVar.f47506c;
        float f11 = mVar.f47505b;
        int iB = cVar.b();
        float fMax = CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i11 = 0; i11 < iB; i11++) {
            q6.c cVar2 = (q6.c) cVar.get(i11);
            float[] fArr2 = cVar2.f47478a;
            float f12 = fArr2[0] - f11;
            float f13 = fArr2[1] - f5;
            float f14 = n.f47509b;
            float f15 = (f13 * f13) + (f12 * f12);
            long jC = cVar2.c(0.5f);
            float fY = r.y(jC) - f11;
            float fZ = r.z(jC) - f5;
            fMax = Math.max(fMax, Math.max(f15, (fZ * fZ) + (fY * fY)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        fArr[0] = f11 - fSqrt;
        fArr[1] = f5 - fSqrt;
        fArr[2] = f11 + fSqrt;
        fArr[3] = f5 + fSqrt;
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMin = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        matrix.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        return a.z(mVar, matrix);
    }
}

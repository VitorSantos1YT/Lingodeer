package ra;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f49025p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f49026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f49027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f49028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f49029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f49030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f49031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f49032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f49033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f49034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f49035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f49036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f49037l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f49038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y.e f49039o;

    public n() {
        this.f49028c = new Matrix();
        this.f49033h = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49034i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49035j = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49036k = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49037l = 255;
        this.m = null;
        this.f49038n = null;
        this.f49039o = new y.e(0);
        this.f49032g = new k();
        this.f49026a = new Path();
        this.f49027b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i11, int i12) {
        int i13;
        float f5;
        int i14;
        Matrix matrix2 = kVar.f49011a;
        ArrayList arrayList = kVar.f49012b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f49011a;
        matrix3.preConcat(kVar.f49020j);
        canvas.save();
        char c11 = 0;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            l lVar = (l) arrayList.get(i15);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i11, i12);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f11 = i11 / this.f49035j;
                    float f12 = i12 / this.f49036k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix4 = this.f49028c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f11, f12);
                    float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c11], fArr[1]);
                    boolean z11 = c11;
                    i13 = i15;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[z11 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > CropImageView.DEFAULT_ASPECT_RATIO ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != CropImageView.DEFAULT_ASPECT_RATIO) {
                        Path path = this.f49026a;
                        path.reset();
                        r4.f[] fVarArr = mVar.f49022a;
                        if (fVarArr != null) {
                            j3.K(fVarArr, path);
                        }
                        Path path2 = this.f49027b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f49024c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f14 = jVar.f49006i;
                            if (f14 != CropImageView.DEFAULT_ASPECT_RATIO || jVar.f49007j != 1.0f) {
                                float f15 = jVar.f49008k;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (jVar.f49007j + f15) % 1.0f;
                                if (this.f49031f == null) {
                                    this.f49031f = new PathMeasure();
                                }
                                this.f49031f.setPath(path, z11);
                                float length = this.f49031f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f49031f.getSegment(f18, length, path, true);
                                    PathMeasure pathMeasure = this.f49031f;
                                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                                    pathMeasure.getSegment(CropImageView.DEFAULT_ASPECT_RATIO, f19, path, true);
                                } else {
                                    f5 = 0.0f;
                                    this.f49031f.getSegment(f18, f19, path, true);
                                }
                                path.rLineTo(f5, f5);
                            }
                            path2.addPath(path, matrix4);
                            ij.d dVar = jVar.f49003f;
                            float f21 = 255.0f;
                            if (((Shader) dVar.f34422c) == null && dVar.f34421b == 0) {
                                f21 = 255.0f;
                                i14 = 16777215;
                            } else {
                                if (this.f49030e == null) {
                                    i14 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f49030e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i14 = 16777215;
                                }
                                Paint paint2 = this.f49030e;
                                Shader shader = (Shader) dVar.f34422c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(jVar.f49005h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i16 = dVar.f34421b;
                                    float f22 = jVar.f49005h;
                                    PorterDuff.Mode mode = q.L;
                                    paint2.setColor((i16 & i14) | (((int) (Color.alpha(i16) * f22)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(jVar.f49024c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            ij.d dVar2 = jVar.f49001d;
                            if (((Shader) dVar2.f34422c) != null || dVar2.f34421b != 0) {
                                if (this.f49029d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f49029d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f49029d;
                                Paint.Join join = jVar.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = jVar.f49009l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(jVar.f49010n);
                                Shader shader2 = (Shader) dVar2.f34422c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(jVar.f49004g * f21));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i17 = dVar2.f34421b;
                                    float f23 = jVar.f49004g;
                                    PorterDuff.Mode mode2 = q.L;
                                    paint4.setColor((i17 & i14) | (((int) (Color.alpha(i17) * f23)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(jVar.f49002e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i15 = i13 + 1;
                c11 = 0;
            }
            i13 = i15;
            i15 = i13 + 1;
            c11 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f49037l;
    }

    public void setAlpha(float f5) {
        setRootAlpha((int) (f5 * 255.0f));
    }

    public void setRootAlpha(int i11) {
        this.f49037l = i11;
    }

    public n(n nVar) {
        this.f49028c = new Matrix();
        this.f49033h = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49034i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49035j = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49036k = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49037l = 255;
        this.m = null;
        this.f49038n = null;
        y.e eVar = new y.e(0);
        this.f49039o = eVar;
        this.f49032g = new k(nVar.f49032g, eVar);
        this.f49026a = new Path(nVar.f49026a);
        this.f49027b = new Path(nVar.f49027b);
        this.f49033h = nVar.f49033h;
        this.f49034i = nVar.f49034i;
        this.f49035j = nVar.f49035j;
        this.f49036k = nVar.f49036k;
        this.f49037l = nVar.f49037l;
        this.m = nVar.m;
        String str = nVar.m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f49038n = nVar.f49038n;
    }
}

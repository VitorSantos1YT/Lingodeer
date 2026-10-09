package fw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f28206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28208c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f28214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f28215j;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f28218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f28219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f28220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f28221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f28224t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28209d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28210e = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28211f = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f28212g = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f28213h = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f28216k = new Matrix();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f28217l = new Paint();

    public final void a(Canvas canvas) {
        Matrix matrix = this.f28216k;
        matrix.reset();
        matrix.postRotate(this.f28219o, this.f28222r, this.f28223s);
        float f5 = this.f28209d;
        matrix.postScale(f5, f5, this.f28222r, this.f28223s);
        matrix.postTranslate(this.f28207b, this.f28208c);
        int i11 = this.f28210e;
        Paint paint = this.f28217l;
        paint.setAlpha(i11);
        canvas.drawBitmap(this.f28206a, matrix, paint);
    }

    public boolean b(long j11) {
        long j12 = j11 - this.f28221q;
        if (j12 > this.f28220p) {
            return false;
        }
        float f5 = j12;
        this.f28207b = (this.f28214i * f5 * f5) + (this.f28212g * f5) + this.m;
        this.f28208c = (this.f28215j * f5 * f5) + (this.f28213h * f5) + this.f28218n;
        this.f28219o = ((this.f28211f * f5) / 1000.0f) + CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i11 = 0; i11 < this.f28224t.size(); i11++) {
            hw.a aVar = (hw.a) this.f28224t.get(i11);
            aVar.getClass();
            long j13 = aVar.f33821a;
            if (j12 < j13) {
                this.f28210e = 255;
            } else if (j12 > aVar.f33822b) {
                this.f28210e = 0;
            } else {
                this.f28210e = (int) ((aVar.f33824d * aVar.f33825e.getInterpolation(((j12 - j13) * 1.0f) / aVar.f33823c)) + 255);
            }
        }
        return true;
    }
}

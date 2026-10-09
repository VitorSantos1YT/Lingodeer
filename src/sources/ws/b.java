package ws;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.LinearInterpolator;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f55197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PathMeasure f55198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f55199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f55202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HwViewNew f55203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55205i;

    public final void a(int i11) {
        HwViewNew hwViewNew = this.f55203g;
        Canvas canvas = this.f55197a;
        for (int i12 = 0; i12 < i11; i12++) {
            canvas.save();
            canvas.clipPath((Path) hwViewNew.K.get(i12));
            hwViewNew.a(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        this.f55202f.clear();
        this.f55201e = 0;
        this.f55200d = false;
        ValueAnimator valueAnimator = this.f55199c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c(int i11) {
        ArrayList arrayList = this.f55202f;
        HwViewNew hwViewNew = this.f55203g;
        Bitmap bitmap = hwViewNew.M;
        if (bitmap == null) {
            return;
        }
        bitmap.eraseColor(0);
        arrayList.clear();
        this.f55201e = i11;
        this.f55200d = true;
        a(i11);
        if (this.f55200d) {
            arrayList.clear();
            if (this.f55198b == null) {
                this.f55198b = new PathMeasure();
            }
            this.f55198b.setPath(((f) hwViewNew.H.get(this.f55201e)).f55214a, false);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, this.f55198b.getLength());
            this.f55199c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new oa.a(this));
            this.f55199c.addListener(new fw.d(this, 11));
            this.f55199c.setDuration((long) ((this.f55198b.getLength() / this.f55204h) * this.f55205i));
            this.f55199c.setStartDelay(750L);
            this.f55199c.setInterpolator(new LinearInterpolator());
        }
        this.f55199c.start();
    }
}

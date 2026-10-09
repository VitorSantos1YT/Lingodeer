package xs;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.view.animation.LinearInterpolator;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f56215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f56216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PathMeasure f56217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueAnimator f56218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f56221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HwView f56222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f56223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56224j;

    public final void a() {
        this.f56221g.clear();
        this.f56220f = 0;
        this.f56219e = false;
        ValueAnimator valueAnimator = this.f56218d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f56219e) {
            this.f56221g.clear();
            if (this.f56217c == null) {
                this.f56217c = new PathMeasure();
            }
            this.f56217c.setPath(((f) this.f56222h.H.get(this.f56220f)).f56233a, false);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, this.f56217c.getLength());
            this.f56218d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new oa.a(this));
            this.f56218d.addListener(new fw.d(this, 12));
            this.f56218d.setDuration((long) ((this.f56217c.getLength() / this.f56223i) * this.f56224j));
            this.f56218d.setStartDelay(100L);
            this.f56218d.setInterpolator(new LinearInterpolator());
        }
    }
}

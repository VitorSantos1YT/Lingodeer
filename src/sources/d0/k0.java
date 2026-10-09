package d0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22743c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f22744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f22745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f22746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f22747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f22748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f22749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f22750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f22751k;

    public k0(Context context, int i11) {
        this.f22741a = context;
        this.f22742b = i11;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? l.b(edgeEffect) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final EdgeEffect a(f0.h1 h1Var) {
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f22741a;
        EdgeEffect edgeEffectA = i11 >= 31 ? l.a(context) : new p0(context);
        edgeEffectA.setColor(this.f22742b);
        if (!v3.l.a(this.f22743c, 0L)) {
            if (h1Var == f0.h1.Vertical) {
                long j11 = this.f22743c;
                edgeEffectA.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
                return edgeEffectA;
            }
            long j12 = this.f22743c;
            edgeEffectA.setSize((int) (j12 & 4294967295L), (int) (j12 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f22745e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(f0.h1.Vertical);
        this.f22745e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f22746f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(f0.h1.Horizontal);
        this.f22746f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f22747g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(f0.h1.Horizontal);
        this.f22747g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f22744d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(f0.h1.Vertical);
        this.f22744d = edgeEffectA;
        return edgeEffectA;
    }
}

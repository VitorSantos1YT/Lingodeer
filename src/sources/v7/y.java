package v7;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f53705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f53706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f53707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f53709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f53710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f53711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f53712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f53713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f53715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f53716l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f53717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f53718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f53719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f53720q;

    public y(Context context) {
        DisplayManager displayManager;
        e eVar = new e();
        eVar.f53604a = new d();
        eVar.f53605b = new d();
        eVar.f53607d = -9223372036854775807L;
        this.f53705a = eVar;
        w wVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new w(this, displayManager);
        this.f53706b = wVar;
        this.f53707c = wVar != null ? x.f53700e : null;
        this.f53715k = -9223372036854775807L;
        this.f53716l = -9223372036854775807L;
        this.f53710f = -1.0f;
        this.f53713i = 1.0f;
        this.f53714j = 0;
    }

    public static void a(y yVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            yVar.f53715k = refreshRate;
            yVar.f53716l = (refreshRate * 80) / 100;
        } else {
            b7.a.B("Unable to query display refresh rate");
            yVar.f53715k = -9223372036854775807L;
            yVar.f53716l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f53709e) == null || this.f53714j == Integer.MIN_VALUE || this.f53712h == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        this.f53712h = CropImageView.DEFAULT_ASPECT_RATIO;
        a5.d.j(surface, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f5;
        float f11;
        if (Build.VERSION.SDK_INT < 30 || this.f53709e == null) {
            return;
        }
        e eVar = this.f53705a;
        if (!eVar.f53604a.a()) {
            f5 = this.f53710f;
        } else if (eVar.f53604a.a()) {
            d dVar = eVar.f53604a;
            long j11 = dVar.f53600e;
            f5 = (float) (1.0E9d / (j11 != 0 ? dVar.f53601f / j11 : 0L));
        } else {
            f5 = -1.0f;
        }
        float f12 = this.f53711g;
        if (f5 == f12) {
            return;
        }
        if (f5 != -1.0f && f12 != -1.0f) {
            if (eVar.f53604a.a()) {
                if ((eVar.f53604a.a() ? eVar.f53604a.f53601f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f5 - this.f53711g) < f11) {
                return;
            }
        } else if (f5 == -1.0f && eVar.f53608e < 30) {
            return;
        }
        this.f53711g = f5;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void d(boolean z11) {
        Surface surface;
        float f5;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f53709e) == null || this.f53714j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f53708d) {
            float f11 = this.f53711g;
            if (f11 != -1.0f) {
                f5 = f11 * this.f53713i;
            } else {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
        } else {
            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (z11 || this.f53712h != f5) {
            this.f53712h = f5;
            a5.d.j(surface, f5);
        }
    }
}

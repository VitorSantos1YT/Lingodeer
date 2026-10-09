package oa;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f44761a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f44762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f44763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f44764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f44769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f44772l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f44774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f44775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f44776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44780u;

    public c() {
        Paint paint = new Paint();
        this.f44762b = paint;
        Paint paint2 = new Paint();
        this.f44763c = paint2;
        Paint paint3 = new Paint();
        this.f44764d = paint3;
        this.f44765e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f44766f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f44767g = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f44768h = 5.0f;
        this.f44775p = 1.0f;
        this.f44779t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i11) {
        this.f44770j = i11;
        this.f44780u = this.f44769i[i11];
    }
}

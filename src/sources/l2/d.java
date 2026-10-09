package l2;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import g2.y0;
import hh.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f39572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f39573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39574k;

    public d(String str, float f5, float f11, float f12, float f13, long j11, int i11, boolean z11, int i12) {
        str = (i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str;
        long j12 = (i12 & 32) != 0 ? g2.x.f28622i : j11;
        int i13 = (i12 & 64) != 0 ? 5 : i11;
        this.f39564a = str;
        this.f39565b = f5;
        this.f39566c = f11;
        this.f39567d = f12;
        this.f39568e = f13;
        this.f39569f = j12;
        this.f39570g = i13;
        this.f39571h = z11;
        ArrayList arrayList = new ArrayList();
        this.f39572i = arrayList;
        c cVar = new c(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 1023);
        this.f39573j = cVar;
        arrayList.add(cVar);
    }

    public static void a(d dVar, ArrayList arrayList, y0 y0Var) {
        if (dVar.f39574k) {
            v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((c) nv.p.f(1, dVar.f39572i)).f39562j.add(new k0(BuildConfig.VERSION_NAME, arrayList, 0, y0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
    }

    public final e b() {
        if (this.f39574k) {
            v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f39572i;
            if (arrayList.size() <= 1) {
                c cVar = this.f39573j;
                e eVar = new e(this.f39564a, this.f39565b, this.f39566c, this.f39567d, this.f39568e, new g0(cVar.f39553a, cVar.f39554b, cVar.f39555c, cVar.f39556d, cVar.f39557e, cVar.f39558f, cVar.f39559g, cVar.f39560h, cVar.f39561i, cVar.f39562j), this.f39569f, this.f39570g, this.f39571h);
                this.f39574k = true;
                return eVar;
            }
            if (this.f39574k) {
                v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            c cVar2 = (c) p0.f(1, arrayList);
            ((c) nv.p.f(1, arrayList)).f39562j.add(new g0(cVar2.f39553a, cVar2.f39554b, cVar2.f39555c, cVar2.f39556d, cVar2.f39557e, cVar2.f39558f, cVar2.f39559g, cVar2.f39560h, cVar2.f39561i, cVar2.f39562j));
        }
    }
}

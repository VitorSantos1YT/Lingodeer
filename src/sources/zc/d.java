package zc;

import android.view.animation.Interpolator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import ob.u;
import re.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f59095c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f59097e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59093a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59094b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f59096d = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f59098f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f59099g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59100h = -1.0f;

    public d(List list) {
        b aVar;
        if (list.isEmpty()) {
            aVar = new q(17);
        } else {
            aVar = list.size() == 1 ? new vm.a(list) : new c(list);
        }
        this.f59095c = aVar;
    }

    public final void a(a aVar) {
        this.f59093a.add(aVar);
    }

    public final ld.a b() {
        wc.a aVar = wc.d.f54943a;
        return this.f59095c.c();
    }

    public float c() {
        if (this.f59100h == -1.0f) {
            this.f59100h = this.f59095c.f();
        }
        return this.f59100h;
    }

    public final float d() {
        Interpolator interpolator;
        ld.a aVarB = b();
        return (aVarB == null || aVarB.c() || (interpolator = aVarB.f39891d) == null) ? CropImageView.DEFAULT_ASPECT_RATIO : interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f59094b) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        ld.a aVarB = b();
        return aVarB.c() ? CropImageView.DEFAULT_ASPECT_RATIO : (this.f59096d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object f() {
        float fE = e();
        if (this.f59097e == null && this.f59095c.a(fE) && !l()) {
            return this.f59098f;
        }
        ld.a aVarB = b();
        Interpolator interpolator = aVarB.f39892e;
        Interpolator interpolator2 = aVarB.f39893f;
        Object objG = (interpolator == null || interpolator2 == null) ? g(aVarB, d()) : h(aVarB, fE, interpolator.getInterpolation(fE), interpolator2.getInterpolation(fE));
        this.f59098f = objG;
        return objG;
    }

    public abstract Object g(ld.a aVar, float f5);

    public Object h(ld.a aVar, float f5, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        wc.a aVar = wc.d.f54943a;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f59093a;
            if (i11 >= arrayList.size()) {
                wc.a aVar2 = wc.d.f54943a;
                return;
            } else {
                ((a) arrayList.get(i11)).b();
                i11++;
            }
        }
    }

    public void j(float f5) {
        wc.a aVar = wc.d.f54943a;
        b bVar = this.f59095c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f59099g == -1.0f) {
            this.f59099g = bVar.g();
        }
        float f11 = this.f59099g;
        if (f5 < f11) {
            if (f11 == -1.0f) {
                this.f59099g = bVar.g();
            }
            f5 = this.f59099g;
        } else if (f5 > c()) {
            f5 = c();
        }
        if (f5 == this.f59096d) {
            return;
        }
        this.f59096d = f5;
        if (bVar.d(f5)) {
            i();
        }
    }

    public final void k(u uVar) {
        u uVar2 = this.f59097e;
        if (uVar2 != null) {
            uVar2.getClass();
        }
        this.f59097e = uVar;
    }

    public boolean l() {
        return false;
    }
}

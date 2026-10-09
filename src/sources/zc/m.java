package zc;

import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f59122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f59123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f59124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f59125l;
    public u m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f59126n;

    public m(g gVar, g gVar2) {
        super(Collections.EMPTY_LIST);
        this.f59122i = new PointF();
        this.f59123j = new PointF();
        this.f59124k = gVar;
        this.f59125l = gVar2;
        j(this.f59096d);
    }

    @Override // zc.d
    public final Object f() {
        return m();
    }

    @Override // zc.d
    public final /* bridge */ /* synthetic */ Object g(ld.a aVar, float f5) {
        return m();
    }

    @Override // zc.d
    public final void j(float f5) {
        g gVar = this.f59124k;
        gVar.j(f5);
        g gVar2 = this.f59125l;
        gVar2.j(f5);
        this.f59122i.set(((Float) gVar.f()).floatValue(), ((Float) gVar2.f()).floatValue());
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f59093a;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).b();
            i11++;
        }
    }

    public final PointF m() {
        Float f5;
        g gVar;
        ld.a aVarB;
        g gVar2;
        ld.a aVarB2;
        Float f11 = null;
        if (this.m == null || (aVarB2 = (gVar2 = this.f59124k).b()) == null) {
            f5 = null;
        } else {
            Float f12 = aVarB2.f39895h;
            u uVar = this.m;
            float f13 = aVarB2.f39894g;
            f5 = (Float) uVar.u(f13, f12 == null ? f13 : f12.floatValue(), (Float) aVarB2.f39889b, (Float) aVarB2.f39890c, gVar2.d(), gVar2.e(), gVar2.f59096d);
        }
        if (this.f59126n != null && (aVarB = (gVar = this.f59125l).b()) != null) {
            Float f14 = aVarB.f39895h;
            u uVar2 = this.f59126n;
            float f15 = aVarB.f39894g;
            f11 = (Float) uVar2.u(f15, f14 == null ? f15 : f14.floatValue(), (Float) aVarB.f39889b, (Float) aVarB.f39890c, gVar.d(), gVar.e(), gVar.f59096d);
        }
        PointF pointF = this.f59122i;
        PointF pointF2 = this.f59123j;
        if (f5 == null) {
            pointF2.set(pointF.x, CropImageView.DEFAULT_ASPECT_RATIO);
        } else {
            pointF2.set(f5.floatValue(), CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if (f11 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f11.floatValue());
        return pointF2;
    }
}

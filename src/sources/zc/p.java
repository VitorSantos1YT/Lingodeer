package zc;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Collections;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f59144i;

    public p(Object obj, u uVar) {
        super(Collections.EMPTY_LIST);
        k(uVar);
        this.f59144i = obj;
    }

    @Override // zc.d
    public final float c() {
        return 1.0f;
    }

    @Override // zc.d
    public final Object f() {
        u uVar = this.f59097e;
        Object obj = this.f59144i;
        float f5 = this.f59096d;
        return uVar.u(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, obj, obj, f5, f5, f5);
    }

    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        return f();
    }

    @Override // zc.d
    public final void i() {
        if (this.f59097e != null) {
            super.i();
        }
    }

    @Override // zc.d
    public final void j(float f5) {
        this.f59096d = f5;
    }
}

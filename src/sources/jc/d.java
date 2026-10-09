package jc;

import android.graphics.drawable.Drawable;
import gc.o;
import kotlin.NoWhenBranchMatchedException;
import wb.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f36299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.j f36300b;

    public d(j jVar, gc.j jVar2) {
        this.f36299a = jVar;
        this.f36300b = jVar2;
    }

    @Override // jc.f
    public final void a() {
        gc.j jVar = this.f36300b;
        boolean z11 = jVar instanceof o;
        j jVar2 = this.f36299a;
        if (z11) {
            Drawable drawable = ((o) jVar).f29061a;
            jVar2.getClass();
        } else {
            if (!(jVar instanceof gc.e)) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawable2 = ((gc.e) jVar).f28997a;
            jVar2.getClass();
        }
    }
}

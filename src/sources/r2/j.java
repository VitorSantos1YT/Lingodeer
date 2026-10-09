package r2;

import e2.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;
import y2.g2;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f48765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(y yVar, int i11) {
        super(1);
        this.f48764a = i11;
        this.f48765b = yVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        switch (this.f48764a) {
            case 0:
                Object obj2 = (g2) obj;
                if (((q) obj2).f58482a.P) {
                    this.f48765b.f38361a = obj2;
                    z11 = false;
                } else {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 1:
                s2.f fVar = (s2.f) obj;
                y yVar = this.f48765b;
                Object obj3 = yVar.f38361a;
                if (obj3 == null && fVar.S) {
                    yVar.f38361a = fVar;
                } else if (obj3 != null) {
                    fVar.getClass();
                }
                return Boolean.TRUE;
            default:
                this.f48765b.f38361a = (e0) obj;
                return Boolean.TRUE;
        }
    }
}

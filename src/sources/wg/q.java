package wg;

import android.webkit.WebView;
import kotlin.KotlinNothingValueException;
import l1.k1;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.w0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f55159a = x0.b(0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f55160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f55161c;

    public q(b0 b0Var) {
        Boolean bool = Boolean.FALSE;
        this.f55160b = l1.t.B(bool);
        this.f55161c = l1.t.B(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final wy.a a(WebView webView, xy.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i11 = oVar.f55158c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f55158c = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f55156a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.f55158c;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = o0.f50940a;
            sz.c cVar2 = wz.m.f55536a;
            k kVar = new k(this, webView, null, i13);
            oVar.f55158c = 1;
            if (e0.M(cVar2, kVar, oVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }
}

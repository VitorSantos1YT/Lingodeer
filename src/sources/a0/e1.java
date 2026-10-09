package a0;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f68b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(fz.c cVar, int i11) {
        super(1);
        this.f67a = i11;
        this.f68b = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f67a) {
            case 0:
                return new v3.j((((long) ((Number) this.f68b.invoke(Integer.valueOf((int) (((v3.l) obj).f53498a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 1:
                return new v3.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f68b.invoke(Integer.valueOf((int) (((v3.l) obj).f53498a & 4294967295L)))).intValue())));
            case 2:
                return new v3.j((((long) ((Number) this.f68b.invoke(Integer.valueOf((int) (((v3.l) obj).f53498a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 3:
                return new v3.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f68b.invoke(Integer.valueOf((int) (((v3.l) obj).f53498a & 4294967295L)))).intValue())));
            case 4:
                y2.k0 k0Var = (y2.k0) obj;
                this.f68b.invoke(k0Var);
                k0Var.a();
                return qy.b0.f48488a;
            default:
                WebView it = (WebView) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f68b.invoke(it);
                return qy.b0.f48488a;
        }
    }
}

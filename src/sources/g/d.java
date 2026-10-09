package g;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, boolean z11, int i11) {
        super(0);
        this.f28295a = i11;
        this.f28297c = obj;
        this.f28296b = z11;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fz.a, kotlin.jvm.internal.j] */
    @Override // fz.a
    public final Object invoke() {
        switch (this.f28295a) {
            case 0:
                f fVar = (f) this.f28297c;
                fVar.f26172a = this.f28296b;
                ?? r9 = fVar.f26174c;
                if (r9 != 0) {
                    r9.invoke();
                }
                return b0.f48488a;
            case 1:
                ((fz.c) this.f28297c).invoke(Boolean.valueOf(!this.f28296b));
                return b0.f48488a;
            default:
                return Boolean.valueOf(this.f28296b || ((kw.h) this.f28297c).f38868e.l() > 0.5f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z11, kw.h hVar) {
        super(0);
        this.f28295a = 2;
        this.f28296b = z11;
        this.f28297c = hVar;
    }
}

package qh;

import com.lingo.fluent.ui.game.WordGameIndexActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WordGameIndexActivity f47789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(WordGameIndexActivity wordGameIndexActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47787a = i11;
        this.f47789c = wordGameIndexActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47787a) {
            case 0:
                return new v(this.f47789c, dVar, 0);
            case 1:
                return new v(this.f47789c, dVar, 1);
            case 2:
                return new v(this.f47789c, dVar, 2);
            default:
                return new v(this.f47789c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47787a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((v) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r8 == r1) goto L17;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

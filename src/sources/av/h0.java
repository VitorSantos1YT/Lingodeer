package av;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f3146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(File file, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3145a = i11;
        this.f3146b = file;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3145a) {
            case 0:
                return new h0(this.f3146b, dVar, 0);
            default:
                return new h0(this.f3146b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3145a) {
            case 0:
                break;
        }
        return ((h0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f3145a;
        File file = this.f3146b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new BufferedOutputStream(new FileOutputStream(file, false));
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new BufferedOutputStream(new FileOutputStream(file));
        }
    }
}

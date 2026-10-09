package gn;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f29309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f29310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12, e eVar, File file, vy.d dVar) {
        super(2, dVar);
        this.f29308a = i12;
        this.f29309b = file;
        this.f29310c = eVar;
        this.f29311d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29308a) {
            case 0:
                return new b(this.f29311d, 0, this.f29310c, this.f29309b, dVar);
            default:
                return new b(this.f29311d, 1, this.f29310c, this.f29309b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29308a) {
            case 0:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29308a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f29311d;
        String str = BuildConfig.VERSION_NAME;
        File file = this.f29309b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    String parent = file.getParent();
                    if (parent != null) {
                        str = parent;
                    }
                    return Boolean.valueOf(ks.b.o(str, fv.b.D(i12)));
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return b0Var;
                }
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    String parent2 = file.getParent();
                    if (parent2 != null) {
                        str = parent2;
                    }
                    return Boolean.valueOf(ks.b.o(str, fv.b.D(i12)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return b0Var;
                }
        }
    }
}

package gi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f29250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, d dVar, File file, vy.d dVar2) {
        super(2, dVar2);
        this.f29249a = i11;
        this.f29250b = file;
        this.f29251c = dVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29249a) {
            case 0:
                return new b(0, this.f29251c, this.f29250b, dVar);
            default:
                return new b(1, this.f29251c, this.f29250b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29249a) {
            case 0:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29249a;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = BuildConfig.VERSION_NAME;
        File file = this.f29250b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    String parent = file.getParent();
                    if (parent != null) {
                        str = parent;
                    }
                    return Boolean.valueOf(ks.b.o(str, fv.b.D(-1)));
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
                    return Boolean.valueOf(ks.b.o(str, fv.b.D(-1)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return b0Var;
                }
        }
    }
}

package tq;

import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.e;
import java.io.File;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f52515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f52516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12, File file, d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f52514a = i12;
        this.f52515b = file;
        this.f52516c = dVar;
        this.f52517d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52514a) {
            case 0:
                return new b(this.f52517d, 0, this.f52515b, this.f52516c, dVar);
            default:
                return new b(this.f52517d, 1, this.f52515b, this.f52516c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52514a) {
            case 0:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f52514a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f52517d;
        String str = BuildConfig.VERSION_NAME;
        File file = this.f52515b;
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

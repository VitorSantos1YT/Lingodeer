package kr;

import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f38589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(z0 z0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38588a = i11;
        this.f38589b = z0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38588a) {
            case 0:
                return new u0(this.f38589b, dVar, 0);
            default:
                return new u0(this.f38589b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38588a) {
            case 0:
                break;
        }
        return ((u0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        int i11 = this.f38588a;
        z0 z0Var = this.f38589b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new Long(z0Var.f38628b.c());
            default:
                int i12 = z0Var.f38632f;
                vt.n0 n0Var = z0Var.f38627a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    qy.q qVar = fv.b.f28186a;
                    ns.o.s(new File(fv.b.M(i12)));
                    String str = ((fr.o0) n0Var).v() + xt.d.k(((fr.o0) n0Var).f27733a.keyLanguage) + "-story-" + i12 + "-";
                    File file = new File(((fr.o0) n0Var).v());
                    file.getAbsolutePath();
                    if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile()) {
                                String absolutePath = file2.getAbsolutePath();
                                kotlin.jvm.internal.m.e(absolutePath, "getAbsolutePath(...)");
                                if (oz.x.s0(absolutePath, str, false)) {
                                    if (file2.delete()) {
                                        file2.getAbsolutePath();
                                    } else {
                                        file2.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                    return qy.b0.f48488a;
                } catch (Exception e8) {
                    return new Integer(Log.e("StorySpeakingFinishVM", "删除临时文件时出错: " + e8.getMessage()));
                }
        }
    }
}

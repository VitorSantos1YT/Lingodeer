package dv;

import com.lingodeer.network.model.ApiResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h00.s f24444a = ef.e.d(new e(0));

    public static final ApiResponse a(String str) {
        w wVar;
        List list;
        c0 c0Var;
        h00.s sVar = f24444a;
        sVar.getClass();
        f0 f0Var = (f0) sVar.b(f0.Companion.serializer(), str);
        if (f0Var.f24446b == -1) {
            return new ApiResponse.Error(f0Var.f24447c, 0, null, 6, null);
        }
        q qVar = (q) ry.m.s0(((t) sVar.b(t.Companion.serializer(), f0Var.f24445a.f24533a)).f24513a);
        String str2 = (qVar == null || (wVar = qVar.f24501a) == null || (list = wVar.f24529a) == null || (c0Var = (c0) ry.m.s0(list)) == null) ? null : c0Var.f24437a;
        if (str2 == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return new ApiResponse.Success(str2);
    }
}

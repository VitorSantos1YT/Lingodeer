package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import dt.b5;
import j3.x0;
import java.util.List;
import v0.d;
import v0.f;
import y.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final st.a f51978a = new st.a(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bt.a f51979b = new bt.a(5);

    public static final void a(u0.a aVar, Context context, boolean z11, String str, long j11) {
        if (x0.c(j11) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context2 = context;
        List list = (List) f51978a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        e0 e0Var = aVar.f52716a;
        e0 e0Var2 = aVar.f52716a;
        f fVar = f.f53462b;
        e0Var.a(fVar);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i11);
            e0Var2.a(new d(new v0.a(i11), resolveInfo.loadLabel(packageManager).toString(), 0, new b5(context2, resolveInfo, z11, str, j11)));
            i11++;
            context2 = context;
        }
        e0Var2.a(fVar);
    }
}

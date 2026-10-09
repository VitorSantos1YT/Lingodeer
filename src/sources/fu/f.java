package fu;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28089b;

    public /* synthetic */ f(Context context, int i11) {
        this.f28088a = i11;
        this.f28089b = context;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) obj;
        String packageName = (String) obj2;
        String title = (String) obj3;
        switch (this.f28088a) {
            case 0:
                kotlin.jvm.internal.m.f(uri, "uri");
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                ks.b.i(this.f28089b, uri, packageName, title);
                break;
            case 1:
                kotlin.jvm.internal.m.f(uri, "uri");
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                ks.b.i(this.f28089b, uri, packageName, title);
                break;
            default:
                kotlin.jvm.internal.m.f(uri, "uri");
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                ks.b.i(this.f28089b, uri, packageName, title);
                break;
        }
        return qy.b0.f48488a;
    }
}

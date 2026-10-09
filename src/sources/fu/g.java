package fu;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f28094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28095c;

    public /* synthetic */ g(rz.b0 b0Var, Context context, int i11) {
        this.f28093a = i11;
        this.f28094b = b0Var;
        this.f28095c = context;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28093a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                String fileName = (String) obj2;
                kotlin.jvm.internal.m.f(bitmap, "bitmap");
                kotlin.jvm.internal.m.f(fileName, "fileName");
                rz.e0.B(this.f28094b, null, null, new i(this.f28095c, bitmap, fileName, null, 0), 3);
                break;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                String fileName2 = (String) obj2;
                kotlin.jvm.internal.m.f(bitmap2, "bitmap");
                kotlin.jvm.internal.m.f(fileName2, "fileName");
                rz.e0.B(this.f28094b, null, null, new i(this.f28095c, bitmap2, fileName2, null, 1), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}

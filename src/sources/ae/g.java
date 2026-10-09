package ae;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import td.j;
import zd.p;
import zd.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f681d;

    public g(Context context, q qVar, q qVar2, Class cls) {
        this.f678a = context.getApplicationContext();
        this.f679b = qVar;
        this.f680c = qVar2;
        this.f681d = cls;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && ud.a.b((Uri) obj);
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, j jVar) {
        Uri uri = (Uri) obj;
        return new p(new oe.b(uri), new f(this.f678a, this.f679b, this.f680c, uri, i11, i12, jVar, this.f681d));
    }
}

package mb;

import android.content.Context;
import j9.r;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f41116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f41117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f41118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f41119e;

    public i(Context context, qb.a aVar) {
        Context applicationContext = context.getApplicationContext();
        m.e(applicationContext, "context.applicationContext");
        a aVar2 = new a(applicationContext, aVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        m.e(applicationContext2, "context.applicationContext");
        a aVar3 = new a(applicationContext2, aVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        m.e(applicationContext3, "context.applicationContext");
        int i11 = g.f41113a;
        f fVar = new f(applicationContext3, aVar);
        Context applicationContext4 = context.getApplicationContext();
        m.e(applicationContext4, "context.applicationContext");
        a aVar4 = new a(applicationContext4, aVar, 2);
        this.f41115a = context;
        this.f41116b = aVar2;
        this.f41117c = aVar3;
        this.f41118d = fVar;
        this.f41119e = aVar4;
    }
}

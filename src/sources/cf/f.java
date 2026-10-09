package cf;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f6914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f6915c;

    public /* synthetic */ f(v vVar, Context context, int i11) {
        this.f6913a = i11;
        this.f6914b = vVar;
        this.f6915c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6913a) {
            case 0:
                v billingClientVersion = this.f6914b;
                Context context = this.f6915c;
                if (!qf.a.b(g.class)) {
                    try {
                        kotlin.jvm.internal.m.f(billingClientVersion, "$billingClientVersion");
                        kotlin.jvm.internal.m.f(context, "$context");
                        g gVar = g.f6916a;
                        String packageName = context.getPackageName();
                        kotlin.jvm.internal.m.e(packageName, "context.packageName");
                        gVar.a(billingClientVersion, packageName);
                    } catch (Throwable th2) {
                        qf.a.a(g.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                v billingClientVersion2 = this.f6914b;
                Context context2 = this.f6915c;
                if (!qf.a.b(g.class)) {
                    try {
                        kotlin.jvm.internal.m.f(billingClientVersion2, "$billingClientVersion");
                        kotlin.jvm.internal.m.f(context2, "$context");
                        g gVar2 = g.f6916a;
                        String packageName2 = context2.getPackageName();
                        kotlin.jvm.internal.m.e(packageName2, "context.packageName");
                        gVar2.a(billingClientVersion2, packageName2);
                    } catch (Throwable th3) {
                        qf.a.a(g.class, th3);
                    }
                    break;
                }
                break;
        }
    }
}

package gr;

import l1.b1;
import l1.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f29742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f29743b;

    public /* synthetic */ r(b1 b1Var, g1 g1Var) {
        this.f29742a = b1Var;
        this.f29743b = g1Var;
    }

    public final void a(j9.v vVar, j9.q destination) {
        kotlin.jvm.internal.m.f(destination, "destination");
        Boolean bool = Boolean.FALSE;
        b1 b1Var = this.f29742a;
        b1Var.setValue(bool);
        String str = (String) destination.f36242b.f3962e;
        boolean zA = kotlin.jvm.internal.m.a(str, "chooseLanguage");
        g1 g1Var = this.f29743b;
        if (zA) {
            g1Var.m(0.5f);
            b1Var.setValue(bool);
        } else if (kotlin.jvm.internal.m.a(str, "billing")) {
            g1Var.m(1.0f);
            b1Var.setValue(Boolean.TRUE);
        }
    }
}

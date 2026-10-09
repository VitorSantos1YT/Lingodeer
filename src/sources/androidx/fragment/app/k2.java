package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2 f1736c;

    public /* synthetic */ k2(s sVar, m2 m2Var, int i11) {
        this.f1734a = i11;
        this.f1735b = sVar;
        this.f1736c = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1734a) {
            case 0:
                s sVar = this.f1735b;
                ArrayList arrayList = sVar.f1827b;
                m2 m2Var = this.f1736c;
                if (arrayList.contains(m2Var)) {
                    q2 q2Var = m2Var.f1754a;
                    View view = m2Var.f1756c.mView;
                    kotlin.jvm.internal.m.e(view, "operation.fragment.mView");
                    q2Var.a(view, sVar.f1826a);
                }
                break;
            case 1:
                s this$0 = this.f1735b;
                kotlin.jvm.internal.m.f(this$0, "this$0");
                m2 operation = this.f1736c;
                kotlin.jvm.internal.m.f(operation, "$operation");
                this$0.a(operation);
                break;
            default:
                s sVar2 = this.f1735b;
                ArrayList arrayList2 = sVar2.f1827b;
                m2 m2Var2 = this.f1736c;
                arrayList2.remove(m2Var2);
                sVar2.f1828c.remove(m2Var2);
                break;
        }
    }
}

package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1888b;

    public /* synthetic */ z(Object obj, int i11) {
        this.f1887a = i11;
        this.f1888b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1887a) {
            case 0:
                k0 k0Var = (k0) this.f1888b;
                i2 i2Var = k0Var.mViewLifecycleOwner;
                i2Var.f1703f.a(k0Var.mSavedViewRegistryState);
                k0Var.mSavedViewRegistryState = null;
                return;
            case 1:
                kotlin.jvm.internal.y seekCancelLambda = (kotlin.jvm.internal.y) this.f1888b;
                kotlin.jvm.internal.m.f(seekCancelLambda, "$seekCancelLambda");
                fz.a aVar = (fz.a) seekCancelLambda.f38361a;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 2:
                a2.a(4, (ArrayList) this.f1888b);
                return;
            case 3:
                q qVar = (q) this.f1888b;
                ArrayList arrayList = qVar.f1788c;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((r) obj).f1737a.c(qVar);
                }
                return;
            default:
                Iterator it = ((k1) this.f1888b).f1722o.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }
}

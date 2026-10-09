package pp;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f46970b;

    public /* synthetic */ b(e eVar, int i11) {
        this.f46969a = i11;
        this.f46970b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f46969a) {
            case 0:
                ArrayList arrayListH = this.f46970b.h();
                ArrayList arrayList = new ArrayList();
                int size = arrayListH.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListH.get(i11);
                    i11++;
                    if (!new File(((fv.a) obj).f28184c).exists()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                ArrayList arrayListH2 = this.f46970b.h();
                int size2 = arrayListH2.size();
                int i12 = 0;
                while (true) {
                    boolean zO = true;
                    while (i12 < size2) {
                        Object obj2 = arrayListH2.get(i12);
                        i12++;
                        fv.a aVar = (fv.a) obj2;
                        File file = new File(aVar.f28184c);
                        if (file.length() != 0) {
                            String parent = file.getParent();
                            m.e(parent, "getParent(...)");
                            zO = ks.b.o(parent, aVar.f28184c);
                        }
                    }
                    return Boolean.valueOf(zO);
                }
        }
    }
}

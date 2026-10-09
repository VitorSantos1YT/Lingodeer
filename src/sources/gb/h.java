package gb;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28934a = 0;

    static {
        fb.l.c("Schedulers");
    }

    public static void a(ob.s sVar, fb.l lVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            lVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                sVar.p(jCurrentTimeMillis, ((ob.p) obj).f44848a);
            }
        }
    }

    public static void b(fb.c cVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ob.s sVarE = workDatabase.E();
        workDatabase.c();
        try {
            ArrayList arrayListJ = sVarE.j();
            a(sVarE, cVar.f27049d, arrayListJ);
            ArrayList arrayListI = sVarE.i(cVar.f27055j);
            a(sVarE, cVar.f27049d, arrayListI);
            arrayListI.addAll(arrayListJ);
            ArrayList arrayListG = sVarE.g();
            workDatabase.x();
            workDatabase.s();
            if (arrayListI.size() > 0) {
                ob.p[] pVarArr = (ob.p[]) arrayListI.toArray(new ob.p[arrayListI.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.c()) {
                        fVar.b(pVarArr);
                    }
                }
            }
            if (arrayListG.size() > 0) {
                ob.p[] pVarArr2 = (ob.p[]) arrayListG.toArray(new ob.p[arrayListG.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    if (!fVar2.c()) {
                        fVar2.b(pVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.s();
            throw th2;
        }
    }
}

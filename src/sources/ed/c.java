package ed;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import fb.l;
import gp.r;
import java.util.ArrayList;
import java.util.List;
import kb.j;
import ob.p;
import ry.m;
import ry.n;
import uz.i;
import uz.x0;
import zc.h;
import zc.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25470a;

    public c(int i11) {
        switch (i11) {
            case 2:
                this.f25470a = new ArrayList(20);
                break;
            default:
                this.f25470a = new ArrayList();
                break;
        }
    }

    @Override // ed.f
    public zc.d I() {
        ArrayList arrayList = this.f25470a;
        return ((ld.a) arrayList.get(0)).c() ? new h(1, arrayList) : new k(arrayList);
    }

    @Override // ed.f
    public List O() {
        return this.f25470a;
    }

    @Override // ed.f
    public boolean R() {
        ArrayList arrayList = this.f25470a;
        return arrayList.size() == 1 && ((ld.a) arrayList.get(0)).c();
    }

    public boolean a(p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f25470a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            if (((lb.d) obj).b(pVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            l lVarB = l.b();
            int i12 = kb.k.f38047a;
            m.y0(arrayList, null, null, null, j.f38046a, 31);
            lVarB.getClass();
        }
        return arrayList.isEmpty();
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f25470a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            he.c cVar = (he.c) obj;
            if ((cVar.f32189a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f32190b)) && !arrayList.contains(cVar.f32190b)) {
                arrayList.add(cVar.f32190b);
            }
        }
        return arrayList;
    }

    public i c(p spec) {
        kotlin.jvm.internal.m.f(spec, "spec");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f25470a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            if (((lb.d) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(n.W(arrayList, 10));
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList3.add(((lb.d) obj2).a(spec.f44857j));
        }
        return x0.o(new r((i[]) m.a1(arrayList3).toArray(new i[0]), 2));
    }

    public c(ArrayList arrayList) {
        this.f25470a = arrayList;
    }

    public c(mb.i trackers) {
        kb.f fVar;
        kotlin.jvm.internal.m.f(trackers, "trackers");
        lb.c cVar = new lb.c(trackers.f41116b, 0);
        lb.c cVar2 = new lb.c(trackers.f41117c);
        lb.c cVar3 = new lb.c(trackers.f41119e, 4);
        j9.r rVar = trackers.f41118d;
        lb.c cVar4 = new lb.c(rVar, 2);
        lb.c cVar5 = new lb.c(rVar, 3);
        lb.f fVar2 = new lb.f(rVar);
        lb.e eVar = new lb.e(rVar);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = trackers.f41115a;
            int i11 = kb.k.f38047a;
            kotlin.jvm.internal.m.f(context, "context");
            Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            fVar = new kb.f((ConnectivityManager) systemService);
        } else {
            fVar = null;
        }
        this.f25470a = ry.l.T(new lb.d[]{cVar, cVar2, cVar3, cVar4, cVar5, fVar2, eVar, fVar});
    }
}

package t00;

import com.android.billingclient.api.m;
import defpackage.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nv.p;
import w00.b;
import z00.a0;
import z00.t;
import z00.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d10.a {
    @Override // d10.a
    public final int a(b bVar, b bVar2) {
        String strM;
        ArrayList arrayList = bVar.f54369a;
        int size = arrayList.size();
        ArrayList arrayList2 = bVar2.f54369a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        a0 a0Var = (a0) p.f(1, arrayList);
        if (arrayList.size() == 1) {
            strM = a0Var.f58420g;
        } else {
            String str = a0Var.f58420g;
            strM = e.m(str, str);
        }
        s00.a aVar = new s00.a();
        aVar.f51277g = strM;
        m mVar = new m();
        mVar.g(bVar.b(arrayList.size()));
        u uVar = new u(a0Var.f58447e, (a0) arrayList2.get(0));
        while (uVar.hasNext()) {
            t tVar = (t) uVar.next();
            aVar.c(tVar);
            mVar.f(tVar.d());
        }
        mVar.g(bVar2.a(arrayList2.size()));
        List list = mVar.f7554a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        aVar.g(list);
        a0Var.e(aVar);
        return arrayList.size();
    }

    @Override // d10.a
    public final char b() {
        return '~';
    }

    @Override // d10.a
    public final int c() {
        return 1;
    }

    @Override // d10.a
    public final char d() {
        return '~';
    }
}

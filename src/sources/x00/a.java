package x00;

import com.android.billingclient.api.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z00.a0;
import z00.t;
import z00.u;
import z00.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f55622a;

    public a(char c11) {
        this.f55622a = c11;
    }

    @Override // d10.a
    public final int a(w00.b bVar, w00.b bVar2) {
        t tVar;
        ArrayList arrayList = bVar.f54369a;
        ArrayList arrayList2 = bVar2.f54369a;
        if (bVar.f54373e || bVar2.f54372d) {
            int i11 = bVar2.f54371c;
            if (i11 % 3 != 0 && (bVar.f54371c + i11) % 3 == 0) {
                return 0;
            }
        }
        int size = arrayList.size();
        char c11 = this.f55622a;
        int i12 = 2;
        if (size < 2 || arrayList2.size() < 2) {
            String strValueOf = String.valueOf(c11);
            z00.h hVar = new z00.h();
            hVar.f58425g = strValueOf;
            i12 = 1;
            tVar = hVar;
        } else {
            String str = String.valueOf(c11) + c11;
            z zVar = new z();
            zVar.f58457g = str;
            tVar = zVar;
        }
        m mVar = new m();
        mVar.g(bVar.b(i12));
        a0 a0Var = (a0) arrayList.get(arrayList.size() - 1);
        u uVar = new u(a0Var.f58447e, (a0) arrayList2.get(0));
        while (uVar.hasNext()) {
            t tVar2 = (t) uVar.next();
            tVar.c(tVar2);
            mVar.f(tVar2.d());
        }
        mVar.g(bVar2.a(i12));
        List list = mVar.f7554a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        tVar.g(list);
        a0Var.e(tVar);
        return i12;
    }

    @Override // d10.a
    public final char b() {
        return this.f55622a;
    }

    @Override // d10.a
    public final int c() {
        return 1;
    }

    @Override // d10.a
    public final char d() {
        return this.f55622a;
    }
}

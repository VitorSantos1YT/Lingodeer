package ga;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.android.billingclient.api.h;
import fr.n2;
import g00.d1;
import ha.j;
import ha.k;
import ha.l;
import java.util.HashMap;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28883a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        j jVar = j.f32143a;
        kotlin.jvm.internal.e eVarA = z.a(Bundle.class);
        j00.a aVar = new j00.a(jVar);
        j00.c cVar = (j00.c) map.get(eVarA);
        if (cVar != null && !cVar.equals(aVar)) {
            throw new j00.d("Contextual serializer or serializer provider for " + eVarA + " already registered in this module", 0);
        }
        map.put(eVarA, aVar);
        h hVar = new h(map, map2, map3, map4, map5, d1.i(eVarA));
        h hVar2 = new h(4);
        h.k(hVar2, z.a(Size.class), new j00.a(l.f32147a));
        h.k(hVar2, z.a(SizeF.class), new j00.a(k.f32145a));
        hVar2.c(z.a(SparseArray.class), new n2(18));
        h hVarF = hVar2.f();
        h hVar3 = j00.f.f35451a;
        h hVar4 = new h(4);
        hVar.h(hVar4);
        hVarF.h(hVar4);
        f28883a = hVar4.f();
    }
}

package e6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f25068g = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f25070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f25073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f25074f;

    public w0(Context context, LinkedHashMap linkedHashMap, int i11, int i12, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f25069a = context;
        this.f25070b = linkedHashMap;
        this.f25071c = i11;
        this.f25072d = i12;
        this.f25073e = linkedHashSet;
        this.f25074f = set;
    }

    public final int a(c6.i iVar) {
        g6.j jVarK = ef.e.k(iVar);
        synchronized (this) {
            Integer num = (Integer) this.f25070b.get(jVarK);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f25073e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i11 = this.f25071c;
            while (this.f25074f.contains(Integer.valueOf(i11))) {
                i11 = (i11 + 1) % a1.f24879c;
                if (i11 == this.f25071c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f25071c = (i11 + 1) % a1.f24879c;
            this.f25073e.add(Integer.valueOf(i11));
            this.f25074f.add(Integer.valueOf(i11));
            this.f25070b.put(jVarK, Integer.valueOf(i11));
            return i11;
        }
    }

    public final Object b(h hVar) {
        Object objD = n6.f.f43456a.d(this.f25069a, d1.f24889a, nv.p.j(this.f25072d, "appWidgetLayout-"), new av.f0(this, null, 19), hVar);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
    }
}

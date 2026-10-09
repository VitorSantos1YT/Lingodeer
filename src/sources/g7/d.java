package g7;

import b7.k;
import b7.w;
import java.util.HashMap;
import p7.b0;
import re.e0;
import u8.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k, b7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f28795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28797c;

    public /* synthetic */ d(a aVar, int i11, long j11, long j12) {
        this.f28797c = aVar;
        this.f28796b = i11;
        this.f28795a = j11;
    }

    @Override // b7.g
    public void accept(Object obj) {
        l lVar = (l) this.f28797c;
        u8.a aVar = (u8.a) obj;
        b7.a.k(lVar.f52850h);
        byte[] bArrD = e0.d(aVar.f52818a, aVar.f52820c);
        w wVar = lVar.f52845c;
        wVar.getClass();
        wVar.G(bArrD, bArrD.length);
        lVar.f52843a.a(wVar, bArrD.length, 0);
        long j11 = aVar.f52819b;
        long j12 = this.f28795a;
        if (j11 == -9223372036854775807L) {
            b7.a.j(lVar.f52850h.f57296s == Long.MAX_VALUE);
        } else {
            long j13 = lVar.f52850h.f57296s;
            j12 = j13 == Long.MAX_VALUE ? j12 + j11 : j11 + j13;
        }
        lVar.f52843a.d(j12, this.f28796b | 1, bArrD.length, 0, null);
    }

    @Override // b7.k
    public void invoke(Object obj) {
        a aVar = (a) this.f28797c;
        i iVar = (i) ((b) obj);
        HashMap map = iVar.f28834h;
        HashMap map2 = iVar.f28835i;
        b0 b0Var = aVar.f28787d;
        if (b0Var != null) {
            String strC = iVar.f28829c.c(aVar.f28785b, b0Var);
            Long l9 = (Long) map2.get(strC);
            Long l11 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l9 == null ? 0L : l9.longValue()) + this.f28795a));
            map.put(strC, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) this.f28796b)));
        }
    }

    public /* synthetic */ d(l lVar, long j11, int i11) {
        this.f28797c = lVar;
        this.f28795a = j11;
        this.f28796b = i11;
    }
}

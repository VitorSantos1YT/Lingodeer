package i7;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.android.billingclient.api.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import re.g0;
import s7.s;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.o f34224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.i f34225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f34226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d7.f f34228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f34231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i[] f34232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f34233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j7.c f34234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34235l;
    public BehindLiveWindowException m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34236n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i7.k, java.lang.Object] */
    public k(k0 k0Var, t7.o oVar, j7.c cVar, ob.i iVar, int i11, int[] iArr, s sVar, int i12, d7.f fVar, long j11, int i13, boolean z11, ArrayList arrayList, n nVar) {
        x7.m gVar;
        q7.c cVar2;
        ?? obj = new Object();
        obj.f34224a = oVar;
        obj.f34234k = cVar;
        obj.f34225b = iVar;
        obj.f34226c = iArr;
        obj.f34233j = sVar;
        obj.f34227d = i12;
        obj.f34228e = fVar;
        obj.f34235l = i11;
        obj.f34229f = j11;
        obj.f34230g = i13;
        obj.f34231h = nVar;
        long jC = cVar.c(i11);
        ArrayList arrayListA = obj.a();
        obj.f34232i = new i[sVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f34232i.length) {
            j7.m mVar = (j7.m) arrayListA.get(sVar.h(i15));
            j7.b bVarV = iVar.v(mVar.f36145b);
            i[] iVarArr = kVar.f34232i;
            int i16 = i15;
            bVarV = bVarV == null ? (j7.b) mVar.f36145b.get(i14) : bVarV;
            p pVar = mVar.f36144a;
            k0Var.getClass();
            String str = pVar.m;
            if (d0.m(str)) {
                if (k0Var.f7546a) {
                    gVar = new u8.g(((g0) k0Var.f7547b).h(pVar), pVar);
                } else {
                    cVar2 = null;
                    arrayListA = arrayListA;
                    i16 = i16;
                }
                q7.c cVar3 = cVar2;
                int i17 = i16;
                iVarArr[i17] = new i(jC, mVar, bVarV, cVar3, 0L, mVar.c());
                i15 = i17 + 1;
                kVar = this;
                arrayListA = arrayListA;
                i14 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    arrayListA = arrayListA;
                    gVar = new p8.d((g0) k0Var.f7547b, k0Var.f7546a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    gVar = new b8.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    gVar = new b8.a(1, (byte) 0);
                } else {
                    arrayListA = arrayListA;
                    int i18 = z11 ? 4 : 0;
                    gVar = new r8.g((g0) k0Var.f7547b, k0Var.f7546a ? i18 : i18 | 32, arrayList, nVar);
                }
                cVar2 = new q7.c(gVar, i12, pVar);
                q7.c cVar4 = cVar2;
                int i19 = i16;
                iVarArr[i19] = new i(jC, mVar, bVarV, cVar4, 0L, mVar.c());
                i15 = i19 + 1;
                kVar = this;
                arrayListA = arrayListA;
                i14 = 0;
            }
            cVar2 = new q7.c(gVar, i12, pVar);
            q7.c cVar5 = cVar2;
            int i110 = i16;
            iVarArr[i110] = new i(jC, mVar, bVarV, cVar5, 0L, mVar.c());
            i15 = i110 + 1;
            kVar = this;
            arrayListA = arrayListA;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f34234k.a(this.f34235l).f36133c;
        ArrayList arrayList = new ArrayList();
        for (int i11 : this.f34226c) {
            arrayList.addAll(((j7.a) list.get(i11)).f36090c);
        }
        return arrayList;
    }

    public final i b(int i11) {
        i[] iVarArr = this.f34232i;
        i iVar = iVarArr[i11];
        j7.b bVarV = this.f34225b.v(iVar.f34215b.f36145b);
        if (bVarV == null || bVarV.equals(iVar.f34216c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.f34218e, iVar.f34215b, bVarV, iVar.f34214a, iVar.f34219f, iVar.f34217d);
        iVarArr[i11] = iVar2;
        return iVar2;
    }
}

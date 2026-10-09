package en;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import dt.g;
import ei.t;
import ei.u;
import ei.v;
import ei.w;
import ei.x;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f25693a = new t1.d(new g(3), false, 1225932042);

    public static final void a(int i11, dn.d dVar, fz.a aVar, fz.c cVar, fz.c cVar2, fz.f fVar, Integer num, Integer num2, Integer num3, Integer num4, n nVar, r rVar) {
        s sVar;
        fz.a aVar2;
        s sVar2 = (s) nVar;
        sVar2.f0(799190974);
        int i12 = i11 | (sVar2.f(dVar) ? 4 : 2) | (sVar2.h(fVar) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024) | (sVar2.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 196608 | (sVar2.f(num) ? 1048576 : 524288) | (sVar2.f(num2) ? 8388608 : 4194304) | (sVar2.f(num3) ? 67108864 : 33554432) | (sVar2.f(num4) ? 536870912 : 268435456);
        if (sVar2.T(i12 & 1, (306783379 & i12) != 306783378)) {
            Object objQ = sVar2.Q();
            l1.g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = new ju.d(25);
                sVar2.o0(objQ);
            }
            fz.a aVar3 = (fz.a) objQ;
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            ms.a aVar4 = new ms.a(120, 60, 40, 30, 240);
            int iF = dVar.f();
            int iA = dVar.a();
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ2 = sVar2.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new u(dVar, 1);
                sVar2.o0(objQ2);
            }
            fz.e eVar = (fz.e) objQ2;
            boolean z12 = i13 == 4;
            Object objQ3 = sVar2.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new v(dVar, 2);
                sVar2.o0(objQ3);
            }
            fz.c cVar3 = (fz.c) objQ3;
            boolean z13 = i13 == 4;
            Object objQ4 = sVar2.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new v(dVar, 3);
                sVar2.o0(objQ4);
            }
            fz.c cVar4 = (fz.c) objQ4;
            boolean zH = (i13 == 4) | sVar2.h(context);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new w(dVar, context, 1);
                sVar2.o0(objQ5);
            }
            fz.a aVar5 = (fz.a) objQ5;
            boolean z14 = (i12 & 896) == 256;
            Object objQ6 = sVar2.Q();
            if (z14 || objQ6 == gVar) {
                objQ6 = new x(fVar, 1);
                sVar2.o0(objQ6);
            }
            sVar = sVar2;
            ls.f.a(iF, iA, aVar4, eVar, cVar3, cVar4, aVar5, (fz.f) objQ6, cVar, cVar2, aVar3, num, num2, num3, num4, rVar, sVar, (i12 << 15) & 2113929216, ((i12 >> 15) & 65534) | 196608);
            aVar2 = aVar3;
        } else {
            sVar = sVar2;
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(dVar, rVar, fVar, cVar, cVar2, aVar2, num, num2, num3, num4, i11, 1);
        }
    }
}

package au;

import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f3036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3037b = new c(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3038c = new c(7);

    public k0(w9.s sVar) {
        this.f3036a = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(k0 k0Var, ArrayList arrayList, xy.c cVar) {
        g0 g0Var;
        Iterator it;
        int i11;
        Object obj;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i12 = g0Var.f3001f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                g0Var.f3001f = i12 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(k0Var, cVar);
            }
        } else {
            g0Var = new g0(k0Var, cVar);
        }
        Object obj2 = g0Var.f2999d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = g0Var.f3001f;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj2);
            it = arrayList.iterator();
            i11 = 0;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = g0Var.f2998c;
            Iterator it2 = g0Var.f2997b;
            k0 k0Var2 = g0Var.f2996a;
            com.bumptech.glide.e.F(obj2);
            it = it2;
            i11 = i14;
            k0Var = k0Var2;
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = qy.b0.f48488a;
            if (!zHasNext) {
                return obj;
            }
            DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity = (DailyLearnTimeHistoryEntity) it.next();
            String id2 = dailyLearnTimeHistoryEntity.getId();
            int pendingSeconds = dailyLearnTimeHistoryEntity.getPendingSeconds();
            g0Var.f2996a = k0Var;
            g0Var.f2997b = it;
            g0Var.f2998c = i11;
            g0Var.f3001f = 1;
            Object objC = cf.x.C(g0Var, k0Var.f3036a, false, true, new l(pendingSeconds, 3, id2));
            if (objC == wy.a.COROUTINE_SUSPENDED) {
                obj = objC;
            }
        } while (obj != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(k0 k0Var, String str, int i11, xy.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i12 = h0Var.f3010f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                h0Var.f3010f = i12 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(k0Var, cVar);
            }
        } else {
            h0Var = new h0(k0Var, cVar);
        }
        Object obj = h0Var.f3008d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = h0Var.f3010f;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity = new DailyLearnTimeHistoryEntity(str, 0, 0, 0);
            h0Var.f3005a = k0Var;
            h0Var.f3006b = str;
            h0Var.f3007c = i11;
            h0Var.f3010f = 1;
            if (cf.x.C(h0Var, k0Var.f3036a, false, true, new b(9, k0Var, dailyLearnTimeHistoryEntity)) != aVar) {
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        i11 = h0Var.f3007c;
        str = h0Var.f3006b;
        k0Var = h0Var.f3005a;
        com.bumptech.glide.e.F(obj);
        h0Var.f3005a = null;
        h0Var.f3006b = null;
        h0Var.f3007c = i11;
        h0Var.f3010f = 2;
        Object objC = cf.x.C(h0Var, k0Var.f3036a, false, true, new l(i11, 4, str));
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? aVar : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ce -> B:17:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object c(au.k0 r17, java.util.ArrayList r18, xy.c r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au.k0.c(au.k0, java.util.ArrayList, xy.c):java.lang.Object");
    }
}

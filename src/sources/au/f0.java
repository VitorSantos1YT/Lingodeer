package au;

import com.lingodeer.database.model.DailyLearnHistoryEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f2988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2989b = new c(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2990c = new c(5);

    public f0(w9.s sVar) {
        this.f2988a = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(f0 f0Var, ArrayList arrayList, xy.c cVar) {
        z zVar;
        Iterator it;
        int i11;
        Object obj;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i12 = zVar.f3102f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zVar.f3102f = i12 - Integer.MIN_VALUE;
            } else {
                zVar = new z(f0Var, cVar);
            }
        } else {
            zVar = new z(f0Var, cVar);
        }
        Object obj2 = zVar.f3100d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = zVar.f3102f;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj2);
            it = arrayList.iterator();
            i11 = 0;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = zVar.f3099c;
            Iterator it2 = zVar.f3098b;
            f0 f0Var2 = zVar.f3097a;
            com.bumptech.glide.e.F(obj2);
            it = it2;
            i11 = i14;
            f0Var = f0Var2;
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = qy.b0.f48488a;
            if (!zHasNext) {
                return obj;
            }
            DailyLearnHistoryEntity dailyLearnHistoryEntity = (DailyLearnHistoryEntity) it.next();
            String id2 = dailyLearnHistoryEntity.getId();
            int pendingAmount = dailyLearnHistoryEntity.getPendingAmount();
            zVar.f3097a = f0Var;
            zVar.f3098b = it;
            zVar.f3099c = i11;
            zVar.f3102f = 1;
            Object objC = cf.x.C(zVar, f0Var.f2988a, false, true, new l(pendingAmount, 1, id2));
            if (objC == wy.a.COROUTINE_SUSPENDED) {
                obj = objC;
            }
        } while (obj != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(f0 f0Var, String str, int i11, xy.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i12 = a0Var.f2936f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                a0Var.f2936f = i12 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(f0Var, cVar);
            }
        } else {
            a0Var = new a0(f0Var, cVar);
        }
        Object obj = a0Var.f2934d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = a0Var.f2936f;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            DailyLearnHistoryEntity dailyLearnHistoryEntity = new DailyLearnHistoryEntity(str, 0, 0, 0);
            a0Var.f2931a = f0Var;
            a0Var.f2932b = str;
            a0Var.f2933c = i11;
            a0Var.f2936f = 1;
            if (cf.x.C(a0Var, f0Var.f2988a, false, true, new b(7, f0Var, dailyLearnHistoryEntity)) != aVar) {
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        i11 = a0Var.f2933c;
        str = a0Var.f2932b;
        f0Var = a0Var.f2931a;
        com.bumptech.glide.e.F(obj);
        a0Var.f2931a = null;
        a0Var.f2932b = null;
        a0Var.f2933c = i11;
        a0Var.f2936f = 2;
        Object objC = cf.x.C(a0Var, f0Var.f2988a, false, true, new l(i11, 2, str));
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? aVar : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cd -> B:17:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object c(au.f0 r17, java.util.ArrayList r18, xy.c r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au.f0.c(au.f0, java.util.ArrayList, xy.c):java.lang.Object");
    }
}

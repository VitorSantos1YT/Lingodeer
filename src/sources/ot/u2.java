package ot;

import com.lingodeer.data.model.CourseUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f46014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f46015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f46016c;

    public u2(i0 i0Var, vt.n0 n0Var, wt.m mVar) {
        this.f46014a = mVar;
        this.f46015b = n0Var;
        this.f46016c = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(u2 u2Var, CourseUnit courseUnit, ArrayList arrayList, xy.c cVar) {
        s2 s2Var;
        u2Var.getClass();
        if (cVar instanceof s2) {
            s2Var = (s2) cVar;
            int i11 = s2Var.f45991c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                s2Var.f45991c = i11 - Integer.MIN_VALUE;
            } else {
                s2Var = new s2(u2Var, cVar);
            }
        } else {
            s2Var = new s2(u2Var, cVar);
        }
        Object objB = s2Var.f45989a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = s2Var.f45991c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objB);
            if (!arrayList.isEmpty()) {
                s2Var.f45991c = 1;
                objB = u2Var.b(courseUnit, arrayList, s2Var);
                if (objB == obj) {
                    return obj;
                }
            }
            return ps.f.f47133a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(objB);
        List list = (List) objB;
        if (!list.isEmpty()) {
            int size = list.size();
            int i13 = 0;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (new File(((fv.a) it.next()).f28184c).exists() && (i13 = i13 + 1) < 0) {
                        ns.o.U();
                        throw null;
                    }
                }
            }
            if (i13 != 0) {
                return i13 == size ? ps.d.f47131a : new ps.g(i13 / size);
            }
        }
        return ps.f.f47133a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b7 -> B:21:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(com.lingodeer.data.model.CourseUnit r20, java.util.List r21, xy.c r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.u2.b(com.lingodeer.data.model.CourseUnit, java.util.List, xy.c):java.io.Serializable");
    }
}

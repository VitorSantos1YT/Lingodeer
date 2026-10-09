package n3;

import java.util.List;
import l1.b3;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f43138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f43139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f43140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43141e = true;

    public c(List list, Object obj, d0 d0Var, xq.c cVar, fz.c cVar2, hq.a aVar) {
        this.f43137a = list;
        this.f43138b = d0Var;
        this.f43139c = cVar2;
        this.f43140d = l1.t.B(obj);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0033, B:34:0x0098, B:21:0x004a, B:23:0x004f, B:27:0x0075, B:32:0x008e), top: B:39:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0098 -> B:35:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(xy.c r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.c.b(xy.c):java.lang.Object");
    }

    @Override // l1.b3
    public final Object getValue() {
        return this.f43140d.getValue();
    }
}

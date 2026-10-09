package dr;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.w;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {
    public w H;
    public long K;
    public long L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final /* synthetic */ k S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f23553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Instant f23555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f23556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f23557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23558f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f23559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, vy.d dVar) {
        super(2, dVar);
        this.S = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j(this.S, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x031c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0326 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0327 A[Catch: Exception -> 0x036b, TryCatch #1 {Exception -> 0x036b, blocks: (B:101:0x0320, B:109:0x0347, B:104:0x0327, B:106:0x032f, B:108:0x033b), top: B:143:0x0320 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0433  */
    /* JADX WARN: Code duplicated, block: B:128:0x048e  */
    /* JADX WARN: Code duplicated, block: B:145:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0204  */
    /* JADX WARN: Code duplicated, block: B:71:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:78:0x024f  */
    /* JADX WARN: Code duplicated, block: B:83:0x026b  */
    /* JADX WARN: Code duplicated, block: B:85:0x029c  */
    /* JADX WARN: Code duplicated, block: B:86:0x029f  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x048e -> B:13:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

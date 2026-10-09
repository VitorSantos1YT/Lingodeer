package x00;

import z00.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements b10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.f f55631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.f f55632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.f f55633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.f f55634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a5.f f55635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a5.f f55636f;

    static {
        hd.d dVarD = a5.f.d();
        dVarD.x('A', 'Z');
        dVarD.x('a', 'z');
        a5.f fVar = new a5.f(dVarD);
        f55631a = fVar;
        f55632b = fVar;
        hd.d dVarN = fVar.n();
        dVarN.x('0', '9');
        dVarN.n('-');
        f55633c = new a5.f(dVarN);
        hd.d dVarN2 = fVar.n();
        dVarN2.n('_');
        dVarN2.n(':');
        a5.f fVar2 = new a5.f(dVarN2);
        f55634d = fVar2;
        hd.d dVarN3 = fVar2.n();
        dVarN3.x('0', '9');
        dVarN3.n('.');
        dVarN3.n('-');
        f55635e = new a5.f(dVarN3);
        hd.d dVarD2 = a5.f.d();
        dVarD2.n(' ');
        dVarD2.n('\t');
        dVarD2.n('\n');
        dVarD2.n((char) 11);
        dVarD2.n('\f');
        dVarD2.n('\r');
        dVarD2.n('\"');
        dVarD2.n('\'');
        dVarD2.n('=');
        dVarD2.n('<');
        dVarD2.n('>');
        dVarD2.n('`');
        f55636f = new a5.f(dVarD2);
    }

    public static qh.d b(a9.e eVar, b10.b bVar) {
        String strE = bVar.e(eVar, bVar.o()).e();
        m mVar = new m();
        mVar.f58434g = strE;
        return new qh.d(10, mVar, bVar.o());
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0090 A[EDGE_INSN: B:124:0x0090->B:35:0x0090 BREAK  A[LOOP:1: B:30:0x007c->B:40:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[LOOP:1: B:30:0x007c->B:40:0x009a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0097 -> B:6:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // b10.a
    public final qh.d a(w00.k r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x00.h.a(w00.k):qh.d");
    }
}

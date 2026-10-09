package oz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f46154d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f46157c;

    static {
        e eVar = e.f46151a;
        f fVar = f.f46152b;
        f46154d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z11, e bytes, f number) {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        kotlin.jvm.internal.m.f(number, "number");
        this.f46155a = z11;
        this.f46156b = bytes;
        this.f46157c = number;
    }

    public final String toString() {
        StringBuilder sbN = ep.a.n("HexFormat(\n    upperCase = ");
        sbN.append(this.f46155a);
        sbN.append(",\n    bytes = BytesHexFormat(\n");
        this.f46156b.a(sbN, "        ");
        sbN.append('\n');
        sbN.append("    ),");
        sbN.append('\n');
        sbN.append("    number = NumberHexFormat(");
        sbN.append('\n');
        this.f46157c.a(sbN, "        ");
        sbN.append('\n');
        sbN.append("    )");
        sbN.append('\n');
        sbN.append(")");
        return sbN.toString();
    }
}

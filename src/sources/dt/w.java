package dt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f24297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f24298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(l1.b1 b1Var, List list, kotlin.jvm.internal.w wVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f24294a = i11;
        this.f24296c = b1Var;
        this.f24297d = list;
        this.f24298e = wVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f24294a) {
            case 0:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 0);
            case 1:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 1);
            case 2:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 2);
            case 3:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 3);
            case 4:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 4);
            case 5:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 5);
            case 6:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 6);
            case 7:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 7);
            case 8:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 8);
            default:
                return new w(this.f24296c, this.f24297d, this.f24298e, dVar, 9);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f24294a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return ((w) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0282 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:142:0x0297  */
    /* JADX WARN: Code duplicated, block: B:143:0x029f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01fa -> B:112:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x023d -> B:126:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0025 -> B:14:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0280 -> B:140:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0068 -> B:28:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ab -> B:42:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00ee -> B:56:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0131 -> B:70:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0174 -> B:84:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b7 -> B:98:0x01ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:130:0x0260
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

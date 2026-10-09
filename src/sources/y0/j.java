package y0;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.y;
import rz.b0;
import rz.t;
import zr.q;
import zu.s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f56803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f56804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f56801a = i11;
        this.f56804d = obj;
        this.f56805e = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f56801a) {
            case 0:
                return new j(0, (k) this.f56804d, (z0.e) this.f56805e, dVar);
            case 1:
                return new j(1, (y) this.f56804d, (y9.j) this.f56805e, dVar);
            case 2:
                j jVar = new j((t) this.f56804d, (fz.e) this.f56805e, dVar);
                jVar.f56803c = obj;
                return jVar;
            case 3:
                return new j(3, (String) this.f56804d, (yn.a) this.f56805e, dVar);
            case 4:
                return new j((tz.h) this.f56805e, dVar, 4);
            case 5:
                j jVar2 = new j(5, (za.b) this.f56804d, (Activity) this.f56805e, dVar);
                jVar2.f56803c = obj;
                return jVar2;
            case 6:
                j jVar3 = new j((q) this.f56805e, dVar, 6);
                jVar3.f56804d = obj;
                return jVar3;
            case 7:
                return new j(7, (String) this.f56804d, (Context) this.f56805e, dVar);
            default:
                j jVar4 = new j((s2) this.f56805e, dVar, 8);
                jVar4.f56804d = obj;
                return jVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56801a) {
            case 0:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((j) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x018f */
    /* JADX WARN: Code duplicated, block: B:180:0x0342  */
    /* JADX WARN: Code duplicated, block: B:192:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bc A[Catch: all -> 0x018f, TryCatch #6 {, blocks: (B:70:0x018b, B:81:0x01b4, B:83:0x01bc, B:84:0x01c9, B:91:0x01d9, B:78:0x01a7, B:93:0x01dc, B:95:0x01e1, B:96:0x01e2, B:77:0x01a1, B:85:0x01ca, B:87:0x01d0), top: B:203:0x017f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0 A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:85:0x01ca, B:87:0x01d0), top: B:192:0x01ca, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01dc A[Catch: all -> 0x018f, TryCatch #6 {, blocks: (B:70:0x018b, B:81:0x01b4, B:83:0x01bc, B:84:0x01c9, B:91:0x01d9, B:78:0x01a7, B:93:0x01dc, B:95:0x01e1, B:96:0x01e2, B:77:0x01a1, B:85:0x01ca, B:87:0x01d0), top: B:203:0x017f, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:87:0x01d0, B:90:0x01d8], limit reached: 203 */
    /* JADX WARN: Type inference failed for: r2v3, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3, types: [tz.v] */
    /* JADX WARN: Type inference failed for: r3v5, types: [tz.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [tz.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01b1 -> B:81:0x01b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f56801a = i11;
        this.f56805e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(t tVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f56801a = 2;
        this.f56804d = tVar;
        this.f56805e = (xy.i) eVar;
    }
}

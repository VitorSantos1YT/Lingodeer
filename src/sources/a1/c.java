package a1;

import ie.o;
import nz.m;
import o0.t;
import qy.b0;
import rz.q1;
import s0.a1;
import xy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, ij.d dVar, a1 a1Var, vy.d dVar2) {
        super(2, dVar2);
        this.f271a = 1;
        this.f274d = oVar;
        this.f275e = dVar;
        this.f276f = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f271a) {
            case 0:
                c cVar = new c((e) this.f276f, dVar, 0);
                cVar.f273c = obj;
                return cVar;
            case 1:
                c cVar2 = new c((o) this.f274d, (ij.d) this.f275e, (a1) this.f276f, dVar);
                cVar2.f273c = obj;
                return cVar2;
            case 2:
                c cVar3 = new c((t) this.f276f, dVar, 2);
                cVar3.f273c = obj;
                return cVar3;
            default:
                c cVar4 = new c((q1) this.f276f, dVar, 3);
                cVar4.f273c = obj;
                return cVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f271a) {
            case 0:
                return ((c) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((c) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((c) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((c) create((m) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:243:0x0440  */
    /* JADX WARN: Code duplicated, block: B:255:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02c9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x029e -> B:127:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x040b -> B:228:0x040c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:29:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:29:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0108 -> B:48:0x010b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f271a = i11;
        this.f276f = obj;
    }
}

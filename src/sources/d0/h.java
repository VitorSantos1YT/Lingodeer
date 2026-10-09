package d0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22713a = i11;
        this.f22716d = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22713a) {
            case 0:
                h hVar = new h((i) this.f22716d, dVar, 0);
                hVar.f22715c = obj;
                return hVar;
            default:
                h hVar2 = new h((View) this.f22716d, dVar, 1);
                hVar2.f22715c = obj;
                return hVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22713a) {
            case 0:
                return ((h) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((h) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[LOOP:1: B:49:0x00ec->B:53:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bf -> B:42:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

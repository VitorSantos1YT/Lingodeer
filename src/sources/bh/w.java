package bh;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4406a = 0;
        this.f4411f = a1Var;
        this.f4409d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4406a) {
            case 0:
                w wVar = new w(this.f4409d, (a1) this.f4411f, dVar);
                wVar.f4407b = obj;
                return wVar;
            case 1:
                return new w((String) this.f4410e, (gm.g) this.f4411f, dVar, 1);
            case 2:
                return new w((String) this.f4410e, (si.d) this.f4411f, dVar, 2);
            case 3:
                return new w((tm.c) this.f4411f, dVar);
            default:
                return new w((uz.i[]) this.f4410e, this.f4409d, (AtomicInteger) this.f4411f, (tz.h) this.f4407b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4406a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((w) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009b -> B:35:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x005b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(String str, qp.d dVar, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f4406a = i11;
        this.f4410e = str;
        this.f4411f = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tm.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f4406a = 3;
        this.f4411f = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(uz.i[] iVarArr, int i11, AtomicInteger atomicInteger, tz.h hVar, vy.d dVar) {
        super(2, dVar);
        this.f4406a = 4;
        this.f4410e = iVarArr;
        this.f4409d = i11;
        this.f4411f = atomicInteger;
        this.f4407b = hVar;
    }
}

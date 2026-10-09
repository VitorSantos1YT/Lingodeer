package hs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rt.e3;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements fz.e {
    public Object H;
    public Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33714a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f33715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f33716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33719f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f33720t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, g gVar, vy.d dVar) {
        super(2, dVar);
        this.L = arrayList;
        this.K = gVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f33714a) {
            case 0:
                return new f((ArrayList) this.L, (g) this.K, dVar);
            case 1:
                return new f((List) this.K, (rm.g) this.L, dVar);
            default:
                return new f((e3) this.L, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f33714a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((f) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01fd A[Catch: Exception -> 0x023b, TryCatch #0 {Exception -> 0x023b, blocks: (B:70:0x01d2, B:81:0x022f, B:76:0x01f7, B:78:0x01fd, B:84:0x0237, B:83:0x0233, B:75:0x01e6), top: B:89:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:80:0x022e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0233 A[Catch: Exception -> 0x023b, TryCatch #0 {Exception -> 0x023b, blocks: (B:70:0x01d2, B:81:0x022f, B:76:0x01f7, B:78:0x01fd, B:84:0x0237, B:83:0x0233, B:75:0x01e6), top: B:89:0x01bb }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:22:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:27:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0157 -> B:53:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x022c -> B:81:0x022f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, rm.g gVar, vy.d dVar) {
        super(2, dVar);
        this.K = list;
        this.L = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e3 e3Var, vy.d dVar) {
        super(2, dVar);
        this.L = e3Var;
    }
}

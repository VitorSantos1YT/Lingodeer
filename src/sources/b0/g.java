package b0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import dt.h5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.i implements fz.e {
    public /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3539f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3540t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i11, String str, l1.a1 a1Var, l1.a1 a1Var2, l1.a1 a1Var3, l1.a1 a1Var4, l1.a1 a1Var5, vy.d dVar) {
        super(2, dVar);
        this.f3534a = 7;
        this.f3535b = i11;
        this.f3538e = str;
        this.f3539f = a1Var;
        this.f3540t = a1Var2;
        this.H = a1Var3;
        this.f3536c = a1Var4;
        this.f3537d = a1Var5;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [fz.f, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3534a) {
            case 0:
                g gVar = new g((tz.l) this.f3540t, (d) this.H, (l1.b1) this.f3536c, (l1.b1) this.f3537d, dVar);
                gVar.f3539f = obj;
                return gVar;
            case 1:
                return new g((ExoPlayer) this.f3538e, (h5) this.f3539f, (l1.b1) this.f3536c, (l1.b1) this.f3537d, (l1.b1) this.f3540t, (l1.b1) this.H, dVar);
            case 2:
                g gVar2 = new g((Context) this.f3538e, (e6.c) this.f3540t, (xq.c) this.H, (Bundle) this.f3536c, (fz.f) this.f3537d, dVar);
                gVar2.f3539f = obj;
                return gVar2;
            case 3:
                g gVar3 = new g((s2.w) this.f3538e, (fz.f) this.f3540t, (fz.c) this.H, (fz.c) this.f3536c, (fz.c) this.f3537d, dVar);
                gVar3.f3539f = obj;
                return gVar3;
            case 4:
                g gVar4 = new g((Context) this.H, (Bitmap) this.f3536c, (fu.g0) this.f3537d, dVar, 4);
                gVar4.f3539f = obj;
                return gVar4;
            case 5:
                return new g((l1.z) this.f3539f, (e6.l) this.f3540t, (Context) this.H, (l1.d2) this.f3536c, (m6.w) this.f3537d, dVar, 5);
            case 6:
                g gVar5 = new g((List) this.f3536c, (ArrayList) this.f3537d, dVar);
                gVar5.H = obj;
                return gVar5;
            case 7:
                return new g(this.f3535b, (String) this.f3538e, (l1.a1) this.f3539f, (l1.a1) this.f3540t, (l1.a1) this.H, (l1.a1) this.f3536c, (l1.a1) this.f3537d, dVar);
            case 8:
                g gVar6 = new g((fb.v) this.H, (ed.c) this.f3536c, (ob.p) this.f3537d, dVar, 8);
                gVar6.f3539f = obj;
                return gVar6;
            default:
                return new g((vt.r) this.f3539f, (String) this.f3540t, (String) this.H, (String) this.f3536c, (String) this.f3537d, dVar, 9);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f3534a) {
            case 0:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((g) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((g) create(obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                g gVar = (g) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                gVar.invokeSuspend(b0Var);
                return b0Var;
            case 8:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:202:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:205:0x04cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r2v36, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r3v2, types: [fz.f, xy.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x04b0 -> B:200:0x04b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x025c -> B:87:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0288 -> B:87:0x0236). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, e6.c cVar, xq.c cVar2, Bundle bundle, fz.f fVar, vy.d dVar) {
        super(2, dVar);
        this.f3534a = 2;
        this.f3538e = context;
        this.f3540t = cVar;
        this.H = cVar2;
        this.f3536c = bundle;
        this.f3537d = (xy.i) fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ExoPlayer exoPlayer, h5 h5Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f3534a = 1;
        this.f3538e = exoPlayer;
        this.f3539f = h5Var;
        this.f3536c = b1Var;
        this.f3537d = b1Var2;
        this.f3540t = b1Var3;
        this.H = b1Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3534a = i11;
        this.f3539f = obj;
        this.f3540t = obj2;
        this.H = obj3;
        this.f3536c = obj4;
        this.f3537d = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3534a = i11;
        this.H = obj;
        this.f3536c = obj2;
        this.f3537d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.f3534a = 6;
        this.f3536c = list;
        this.f3537d = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s2.w wVar, fz.f fVar, fz.c cVar, fz.c cVar2, fz.c cVar3, vy.d dVar) {
        super(2, dVar);
        this.f3534a = 3;
        this.f3538e = wVar;
        this.f3540t = fVar;
        this.H = cVar;
        this.f3536c = cVar2;
        this.f3537d = cVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tz.l lVar, d dVar, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar2) {
        super(2, dVar2);
        this.f3534a = 0;
        this.f3540t = lVar;
        this.H = dVar;
        this.f3536c = b1Var;
        this.f3537d = b1Var2;
    }
}

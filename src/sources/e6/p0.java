package e6;

import android.content.Context;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import ot.f2;
import rt.b5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25010a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f25014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f25015f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f25016t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(DayStreakWidgetReceiver dayStreakWidgetReceiver, Context context, int[] iArr, vy.d dVar) {
        super(2, dVar);
        this.f25015f = dayStreakWidgetReceiver;
        this.H = context;
        this.L = iArr;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25010a) {
            case 0:
                p0 p0Var = new p0((DayStreakWidgetReceiver) this.f25015f, (Context) this.H, (int[]) this.L, dVar);
                p0Var.K = obj;
                return p0Var;
            case 1:
                return new p0((List) this.H, (HashMap) this.K, (oi.c) this.L, dVar);
            case 2:
                return new p0((l0.w) this.f25014e, (b5) this.f25015f, this.f25012c, this.f25013d, (l1.b1) this.f25016t, (l1.b1) this.H, (l1.b1) this.K, (Integer) this.L, dVar);
            default:
                p0 p0Var2 = new p0((po.a) this.f25015f, this.f25013d, (BufferedOutputStream) this.f25016t, (File) this.H, (f2) this.L, dVar);
                p0Var2.K = obj;
                return p0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25010a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((p0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0540  */
    /* JADX WARN: Code duplicated, block: B:230:0x0557  */
    /* JADX WARN: Code duplicated, block: B:231:0x0559  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0425 -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x043b -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x044e -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0490 -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x04b1 -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x04e0 -> B:188:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x04f8 -> B:216:0x04fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x0559 -> B:232:0x055b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0156 -> B:70:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x015a -> B:70:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(List list, HashMap map, oi.c cVar, vy.d dVar) {
        super(2, dVar);
        this.H = list;
        this.K = map;
        this.L = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0.w wVar, b5 b5Var, int i11, int i12, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, Integer num, vy.d dVar) {
        super(2, dVar);
        this.f25014e = wVar;
        this.f25015f = b5Var;
        this.f25012c = i11;
        this.f25013d = i12;
        this.f25016t = b1Var;
        this.H = b1Var2;
        this.K = b1Var3;
        this.L = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(po.a aVar, int i11, BufferedOutputStream bufferedOutputStream, File file, f2 f2Var, vy.d dVar) {
        super(2, dVar);
        this.f25015f = aVar;
        this.f25013d = i11;
        this.f25016t = bufferedOutputStream;
        this.H = file;
        this.L = f2Var;
    }
}

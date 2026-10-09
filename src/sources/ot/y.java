package ot;

import com.lingodeer.data.model.TestModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.i implements fz.e {
    public Collection H;
    public int K;
    public int L;
    public int M;
    public int N;
    public final /* synthetic */ z O;
    public final /* synthetic */ long P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f46047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f46048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f46049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f46050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TestModel f46051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f46052f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f46053t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, long j11, vy.d dVar) {
        super(2, dVar);
        this.O = zVar;
        this.P = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new y(this.O, this.P, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0720  */
    /* JADX WARN: Code duplicated, block: B:132:0x075e  */
    /* JADX WARN: Code duplicated, block: B:135:0x076e  */
    /* JADX WARN: Code duplicated, block: B:137:0x077b  */
    /* JADX WARN: Code duplicated, block: B:139:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0809  */
    /* JADX WARN: Code duplicated, block: B:25:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [ot.h] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [ot.f] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x080b -> B:142:0x0817). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0182 -> B:142:0x0817). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x021a -> B:50:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x035d -> B:51:0x022f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0438 -> B:51:0x022f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

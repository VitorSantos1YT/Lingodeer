package mi;

import fz.e;
import fz.f;
import java.util.ArrayList;
import java.util.List;
import rz.b0;
import uz.j;
import vt.z0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements e {
    public final /* synthetic */ Object H;
    public Object K;
    public Object L;
    public /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41148a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41153f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f41154t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(fz.a aVar, f fVar, j jVar, d dVar, uz.i[] iVarArr) {
        super(2, dVar);
        this.f41149b = iVarArr;
        this.f41150c = aVar;
        this.M = (i) fVar;
        this.H = jVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fz.f, xy.i] */
    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f41148a) {
            case 0:
                b bVar = new b((List) this.H, (c) this.L, dVar);
                bVar.M = obj;
                return bVar;
            case 1:
                b bVar2 = new b((List) this.H, (o20.i) this.M, dVar);
                bVar2.f41154t = obj;
                return bVar2;
            case 2:
                b bVar3 = new b((ArrayList) this.M, (z0) this.H, dVar);
                bVar3.f41154t = obj;
                return bVar3;
            default:
                b bVar4 = new b((fz.a) this.f41150c, (i) this.M, (j) this.H, dVar, (uz.i[]) this.f41149b);
                bVar4.f41154t = obj;
                return bVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41148a) {
            case 0:
                return ((b) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b) create((j) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b) create((j) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0324  */
    /* JADX WARN: Code duplicated, block: B:112:0x033a  */
    /* JADX WARN: Code duplicated, block: B:113:0x033c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0390  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ae  */
    /* JADX WARN: Type inference failed for: r10v27, types: [fz.f, xy.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x037a -> B:146:0x037e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x038e -> B:123:0x0389). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0390 -> B:144:0x0392). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0399 -> B:133:0x039e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011b -> B:43:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0136 -> B:43:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01b9 -> B:63:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x029d -> B:88:0x029e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, z0 z0Var, d dVar) {
        super(2, dVar);
        this.M = arrayList;
        this.H = z0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, c cVar, d dVar) {
        super(2, dVar);
        this.H = list;
        this.L = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, o20.i iVar, d dVar) {
        super(2, dVar);
        this.H = list;
        this.M = iVar;
    }
}

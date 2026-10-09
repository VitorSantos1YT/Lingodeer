package en;

import androidx.lifecycle.ViewModel;
import java.util.List;
import l1.b1;
import l1.b3;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements fz.e {
    public dn.d H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final /* synthetic */ dn.d Q;
    public final /* synthetic */ b1 R;
    public final /* synthetic */ b3 S;
    public final /* synthetic */ b1 T;
    public final /* synthetic */ b1 U;
    public final /* synthetic */ b1 V;
    public final /* synthetic */ b1 W;
    public final /* synthetic */ ViewModel X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f25709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f25711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f25712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f25713f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b1 f25714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(dn.d dVar, b1 b1Var, b3 b3Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, ViewModel viewModel, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f25708a = i11;
        this.Q = dVar;
        this.R = b1Var;
        this.S = b3Var;
        this.T = b1Var2;
        this.U = b1Var3;
        this.V = b1Var4;
        this.W = b1Var5;
        this.X = viewModel;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25708a) {
            case 0:
                return new d(this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (gn.e) this.X, dVar, 0);
            default:
                return new d(this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (tq.d) this.X, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25708a) {
            case 0:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0435  */
    /* JADX WARN: Code duplicated, block: B:145:0x0440  */
    /* JADX WARN: Code duplicated, block: B:147:0x045a  */
    /* JADX WARN: Code duplicated, block: B:148:0x045f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0466  */
    /* JADX WARN: Code duplicated, block: B:153:0x0474  */
    /* JADX WARN: Code duplicated, block: B:154:0x0479  */
    /* JADX WARN: Code duplicated, block: B:160:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:213:0x04e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x04bf -> B:161:0x04c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x04e4 -> B:162:0x04d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ce -> B:71:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01ef -> B:72:0x01e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

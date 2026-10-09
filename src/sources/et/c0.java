package et;

import androidx.lifecycle.ViewModel;
import b0.i2;
import com.lingo.lingoskill.object.PdLesson;
import java.util.List;
import l1.a1;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f25845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(ViewModel viewModel, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25842a = i11;
        this.f25847f = viewModel;
        this.f25844c = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25842a) {
            case 0:
                return new c0(this.f25844c, (jt.v) this.f25845d, (List) this.f25846e, (a1) this.f25847f, dVar);
            case 1:
                return new c0((b0.d) this.f25845d, this.f25844c, (i2) this.f25846e, (fz.a) this.f25847f, dVar);
            case 2:
                c0 c0Var = new c0((ph.k) this.f25847f, this.f25844c, dVar, 2);
                c0Var.f25846e = obj;
                return c0Var;
            case 3:
                c0 c0Var2 = new c0((ph.a0) this.f25847f, this.f25844c, dVar, 3);
                c0Var2.f25846e = obj;
                return c0Var2;
            default:
                return new c0((b1) this.f25846e, this.f25844c, (h0.i) this.f25847f, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25842a) {
            case 0:
                return ((c0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((c0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((c0) create((PdLesson) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((c0) create((PdLesson) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((c0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01f1 -> B:82:0x01f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0.d dVar, boolean z11, i2 i2Var, fz.a aVar, vy.d dVar2) {
        super(2, dVar2);
        this.f25842a = 1;
        this.f25845d = dVar;
        this.f25844c = z11;
        this.f25846e = i2Var;
        this.f25847f = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b1 b1Var, boolean z11, h0.i iVar, vy.d dVar) {
        super(2, dVar);
        this.f25842a = 4;
        this.f25846e = b1Var;
        this.f25844c = z11;
        this.f25847f = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z11, jt.v vVar, List list, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f25842a = 0;
        this.f25844c = z11;
        this.f25845d = vVar;
        this.f25846e = list;
        this.f25847f = a1Var;
    }
}

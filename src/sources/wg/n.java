package wg;

import android.widget.FrameLayout;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.n implements fz.f {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f55149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f55151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f55152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f55153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f55154f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f55155t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, boolean z11, q qVar, fz.c cVar, fz.c cVar2, b bVar, a aVar, int i11) {
        super(3);
        this.f55149a = rVar;
        this.f55150b = z11;
        this.f55151c = qVar;
        this.f55152d = cVar;
        this.f55153e = cVar2;
        this.f55154f = bVar;
        this.f55155t = aVar;
        this.H = i11;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0037, please report this as an issue */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        j0.s BoxWithConstraints = (j0.s) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
        long j11 = BoxWithConstraints.f35407b;
        if ((iIntValue & 14) == 0) {
            iIntValue |= ((l1.s) nVar).f(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                if (v3.a.f(j11)) {
                    i11 = -1;
                } else {
                    i11 = -2;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, v3.a.e(j11) ? -1 : -2);
                int i12 = this.H;
                int i13 = (i12 & 14) | 150995392;
                int i14 = i12 << 3;
                qx.p.f(this.f55149a, layoutParams, this.f55150b, this.f55151c, this.f55152d, this.f55153e, this.f55154f, this.f55155t, nVar, i13 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 1879048192));
            }
        } else {
            if (v3.a.f(j11)) {
                i11 = -1;
            } else {
                i11 = -2;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, v3.a.e(j11) ? -1 : -2);
            int i15 = this.H;
            int i16 = (i15 & 14) | 150995392;
            int i17 = i15 << 3;
            qx.p.f(this.f55149a, layoutParams2, this.f55150b, this.f55151c, this.f55152d, this.f55153e, this.f55154f, this.f55155t, nVar, i16 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 1879048192));
        }
        return b0.f48488a;
    }
}

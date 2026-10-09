package kr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f38461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(d1 d1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38460a = i11;
        this.f38461b = d1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38460a) {
            case 0:
                return new f1(this.f38461b, dVar, 0);
            case 1:
                return new f1(this.f38461b, dVar, 1);
            case 2:
                return new f1(this.f38461b, dVar, 2);
            default:
                return new f1(this.f38461b, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38460a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((f1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38460a;
        int i12 = 0;
        d1 d1Var = this.f38461b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var = (c1) d1Var;
                List list = c1Var.f38434a;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (Object obj2 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList.add(a1.a((a1) obj2, null, false, false, false, false, false, 0, 253));
                    i12 = i13;
                }
                return c1.a(c1Var, arrayList, 0, false, false, 30);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var2 = (c1) d1Var;
                List list2 = c1Var2.f38434a;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                for (Object obj3 : list2) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList2.add(a1.a((a1) obj3, null, false, false, false, false, false, -1, 127));
                    i12 = i14;
                }
                return c1.a(c1Var2, arrayList2, 0, false, false, 30);
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var3 = (c1) d1Var;
                List list3 = c1Var3.f38434a;
                ArrayList arrayList3 = new ArrayList(ry.n.W(list3, 10));
                for (Object obj4 : list3) {
                    int i15 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList3.add(a1.a((a1) obj4, null, false, false, false, false, false, 0, 253));
                    i12 = i15;
                }
                return c1.a(c1Var3, arrayList3, 0, false, false, 30);
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var4 = (c1) d1Var;
                List list4 = c1Var4.f38434a;
                ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
                for (Object obj5 : list4) {
                    int i16 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList4.add(a1.a((a1) obj5, null, false, false, false, false, false, 0, 247));
                    i12 = i16;
                }
                return c1.a(c1Var4, arrayList4, 0, false, false, 30);
        }
    }
}

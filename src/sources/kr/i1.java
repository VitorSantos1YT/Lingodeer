package kr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f38497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f38498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(d1 d1Var, a1 a1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38496a = i11;
        this.f38497b = d1Var;
        this.f38498c = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38496a) {
            case 0:
                return new i1(this.f38497b, this.f38498c, dVar, 0);
            case 1:
                return new i1(this.f38497b, this.f38498c, dVar, 1);
            case 2:
                return new i1(this.f38497b, this.f38498c, dVar, 2);
            case 3:
                return new i1(this.f38497b, this.f38498c, dVar, 3);
            default:
                return new i1(this.f38497b, this.f38498c, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38496a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((i1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38496a;
        Object obj2 = null;
        int i12 = 0;
        a1 a1Var = this.f38498c;
        d1 d1Var = this.f38497b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var = (c1) d1Var;
                List list = c1Var.f38434a;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (Object obj3 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA = (a1) obj3;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA.f38410a.f34557a.getSentenceId()) {
                        a1VarA = a1.a(a1VarA, null, true, false, false, false, false, 0, 241);
                    }
                    arrayList.add(a1VarA);
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
                for (Object obj4 : list2) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA2 = (a1) obj4;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA2.f38410a.f34557a.getSentenceId()) {
                        a1VarA2 = a1.a(a1VarA2, null, false, false, true, false, false, 0, 241);
                    }
                    arrayList2.add(a1VarA2);
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
                for (Object obj5 : list3) {
                    int i15 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA3 = (a1) obj5;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA3.f38410a.f34557a.getSentenceId()) {
                        a1VarA3 = a1.a(a1VarA3, null, false, true, false, false, false, 0, 241);
                    }
                    arrayList3.add(a1VarA3);
                    i12 = i15;
                }
                return c1.a(c1Var3, arrayList3, 0, false, false, 30);
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var4 = (c1) d1Var;
                List list4 = c1Var4.f38434a;
                ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
                int i16 = 0;
                for (Object obj6 : list4) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA4 = (a1) obj6;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA4.f38410a.f34557a.getSentenceId()) {
                        a1VarA4 = a1.a(a1VarA4, null, false, false, false, true, false, 0, 203);
                    }
                    arrayList4.add(a1VarA4);
                    i16 = i17;
                }
                int size = arrayList4.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj7 = arrayList4.get(i18);
                    i18++;
                    if (!((a1) obj7).f38415f) {
                        obj2 = obj7;
                        return c1.a(c1Var4, arrayList4, 0, obj2 == null ? 1 : 0, false, 22);
                    }
                }
                return c1.a(c1Var4, arrayList4, 0, obj2 == null ? 1 : 0, false, 22);
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var5 = (c1) d1Var;
                List list5 = c1Var5.f38434a;
                ArrayList arrayList5 = new ArrayList(ry.n.W(list5, 10));
                for (Object obj8 : list5) {
                    int i19 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA5 = (a1) obj8;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA5.f38410a.f34557a.getSentenceId()) {
                        a1VarA5 = a1.a(a1VarA5, null, false, false, false, false, false, 0, 203);
                    }
                    arrayList5.add(a1VarA5);
                    i12 = i19;
                }
                return c1.a(c1Var5, arrayList5, 0, false, false, 30);
        }
    }
}

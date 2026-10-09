package js;

import java.util.ArrayList;
import java.util.List;
import rt.eb;
import rt.ia;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f36847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs.f f36848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, bs.f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36845a = i11;
        this.f36847c = yVar;
        this.f36848d = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36845a) {
            case 0:
                return new x(this.f36847c, this.f36848d, dVar, 0);
            case 1:
                return new x(this.f36847c, this.f36848d, dVar, 1);
            case 2:
                return new x(this.f36847c, this.f36848d, dVar, 2);
            case 3:
                return new x(this.f36847c, this.f36848d, dVar, 3);
            case 4:
                return new x(this.f36847c, this.f36848d, dVar, 4);
            default:
                return new x(this.f36847c, this.f36848d, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f36845a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i11 = this.f36845a;
        qy.b0 b0Var = qy.b0.f48488a;
        bs.f fVar = this.f36848d;
        eb ebVar = eb.f49693a;
        y yVar = this.f36847c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f36846b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var = yVar.f36851c;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, ebVar));
                fv.c cVar = yVar.f36850b;
                List<bs.e> list = fVar.f5130e;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (bs.e eVar : list) {
                    qy.q qVar = fv.f.f28191a;
                    String str = eVar.f5123c;
                    int i13 = eVar.f5124d;
                    arrayList.add(new fv.a(0L, fv.f.g(i13, str), fv.f.f(i13, eVar.f5123c)));
                }
                gs.b bVar = new gs.b(yVar, 9);
                this.f36846b = 1;
                return ia.a(cVar, arrayList, bVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f36846b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var2 = yVar.f36851c;
                do {
                    value2 = i1Var2.getValue();
                } while (!i1Var2.j(value2, ebVar));
                fv.c cVar2 = yVar.f36850b;
                List<bs.e> list2 = fVar.f5130e;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                for (bs.e eVar2 : list2) {
                    qy.q qVar2 = fv.f.f28191a;
                    String str2 = eVar2.f5123c;
                    int i15 = eVar2.f5124d;
                    arrayList2.add(new fv.a(0L, fv.f.g(i15, str2), fv.f.f(i15, eVar2.f5123c)));
                }
                gs.b bVar2 = new gs.b(yVar, 10);
                this.f36846b = 1;
                return ia.a(cVar2, arrayList2, bVar2, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f36846b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var3 = yVar.f36851c;
                do {
                    value3 = i1Var3.getValue();
                } while (!i1Var3.j(value3, ebVar));
                fv.c cVar3 = yVar.f36850b;
                List<bs.e> list3 = fVar.f5130e;
                ArrayList arrayList3 = new ArrayList(ry.n.W(list3, 10));
                for (bs.e eVar3 : list3) {
                    qy.q qVar3 = fv.f.f28191a;
                    String str3 = eVar3.f5123c;
                    int i17 = eVar3.f5124d;
                    arrayList3.add(new fv.a(0L, fv.f.g(i17, str3), fv.f.f(i17, eVar3.f5123c)));
                }
                gs.b bVar3 = new gs.b(yVar, 11);
                this.f36846b = 1;
                return ia.a(cVar3, arrayList3, bVar3, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f36846b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var4 = yVar.f36851c;
                do {
                    value4 = i1Var4.getValue();
                } while (!i1Var4.j(value4, ebVar));
                fv.c cVar4 = yVar.f36850b;
                List<bs.e> list4 = fVar.f5130e;
                ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
                for (bs.e eVar4 : list4) {
                    qy.q qVar4 = fv.f.f28191a;
                    String str4 = eVar4.f5123c;
                    int i19 = eVar4.f5124d;
                    arrayList4.add(new fv.a(0L, fv.f.g(i19, str4), fv.f.f(i19, eVar4.f5123c)));
                }
                gs.b bVar4 = new gs.b(yVar, 12);
                this.f36846b = 1;
                return ia.a(cVar4, arrayList4, bVar4, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f36846b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var5 = yVar.f36851c;
                do {
                    value5 = i1Var5.getValue();
                } while (!i1Var5.j(value5, ebVar));
                fv.c cVar5 = yVar.f36850b;
                List<bs.e> list5 = fVar.f5130e;
                ArrayList arrayList5 = new ArrayList(ry.n.W(list5, 10));
                for (bs.e eVar5 : list5) {
                    qy.q qVar5 = fv.f.f28191a;
                    String str5 = eVar5.f5123c;
                    int i22 = eVar5.f5124d;
                    arrayList5.add(new fv.a(0L, fv.f.g(i22, str5), fv.f.f(i22, eVar5.f5123c)));
                }
                gs.b bVar5 = new gs.b(yVar, 13);
                this.f36846b = 1;
                return ia.a(cVar5, arrayList5, bVar5, this) == aVar5 ? aVar5 : b0Var;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f36846b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var6 = yVar.f36851c;
                do {
                    value6 = i1Var6.getValue();
                } while (!i1Var6.j(value6, ebVar));
                fv.c cVar6 = yVar.f36850b;
                List<bs.e> list6 = fVar.f5130e;
                ArrayList arrayList6 = new ArrayList(ry.n.W(list6, 10));
                for (bs.e eVar6 : list6) {
                    qy.q qVar6 = fv.f.f28191a;
                    String str6 = eVar6.f5123c;
                    int i24 = eVar6.f5124d;
                    arrayList6.add(new fv.a(0L, fv.f.g(i24, str6), fv.f.f(i24, eVar6.f5123c)));
                }
                gs.b bVar6 = new gs.b(yVar, 17);
                this.f36846b = 1;
                return ia.a(cVar6, arrayList6, bVar6, this) == aVar6 ? aVar6 : b0Var;
        }
    }
}

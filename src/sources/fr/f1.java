package fr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f27500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1 f27501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(List list, v1 v1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27497a = i11;
        this.f27500d = list;
        this.f27501e = v1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27497a) {
            case 0:
                f1 f1Var = new f1(this.f27500d, this.f27501e, dVar, 0);
                f1Var.f27499c = obj;
                return f1Var;
            default:
                f1 f1Var2 = new f1(this.f27500d, this.f27501e, dVar, 1);
                f1Var2.f27499c = obj;
                return f1Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27497a) {
            case 0:
                break;
        }
        return ((f1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27497a) {
            case 0:
                rz.b0 b0Var = (rz.b0) this.f27499c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27498b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List list = this.f27500d;
                    ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        vy.d dVar = null;
                        if (it.hasNext()) {
                            arrayList.add(rz.e0.f(b0Var, null, null, new e1(this.f27501e, (String) it.next(), dVar, 0), 3));
                        } else {
                            this.f27499c = null;
                            this.f27498b = 1;
                            obj = rz.e0.g(arrayList, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return ry.m.o0((Iterable) obj);
            default:
                rz.b0 b0Var2 = (rz.b0) this.f27499c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27498b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List list2 = this.f27500d;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (true) {
                        vy.d dVar2 = null;
                        if (it2.hasNext()) {
                            arrayList2.add(rz.e0.f(b0Var2, null, null, new e1(this.f27501e, (String) it2.next(), dVar2, 1), 3));
                        } else {
                            this.f27499c = null;
                            this.f27498b = 1;
                            obj = rz.e0.g(arrayList2, this);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return ry.m.o0((Iterable) obj);
        }
    }
}

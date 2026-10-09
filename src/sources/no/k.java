package no;

import com.google.firebase.database.DataSnapshot;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.ArrayList;
import java.util.Iterator;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f43886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DataSnapshot f43889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43890f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f43891t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(DataSnapshot dataSnapshot, ArrayList arrayList, s sVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43885a = i11;
        this.f43889e = dataSnapshot;
        this.f43890f = arrayList;
        this.f43891t = sVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43885a) {
            case 0:
                k kVar = new k(this.f43889e, this.f43890f, this.f43891t, dVar, 0);
                kVar.f43888d = obj;
                return kVar;
            default:
                k kVar2 = new k(this.f43889e, this.f43890f, this.f43891t, dVar, 1);
                kVar2.f43888d = obj;
                return kVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43885a) {
            case 0:
                break;
        }
        return ((k) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f43885a) {
            case 0:
                b0 b0Var = (b0) this.f43888d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43887c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    DataSnapshot dataSnapshot = this.f43889e;
                    if (dataSnapshot.f18954a.f19539a.V() > 0) {
                        Iterable iterableA = dataSnapshot.a();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = iterableA.iterator();
                        while (it.hasNext()) {
                            PodUser podUser = (PodUser) ((DataSnapshot) it.next()).b();
                            if (podUser != null) {
                                arrayList3.add(podUser);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (true) {
                            vy.d dVar = null;
                            if (i12 < size) {
                                Object obj2 = arrayList3.get(i12);
                                i12++;
                                arrayList4.add(e0.f(b0Var, null, null, new j(this.f43891t, (PodUser) obj2, dVar, 0), 3));
                            } else {
                                this.f43888d = null;
                                arrayList = this.f43890f;
                                this.f43886b = arrayList;
                                this.f43887c = 1;
                                obj = e0.g(arrayList4, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                    return qy.b0.f48488a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f43886b;
                com.bumptech.glide.e.F(obj);
                arrayList.addAll(ry.m.o0((Iterable) obj));
                return qy.b0.f48488a;
            default:
                b0 b0Var2 = (b0) this.f43888d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f43887c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    DataSnapshot dataSnapshot2 = this.f43889e;
                    if (dataSnapshot2.f18954a.f19539a.V() > 0) {
                        Iterable iterableA2 = dataSnapshot2.a();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = iterableA2.iterator();
                        while (it2.hasNext()) {
                            PodUser podUser2 = (PodUser) ((DataSnapshot) it2.next()).b();
                            if (podUser2 != null) {
                                arrayList5.add(podUser2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        int size2 = arrayList5.size();
                        int i14 = 0;
                        while (true) {
                            vy.d dVar2 = null;
                            if (i14 < size2) {
                                Object obj3 = arrayList5.get(i14);
                                i14++;
                                arrayList6.add(e0.f(b0Var2, null, null, new j(this.f43891t, (PodUser) obj3, dVar2, 1), 3));
                            } else {
                                this.f43888d = null;
                                arrayList2 = this.f43890f;
                                this.f43886b = arrayList2;
                                this.f43887c = 1;
                                obj = e0.g(arrayList6, this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                            }
                        }
                    }
                    return qy.b0.f48488a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList2 = this.f43886b;
                com.bumptech.glide.e.F(obj);
                arrayList2.addAll(ry.m.o0((Iterable) obj));
                return qy.b0.f48488a;
        }
    }
}

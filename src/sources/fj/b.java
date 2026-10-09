package fj;

import ay.x;
import bh.r;
import bh.s;
import bp.g4;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingodeer.data.model.Bookmark;
import fz.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;
import rz.b0;
import rz.e0;
import rz.o0;
import th.j;
import uz.x0;
import vy.d;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f27324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, long j11, d dVar, int i11) {
        super(2, dVar);
        this.f27322a = i11;
        this.f27324c = cVar;
        this.f27325d = j11;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f27322a) {
            case 0:
                return new b(this.f27324c, this.f27325d, dVar, 0);
            default:
                return new b(this.f27324c, this.f27325d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        d dVar = (d) obj2;
        switch (this.f27322a) {
            case 0:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = 1;
        switch (this.f27322a) {
            case 0:
                c cVar = this.f27324c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27323b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    s sVar = new s(this.f27325d, null, i11);
                    this.f27323b = 1;
                    obj = e0.M(eVar, sVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                cVar.K.setValue((List) obj);
                c.a(cVar);
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27323b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    r rVarB = ((fr.r) this.f27324c.f27326a).b(xt.d.k(((fr.o0) xt.b.c()).f27733a.keyLanguage), "sc");
                    f fVar2 = o0.f50940a;
                    uz.i iVarW = x0.w(rVarB, yz.e.f58387a);
                    this.f27323b = 1;
                    obj = x0.u(iVarW, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((Bookmark) obj2).isFav() == 1) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    List listW0 = q.W0(((Bookmark) obj3).getId(), new String[]{"_"}, 0, 6);
                    if (listW0.size() > 1) {
                        if (dj.b.f23431e == null) {
                            synchronized (dj.b.class) {
                                if (dj.b.f23431e == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication);
                                    dj.b.f23431e = new dj.b(lingoSkillApplication);
                                }
                            }
                        }
                        dj.b bVar = dj.b.f23431e;
                        m.c(bVar);
                        Object objLoad = bVar.c().load(Long.valueOf(Long.parseLong((String) listW0.get(2))));
                        m.e(objLoad, "load(...)");
                        arrayList2.add((TravelPhrase) objLoad);
                        break;
                    }
                }
                this.f27324c.K.setValue(arrayList2);
                if (this.f27325d >= 0) {
                    c.a(this.f27324c);
                } else {
                    c cVar2 = this.f27324c;
                    cVar2.f27330e = 0;
                    cVar2.f27327b = new fv.c();
                    j.a(new x(new g4(arrayList2, 5)).k(ky.e.f38937b).g(px.b.a()).h(new hd.d(cVar2, 12), vx.b.f54316e), cVar2.f27332t);
                }
                return qy.b0.f48488a;
        }
    }
}

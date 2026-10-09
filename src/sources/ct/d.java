package ct;

import com.bumptech.glide.e;
import ht.l;
import java.util.ArrayList;
import jh.h;
import kotlin.jvm.internal.w;
import qy.b0;
import ry.m;
import rz.e0;
import xy.i;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f22480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f22481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f22482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f22483f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f22484t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, w wVar, float f5, fz.c cVar, l lVar, d0 d0Var, vy.d dVar) {
        super(1, dVar);
        this.f22479b = arrayList;
        this.f22480c = wVar;
        this.f22481d = f5;
        this.f22482e = cVar;
        this.f22483f = lVar;
        this.f22484t = d0Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new d(this.f22479b, this.f22480c, this.f22481d, this.f22482e, this.f22483f, this.f22484t, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((d) create((vy.d) obj)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f22478a;
        float f5 = this.f22481d;
        w wVar = this.f22480c;
        fz.c cVar = this.f22482e;
        ArrayList arrayList = this.f22479b;
        if (i11 == 0) {
            e.F(obj);
            if (((String) (arrayList.isEmpty() ? null : arrayList.remove(0))) == null || arrayList.size() <= 0) {
                cVar.invoke(h.y(ht.a.f33722e, wVar.f38359a, f5));
            } else {
                this.f22478a = 1;
                if (e0.m(800L, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f48488a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.F(obj);
        wVar.f38359a++;
        String str = (String) m.q0(arrayList);
        float f11 = this.f22481d;
        l lVar = this.f22483f;
        d0 d0Var = this.f22484t;
        d0Var.d(str, new d(arrayList, wVar, f11, cVar, lVar, d0Var, null), f11);
        cVar.invoke(h.y(this.f22483f, wVar.f38359a, f5));
        return b0.f48488a;
    }
}

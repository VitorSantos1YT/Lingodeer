package si;

import androidx.lifecycle.LifecycleOwnerKt;
import bh.w;
import com.lingodeer.R;
import hj.u1;
import jp.p0;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.o0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f51705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f51706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, String str, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f51703a = i11;
        this.f51705c = dVar;
        this.f51706d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f51703a) {
            case 0:
                return new c(this.f51705c, this.f51706d, dVar, 0);
            default:
                return new c(this.f51705c, this.f51706d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f51703a) {
            case 0:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f51703a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        String str = this.f51706d;
        d dVar2 = this.f51705c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f51704b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    w wVar = new w(str, dVar2, dVar, 2);
                    this.f51704b = 1;
                    if (e0.M(eVar, wVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                p0 p0Var = (p0) dVar2.f47881a;
                p0Var.getClass();
                e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), null, null, new c(dVar2, str, dVar, i12), 3);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f51704b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    gm.f fVar3 = new gm.f(str, dVar, i12);
                    this.f51704b = 1;
                    obj = e0.M(eVar2, fVar3, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ta.a aVar3 = dVar2.f47886f;
                    m.c(aVar3);
                    ((u1) aVar3).f33374c.setImageResource(R.drawable.sc_item_fav);
                    return b0Var;
                }
                ta.a aVar4 = dVar2.f47886f;
                m.c(aVar4);
                ((u1) aVar4).f33374c.setImageResource(R.drawable.sc_item_not_fav_bmp);
                return b0Var;
        }
    }
}

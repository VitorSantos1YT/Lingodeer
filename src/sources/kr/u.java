package kr;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rt.c6;
import rt.k8;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Collection f38585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f38584a = i12;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f38584a) {
            case 0:
                u uVar = new u(4, 0, (vy.d) obj4);
                uVar.f38585b = (List) obj;
                uVar.f38586c = (List) obj2;
                uVar.f38587d = (List) obj3;
                return uVar.invokeSuspend(qy.b0.f48488a);
            case 1:
                u uVar2 = new u(4, 1, (vy.d) obj4);
                uVar2.f38585b = (List) obj;
                uVar2.f38586c = (c6) obj2;
                uVar2.f38587d = (rt.p) obj3;
                return uVar2.invokeSuspend(qy.b0.f48488a);
            case 2:
                u uVar3 = new u(4, 2, (vy.d) obj4);
                uVar3.f38585b = (Set) obj;
                uVar3.f38586c = (Set) obj2;
                uVar3.f38587d = (Set) obj3;
                return uVar3.invokeSuspend(qy.b0.f48488a);
            default:
                u uVar4 = new u(4, 3, (vy.d) obj4);
                uVar4.f38585b = (List) obj;
                uVar4.f38586c = (k8) obj2;
                uVar4.f38587d = (rt.k0) obj3;
                return uVar4.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f38584a) {
            case 0:
                List<n> list = (List) this.f38585b;
                List list2 = (List) this.f38586c;
                List list3 = (List) this.f38587d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (n nVar : list) {
                    boolean z11 = nVar.f38540h;
                    String str = nVar.f38533a;
                    int i11 = nVar.f38539g;
                    boolean z12 = (z11 && !list3.contains(str)) || list2.contains(str);
                    if (z11 && list3.contains(str)) {
                        i11--;
                    } else if ((!z11 || !list2.contains(str)) && !z11 && list2.contains(str)) {
                        i11++;
                    }
                    arrayList.add(n.a(nVar, i11, z12, false, false, CropImageView.DEFAULT_ASPECT_RATIO, 1855));
                }
                return arrayList;
            case 1:
                List list4 = (List) this.f38585b;
                c6 c6Var = (c6) this.f38586c;
                rt.p pVar = (rt.p) this.f38587d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Map map = c6Var.f49567b;
                return new rt.b0(c.a.e(list4, map, map.keySet()), pVar);
            case 2:
                Set set = (Set) this.f38585b;
                Set set2 = (Set) this.f38586c;
                Set set3 = (Set) this.f38587d;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ry.x.Y(new qy.l(x8.CHARACTER, set), new qy.l(x8.WORD, set2), new qy.l(x8.SENTENCE, set3));
            default:
                List list5 = (List) this.f38585b;
                k8 k8Var = (k8) this.f38586c;
                rt.k0 k0Var = (rt.k0) this.f38587d;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new rt.s(list5, k8Var, k0Var);
        }
    }
}

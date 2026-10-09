package rt;

import com.lingodeer.data.model.BookmarkFolder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d6 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Set f49620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f49621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f49622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g6 f49623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f49624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(g6 g6Var, String str, vy.d dVar) {
        super(4, dVar);
        this.f49623d = g6Var;
        this.f49624e = str;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        d6 d6Var = new d6(this.f49623d, this.f49624e, (vy.d) obj4);
        d6Var.f49620a = (Set) obj;
        d6Var.f49621b = (List) obj2;
        d6Var.f49622c = (List) obj3;
        return d6Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Set set = this.f49620a;
        List list = this.f49621b;
        List list2 = this.f49622c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        String str = this.f49623d.f49784d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BookmarkFolder) it.next()).getId());
        }
        return i6.b(set, list, str, this.f49624e, linkedHashSet);
    }
}

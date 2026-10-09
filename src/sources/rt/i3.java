package rt;

import com.lingodeer.data.model.Bookmark;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ m0 f49865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Bookmark f49866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Map f49867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f49864a = i12;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        m0 m0Var = (m0) obj;
        Bookmark bookmark = (Bookmark) obj2;
        Map map = (Map) obj3;
        vy.d dVar = (vy.d) obj4;
        switch (this.f49864a) {
            case 0:
                i3 i3Var = new i3(4, 0, dVar);
                i3Var.f49865b = m0Var;
                i3Var.f49866c = bookmark;
                i3Var.f49867d = map;
                return i3Var.invokeSuspend(qy.b0.f48488a);
            default:
                i3 i3Var2 = new i3(4, 1, dVar);
                i3Var2.f49865b = m0Var;
                i3Var2.f49866c = bookmark;
                i3Var2.f49867d = map;
                return i3Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Boolean bool;
        boolean zBooleanValue = false;
        switch (this.f49864a) {
            case 0:
                m0 m0Var = this.f49865b;
                Bookmark bookmark = this.f49866c;
                Map map = this.f49867d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (m0Var == null) {
                    return new ka(false, false);
                }
                Boolean bool2 = (Boolean) map.get(m0Var.f50042a);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else if (bookmark != null && bookmark.isFav() == 1) {
                    zBooleanValue = true;
                }
                return new ka(true, zBooleanValue);
            default:
                m0 m0Var2 = this.f49865b;
                Bookmark bookmark2 = this.f49866c;
                Map map2 = this.f49867d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (m0Var2 != null && (str = m0Var2.f50042a) != null && (bool = (Boolean) map2.get(str)) != null) {
                    if (bool.booleanValue() == (bookmark2 != null && bookmark2.isFav() == 1)) {
                        return str;
                    }
                }
                return null;
        }
    }
}

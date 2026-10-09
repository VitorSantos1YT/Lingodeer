package rt;

import com.lingodeer.data.model.Bookmark;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n9 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ ja f50142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Bookmark f50143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Map f50144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f50141a = i12;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        ja jaVar = (ja) obj;
        Bookmark bookmark = (Bookmark) obj2;
        Map map = (Map) obj3;
        vy.d dVar = (vy.d) obj4;
        switch (this.f50141a) {
            case 0:
                n9 n9Var = new n9(4, 0, dVar);
                n9Var.f50142b = jaVar;
                n9Var.f50143c = bookmark;
                n9Var.f50144d = map;
                return n9Var.invokeSuspend(qy.b0.f48488a);
            default:
                n9 n9Var2 = new n9(4, 1, dVar);
                n9Var2.f50142b = jaVar;
                n9Var2.f50143c = bookmark;
                n9Var2.f50144d = map;
                return n9Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Boolean bool;
        boolean zBooleanValue = false;
        switch (this.f50141a) {
            case 0:
                ja jaVar = this.f50142b;
                Bookmark bookmark = this.f50143c;
                Map map = this.f50144d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (jaVar != null && (str = jaVar.f49927a) != null && (bool = (Boolean) map.get(str)) != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    if (bookmark != null && bookmark.isFav() == 1) {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue2 == zBooleanValue) {
                        return str;
                    }
                }
                return null;
            default:
                ja jaVar2 = this.f50142b;
                Bookmark bookmark2 = this.f50143c;
                Map map2 = this.f50144d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (jaVar2 == null || !jaVar2.f49933g) {
                    return new ka(false, false);
                }
                Boolean bool2 = (Boolean) map2.get(jaVar2.f49927a);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else if (bookmark2 != null && bookmark2.isFav() == 1) {
                    zBooleanValue = true;
                }
                return new ka(true, zBooleanValue);
        }
    }
}

package vt;

import com.lingodeer.data.model.BookmarkFolderKt;
import com.lingodeer.database.UserDataDatabase;
import com.lingodeer.database.model.BookmarkFolderEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f54241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(r rVar, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f54239a = i11;
        this.f54241c = rVar;
        this.f54242d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f54239a) {
            case 0:
                return new k(this.f54241c, this.f54242d, dVar, 0);
            default:
                return new k(this.f54241c, this.f54242d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f54239a) {
            case 0:
                break;
        }
        return ((k) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f54239a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54240b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    r rVar = this.f54241c;
                    UserDataDatabase userDataDatabase = rVar.f54281a;
                    j jVar = new j(rVar, this.f54242d, jCurrentTimeMillis, null);
                    this.f54240b = 1;
                    if (hz.b.V(userDataDatabase, jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f54240b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.m mVar = this.f54241c.f54283c;
                    this.f54240b = 1;
                    obj = cf.x.C(this, mVar.f3044a, true, false, new au.f(this.f54242d, 2));
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(BookmarkFolderKt.asExternalModel((BookmarkFolderEntity) it.next()));
                }
                return new s(arrayList);
        }
    }
}

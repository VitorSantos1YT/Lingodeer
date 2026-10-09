package n5;

import com.lingodeer.data.model.characterstroke.CharacterStrokeKt;
import com.lingodeer.database.CharacterStrokeDatabase;
import com.lingodeer.database.model.CharacterStrokeEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f43260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43257a = i11;
        this.f43260d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43257a) {
            case 0:
                d dVar2 = new d(this.f43260d, dVar, 0);
                dVar2.f43259c = obj;
                return dVar2;
            default:
                d dVar3 = new d(this.f43260d, dVar, 1);
                dVar3.f43259c = obj;
                return dVar3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43257a) {
            case 0:
                return ((d) create((i) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((d) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43257a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43258b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i iVar = (i) this.f43259c;
                    this.f43258b = 1;
                    if (hz.b.g(this.f43260d, iVar, this) == aVar) {
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
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) this.f43259c;
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43258b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.p pVarZ = characterStrokeDatabase.z();
                    this.f43259c = null;
                    this.f43258b = 1;
                    pVarZ.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM CharacterStroke WHERE CharId IN (");
                    List list = this.f43260d;
                    ew.a.i(list.size(), sb2);
                    sb2.append(")");
                    String string = sb2.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    obj = cf.x.C(this, pVarZ.f3057a, true, false, new au.n(string, list, pVarZ));
                    if (obj != arrayList) {
                    }
                    return arrayList;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(ry.n.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(CharacterStrokeKt.asExternalModel((CharacterStrokeEntity) it.next()));
                }
                return arrayList;
        }
    }
}

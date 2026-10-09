package rt;

import com.lingodeer.data.model.CourseUnit;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j4 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f49915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49916c;

    public /* synthetic */ j4(Object obj, long j11, int i11) {
        this.f49914a = i11;
        this.f49916c = obj;
        this.f49915b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        i4 i4Var;
        switch (this.f49914a) {
            case 0:
                if (dVar instanceof i4) {
                    i4Var = (i4) dVar;
                    int i11 = i4Var.f49869b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        i4Var.f49869b = i11 - Integer.MIN_VALUE;
                    } else {
                        i4Var = new i4(this, dVar);
                    }
                } else {
                    i4Var = new i4(this, dVar);
                }
                Object obj2 = i4Var.f49868a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = i4Var.f49869b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    uz.j jVar = (uz.j) this.f49916c;
                    for (Object obj3 : (List) obj) {
                        if (((CourseUnit) obj3).getUnitId() == this.f49915b) {
                            i4Var.f49869b = 1;
                            if (jVar.emit(obj3, i4Var) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj2);
                return qy.b0.f48488a;
            default:
                ps.a aVar2 = (ps.a) obj;
                mf mfVar = (mf) this.f49916c;
                float f5 = aVar2.f47121d;
                long j11 = this.f49915b;
                mf.a(mfVar, j11, f5);
                if (aVar2.f47121d >= 1.0f) {
                    mfVar.f50105f.remove(new Long(j11));
                    mfVar.c(j11, ps.d.f47131a, 1.0f);
                }
                return qy.b0.f48488a;
        }
    }
}

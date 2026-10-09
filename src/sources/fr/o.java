package fr;

import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.DbFileVersion;
import com.lingodeer.data.model.DbFileVersionKt;
import com.lingodeer.data.model.LessonTestProgress;
import com.lingodeer.data.model.LessonTestProgressKt;
import com.lingodeer.database.model.DbFileVersionEntity;
import com.lingodeer.database.model.LessonTestProgressEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f27731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27732c;

    public /* synthetic */ o(uz.j jVar, String str, int i11) {
        this.f27730a = i11;
        this.f27731b = jVar;
        this.f27732c = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        n nVar;
        c4 c4Var;
        DbFileVersion dbFileVersion;
        e4 e4Var;
        LessonTestProgress lessonTestProgress;
        switch (this.f27730a) {
            case 0:
                if (dVar instanceof n) {
                    nVar = (n) dVar;
                    int i11 = nVar.f27713b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f27713b = i11 - Integer.MIN_VALUE;
                    } else {
                        nVar = new n(this, dVar);
                    }
                } else {
                    nVar = new n(this, dVar);
                }
                Object obj2 = nVar.f27712a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = nVar.f27713b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (oz.x.s0(((Bookmark) obj3).getId(), this.f27732c + "_", false)) {
                            arrayList.add(obj3);
                        }
                    }
                    nVar.f27713b = 1;
                    if (this.f27731b.emit(arrayList, nVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return qy.b0.f48488a;
            case 1:
                if (dVar instanceof c4) {
                    c4Var = (c4) dVar;
                    int i13 = c4Var.f27448b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c4Var.f27448b = i13 - Integer.MIN_VALUE;
                    } else {
                        c4Var = new c4(this, dVar);
                    }
                } else {
                    c4Var = new c4(this, dVar);
                }
                Object obj4 = c4Var.f27447a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = c4Var.f27448b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    DbFileVersionEntity dbFileVersionEntity = (DbFileVersionEntity) obj;
                    if (dbFileVersionEntity == null || (dbFileVersion = DbFileVersionKt.asExternalModel(dbFileVersionEntity)) == null) {
                        dbFileVersion = new DbFileVersion(this.f27732c, 0L, true);
                    }
                    c4Var.f27448b = 1;
                    if (this.f27731b.emit(dbFileVersion, c4Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                }
                return qy.b0.f48488a;
            default:
                if (dVar instanceof e4) {
                    e4Var = (e4) dVar;
                    int i15 = e4Var.f27487b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        e4Var.f27487b = i15 - Integer.MIN_VALUE;
                    } else {
                        e4Var = new e4(this, dVar);
                    }
                } else {
                    e4Var = new e4(this, dVar);
                }
                Object obj5 = e4Var.f27486a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = e4Var.f27487b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj5);
                    LessonTestProgressEntity lessonTestProgressEntity = (LessonTestProgressEntity) obj;
                    if (lessonTestProgressEntity == null || (lessonTestProgress = LessonTestProgressKt.asExternalModel(lessonTestProgressEntity)) == null) {
                        lessonTestProgress = new LessonTestProgress(this.f27732c, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
                    }
                    e4Var.f27487b = 1;
                    if (this.f27731b.emit(lessonTestProgress, e4Var) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj5);
                }
                return qy.b0.f48488a;
        }
    }
}

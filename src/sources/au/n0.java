package au;

import com.lingodeer.database.model.DbFileVersionEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f3051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3052b = new c(10);

    public n0(w9.s sVar) {
        this.f3051a = sVar;
    }

    public final Object a(DbFileVersionEntity dbFileVersionEntity, xy.c cVar) {
        Object objC = cf.x.C(cVar, this.f3051a, false, true, new b(14, this, dbFileVersionEntity));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }

    public final no.g b(String fileName) {
        kotlin.jvm.internal.m.f(fileName, "fileName");
        f fVar = new f(fileName, 8);
        return qx.p.l(this.f3051a, new String[]{"db_file_version"}, fVar);
    }

    public final DbFileVersionEntity c(String fileName) {
        kotlin.jvm.internal.m.f(fileName, "fileName");
        f fVar = new f(fileName, 7);
        w9.s sVar = this.f3051a;
        sVar.a();
        sVar.b();
        return (DbFileVersionEntity) se.i.D(new ca.c(sVar, false, true, (fz.c) fVar, (vy.d) null));
    }
}
